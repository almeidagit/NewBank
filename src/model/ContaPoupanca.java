package model;

public class ContaPoupanca extends Conta {
	
	private double bonus = 1.005; // somado ao valor do deposito
	
	@Override
	boolean sacar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
		this.setSaldo(this.getSaldo() + bonus);
		return true;
	}
	
	void exibirDados() {
		System.out.println("Voce está em conta Poupança");
		System.out.println("nome" + this.getNomeDono());
		System.out.println("Agencia" + this.getAgencia());
		System.out.println("Numero da conta" + this.getNumero());
	
	}
	
	//depositar 

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	

}
