package br.com.caelum.contas;

import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	/* declara a variavel para todo metodo */
	private Conta conta;

	/* instancia o new conta para "forcar" criar conta */
	public void criaConta(Evento evento) {

		/*
		 * selecionar o tipo de conta no radio button buscando o input escrito
		 * no campo de nome tipo
		 */

		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else if (tipo.equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
		}

		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
	}

	public void deposita(Evento evento) {
		/*
		 * valorOperacao eh o novo nome do campo substituindo ao campo valor
		 */
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDigitado);

	}

	public void saca(Evento evento) {
		/*
		 * valorOperacao eh o novo nome do campo substituindo ao campo valor nao
		 * precisa do if, pois o tipo de conta ja eh definido na criacao da
		 * conta entao se for conta corrente ele utiliza o metodo de la
		 */
		double valor = evento.getDouble("valorOperacao");
		this.conta.saca(valor);
	}

	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}

	public void ordenaLista(Evento evento) {
		List<Conta> contas = evento.getLista("destino");
		Collections.sort(contas);
	}
}
