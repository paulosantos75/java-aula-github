package exercicios.aula35;

import java.util.Scanner;

/*
 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em 
ordem crescente ou decrescente.
 */
public class Eexercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 % num2 == 0 || num2 % num1 == 0)
		{
			System.out.println("Sao multiplos");
		}else
		{
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
	}

}
