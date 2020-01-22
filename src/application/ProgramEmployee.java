package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();
		
		System.out.println("Name:");
		emp.name = sc.nextLine();
		System.out.println("Gross salary:");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax:");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: " + emp);
		
		System.out.print("Which percentage to increase salary?");
		double percentagem = sc.nextDouble();
		emp.increaseSalary(percentagem);
		
		System.out.println("Updated data: " + emp);
		sc.close();
	}

}
