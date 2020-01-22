package entities;

public class Student {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaFinal;
	
	public double obterNotaFinal()
	{
		notaFinal = nota1 + nota2 + nota3;
		return notaFinal;
	}
	public String estadoResultado()
	{
		String estado;
		if(notaFinal >= 60)
			estado ="PASS";
		else
		{
			estado ="FAILED";
			estado +="\nMISSING " + String.format("%.2f", 60 - notaFinal) + " POINTS";
		}
		return estado;
	}
}
