
public interface Conta {

	public String getTitular();

	public void setTitular(String titular);

	public int getNumero();

	public void setNumero(int numero);

	public String getAgencia();

	public void setAgencia(String agencia);

	public String getDataDeAbertura();

	public void setDataDeAbertura(String dataDeAbertura);

	public double getSaldo();

	public void deposita(double valor);

	public void saca(double valor);

	public abstract String getTipo();

	public void transfere(double valor, Conta conta);

}
