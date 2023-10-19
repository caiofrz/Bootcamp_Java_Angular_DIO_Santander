import { Component } from '@angular/core';

@Component({
	selector: 'app-card',
	templateUrl: './card.component.html',
	styleUrls: ['./card.component.css'],
})
export class CardComponent {
	produtos: string[] = [];
	menuType: string = 'Admin';

	constructor(){
		this.produtos = [
			"mouse",
			"tecaldo",
			"fone"
		];
	}

	adicionar():void{
		this.produtos.push('newProduto');
	}
	remover(index:number):void{
		this.produtos.splice(index, 1);
	}
}
