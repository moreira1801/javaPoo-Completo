package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bank b1 = new Bank();
		
		System.out.print("Enter account number: ");
		b1.setNumeroConta(sc.nextInt());
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		b1.setTitular(sc.nextLine());
		
		System.out.print("Is there a initial deposit? (y/n) ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			b1.deposito(sc.nextDouble());
			
		} else {
			
		}
		System.out.println("");
		System.out.println("Account data: ");
		System.out.println("Account " + b1.getNumeroConta() + ", Holder: " + b1.getTitular() + ", Balance: $ " + b1.getValorInicial());
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		b1.deposito(sc.nextDouble());
		System.out.print("Updated account data: ");
		System.out.println("Account " + b1.getNumeroConta() + ", Holder: " + b1.getTitular() + ", Balance: $ " + b1.getValorInicial());
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		b1.saque(sc.nextDouble());
		System.out.print("Updated account data: ");
		System.out.println("Account " + b1.getNumeroConta() + ", Holder: " + b1.getTitular() + ", Balance: $ " + b1.getValorInicial());
		
		
	}
}
