package br.edu.senai.varargs;

public class ExemploVarargs {

	public static void main(String[] args) {
		// String a="qualquer coisa";
		// System.out.printf("%s %d" , 9, "tere", "dfdf", 909, true, false );
		// varargs

		System.out.println(somaNumeros(100, 10, 20, 30, 40, 100, 200));
	}

	public static int somaNumeros(int a, int... numeros) {
		int soma = 0;
		for (int valor : numeros) {
			soma += valor;
		}
		return soma;
	}

}
