package entidades;

import java.util.Scanner;

public abstract class Conta {

	private String agencia;
	private int numeroConta;
	private String nomeCliente;
	private double saldo;
	private boolean contaAtiva = false;

	public Conta(String agencia, int numeroConta, String nomeCliente, double saldo, boolean contaAtiva) {
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		this.contaAtiva = contaAtiva;
	}

	public Conta(int numeroConta) {
		super();
		this.numeroConta = numeroConta;
	}

	Scanner sc = new Scanner(System.in);

	abstract void sacar(double valor);

	abstract void depositar(double valor);

	abstract void abrirConta();

	abstract void fecharConta(double valor);

	public int escolherMenu(ContaCorrente c1, ContaCorrente c2, ContaCorrente c3, ContaCorrente c4, ContaCorrente c5,
			ContaPoupanca p1, ContaPoupanca p2, ContaPoupanca p3, ContaPoupanca p4, ContaPoupanca p5) {

		exibeBancodeDados(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5);

		System.out.println(
				"\n[1] SACAR\n[2] DEPOSITAR\n[3] TRANSFERIR\n[4] ABRIR CONTA\n[5] FECHAR CONTA\n\n\nDigite sua Op��o: ");
		int op = sc.nextInt();

		return op;

	}

	void exibeBancodeDados(ContaCorrente c1, ContaCorrente c2, ContaCorrente c3, ContaCorrente c4, ContaCorrente c5,
			ContaPoupanca p1, ContaPoupanca p2, ContaPoupanca p3, ContaPoupanca p4, ContaPoupanca p5) {

		for (int i = 0; i < 25; i++) {
			System.out.println("");
		} // limpa tela

		System.out.println(
				"\n\nCONTAS ATIVAS NO NEW BANK JPR\n===============================================================================\n");

		c1.exibirDados();
		c2.exibirDados();
		c3.exibirDados(); // exibe dados de todas contas CORRENTES ativas
		c4.exibirDados();
		c5.exibirDados();

		p1.exibirDados();
		p2.exibirDados();
		p3.exibirDados(); // exibe dados de todas contas POUPAN�AS ativas
		p4.exibirDados();
		p5.exibirDados();

		System.out.println(
				"\nTotal de TAXAS: " + ContaCorrente.taxaTotal + "\nTotal de BONUS: " + ContaPoupanca.bonusTotal
						+ "\n===============================================================================\n");

	}

	public void selecionarContaSaque(ContaCorrente c1, ContaCorrente c2, ContaCorrente c3, ContaCorrente c4, ContaCorrente c5,
			ContaPoupanca p1, ContaPoupanca p2, ContaPoupanca p3, ContaPoupanca p4, ContaPoupanca p5) {

		exibeBancodeDados(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5);

		System.out.println("\nOp��o Selecionada:     SACAR \n\nDigite o numero da Conta ");
		int conta = sc.nextInt();

		System.out.println("\nDigite o valor do saque ");
		double saque = sc.nextDouble();

		if (c1.getNumero() == conta) {
			c1.sacar(saque);
		} else if (c2.getNumero() == conta) {
			c2.sacar(saque);
		} else if (c3.getNumero() == conta) {
			c3.sacar(saque);
		} else if (c4.getNumero() == conta) {
			c4.sacar(saque);
		} else if (c5.getNumero() == conta) {
			c5.sacar(saque);
		} else if (p1.getNumero() == conta) {
			p1.sacar(saque);
		} else if (p2.getNumero() == conta) {
			p2.sacar(saque);
		} else if (p3.getNumero() == conta) {
			p3.sacar(saque);
		} else if (p4.getNumero() == conta) {
			p4.sacar(saque);
		} else if (p5.getNumero() == conta) {
			p5.sacar(saque);
		} else {
			System.err.println("CONTA NAO EXISTE");
		}

	}

