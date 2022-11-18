import java.util.Scanner;

public class Aula48Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int g = 0;
		int d = 0;
		int co = 0;
		
		while(co != 4) {
			co = sc.nextInt();
			if (co == 1) {
				a += 1;
			} else if (co == 2) {
				g+= 1;
			} else if (d == 3) {
				d += 1;
			} else if(co == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + a);
				System.out.println("Gasolina: " + g);
				System.out.println("Diesel: " + d);
			}
			
		}
		
	}

}
