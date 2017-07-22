package br.com.caelum.contas;

import java.io.PrintStream;

public class TesteThrowable {
	public static void main(String[] args) {
		Throwable t = new Throwable();
		System.out.println(t);
		PrintStream out = System.out;
	}
}
