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

const heroi: Hero = { name: "Hulk", vulgo: "Hulk Smash" };
console.log(heroi);

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