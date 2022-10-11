package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um número: ");
		num = scn.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			num = num + 1;
			System.out.print(num + ", ");
		}
	}}

