package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		
		System.out.print("Student name: " );
		s1.nome = sc.nextLine();
		System.out.print("First grade: ");
		s1.nota1 = sc.nextDouble();
		System.out.print("Second grade: ");
		s1.nota2 = sc.nextDouble();
		System.out.print("Third grade: ");
		s1.nota3 = sc.nextDouble();
		
		s1.calcularNota();
		
		System.out.printf("Final Grade: %.2f%n", s1.notaFinal);
		
		
	}
}
