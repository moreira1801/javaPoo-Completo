package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		CurrencyConverter a = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		a.dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		a.quantity = sc.nextDouble();
		a.converter();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", a.real);
		
		sc.close();
	}
}
