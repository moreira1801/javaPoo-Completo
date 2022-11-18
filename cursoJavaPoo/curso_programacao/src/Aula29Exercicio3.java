import java.util.Scanner;

public class Aula29Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		int B; 
		int C;
		int D;
		double resultado;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		resultado = (A * B - C * D);
		
		
		
		System.out.println("DIFERENCA = " + resultado);
		
		sc.close();
	}

}
