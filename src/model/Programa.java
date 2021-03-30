package model;

import java.util.Scanner;

public class Programa {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 1;

		ContaCorrente cc1 = new ContaCorrente("1010-CC", 102030, "Maria", 500, true);
		ContaCorrente cc2 = new ContaCorrente("1010-CC", 102031, "Jose", 1000, true);
		ContaCorrente cc3 = new ContaCorrente(null, 0, null, 0, false);
		ContaCorrente cc4 = new ContaCorrente(null, 0, null, 0, false);
		ContaCorrente cc5 = new ContaCorrente(null, 0, null, 0, false);
		ContaPoupanca cp1 = new ContaPoupanca("1010-CP", 202030, "Maria", 2000, true);
		ContaPoupanca cp2 = new ContaPoupanca("1010-CP", 202031, "Pedro", 3000, true);
		ContaPoupanca cp3 = new ContaPoupanca(null, 0, null, 0, false);
		ContaPoupanca cp4 = new ContaPoupanca(null, 0, null, 0, false);
		ContaPoupanca cp5 = new ContaPoupanca(null, 0, null, 0, false);
		ContaCorrente cont = new ContaCorrente(302050);
//		REGRAS GERAIS DO BANCO
//		
//		SAQUES EM CONTA CORRENTE SERÃO TAXADOS EM 0,5% DIANTE DO VALOR SACADO.
//		DEPOSITOS EM CONTA POUPANÇA TERÃO RENDIMENTO DE 0,6% SOBRE O VALOR DEPOSITADO.
//		TRANSFERENCIAS NÃO POSSUEM TAXAS.

		while (opcao < 10) {

			opcao = cc1.escolherMenu(cc1, cc2, cc3, cc4, cc5, cp1, cp2, cp3, cp4, cp5);

			if (opcao == 1) { // sacar

				cc1.selecionarContaSaque(cc1, cc2, cc3, cc4, cc5, cp1, cp2, cp3, cp4, cp5);

			} else if (opcao == 2) { // depositar

				cc1.selecionarContaDeposito(cc1, cc2, cc3, cc4, cc5, cp1, cp2, cp3, cp4, cp5);

			} else if (opcao == 3) { // transferir

				cc1.selecionarContaTranferir(cc1, cc2, cc3, cc4, cc5, cp1, cp2, cp3, cp4, cp5);

			} else if (opcao == 4) { // abrir conta

				cont.setNumero(ContaCorrente.getCont());
				cc1.selecionarContaAbertura(cc1, cc2, cc3, cc4, cc5, cp1, cp2, cp3, cp4, cp5);

			} else if (opcao == 5) { // fechar conta

				cc1.selecionarContaEncerrar(cc1, cc2, cc3, cc4, cc5, cp1, cp2, cp3, cp4, cp5);

			} else {

			}

			System.out.println("\n\ndeseja continuar? [1] sim           [2]nao");
			opcao = sc.nextInt();

			if (opcao == 2) {
				opcao = 10; // encerra programa
			}

		} // true

	}

}
