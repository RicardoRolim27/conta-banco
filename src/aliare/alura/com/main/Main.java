package aliare.alura.com.main;

import java.util.Scanner;

import aliare.alura.com.entities.ContaBanco;
import aliare.alura.com.service.TerminalBanco;

public class Main {

	public static void main(String[] args) {

		TerminalBanco terminal = new TerminalBanco();

		ContaBanco conta = new ContaBanco();

		conta.setTitular("Ricardo");

		conta.setSaldo(5000);

		//System.out.println(conta.getTitular() + " " + conta.getSaldo());

		Scanner scanner = new Scanner(System.in);

		int opcao = 0;

		while (opcao != 4) {

			System.out.println("Seja bem-vindo ao terminal banc�rio " + conta.getTitular());

			System.out.println("Escolha uma das op��es:");

			System.out.println("1 - Consultar Saldo\n" + "2 - Depositar\n" + "3 - Transferir\n" + "4 - Sair");

			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println(terminal.consultarSaldo(conta));
				break;
			case 2:
				System.out.println("Qual valor deseja depositar?");

				double valorDeposito = scanner.nextDouble();

				terminal.depositar(conta, valorDeposito);

				System.out
						.println("Valor depositado: " + valorDeposito + "\n" + "Valor atualizado: " + conta.getSaldo());
				break;
			case 3:
				System.out.println("Qual valor deseja transferir?");

				System.out.println("saldo atual: " + conta.getSaldo());

				double valorTransferencia = scanner.nextDouble();

				if (conta.getSaldo() < valorTransferencia) {
					/*throw new IllegalArgumentException("Saldo insuficiente\n" + "Escolha um das op��es:\n"
							+ "1 - Consultar Saldo\n" + "2 - Depositar\n" + "4 - Sair");*/
					System.out.println("Saldo insuficiente\n" + "Escolha um das op��es:\n"
							+ "1 - Consultar Saldo\n" + "2 - Depositar\n" + "3 - Transferir\n" + "4 - Sair");
					break;
				} else {
					terminal.tranferir(conta, valorTransferencia);
					System.out.println("Valor Transferido: " + valorTransferencia + "\n" + "Valor Atualizado: "
							+ conta.getSaldo());
				}
				break;
			case 4:
				System.out.println("Saindo do terminal.");
				break;
			default:
				throw new IllegalArgumentException("Op��o inv�lida, favor escolher as op��es:\n"
						+ "1 - Consultar Saldo\n" + "2 - Depositar\n" + "4 - Sair");
			}

		}

	}

}
