package br.edu.senai.listas;

import java.util.Arrays;
import java.util.List;

public class ExemploListaArrays {

	public static void main(String[] args) {
		List<String> cores = Arrays.asList("Amarelo", "Verde", "Azul");
//		cores.add("Branco");
		cores.set(0, "Laranja");
		if (cores.isEmpty()) {
			System.out.println("A lista está vazia !");
		} else {
			System.out.println(cores);
		}
		System.out.println("A lista contém a cor Verde?" + (cores.contains("Verde") ? " Sim" : " Não"));

		List<String> meses = List.of("Jan", "Fev", "Mar");
		// meses.set(0, "Janeiro");
		System.out.println(meses);
	}

}
