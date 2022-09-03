package br.org.senai.teste;

import br.org.senai.model.Atleta;
import br.org.senai.model.Time;

public class TesteAtleta {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("Raphaela", "Atacante");
		Atleta atleta2 = new Atleta("Carlos", "Goleiro");
		Atleta atleta3 = new Atleta("Pedro", "Zagueiro");
		
		Time time1 = new Time("Flamengo", "Zézin", new Atleta[3]);
		
		time1.adicionarAtletas(atleta1);
		time1.adicionarAtletas(atleta2);
		time1.adicionarAtletas(atleta3);
		
		System.out.println(time1.getNomeTime());
		time1.listarAtletas();

	}

}
