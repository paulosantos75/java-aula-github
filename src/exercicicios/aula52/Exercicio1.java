package exercicicios.aula52;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int X = sc.nextInt();
	
	
	for(int i=1; i<=X; i++)
	{
		//numero impar
		if(i%2 !=0)
		{
			System.out.println(i);
		};
	}
	
	sc.close();
	}
}
