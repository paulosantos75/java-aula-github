package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/*
 * Aula 65
 */
public class ProgramProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter product data:");

		System.out.print("Name:");
		String name = sc.nextLine();
		
		System.out.print("Price:");
		double price = sc.nextDouble();
		/*
		System.out.print("Quantity in stock:");
		int quantity = sc.nextInt();
		 */
		Product product = new Product(name, price);
		System.out.println("\nProduct data: " + product);// toString

		// adicionar produtos
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("\nUpdated data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("\nUpdated data: " + product);

		sc.close();
	}

}
