package br.com.caelum.contas;

import java.util.ArrayList;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {
	public static void main(String[] args) {

		ArrayList<Conta> contaz = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			Conta c = new ContaCorrente();
			Random s = new Random();
			c.deposita(s.nextInt(100 * i + 1));
			contaz.add(c);
		}
		
		System.out.println(contaz);
	}
}
