package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	/*declara a variavel para todo metodo*/
	private Conta conta;
	
	/*instancia o new conta para "forcar" criar conta*/
	public void criaConta(Evento evento){
		this.conta = new Conta();
		this.conta.setTitular("Dan");
		this.conta.setNumero(123);
		this.conta.setAgencia("22");
		this.conta.setDataDeAbertura("2/2/22");
	}
	
	public void deposita(Evento evento){
		/*"valor eh o nome do campo*/
		double valorDigitado = evento.getDouble("valor");
		this.conta.deposita(valorDigitado);
	}
	
	public void saca(Evento evento){
		double valorDigitado = evento.getDouble("valor");
		this.conta.saca(valorDigitado);
	}

}
