package curso_programacao;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public double netSalary;
	
	
	public void netSalary() {
		netSalary = grossSalary - tax;
	}
	
	void increaseSalary(double porcentagem) {
		grossSalary = (grossSalary + (grossSalary * porcentagem) /100) - tax;
	}

}
