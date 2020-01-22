import java.util.Scanner;

public class Aula59 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("digite 3 numeros:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int maior = maximo(n1, n2, n3);
		imprime(maior);
		
		sc.close();
	}
	public static int maximo(int n1, int n2, int n3) {
		int max;
		
		if(n1 > n2 && n1 > n3)
			max = n1;
		else if(n2 > n3)
			max = n2;
		else 
			max = n3;
		
		return max;
	}
	
	public static void imprime(int a)
	{
		System.out.println("O numero maior é: " + a);
	}

}
