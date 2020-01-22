package exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais. 
 */
public class Exercicio4 {

	public static void main(String[] args) {
		int numFunc, numHoras;
		double precoHora, salario;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		numFunc = sc.nextInt();
		numHoras = sc.nextInt();
		precoHora = sc.nextDouble();
		
		salario = numHoras * precoHora;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f ", salario);
		
		sc.close();

	}

}
