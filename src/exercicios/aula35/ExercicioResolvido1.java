package exercicios.aula35;

import java.util.Locale;
import java.util.Scanner;

//https://www.youtube.com/watch?v=SRyQZBaA-_s
public class ExercicioResolvido1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double nota1, nota2, soma;
		String resultado ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza a nota do 1º teste:");
		nota1 = sc.nextDouble();
		System.out.println("Introduza a nota do 2º teste:");
		nota2 = sc.nextDouble();
		
		soma = nota1 + nota2;
		
		if(soma <= 60)
		{
			resultado = "REPROVADO!";
		}
		System.out.printf("NOTA FINAL = %.1f%n", soma);
		System.out.println("Resultado: " + resultado);
		sc.close();

	}

}
