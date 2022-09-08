package br.edu.senai.teste;

import br.edu.senai.model.Empregado;

public class VetorEmpregado {

	public static void main(String[] args) {
//		Empregado empregado  = new Empregado("Lucas", "1234565");
//		Empregado empregado2  = new Empregado("Roni", "9876543");
		Empregado[] empregados = new Empregado[3];
		empregados[0] = new Empregado("Lucas", "1234565");
		empregados[1] = new Empregado("Roni", "9876543");
		empregados[2] = new Empregado("Bacon", "6666666");

		for (Empregado empregado : empregados) {
			System.out.println(empregado);
		}
	}

}
