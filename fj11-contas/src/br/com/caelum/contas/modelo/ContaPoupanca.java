package br.com.caelum.contas.modelo;

//Classe filha de Conta
public class ContaPoupanca extends Conta {
	public String getTipo() {
		return super.getTipo() + "Poupança";
	}

}
