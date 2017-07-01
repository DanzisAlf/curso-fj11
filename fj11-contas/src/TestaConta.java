
public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Ozzy");
		conta.deposita(300.0);
		if (conta.saca(500.0)) {
			System.out.println("Sacou:");
		} else {
			System.out.println("Nao Sacou");
		}
	}
}
