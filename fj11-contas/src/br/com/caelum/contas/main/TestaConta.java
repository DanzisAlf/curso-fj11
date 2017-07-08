package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Ozzy");
		conta.deposita(300.0);

		if (conta.saca(100.0)) {
			System.out.println("Sacou");
		} else {
			System.out.println("Nao Sacou");
		}
	}
}
