import java.util.Locale;
import java.util.Scanner;

public class Aula29Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		double x;
		double a;
		
		x = sc.nextDouble();
		
		a = pi * x * x;
		
		System.out.printf("A = %.4f%n", a);
		
		sc.close();
	}

}
