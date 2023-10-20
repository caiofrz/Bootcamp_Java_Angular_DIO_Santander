import { Component } from '@angular/core';

@Component({
	selector: 'app-comp-atributos',
	templateUrl: './comp-atributos.component.html',
	styleUrls: ['./comp-atributos.component.css'],
})
export class CompAtributosComponent {
	style: string = 'disable';
	corFundo: string = 'blue';
	item:string = '';
	lista: string[] = [];

	trocar(): void {
		this.style = this.style === 'disable' ? 'enable' : 'disable';
	}
	addLista(item:string) : void {
		this.lista.push(item);
	}
}
