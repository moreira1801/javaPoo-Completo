package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee a = new Employee();
		System.out.print("Name: ");
		a.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		a.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		a.tax = sc.nextDouble();
		
		a.netSalary();
		
		System.out.printf("Employee: " + a.name + ", $ %.2f%n", a.netSalary);
		
		System.out.print("Which percentage to increase salary? ");
		double porcetagem = sc.nextDouble();
		
		a.increaseSalary(porcetagem);
		
		System.out.printf("Update data: " + a.name + ", $ %.2f%n", a.grossSalary);
				
		sc.close();
	}

}
