import java.util.Scanner;

public class Aula48Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y = 1;
		int x = 1;

		while (x != 0 && y != 0) {
			x = sc.nextInt();
			y = sc.nextInt();

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} 
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} 
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
		}
		sc.close();
	}
}
