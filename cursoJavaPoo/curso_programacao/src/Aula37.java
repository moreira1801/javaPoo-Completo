import java.util.Locale;
import java.util.Scanner;

public class Aula37 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double minutos = sc.nextDouble();
		double valor, total;
		
		if (minutos > 100) {
			valor = (minutos - 100) * 2;
			total = valor + 50;
			System.out.printf("Valor a pagar R$: %.2f%n", total);
		} else {
			System.out.println("Valor a pagar = R$ "  + 100);
		}
		
		sc.close();
	}

}
