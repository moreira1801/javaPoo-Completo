import java.util.Scanner;

public class Aula53Exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		x = sc.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i % 2 > 0) {
				System.out.println(i);
			}
		}
	}

}
