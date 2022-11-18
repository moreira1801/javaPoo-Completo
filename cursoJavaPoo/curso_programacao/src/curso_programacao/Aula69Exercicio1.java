package curso_programacao;

public class Aula69Exercicio1 {
	//atributos
	public double a;
	public double b;
	
	public double area;
	public double perimetro;
	public double diagonal;
	
	//métodos
	void area() {
		area = a*b;
	}
	
	void perimetro() {
		perimetro = 2*(a+b);
	}
	
	void diagonal() {
		diagonal = Math.sqrt((b * b) + (a * a));
	}
}
