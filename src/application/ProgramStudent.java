package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		System.out.println("Entre o nome do aluno:");
		aluno.nome = sc.nextLine();
		
		System.out.println("Entre as tres notas do aluno:");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.obterNotaFinal());
		System.out.println(aluno.estadoResultado());
		sc.close();
	}

}
