import java.util.Scanner;

public class Aula29Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		int horas;
		double salary; 
		double total;
		
		number = sc.nextInt();
		horas = sc.nextInt();
		salary = sc.nextDouble();
		
		total = salary * horas;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", + total);
		
		
	}

}
