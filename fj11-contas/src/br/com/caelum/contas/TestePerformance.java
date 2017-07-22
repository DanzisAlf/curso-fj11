package br.com.caelum.contas;

import java.util.Collection;
import java.util.HashSet;
//ArrayList adiciona mais rapido, enquanto HashSet busca mais rapido

public class TestePerformance {
	public static void main(String[] args) {

		Collection<Integer> teste = new HashSet<>();

		System.out.println("Iniciando...");
		int total = 30000;

		long inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("adicao... " + tempo);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("leitura... " + tempo);

	}
}
