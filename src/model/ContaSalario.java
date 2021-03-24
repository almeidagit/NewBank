package model;

public class ContaSalario extends Conta {

	private String empresa ;
		
	@Override
	boolean sacar(double valor) {
		return true;
	}
	
	
}
