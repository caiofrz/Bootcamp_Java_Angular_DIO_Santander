const number: number = 1;
const string: string = "1";
const bool: boolean = true;
const float: number = 1.9; //float || double

const nulo: null = null;
const indefinido: undefined = undefined;

let vazio: void;
const x: any = "any";

const objeto: object = {
  name: "Hulk",
  vulgo: "Hulk Smash",
};

type Hero = {
  name: string;
  vulgo: string;
};

const heroi1: Hero = { name: "Hulk", vulgo: "Hulk Smash" };
console.log(heroi1);

const array: string[] = ["x", "y"];
const array1: any[] = ["x", 2, false];
const array2: Array<string> = ["x", "y"];
const array3: (string | number)[] = ["x", 2];

const tuplas: [string, number, number] = ["x", 2, 3];

const data : Date = new Date();
console.log(data.toString());

function somar(x: number, y: number) : number{
    return x+y;
}

// const soma: string = somar(1, 2); // n consegue
const soma: number = somar(1, 2);

//
//
//INTERFACE
//
//
interface IHero {
  readonly name: string;
  vulgo: string;
}

const heroi: IHero = { name: "Hulk", vulgo: "Hulk Smash" };
console.log(heroi);

interface robot {
  id: number | string;
  name: string;
}

class Bot implements robot{
    id: string | number;
    name: string;
    
    constructor(id: string | number, name: string) {
        this.id = id;
        this.name = name;
    }
    hello() : void {
        console.log("hello");
    }

}

const BOT = new Bot(1, "caio");
console.log(BOT.hello());


//
//
//GENERICS
//
//
function concatArray<T>(...itens: T[]) : T[]{
  return new Array().concat(...itens);
}

const numArray = concatArray<number[]>([1, 2], [3]);
const stgArray = concatArray<string[]>(["aa", "b"], ["c"]);


