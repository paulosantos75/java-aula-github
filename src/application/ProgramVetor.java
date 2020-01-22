package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//declara vector
		double[] vect = new double[n];
		//preenche vector
		for(int i = 0; i<3; i++){
			vect[i]=sc.nextDouble();
		}
		double soma = 0;
		for(int i = 0; i<n; i++) {
			soma += vect[i];
		}
		double avg = soma/n;
		
		System.out.printf("Media = %.2f", avg);
		
		sc.close();
	}

}
