package curso_programacao;

public class Bank {
	private int numero;
	private String titular;
	private double valor;
		
	public Bank(int numeroConta, String titular, double valorInicial, double saldo) {
		super();
		this.numero = numeroConta;
		this.titular = titular;
		this.valor = valorInicial;
		
	}
	public Bank() {
		
	}
	void deposito(double deposito) {
		valor += deposito;
	}

	void saque(double saque) {
		 valor -= (saque + 5.00);
	}
	public int getNumeroConta() {
		return numero;
	}
	public void setNumeroConta(int numeroConta) {
		this.numero = numeroConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getValorInicial() {
		return valor;
	}
	public void setValorInicial(double valorInicial) {
		this.valor = valorInicial;
	}
	
	
}
