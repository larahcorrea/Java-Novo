package ex56;

import java.util.Scanner;

public class Ex56 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Produto[] listaprodutos = new Produto[5];

		int id;
		String nome;
		double preco;
		double quantidade;
		char possuiCat;

		for (int i = 0; i <= 2; i++) {

			Produto p = new Produto();

			System.out.println("Digite o Id  ");
			p.setId(ler.nextInt());

			System.out.println("Digite o nome  ");
			p.setNome(ler.next());

			System.out.println("Digite o preco  ");
			p.setPreco(ler.nextDouble());

			System.out.println("Digite a quantidade  ");
			p.setQuantidade(ler.nextDouble());

			System.out.println("O produto possui uma categoria? S/N  ");
			possuiCat = ler.next().charAt(0);
				if (possuiCat == 'S') {

				Categoria c = new Categoria();

				System.out.println("Digite o Id da categoria  ");
				c.setId(ler.nextInt());

				System.out.println("Digite o  nome da categoria   ");
				c.setNome(ler.next());
				
				p.setCategoria(c);
				
				
				

			} else {
				p.setCategoria(null);

				
			
			}
				listaprodutos[i] = p;
		}

		for (int i = 0; i <= 2; i++) {
			
			System.out.println(listaprodutos[i].exibirNomePreco());
			System.out.println(listaprodutos[i].exibirNomeQuantidade());
			
			if(listaprodutos[i].getCategoria() != null){
				System.out.println(listaprodutos[i].exibirCategoria());
					
				}		
		}

	}

}
