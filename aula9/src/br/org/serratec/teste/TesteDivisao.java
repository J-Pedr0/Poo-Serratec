package br.org.serratec.teste;

import br.org.serratec.calculo.CalculoMedio;

public class TesteDivisao {

	public static void main(String[] args) {
		try {
			System.out.println(CalculoMedio.calcular(10, 0));

		} catch (ArithmeticException e) {
			System.out.println("Erro ! Divisão por zero ! Verifique seu código");
			e.printStackTrace();
		} finally {
			System.out.println("Sempre é executado independente se cair ou não no catch");
		}

	}

}
