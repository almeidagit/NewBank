package model;

public class ContaExemplo {
	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		
		cc1.setSaldo(100);
		cp1.setSaldo(200);
		
		cc1.sacar(50);
		cc1.exibirSaldo();
		
		cp1.sacar(200);
		cp1.exibirSaldo();
		
		

	}

}
