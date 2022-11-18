package curso_programacao;

import java.util.Scanner;

public class TestTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test Test = new Test();
		
		Test.getName();
		Test.getPrice();
		Test.getQuantity();
		
		
		
		System.out.print("Nome: ");
		Test.setName(sc.next());
		System.out.print("Price: ");
		Test.setPrice(sc.nextDouble());
		System.out.print("Quantity: ");
		Test.setQuantity(sc.nextInt());
		
		Test Test1 = new Test("TV", 1200, 1);
		System.out.println(Test1.getName() + " " + Test1.getPrice() + Test1.getQuantity());
		
		
	}

}
