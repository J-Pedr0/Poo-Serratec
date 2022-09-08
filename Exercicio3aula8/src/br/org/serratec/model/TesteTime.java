package br.org.serratec.model;

import java.util.ArrayList;
import java.util.List;

public class TesteTime {

	public static void main(String[] args) {
		List<Atleta> atletas = new ArrayList<Atleta>();

		atletas.add(new Atleta("José", 20, "Defenciva"));
		atletas.add(new Atleta("Matheus", 19, "Atacante"));

		Time time = new Time("Timizão", "Rodolfo", "Rocky", atletas);
		
		System.out.println(time);

	}

}
