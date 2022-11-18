package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Aula69Exercicio1Test {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aula69Exercicio1 x;
		
		x = new Aula69Exercicio1();
		
		System.out.println("Digite a altura e o comprimento do ratangulo");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		x.area();
		x.perimetro();
		x.diagonal();
		
		System.out.printf("AREA: %.2f%n" ,x.area);
		System.out.printf("PERIMETRO: %.2f%n", x.perimetro);
		System.out.printf("DIAGONAL: %.2f%n", x.diagonal);
		
		sc.close();
	}

}
