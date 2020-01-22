package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 
 */
public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int cod1, numPecas1, cod2, numPecas2;
		double valorUnitario1, valorUnitario2, valorPagar;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		cod1 = sc.nextInt();
		numPecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
		//sc.nextLine();
		
		cod2 = sc.nextInt();
		numPecas2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		valorPagar = numPecas1 * valorUnitario1 + numPecas2 * valorUnitario2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);
		sc.close();
	}

}
