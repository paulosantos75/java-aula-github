package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

/*
 * Programa que calcula a area de 2 triangulos e devolve a maior area
 */
public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas(base, largura, altura) do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas(base, largura, altura) do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		
		System.out.printf("Area  do Triangulo X = %.2f%n", areaX);
		System.out.printf("Area  do Triangulo Y = %.2f%n", areaY);
		
		if(areaX > areaY)
		{
			System.out.printf("A area do Triangulo X é a maior = %.2f", areaX);
		}else {
			System.out.printf("A area do Triangulo Y é a maior = %.2f", areaY);
		}
		sc.close();
	}

}
