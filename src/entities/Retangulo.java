package entities;
//https://matematicabasica.net/perimetro-do-retangulo/
public class Retangulo {
	public double width;
	public double heigth;
	
	public double area()
	{
		return width * heigth;
	}
	public double perimeter()
	{
		//P = 2(b + h)
		return 2 *(width + heigth);
		
	}
	public double diagonal() {
		//d² = b² + h²
		return Math.sqrt(width * width + heigth*heigth);
	}
}
