package exercicios.aula47while;

import java.util.Scanner;

//https://www.youtube.com/watch?v=r3qCFqaNHds
public class ExercicioResolvido1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != y)
		{
			if(x < y)
			{
				System.out.println("Crescente");
			}else
			{
				System.out.println("Decrescente");
			}
			//le de novo as variaveis
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}

}
