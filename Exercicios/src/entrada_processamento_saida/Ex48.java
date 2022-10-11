package entrada_processamento_saida;

import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int inicial, numFinal, soma=0;
		
		System.out.printf("Digite um número inicial: ");
		inicial = scn.nextInt();
		System.out.printf("Digite um número final: ");
		numFinal = scn.nextInt();
		
		for(int i = inicial; i <= numFinal; i++) {
			soma = soma + i;
		}
		
		System.out.println("Soma: " + soma);}
	}
