import java.util.Locale;
import java.util.Scanner;

//entrada de dados
public class Aula24 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("Digite um caracter: ");
		
		String x;
		int y;
		double z;
		//String x = sc.next();
		//char x = sc.next().charAt(0);
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: " + x + ", " + y + ", " + z);
		
		
		sc.close();
	}

}
