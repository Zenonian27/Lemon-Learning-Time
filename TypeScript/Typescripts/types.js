"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
let prints = "Hello World";
let woo = "Wooo";
class fuckyou {
    woo;
    constructor(woo) {
        this.woo = woo;
    }
    printMe() {
        return console.log("fuck you " + woo);
    }
    test() {
        var a = 10;
        var b = 15;
        if (a < b) {
            console.log(a + " less than " + b);
        }
    }
}
class main extends fuckyou {
    runAll(fuck) {
        console.log(fuck);
    }
}
function runAlls() {
    const app = new main(woo);
    app.runAll(woo);
    app.printMe();
    app.test();
}
runAlls();
//interface can be passed as parameters to
//functions
//# sourceMappingURL=types.js.map