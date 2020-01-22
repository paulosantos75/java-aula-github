import java.util.Locale;

public class Aula22 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nome ="Maria";
		int idade = 31;
		double salario = 2000.0;
		/*
		 * marcadores:
		 * c - char
		 * s -String
		 * d - inteiro
		 * f - ponto flutuante
		 * %n - mudanca de linha
		 */
		
		
		System.out.printf("%s tem %d anos e ganha %.2f euros%n", nome, idade, salario);

	}

}
