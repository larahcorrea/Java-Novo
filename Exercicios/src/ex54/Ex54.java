package ex54;

import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		Pessoa[] listapessoas = new Pessoa [3]; 
int id;
String nome;
char possuiDep;
int idadeDep;
String nomeDep;

	for (int i = 0; i<=2 ; i++) {
		
		Pessoa p ;
		
		System.out.println("digite o Id   ");
		id = ler.nextInt();
		
		System.out.println("digite o nome   ");
		nome = ler.next();
		
		System.out.println("Possui dependente? S/N   ");
		possuiDep = ler.next().charAt(0);
		
		if (possuiDep == 'S') {
			System.out.println("digite o nome do dependente   ");
			nomeDep = ler.next();
			
			System.out.println("digite a idade do dependente   ");
			idadeDep = ler.nextInt();
			
		Dependente d = new Dependente(nomeDep,idadeDep);
			
		p = new Pessoa(id,nome,d);
	
		}
		else {

		p = new Pessoa(id,nome,null);			
			
		}
		listapessoas[i] = p;
		}
		
		
		
	for (int i = 0; i<=2; i++) {
		
		System.out.println(listapessoas[i].exibirNome());
		if (listapessoas[i].dep != null) {
			System.out.printf("Dependente: ", listapessoas[i].exibirDependente()); 
		}
		
	}
		
		
		
	}

}

