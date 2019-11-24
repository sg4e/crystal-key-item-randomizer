(ns crystal-key-item-randomizer.seeds-test
  (:require [clojure.test :refer :all]
            [crystal-key-item-randomizer.seeds :refer :all]))

(deftest deterministic-shuffle-test
  (testing "returns a fixed shuffle for a particular seed value"
    (is (= [:CLEAR_BELL :MACHINE_PART :GOOD_ROD :SUPER_ROD :RED_SCALE
            :SQUIRTBOTTLE :OLD_ROD :BICYCLE :ITEMFINDER :LOST_ITEM
            :SILVER_WING :COIN_CASE :PASS :CARD_KEY :MYSTERY_EGG :HM_FLASH
            :HM_STRENGTH :HM_WHIRLPOOL :HM_CUT :BASEMENT_KEY :HM_SURF
            :HM_FLY :HM_WATERFALL :BLUE_CARD :SECRETPOTION :S_S_TICKET]
           (deterministic-shuffle all-items 1)))))

(deftest generate-random-test
  (testing "when early-bicycle? is true"
    (is (= {:item-swaps {:HM_FLASH :HM_CUT,
                         :SILVER_WING :HM_FLASH,
                         :LOST_ITEM :HM_STRENGTH,
                         :ITEMFINDER :BASEMENT_KEY,
                         :GOOD_ROD :LOST_ITEM,
                         :CARD_KEY :S_S_TICKET,
                         :COIN_CASE :HM_SURF,
                         :BLUE_CARD :RED_SCALE,
                         :CLEAR_BELL :CLEAR_BELL,
                         :SQUIRTBOTTLE :SQUIRTBOTTLE,
                         :HM_WHIRLPOOL :MACHINE_PART,
                         :RED_SCALE :BLUE_CARD,
                         :HM_WATERFALL :SILVER_WING,
                         :SECRETPOTION :COIN_CASE,
                         :BASEMENT_KEY :ITEMFINDER,
                         :MACHINE_PART :HM_FLY,
                         :MYSTERY_EGG :BICYCLE,
                         :S_S_TICKET :GOOD_ROD,
                         :PASS :SECRETPOTION,
                         :HM_CUT :MYSTERY_EGG,
                         :HM_FLY :HM_WHIRLPOOL,
                         :HM_STRENGTH :CARD_KEY,
                         :OLD_ROD :PASS,
                         :BICYCLE :HM_WATERFALL,
                         :HM_SURF :OLD_ROD,
                         :SUPER_ROD :SUPER_ROD},
            :id "1359243304"}
           (-> (generate-random {:early-bicycle? true
                                 :rng (new java.util.Random 1)})
               :seed
               (select-keys [:item-swaps :id])))))

  (testing "when no-early-super-rod? is false"
    (is (= {:item-swaps {:HM_FLASH :HM_STRENGTH,
                         :SILVER_WING :S_S_TICKET,
                         :LOST_ITEM :HM_WATERFALL,
                         :ITEMFINDER :SECRETPOTION,
                         :GOOD_ROD :CLEAR_BELL,
                         :CARD_KEY :BICYCLE,
                         :COIN_CASE :COIN_CASE,
                         :BLUE_CARD :HM_SURF,
                         :CLEAR_BELL :HM_FLY,
                         :SQUIRTBOTTLE :GOOD_ROD,
                         :HM_WHIRLPOOL :BLUE_CARD,
                         :RED_SCALE :HM_FLASH,
                         :HM_WATERFALL :MACHINE_PART,
                         :SECRETPOTION :HM_CUT,
                         :BASEMENT_KEY :SUPER_ROD,
                         :MACHINE_PART :BASEMENT_KEY,
                         :MYSTERY_EGG :OLD_ROD,
                         :S_S_TICKET :LOST_ITEM,
                         :PASS :SILVER_WING,
                         :HM_CUT :ITEMFINDER,
                         :HM_FLY :MYSTERY_EGG,
                         :HM_STRENGTH :PASS,
                         :OLD_ROD :SQUIRTBOTTLE,
                         :BICYCLE :HM_WHIRLPOOL,
                         :HM_SURF :RED_SCALE,
                         :SUPER_ROD :CARD_KEY},
            :id "155629808"}
           (-> (generate-random {:no-early-super-rod? true
                                 :rng (new java.util.Random 1)})
               :seed
               (select-keys [:item-swaps :id])))))

  (testing "when randomize-badges? is true"
    (is (= {:badge-swaps {:PLAINBADGE :GLACIERBADGE,
                          :MARSHBADGE :HIVEBADGE,
                          :RISINGBADGE :SOULBADGE,
                          :FOGBADGE :EARTHBADGE,
                          :ZEPHYRBADGE :RAINBOWBADGE,
                          :RAINBOWBADGE :BOULDERBADGE,
                          :STORMBADGE :CASCADEBADGE,
                          :VOLCANOBADGE :RISINGBADGE,
                          :SOULBADGE :STORMBADGE,
                          :EARTHBADGE :MINERALBADGE,
                          :THUNDERBADGE :VOLCANOBADGE,
                          :HIVEBADGE :ZEPHYRBADGE,
                          :MINERALBADGE :FOGBADGE,
                          :BOULDERBADGE :PLAINBADGE,
                          :CASCADEBADGE :MARSHBADGE,
                          :GLACIERBADGE :THUNDERBADGE}}
           (-> (generate-random {:randomize-badges? true
                                 :rng (new java.util.Random 1)})
               :seed
               (select-keys [:badge-swaps])))))

  (testing "when randomize-badges? is not true"
    (is (= {:badge-swaps
            {:PLAINBADGE :PLAINBADGE,
             :MARSHBADGE :MARSHBADGE,
             :RISINGBADGE :RISINGBADGE,
             :FOGBADGE :FOGBADGE,
             :ZEPHYRBADGE :ZEPHYRBADGE,
             :RAINBOWBADGE :RAINBOWBADGE,
             :STORMBADGE :STORMBADGE,
             :VOLCANOBADGE :VOLCANOBADGE,
             :SOULBADGE :SOULBADGE,
             :EARTHBADGE :EARTHBADGE,
             :THUNDERBADGE :THUNDERBADGE,
             :HIVEBADGE :HIVEBADGE,
             :MINERALBADGE :MINERALBADGE,
             :BOULDERBADGE :BOULDERBADGE,
             :CASCADEBADGE :CASCADEBADGE,
             :GLACIERBADGE :GLACIERBADGE}}
           (-> (generate-random {})
               :seed
               (select-keys [:badge-swaps]))))))
