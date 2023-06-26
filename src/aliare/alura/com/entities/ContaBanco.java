package aliare.alura.com.entities;

public class ContaBanco {

	String titular;
	double saldo;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void recebeSaldo(double valor) {
		double somaValor = this.saldo + valor;

		this.setSaldo(somaValor);
	}

	public void transfereSaldo(double valor) {
		double diminuiValor = this.saldo - valor;

		this.setSaldo(diminuiValor);

	}

}
