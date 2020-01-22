package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o 
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago. 
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
