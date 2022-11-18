import java.util.Scanner;

public class Aula53Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double divisao;
		
		for (int i = 0; i < N; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if (b == 0) {
				System.out.println("Divisao impossivel");
			} else {
			divisao = a / b;
			System.out.println(divisao);
			}
		}
				
	}

}
