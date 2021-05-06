package entidades;

import java.util.Scanner;

public class ContaCorrente extends Conta {

	public ContaCorrente(String agencia, int numeroConta, String nomeCliente, double saldo, boolean contaAtiva) {
		super(agencia, numeroConta, nomeCliente, saldo, contaAtiva);
	}

	public ContaCorrente(int numeroConta) {
		super(numeroConta);
	}

	Scanner sc = new Scanner(System.in);
	private double taxa = 0.005; // para saque
	public static double taxaTotal = 0;
	public static int cont = 505050;

	public static int getCont() {
		return cont++;
	}

	public static void setCont(int cont) {
		ContaCorrente.cont = cont;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public static double getTaxaTotal() {
		return taxaTotal;
	}

	public static void setTaxaTotal(double taxaTotal) {
		ContaCorrente.taxaTotal = taxaTotal;
	}

	@Override
	void sacar(double valor) {

		if (valor > this.getSaldo()) {
			System.err.println("Saldo insuficiente");

		} else {

			this.setSaldo(this.getSaldo() - valor - (valor * taxa));

			taxaTotal = taxaTotal + (taxa * valor);

			System.err.println(
					"Saldo Atual na CONTA CORRENTE: " + this.getSaldo() + "  Taxa da transa��o: " + valor * taxa);

		}
	}

	@Override
	void depositar(double valor) {

		this.setSaldo(this.getSaldo() + valor);
		System.err.println("Ol�, " + getNomeCliente() + "! Seu saldo Atual na CONTA CORRENTE: " + this.getSaldo());

	}

	@Override
	void abrirConta() {

		System.err.println(" CADASTRO DE NOVA CONTA CORRENTE\nDigite o NOME do cliente: ");
		this.setNomeCliente(sc.nextLine());

		this.setAgencia("1010-CC"); // Agencia possue n�mero padr�o

		this.setContaAtiva(true);

		this.setNumero(ContaCorrente.cont);

	}

	@Override
	void fecharConta(double valor) {

		if (this.getSaldo() >= 1) {

			System.err.println(
					"N�o � poss�vel encerrar a conta! Ainda existe saldo dispon�vel. SALDO: " + this.getSaldo());

		} else {

			this.setAgencia(null);
			this.setNumero(0);
			this.setNomeCliente(null);
			this.setContaAtiva(false);

			System.err.println("Conta ENCERRADA com sucesso!");
		}

	}

	void exibirDados() {

		if (this.isContaAtiva() == true) {

			System.out.println("Nome: " + this.getNomeCliente() + "   Agencia :" + this.getAgencia()
					+ "   Numero da Conta :" + this.getNumero() + "   Saldo :" + this.getSaldo());

		}

	}

}
