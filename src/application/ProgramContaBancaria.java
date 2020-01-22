package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

//exercicio de fixacao da aula 80 - POO


public class ProgramContaBancaria {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double deposito = 0.0;
		ContaBancaria cb;
		
		System.out.println("Enter account number:");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n):");
		char response = sc.next().charAt(0);
		
		
		
		if(response == 'y')
		{
			System.out.println("Enter initial deposit value:");
			deposito = sc.nextDouble();
			cb = new ContaBancaria(accountNumber, holder, deposito);
		}else
		{
			 cb = new ContaBancaria(accountNumber, holder);
		}
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(cb);
		
		
		System.out.println("Enter a deposit value:");		
		deposito = sc.nextDouble();
		if(deposito > 0)
		{
			cb.efetuarDeposito(deposito);
			System.out.println("updated:" + cb);
		}
		
		System.out.println("Enter a withdraw value: ");
		double montanteRetirar = sc.nextDouble();
		if(montanteRetirar > 0)
		{
			cb.efetuarSaque(montanteRetirar);
			System.out.println("updated:" + cb);
		}
			
		sc.close();
	}
}
