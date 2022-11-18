import java.util.Scanner;

public class Aula36Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		if (n % 2 == 0) {
			System.out.println("O numero e PAR");
		} else {
			System.out.println("O numero e IMPAR");
		}
	}

}