	public void selecionarContaDeposito(ContaCorrente c1, ContaCorrente c2, ContaCorrente c3, ContaCorrente c4,
			ContaCorrente c5, ContaPoupanca p1, ContaPoupanca p2, ContaPoupanca p3, ContaPoupanca p4,
			ContaPoupanca p5) {

		exibeBancodeDados(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5);

		System.out.println("\nOp��o Selecionada:     Depositar \n\nDigite o numero da Conta ");
		int conta = sc.nextInt();

		System.out.println("\nDigite o valor do deposito ");
		double deposito = sc.nextDouble();

		if (c1.getNumero() == conta) {
			c1.depositar(deposito);
		} else if (c2.getNumero() == conta) {
			c2.depositar(deposito);
		} else if (c3.getNumero() == conta) {
			c3.depositar(deposito);
		} else if (c4.getNumero() == conta) {
			c4.depositar(deposito);
		} else if (c5.getNumero() == conta) {
			c5.depositar(deposito);
		} else if (p1.getNumero() == conta) {
			p1.depositar(deposito);
		} else if (p2.getNumero() == conta) {
			p2.depositar(deposito);
		} else if (p3.getNumero() == conta) {
			p3.depositar(deposito);
		} else if (p4.getNumero() == conta) {
			p4.depositar(deposito);
		} else if (p5.getNumero() == conta) {
			p5.depositar(deposito);
		} else {
			System.err.println("CONTA NAO EXISTE");
		}
	}

	public void selecionarContaTranferir(ContaCorrente c1, ContaCorrente c2, ContaCorrente c3, ContaCorrente c4,
			ContaCorrente c5, ContaPoupanca p1, ContaPoupanca p2, ContaPoupanca p3, ContaPoupanca p4,
			ContaPoupanca p5) {

		exibeBancodeDados(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5);

		System.out.println("\nOp��o Selecionada:     Transferir \n\nDigite o numero da sua CONTA: ");
		int conta = sc.nextInt();

		System.out.println("\nDigite o valor da TRANSFER�NCIA: ");
		double valorTransf = sc.nextDouble();

		if (valorTransf <= 0) {

			System.err.println("DIGITE UM VALOR V�LIDO PARA TRANSFER�NCIA!");

		} else if (c1.getNumero() == conta && c1.getSaldo() >= valorTransf) {

			c1.transferir(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5, valorTransf);
			c1.setSaldo(c1.getSaldo() - valorTransf);

		} else if (c2.getNumero() == conta && c2.getSaldo() >= valorTransf) {

			c2.transferir(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5, valorTransf);
			c2.setSaldo(c2.getSaldo() - valorTransf);

		} else if (c3.getNumero() == conta && c3.getSaldo() >= valorTransf) {

			c3.transferir(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5, valorTransf);
			c3.setSaldo(c3.getSaldo() - valorTransf);

		} else if (c4.getNumero() == conta && c4.getSaldo() >= valorTransf) {

			c4.transferir(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5, valorTransf);
			c4.setSaldo(c4.getSaldo() - valorTransf);

		} else if (c5.getNumero() == conta && c5.getSaldo() >= valorTransf) {

			c5.transferir(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5, valorTransf);
			c5.setSaldo(c5.getSaldo() - valorTransf);
		} else if (p1.getNumero() == conta && p1.getSaldo() >= valorTransf) {

			p1.transferir(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5, valorTransf);
			p1.setSaldo(p1.getSaldo() - valorTransf);
		} else if (p2.getNumero() == conta && p2.getSaldo() >= valorTransf) {

			p2.transferir(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5, valorTransf);
			p2.setSaldo(p2.getSaldo() - valorTransf);
		} else if (p3.getNumero() == conta && p3.getSaldo() >= valorTransf) {

			p3.transferir(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5, valorTransf);
			p3.setSaldo(p3.getSaldo() - valorTransf);
		} else if (p4.getNumero() == conta && p4.getSaldo() >= valorTransf) {

			p4.transferir(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5, valorTransf);
			p4.setSaldo(p4.getSaldo() - valorTransf);
		} else if (p5.getNumero() == conta && p5.getSaldo() >= valorTransf) {

			p5.transferir(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5, valorTransf);
			p5.setSaldo(p5.getSaldo() - valorTransf);
		} else {

			System.err.println("SALDO INSUFICIENTE PARA TRANSFERENCIA!");
		}

	}

	void transferir(ContaCorrente c1, ContaCorrente c2, ContaCorrente c3, ContaCorrente c4, ContaCorrente c5,
			ContaPoupanca p1, ContaPoupanca p2, ContaPoupanca p3, ContaPoupanca p4, ContaPoupanca p5, double valor) {

		System.out.println("\n\nDigite o numero da conta do BENEFICIARIO: ");
		int beneficiario = sc.nextInt();

		if (c1.getNumero() == beneficiario) {

			c1.depositar(valor);

		} else if (c2.getNumero() == beneficiario) {

			c2.depositar(valor);

		} else if (c3.getNumero() == beneficiario) {

			c3.depositar(valor);

		} else if (c4.getNumero() == beneficiario) {

			c4.depositar(valor);

		} else if (c5.getNumero() == beneficiario) {

			c5.depositar(valor);

		} else if (p1.getNumero() == beneficiario) {

			p1.depositarTransf(valor);

		} else if (p2.getNumero() == beneficiario) {

			p2.depositarTransf(valor);

		} else if (p3.getNumero() == beneficiario) {

			p3.depositarTransf(valor);

		} else if (p4.getNumero() == beneficiario) {

			p4.depositarTransf(valor);

		} else if (p5.getNumero() == beneficiario) {

			p5.depositarTransf(valor);

		} else {

			System.err.println("CONTA NAO EXISTE");
		}

	}

