import java.util.Scanner;

public class Aula43 {
	public static void main(String[] args) {
		int soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int x = sc.nextInt();
		
		while(x != 0 )
		{
			soma += x;
			System.out.println("Digite um numero:");
			x = sc.nextInt();
			
		}
		System.out.println("Valor total:" + soma);
		sc.close();
	}
}
