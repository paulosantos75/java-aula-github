package exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Exercicio 1. Digite 2 numeros inteiros");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int soma = num1 + num2;
			System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
