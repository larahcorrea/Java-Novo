package poo;

import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		
		
		Aluno[] listaAluno = new Aluno [3];
		
		
		for (int i = 0; i<listaAluno.length ; i++) {
			Aluno a = new Aluno();
			
			System.out.println("Digite seu ra  ");
			a.ra=ler.next();
			
			System.out.println("Digite seu nome  ");
			a.nome=ler.next();
			
			System.out.println("Digite seu período  ");
			a.periodo=ler.next();
			int c=1;
			String[] listaMateria = new String[6];
			for (int b = 0; b<=5 ; b++) {
				System.out.println("Digite as siglas das suas matérias  ");
				listaMateria[b]=ler.next();
				word.append(c);
			}
			
			a.materias = listaMateria;
			
			listaAluno[i] = a ;
		}
		
		for (int i = 0; i<=2 ; i++) {
			if (listaAluno[i].periodo.equals("noite")) {
				System.out.println("RA  "+ listaAluno[i].ra);
				System.out.println("Nome  "+ listaAluno[i].nome);
				System.out.println("periodo  "+ listaAluno[i].periodo);
				for (int b = 0; b<=5 ; b++) {
					System.out.println(listaAluno[i].materias[b]);
				}
				
			}
			
		}
		
			
			
			
		}}
		
		
		
		

	
