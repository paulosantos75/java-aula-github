package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

//88- vectores com objetos
public class ProgramProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduza o numero de produtos:");
		int n = sc.nextInt();
		
		Produto[] vect = new Produto[n];
		
		//preencher o vetor
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			
			vect[i] = new Produto(nome, preco);
		}
		
		//calculo da media
		double soma = 0;
		for(int i = 0; i < vect.length; i++ ) {
			soma += vect[i].getPreco();
		}
		double avg = soma /vect.length;
		System.out.printf("MEDIA = %.2f", avg);
		
		sc.close();
	}

}
