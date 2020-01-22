package exercicios.aula47while;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int senha = 2002; 
		while(x != senha)
		{
			System.out.println("senha invalida");
			x = sc.nextInt();
		}
		System.out.println("acesso permitido");	
		
		sc.close();
	}

}
