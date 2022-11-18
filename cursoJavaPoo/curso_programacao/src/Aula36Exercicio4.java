import java.util.Scanner;

public class Aula36Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int f = sc.nextInt();
		int tempos;
		
		tempos = i - f;
		if ( i  < f) {
			tempos = f - i;
			
		} else {
			tempos = 24 - i + f;
		}
		
		System.out.println("O JOGO DUROU " +  tempos + " HORA(S)");
		
		sc.close();
	}

}
