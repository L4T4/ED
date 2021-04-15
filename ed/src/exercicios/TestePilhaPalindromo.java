package exercicios;

import java.io.IOException;

public class TestePilhaPalindromo {

	public static void main(String[] args) throws IOException {
		PilhaPalindromo palindromo = new PilhaPalindromo();
		palindromo.pegarPalindromo();
		System.out.println(palindromo.validarPalindromo());

	}

}
