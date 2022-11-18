import java.util.Scanner;

public class Aula53Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int fatoral = 1;
		
		for (int i = 1; i <= N; i++) {
			fatoral = i * fatoral;
		}
		System.out.println(fatoral);
	}

}
