package entities;

public class ContaBancaria {
	private int numeroConta;
	private String nome;
	private double saldo;
	
	private static double TAXA = 5.0;
	
	public ContaBancaria(int numeroConta, String nome, double montanteInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		efetuarDeposito(montanteInicial);
	}


	public ContaBancaria(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public void efetuarDeposito(double montante)
	{
		this.saldo += montante;
		//System.out.println("efe");
	}
	public void efetuarSaque(double montante)
	{
		this.saldo -= (montante + TAXA);
	}
	//getter setters


	public int getNumeroConta() {
		return numeroConta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo() {
		return saldo;
	}
	public String toString()
	{
		return "Account: "
				+ this.getNumeroConta() 
				+ ", Holder: " + this.getNome() 
				+ ", Balance: €" + String.format("%.2f", this.getSaldo()) ;
				
	}
}
