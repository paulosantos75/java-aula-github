package entities;
/*
 * Aula 63
 */
public class Triangulo {

	//atributos
	public double a;
	public double b;
	public double c;

	public double area()
	{
		double p = (a + b + c)/2.0;
		return Math.sqrt(p*(p - a) * (p - b)*(p - c));
	}

}
