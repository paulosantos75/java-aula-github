package exercicios;

import java.util.Locale;
import java.util.Scanner;


/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos. 
fórmula da área: area = π . raio2 

 Considere o valor de π = 3.14159 
 */
public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		double area;
		
		
		Scanner sc = new Scanner(System.in);
			
		double raio = sc.nextDouble();
		area = pi*Math.pow(raio, 2);

		System.out.printf("A = %.4f%n", area);
		sc.close();
	}

}
