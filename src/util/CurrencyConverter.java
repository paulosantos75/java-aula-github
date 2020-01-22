package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double quantidadePagar(double price, double quantity)
	{
		return quantity * price*(1+IOF) ;
	}
}
