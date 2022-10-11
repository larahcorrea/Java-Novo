package poo;

import java.util.Scanner;

public class Ex51DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Cliente[] listaCliente = new Cliente [5];
		int i = 0;
		
		Cliente c = new Cliente ();
	
		
		do {
			
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
			
			}while (i<5);
		
		
		
		
	}

}
