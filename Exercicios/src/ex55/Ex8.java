package ex55;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Cliente[] listaclientes = new Cliente [5];
		
		int id;
		int idade;
		int agencia;
		int numero;
		char possuiCb;
		String nome;
		String email;
		Double saldo;
		
		
		
		for (int i=0; i<=2; i++) {
			
			Cliente c;
			
			System.out.println("Digite o seu Id  ");
			id = ler.nextInt();
			
			System.out.println("Digite o seu nome  ");
			nome = ler.next();
			
			System.out.println("Digite o sua idade   ");
			idade = ler.nextInt();
			
			System.out.println("Digite o seu email  ");
			email = ler.next();
			
			System.out.println("Você possui conta bancária?S/N  ");
			possuiCb = ler.next().charAt(0);
			
			if (possuiCb == 'S') {
				System.out.println("Digite a sua agência  ");
				agencia = ler.nextInt();
				
				System.out.println("Digite o numero da sua conta  ");
				numero = ler.nextInt();
				
				System.out.println("Digite o seu saldo  ");
				saldo = ler.nextDouble();
		
				
				ContaBancaria cb = new ContaBancaria (agencia,numero,saldo);
				
				c = new Cliente (id, nome ,idade, email, cb);
			}
			
			else {
				 c = new Cliente (id, nome ,idade, email, null);
				
			}
			 listaclientes[i] = c ;
		}
		
		for (int i=0; i<=2; i++) {
			System.out.printf("\n Aqui a lista dos clientes    %s", listaclientes[i].exibirDados());
			if (listaclientes[i].cb != null) 
				System.out.printf("Estes são seus dados bancários %s", listaclientes[i].exibirDadosBanco());
				
			
		}

	}

}

    

