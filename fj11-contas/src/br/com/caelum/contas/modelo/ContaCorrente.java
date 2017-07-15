package br.com.caelum.contas.modelo;

// Classe filha de Conta

public class ContaCorrente extends Conta implements Tributavel {
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	// muda a regra para saque em conta corrente
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido.");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= (valor + 0.10);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

}
