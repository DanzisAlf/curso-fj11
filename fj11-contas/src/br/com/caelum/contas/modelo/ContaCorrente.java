package br.com.caelum.contas.modelo;

// Classe filha de Conta

public class ContaCorrente extends Conta implements Tributavel {
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
	
	//muda a regra para saque em conta corrente
	@Override
	public void saca(double valor){
		this.saldo -= (valor + 0.10);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
	
}
