package exercicio3;

public class ContaCorrente {
	private String numero;
	private double saldo = 0;
	
	ContaCorrente(){}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
}
