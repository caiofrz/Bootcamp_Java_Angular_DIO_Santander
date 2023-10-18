"use strict";
const heroi = { name: "Hulk", vulgo: "Hulk Smash" };
console.log(heroi);
class Bot {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
    hello() {
        console.log("hello");
    }
}
const BOT = new Bot(1, "caio");
console.log(BOT.hello());
