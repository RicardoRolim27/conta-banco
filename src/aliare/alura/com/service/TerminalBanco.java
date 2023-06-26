package aliare.alura.com.service;

import aliare.alura.com.entities.ContaBanco;

public class TerminalBanco {

	public String consultarSaldo(ContaBanco conta) {

		System.out.println(conta.getTitular());

		double saldo = conta.getSaldo();

		return "Seu saldo é de: " + saldo;
	}

	public void depositar(ContaBanco conta, double valor) {

		System.out.println(conta.getTitular());

		conta.recebeSaldo(valor);

	}
	
	public void tranferir(ContaBanco conta, double valor) {

		System.out.println(conta.getTitular());

		conta.transfereSaldo(valor);

	}

}
