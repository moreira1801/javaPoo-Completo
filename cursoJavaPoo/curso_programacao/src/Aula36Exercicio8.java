import java.util.Locale;
import java.util.Scanner;

public class Aula36Exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto = 0;
		
		if (salario <= 2000) {
			System.out.println("Isento");
		} 
		else if(salario <= 3000) {
			imposto = (salario - 2000) * 0.8;
		} 
		else if(salario <= 4500) {
			imposto = salario - 3000.01 * 18/100;
		} 
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
	}

}
