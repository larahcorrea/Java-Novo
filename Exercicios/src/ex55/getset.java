package ex55;

import java.util.Scanner;

public class getset {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Cliente1[] listacliente1 = new Cliente1 [5];
		
		int id;
		int idade;
		int agencia;
		int numero;
		char possuiCb1;
		String nome;
		String email;
		Double saldo;
		
		
		
		for (int i=0; i<=2; i++) {
			
			Cliente1 c = new Cliente1 ();
			
	
			
			System.out.println("Digite o seu Id  ");
			c.setId(ler.nextInt());
			
			System.out.println("Digite o seu nome  ");
			c.setNome(ler.next());
			
			System.out.println("Digite o sua idade   ");
			c.setIdade(ler.nextInt());
			
			System.out.println("Digite o seu email  ");
			c.setEmail(ler.next());
			
			System.out.println("Você possui conta bancária?S/N  ");
			possuiCb1 = ler.next().charAt(0);
			
			
			
			if (possuiCb1 == 'S') {
				
				ContaBancaria1 cb1 = new ContaBancaria1 () ;
				
				System.out.println("Digite a sua agência  ");
				cb1.setAgencia(ler.nextInt());
				
				System.out.println("Digite o numero da sua conta  ");
				cb1.setNumero(ler.nextInt());
				
				System.out.println("Digite o seu saldo  ");
				cb1.setSaldo(ler.nextDouble());
		
				c.setCb1(cb1);		
				
			}else {
				c.setCb1(null);	
			}
			 listacliente1[i] = c ;
			}
			
			
		
		
		for (int i=0; i<=2; i++) {
			System.out.printf("\n Aqui a lista dos clientes    %s", listacliente1[i].exibirDados1());
			if (listacliente1[i].getCb1() != null) 
				System.out.printf("Estes são seus dados bancários %s", listacliente1[i].exibirDadosBanco1());
				
			
		}

	}

}

    

