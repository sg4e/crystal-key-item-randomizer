(ns crystal-key-item-randomizer.core
  (:gen-class)
  (:require [clojure.data.json :as json]
            [crystal-key-item-randomizer.seeds :as seeds]
            [crystal-key-item-randomizer.patches :as patches]
            [ring.adapter.jetty :as jetty]
            [ring.middleware.defaults :refer :all])
  (:use [compojure.route :only [files not-found]]
        [compojure.core :only [defroutes GET]]))

(def dev? (= "dev" (System/getenv "RUNTIME_ENV")))

(when dev?
  (println "using ring middleware")
  (use '[ring.middleware.reload :only [wrap-reload]]))

(defn parse-seed-id [seed-id]
  (or (empty? seed-id)
      (if-let [seed-id-parsed (try
                                (new java.lang.Long seed-id)
                                (catch Exception e nil))]
        {:seed-id seed-id-parsed}
        {:error (str "Invalid seed: " seed-id)})))


(defn seed-handler [req]
  (let [{:keys [seed-id error]} (-> req :params :id parse-seed-id)
        speedchoice? (-> req :params :speedchoice java.lang.Boolean/parseBoolean)]
    (if error
      {:status 400
       :headers {"Content-Type" "text/json"}
       :body (json/write-str {:error error})}
      (let [{:keys [seed error]} (if seed-id
                                   (seeds/generate seed-id {:speedchoice? speedchoice?})
                                   (seeds/generate-beatable {:speedchoice? speedchoice?}))]
        (if error
          {:status 500
           :headers {"Content-Type" "text/json"}
           :body (json/write-str {:error error})}
          (let [seed' (if dev?
                        seed
                        (dissoc seed :items-obtained :badges :conditions-met :beatable? :reasons))]
            {:status 200
             :headers {"Content-Type" "text/json"}
             :body (json/write-str {:seed seed'})}))))))

(defroutes app-routes
  (GET "/seed" [] seed-handler)
  (GET "/seed/" [] seed-handler)
  (GET "/seed/:id" [] seed-handler)
  (files "")
  (files "assets")
  (not-found {:error "not found"}))

(defn wrap-logger [handler]
  (fn [request]
    (let [{:keys [request-method uri]} request
          {:keys [status body] :as response} (handler request)
          logline (str "INFO: -- " {:method (-> request-method name .toUpperCase)
                                    :uri uri
                                    :status status
                                    :response-body body})]
      (.println System/out logline)
      response)))

(def app
  (-> app-routes
      (wrap-defaults site-defaults)
      (wrap-logger)))

(defn event-logger [event]
  (println event)
  (.println System/out event))

(defn -main
  [& args]
  (let [port (Integer/parseInt (or (System/getenv "PORT") "8080"))]
    (jetty/run-jetty #'app {:port port})
    (println (str "Running webserver at http:/127.0.0.1:" port "/"))))
