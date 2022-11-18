import java.util.Locale;
import java.util.Scanner;

public class ExercicioAula26 {

	public static void main(String[] args) {
		
		//DEFINIDO PARA O TECLADO AMERICA COM PONTO
		Locale.setDefault(Locale.US);
		
		//ENTRADA DE DADOS
		Scanner sc = new Scanner(System.in);
		
		//CHAR
		char x;
		x = sc.next().charAt(0);
		System.out.println("Voce digitou: " + x);
		
		//INT
		int y;
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		
		//STRING	
		String z;
		z = sc.next();
		System.out.println("Voce digitou: " + z);
		
		//DOUBLE
		double m;
		m = sc.nextDouble();
		System.out.println("Voce digitou: " + m);
		
		sc.close();
		
	}

}
