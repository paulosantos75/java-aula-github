package application;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz.
 */
public class ProgramMatrizQuadrada {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("Digite o numero N da matriz quadrada: ");
		int n = sc.nextInt();
		
		System.out.println();
		int[][] matriz = new int[n][n];
		
		//--PARTE 1 - preencher matriz
		for(int i = 0; i < matriz.length; i++) {//linhas
			//preencher colunas por linha
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite o valor correspondente à linha " + i +", coluna " + j + ":");
				matriz[i][j] = sc.nextInt();
			}
			System.out.println("............");
		}
		//PARTE 2 - imprimir diagonal principal
		System.out.println("Diagonal principal:");
		for(int i = 0; i < matriz.length; i++) {//linhas
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		//PARTE 3 - imprimir quantidade de valores nageativos na matriz
		int contador = 0;
		for(int i = 0; i < matriz.length ; i++) {
			for(int j = 0; j < matriz[i].length; j++)
			{
				if(matriz[i][j] <0)
				{
					contador++;
				}
			}
		}
		System.out.println("Quantidade de numeros negativos: " + contador);
		sc.close();
	}

}
