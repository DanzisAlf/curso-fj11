package br.com.caelum.contas.modelo;

public class TestaString {
	public static void main(String[] args) {
		String s = "fj11 eu ";
		s = s.replace("11", "22");
		s = s.replace(" ", "  ");

		// opcional 6
		String p = "Socorram-me, subi no ônibus em Marrocos";

		System.out.println(s);
		System.out.println(s.length());

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));

		}
		System.out.println(p);
		System.out.println(p.length());

		int j;
		for (j = p.length() - 1; j >= 0; j--) {
			System.out.print(p.charAt(j));
		}
	}
}
