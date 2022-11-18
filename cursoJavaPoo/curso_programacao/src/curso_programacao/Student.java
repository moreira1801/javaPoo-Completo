package curso_programacao;

public class Student {
	String nome;
	double nota1;
	double nota2;
	double nota3;
	double notaFinal;
	double points;
	
	void calcularNota() {
		notaFinal  = nota1 + nota2 + nota3;
		if (notaFinal >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			points = 60 - notaFinal;
			System.out.println("MISSING " + points + " points");
		}
	}
}
