package exercicios.aula35;
//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o. 

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um numero:");
		int numero = sc.nextInt();
		if(numero < 0)
		{
			System.out.println("NEGATIVO");
		}else
		{
			System.out.println("NAO NEGATIVO");
		}
		sc.close();
	}
	
	
}
