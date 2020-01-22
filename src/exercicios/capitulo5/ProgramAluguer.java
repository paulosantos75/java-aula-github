package exercicios.capitulo5;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAluguer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Aluguer[] vect = new Aluguer[10];
		System.out.print("Digite o numero de estudantes que vao alugar quarto:");
		int numeroReserva=sc.nextInt();
		
		
		for(int i = 1; i <= numeroReserva; i++ )
		{
			sc.nextLine();
			System.out.println("Rent # " + i);
			System.out.print("Name: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			
			if(vect[quarto] == null && quarto < 10)
			{
				vect[quarto] = new Aluguer(nome, email);
				
			}else {
				System.out.println("Não é possivel efetuar esta reserva. O quarto " + quarto + " já reservado.");
			}
		}
		
		System.out.println("Busy rooms:");
		for(int i = 0; i < vect.length ; i++ )
		{
			if(vect[i] != null)
			{
				//System.out.println(i + ": " + vect[i].getNome() + ", " + vect[i].getEmail());
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}

}
