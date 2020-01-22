package exercicios.capitulo5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered?");
		int numero=sc.nextInt();
	

		List<Employee> listaEmpregados = new ArrayList<>();
		
		for(int i = 1; i <= numero; i++)
		{
			sc.nextLine();
			System.out.println();
			System.out.println("Emplyoee #" + i + ":");
			
			System.out.print("Id:");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			listaEmpregados.add(new Employee(id, nome, salario));
		}
		
		//--PARTE 2
		
		System.out.print("\nEnter the employee id that will have salary increase:");
		int id = sc.nextInt();
		
		Employee empFound = listaEmpregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (empFound == null) {
			System.out.println("This ID does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			empFound.aumentarSalario(percentage);
		}
		
		
		//--PARTE 3
		System.out.println();
		System.out.println("List of employees:");
		
		for(Employee emp: listaEmpregados)
		{
			System.out.println(emp.toString());
		}
		sc.close();
		
		
	}

}
