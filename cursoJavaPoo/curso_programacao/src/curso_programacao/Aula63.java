package curso_programacao;

import java.util.Scanner;

public class Aula63 {

	public static void main(String[] args) {
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Medidas do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Medidas do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double area1 = x.area();
		double area2 = y.area();
	
		System.out.printf("Area do triangulo X: %.4f%n", area1);
		System.out.printf("Area do triangulo Y: %.4f%n", area2);
		
		if(area1 > area2) {
			System.out.print("X e maior");
		} else {
			System.out.print("Y e maior");
		}
		
		sc.close();
		
	}

}
