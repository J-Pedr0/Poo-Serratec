package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

public class ExercicioListas {

	public static void main(String[] args) {
//		String times[] = {"Palmeiras", "Fortaleza"};
		List listaDeTimes = new ArrayList<>();

		listaDeTimes.add("Flamengo");
		listaDeTimes.add("Vasco");
		listaDeTimes.add("Serrano");
		listaDeTimes.add("Bangu");
		listaDeTimes.add(5000.);
		listaDeTimes.add(true);
		listaDeTimes.remove(5);
		listaDeTimes.set(4, "Botafogo");
		System.out.println(listaDeTimes.get(0));
		System.out.println(listaDeTimes);
		System.out.println("Tamanho da Lista: " + listaDeTimes.size());

	}

}
