
package poo;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		Cliente c = new Cliente();
		
		Cliente[] listaCliente = new Cliente [5];
	
		
		for (int i =0 ; i <= 4; i++) {
			
			System.out.println("Digite o ID  ");
			c.id = ler.nextInt();
			
			System.out.println("Digite o nome  ");
			c.nome = ler.next();
			
			System.out.println("Digite a idade  ");
			c.idade = ler.nextInt();
			
			System.out.println("Digite o email  ");
			c.email = ler.next();
			
			
		listaCliente[i] = c;
			
		}
		
		for (int i =0 ; i <= 4; i++) {
			if (listaCliente[i].idade >18 ) {
				
				System.out.println("As pessoas cadastradas foram:\n");
				System.out.println("Id  " + listaCliente[i].id);
				System.out.println("Id  " + listaCliente[i].nome);
				System.out.println("Id  " + listaCliente[i].idade);
				System.out.println("Id  " + listaCliente[i].email);}
			}
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	