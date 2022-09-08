package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Empregado;

public class ExemploEmpregado {

	public static void main(String[] args) {
		List<Empregado> empregados = new ArrayList<Empregado>();
		
		empregados.add(new Empregado("Lucas", "1234565"));
		empregados.add(new Empregado("Goku careca", "8000"));
		empregados.add(new Empregado("Paulo Batera", "0101010101"));
		
		for (Empregado empregado : empregados) {
			System.out.println(empregado);
		}

	}

}
