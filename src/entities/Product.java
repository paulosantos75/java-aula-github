package entities;

public class Product {

	//--atributos
	private String name;
	private double price;
	private int quantity;

	//-- sobrecarga construtores
	
	
	public Product(String name, double price, int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
		
	}
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	//--metodos
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	//getters e setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	//o metodo setQuantity(int quantity) não eh implementado por razoes de seguranca da aplicacao.
	//a qtd só e alterada por entrada e saida de stock

	public String toString() {
		return name 
				+ ", € " 
				+ String.format("%.2f", price)
				+ ", " 
				+ quantity
				+ " units, Total: € "
				+ String.format("%.2f", totalValueInStock());
	}
}
