package exercicios.aula35;
/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar. 
 */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double preco1, preco2, preco3, preco4, preco5, total;
		String erro = "";
		preco1 = 4.0;
		preco2 = 4.50;
		preco3 = 5.0;
		preco4 = 2.0;
		preco5 = 1.5;
		
		System.out.println("digite o codigo e quantidade");
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		String n ="";
		if(codigo ==1)
		{
			total = preco1 * quantidade;
		}else if(codigo ==2)
		{
			total = preco2 * quantidade;
		}
		else if(codigo ==3)
		{
			total = preco3 * quantidade;
		}else if(codigo == 4)
		{
			total = preco4 * quantidade;
		}
		else if(codigo == 5)
		{
			total = preco5 * quantidade;
		}
		else //codigo nao existe
		{
			total = 0;
			erro = "Codigo de produto nao existe!";
		}
		
		if(total == 0)
		{
			System.out.println("ERRO: " + erro);
		}else
		{
			System.out.printf("TOTAL: %.2f", total);
		}
		
sc.close();
	}

}
