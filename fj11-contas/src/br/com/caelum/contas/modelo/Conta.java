package br.com.caelum.contas.modelo;

/**
 * 
 * classe que modela as contas do sistema
 * 
 * @author Danzis
 *
 */
public abstract class Conta {

	// Attributes
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	private String dataDeAbertura;

	// Command CTRL+3 ggas (getters setters)
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	/**
	 * metodo que retorna o saldo
	 * 
	 * @return valor de saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * metodo para incrementar o valor de saldo da conta
	 * 
	 * @param valor
	 *            - valor a ser depositado
	 */
	public void deposita(double valor) throws IllegalArgumentException {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido");
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido.");
		}
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}
	}

	// metodo criado nos filhos e utilizar override do getTipo
	public abstract String getTipo();

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	@Override
	public String toString() {
		return "[titular "+ this.titular + " numero "+this.numero + " agencia "+ this.agencia+ "]";
	}

}
