package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.setTitular("Ozzy");
		conta.deposita(300.0);
	}
}
