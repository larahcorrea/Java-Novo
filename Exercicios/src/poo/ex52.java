package poo;

import java.util.Scanner;

public class ex52 {

	public static void main(String[] args) {
		
Scanner ler = new Scanner (System.in);

	Produto[] listaProduto = new Produto [10];
	
	for (int i=0; i<=9 ; i++) {
		
		Produto p = new Produto();
		
		
		System.out.printf("Digite o Id  ");
		p.id = ler.nextInt();
		
		System.out.printf("Digite a Descrição  ");
		p.descricao = ler.next();
		
		System.out.printf("Digite o valor  ");
		p.valor = ler.nextDouble();
		
		System.out.printf("Digite a quantidade  ");
		p.quantidade = ler.nextDouble();
		
		listaProduto[i] = p;
		
	
		}
	
	 for (int i=0; i<=9 ; i++) {
		if (listaProduto[i].valor < 100) {
		
			System.out.println("Id  " + listaProduto[i].id+"\n");
			System.out.println("Descrição  " + listaProduto[i].descricao+"\n");
			System.out.println("Valor  " + listaProduto[i].valor +"\n");
			System.out.println("Quantidade  " + listaProduto[i].quantidade+"\n");
		 
	}}
	
	
	}

}
