import java.util.Locale;
import java.util.Scanner;

public class Aula36Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int quantidade;
		double cq, xs, xb, ts, rf;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			cq = 4 * quantidade;
			System.out.printf("Total: R$ %.2f%n", cq);
		} else if (codigo == 2){
			xs = 4.50 * quantidade;
			System.out.printf("Total:  R$ %.2f%n", xs);
		} else if(codigo == 3) {
			xb = 5 * quantidade;
			System.out.printf("Total: R$ %.2f%n", xb);
		} else if (codigo == 4) {
			ts = 2 * quantidade;
			System.out.printf("Total: R$ %.2f%n", ts);
		} else {
			rf =  1.5 * quantidade;
			System.out.printf("Total R$ %.2f%n", rf);
		}
		
		sc.close();
	}

}
