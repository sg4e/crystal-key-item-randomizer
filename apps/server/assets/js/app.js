// Brunch automatically concatenates all files in your
// watched paths. Those paths can be configured at
// config.paths.watched in "brunch-config.js".
//
// However, those files will only be executed if
// explicitly imported. The only exception are files
// in vendor, which are never wrapped in imports and
// therefore are always executed.

// Import dependencies
//
// If you no longer want to use a dependency, remember
// to also remove its path from "config.paths.watched".
import "phoenix_html"

// Import local files
//
// Local files can be imported directly using relative
// paths "./socket" or full ones "web/static/js/socket".

// import socket from "./socket"

function handleFiles() {
    var romFile = this.files[0];
    var fileReader = new FileReader();

    fileReader.readAsArrayBuffer(romFile);

    var bytes = new Uint8Array(fileReader.result);
    debugger

    var swaps = new Request("api/swap");

    var swapsPromise = fetch(swaps).then(
        function (response) {
            return response.json();
        },
        function(err) {
            console.log(err)
        }
    ).then(
        function (json) {
            console.log(json);
        }
    );
}

var romFileInput = document.getElementById("rom-file");
romFileInput.addEventListener("change", handleFiles, false);
