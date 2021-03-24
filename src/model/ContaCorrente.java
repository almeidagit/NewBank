package model;

public class ContaCorrente extends Conta {
	private double taxa = 2;  //para transferencia e saque
	
	@Override
	boolean sacar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
		this.setSaldo(this.getSaldo() - taxa);
		return true;
	}
	
	void exibirDados() {
		System.out.println("Olá, você está na conta corrente");
		System.out.println("Nome: " + this.getNomeDono());
		System.out.println("Agencia : " + this.getAgencia());
		System.out.println("Numero da Conta :" + this.getNumero());
	}

	public double getDesconto() {
		return taxa;
	}

	public void setDesconto(double desconto) {
		this.taxa = desconto;
	}

	

	
}