	public void selecionarContaAbertura(ContaCorrente c1, ContaCorrente c2, ContaCorrente c3, ContaCorrente c4,
			ContaCorrente c5, ContaPoupanca p1, ContaPoupanca p2, ContaPoupanca p3, ContaPoupanca p4,
			ContaPoupanca p5) {

		exibeBancodeDados(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5);

		System.out.println(
				"\nOp��o Selecionada:     Abrir Conta \n\nDesejar abrir uma CONTA CORRENTE [1] ou uma CONTA POUPAN�A [2]");
		int opcaoConta = sc.nextInt();

		if (c1.isContaAtiva() == false && opcaoConta == 1) {
			c1.abrirConta();
		} else if (c2.isContaAtiva() == false && opcaoConta == 1) {
			c2.abrirConta();
		} else if (c3.isContaAtiva() == false && opcaoConta == 1) {
			c3.abrirConta();
		} else if (c4.isContaAtiva() == false && opcaoConta == 1) {
			c4.abrirConta();
		} else if (c5.isContaAtiva() == false && opcaoConta == 1) {
			c5.abrirConta();
		} else if (p1.isContaAtiva() == false && opcaoConta == 2) {
			p1.abrirConta();
		} else if (p2.isContaAtiva() == false && opcaoConta == 2) {
			p2.abrirConta();
		} else if (p3.isContaAtiva() == false && opcaoConta == 2) {
			p3.abrirConta();
		} else if (p4.isContaAtiva() == false && opcaoConta == 2) {
			p4.abrirConta();
		} else if (p5.isContaAtiva() == false && opcaoConta == 2) {
			p5.abrirConta();
		} else {
			System.err.println("OP��O INV�LIDA");
		}

	}

	public void selecionarContaEncerrar(ContaCorrente c1, ContaCorrente c2, ContaCorrente c3, ContaCorrente c4,
			ContaCorrente c5, ContaPoupanca p1, ContaPoupanca p2, ContaPoupanca p3, ContaPoupanca p4,
			ContaPoupanca p5) {

		exibeBancodeDados(c1, c2, c3, c4, c5, p1, p2, p3, p4, p5);

		System.out.println("\nOp��o Selecionada:     Fechar Conta \n\nDigite o numero da Conta a ser ENCERRADA: ");
		int conta = sc.nextInt();

		// System.out.println("\nDigite o valor do saque ");
		double encerra = 0;

		if (c1.getNumero() == conta) {
			c1.fecharConta(encerra);
		} else if (c2.getNumero() == conta) {
			c2.fecharConta(encerra);
		} else if (c3.getNumero() == conta) {
			c3.fecharConta(encerra);
		} else if (c4.getNumero() == conta) {
			c4.fecharConta(encerra);
		} else if (c5.getNumero() == conta) {
			c5.fecharConta(encerra);
		} else if (p1.getNumero() == conta) {
			p1.fecharConta(encerra);
		} else if (p2.getNumero() == conta) {
			p2.fecharConta(encerra);
		} else if (p3.getNumero() == conta) {
			p3.fecharConta(encerra);
		} else if (p4.getNumero() == conta) {
			p4.fecharConta(encerra);
		} else if (p5.getNumero() == conta) {
			p5.fecharConta(encerra);
		} else {
			System.err.println("CONTA NAO EXISTE");
		}

	}

	void exibirSaldo() {
		System.out.println("Seu saldo � :" + saldo);
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numeroConta;
	}

	public void setNumero(int numero) {
		this.numeroConta = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isContaAtiva() {
		return contaAtiva;
	}

	public void setContaAtiva(boolean contaAtiva) {
		this.contaAtiva = contaAtiva;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numeroConta + ", nomeDono=" + nomeCliente + ", saldo="
				+ saldo + ", contaAtiva=" + contaAtiva + "]";
	}

}
