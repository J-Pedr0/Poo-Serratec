package br.edu.senai.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {
		List<String> times = Arrays.asList("Flamengo", "Fluminense", "Vasco", "Botafogo");
		times.forEach(t -> System.out.println(t));
		// Stream - método que permite algumas tranformações, filtros e outras operações

		//times.stream().map(t -> t.substring(0, 3)).forEach(t -> System.out.println(t));
		List<String> timeAbreviados = times.stream().map(t -> t.substring(0, 3)).collect(Collectors.toList());
		timeAbreviados.forEach(t -> System.out.println(t));
	}

}
