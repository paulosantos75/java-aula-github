package application;

import java.util.Scanner;

public class ProgramMatriz2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Digite o numero  de linhas da matriz: ");
		int m = sc.nextInt();
		System.out.println();
		System.out.print("Digite o numero  de colunas da matriz: ");
		int n = sc.nextInt();
		System.out.println();
		
		int[][] matriz =  new int[m][n];
		
		//--PARTE 1 - preencher matriz
		for (int i = 0; i < matriz.length; i++) {// linhas
			// preencher colunas por linha
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite o valor correspondente à linha " + i + ", coluna " + j + ":");
				matriz[i][j] = sc.nextInt();
			}
			System.out.println("............");
		}
		
		//2PARTE
		System.out.print("Digite um numero que esteja na matriz: ");
		int numero = sc.nextInt();
		for (int i = 0; i < matriz.length; i++) {// linhas
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] ==numero)
				{
					System.out.println("Numero: " + numero + ", está na posicao: ("+ i + ", "+ j + ")");
					if(j > 0) 
					{
						System.out.println("Left:" + matriz[i][j-1]);
					}
					if(j < matriz[i].length-1)
					{
						System.out.println("Right:" + matriz[i][j+1]);
					}
					if(i < matriz.length-1)
					{
						System.out.println("Down:" + matriz[i+1][j]);
					}
					if(i >0) {
						System.out.println("Up:" + matriz[i-1][j]);
					}
					
				}
			}
		}
		
		sc.close();
	}

}
