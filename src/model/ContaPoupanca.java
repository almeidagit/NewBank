package model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String agencia, int numeroConta, String nomeCliente, double saldo, boolean contaAtiva) {
		super(agencia, numeroConta, nomeCliente, saldo, contaAtiva);

	}

	private double bonus = 1.005; // somado ao valor do deposito
	public static double bonusTotal = 0;

	@Override
	void sacar(double valor) {

		if (valor > this.getSaldo()) {

			System.err.println("Saldo insuficiente");

		} else {

			this.setSaldo(this.getSaldo() - valor);

			System.err.println("Saldo Atual na CONTA POUPANÇA: " + this.getSaldo());

		}

	}

	@Override
	void depositar(double valor) {

		this.setSaldo(this.getSaldo() + (valor * bonus));

		bonusTotal = bonusTotal + ((bonus - 1) * valor);

		System.err.printf("Olá, " + getNomeCliente() + "! Seu saldo Atual na CONTA POUPANÇA: " + this.getSaldo()
				+ "  Bonus recebido: " + (bonus - 1) * valor);

	}

	void depositarTransf(double valor) {

		this.setSaldo(this.getSaldo() + valor);

		System.err.printf("Olá, " + getNomeCliente() + "! Seu saldo Atual na CONTA POUPANÇA: " + this.getSaldo());

	}

	@Override
	void abrirConta() {

		System.err.println(" CADASTRO DE NOVA CONTA POUPANÇA\nDigite o NOME do cliente: ");
		this.setNomeCliente(sc.nextLine());

		this.setAgencia("1010-CP"); // Agencia possue número padrão

		this.setNumero(ContaCorrente.cont);

		this.setContaAtiva(true);
	}

	@Override
	void fecharConta(double valor) {

		if (this.getSaldo() >= 1) {

			System.err.println(
					"Não é possível encerrar a conta! Ainda existe saldo disponível. SALDO: " + this.getSaldo());

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
			// System.out.println(toString());
			System.out.println("Nome: " + this.getNomeCliente() + "   Agencia :" + this.getAgencia()
					+ "   Numero da Conta :" + this.getNumero() + "   Saldo :" + this.getSaldo());

		}

	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
