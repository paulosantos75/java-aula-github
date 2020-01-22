package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class ProgramCurrency {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double preco = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double qtd = sc.nextDouble();
		
		double result = CurrencyConverter.quantidadePagar(preco, qtd);
		System.out.printf("Amount to be paid in reais = %.2f", result);
		sc.close();
	}

}
