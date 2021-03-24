package model;

public abstract class Conta {

	private String agencia; 
	private int numeroConta; 
	private String nomeCliente;
	private double saldo;
	private boolean contaAtiva = false;
	boolean saldoOk = false;
	
	
	
	boolean sacar(double valor) {
		if (valor > this.saldo) {
			System.err.println("Saldo insuficiente");
			this.saldoOk = false;
			return saldoOk;

		} else {
			this.saldo = saldo - valor;
			saldoOk = true;
			return saldoOk;
		}
	}

	void depositar(double valor) {
		this.saldo = saldo + valor;
	}

	void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		if (this.saldoOk == true) {
			contaDestino.depositar(valor);
		}
	}

	void abrirConta() {
		if (this.contaAtiva == true) {
			System.out.println("Conta já esta aberta");
		} else {
			this.contaAtiva = true;
			System.out.println("Conta aberta com sucesso!");
		}
	}

	void fecharConta() {
		if (this.contaAtiva == false) {
			System.out.println("Conta está inativa");
		} else {
			this.setAgencia(null);
			this.setNomeDono(null);
			this.setNumero(0);
			this.setSaldo(0);
			this.contaAtiva = false;
			System.out.println("Conta fechada com sucesso!");
		}

	}

	void exibirSaldo() {
		System.out.println("Seu saldo é :" + saldo);
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

	public String getNomeDono() {
		return nomeCliente;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeCliente = nomeDono;
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
		return "Conta [agencia=" + agencia + ", numero=" + numeroConta + ", nomeDono=" + nomeCliente + ", saldo=" + saldo
				+ ", contaAtiva=" + contaAtiva + "]";
	}

}
