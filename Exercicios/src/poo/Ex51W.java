package poo;

import java.util.Scanner;

public class Ex51W {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i = 0;
		Cliente[] listaCliente = new Cliente [5];
		
		while (i<5) {			
				
			Cliente c = new Cliente ();
			
			System.out.println("Digite o ID  ");
			c.id = ler.nextInt();
			
			System.out.println("Digite o nome  ");
			c.nome = ler.next();
			
			System.out.println("Digite a idade  ");
			c.idade = ler.nextInt();
			
			System.out.println("Digite o email  ");
			c.email = ler.next();
			
			
		listaCliente[i] = c;
		
		i++;
			
			}
		i = 0 ;
		while (i<5) {
			if (listaCliente[i].idade > 18) {			
				System.out.println("As pessoas cadastradas foram:\n");
				System.out.println("Id  " + listaCliente[i].id);
				System.out.println("Nome  " + listaCliente[i].nome);
				System.out.println("Idade  " + listaCliente[i].idade);
				System.out.println("Email  " + listaCliente[i].email);
				
				}
			i++;
			}
		}
		
		
		
	}


