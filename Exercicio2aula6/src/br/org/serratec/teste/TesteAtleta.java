package br.org.serratec.teste;

import br.org.serratec.model.Atleta;
import br.org.serratec.model.Pais;

public class TesteAtleta {

	public static void main(String[] args) {

		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("EUA");

		Atleta atleta1 = new Atleta("Anderson Silva", 98., pais1);
		Atleta atleta2 = new Atleta("Jon Jone", 59., pais2);
		Atleta atleta3 = new Atleta("Vitor Belfort", 110., pais1);

		System.out.println("O atleta: " + atleta1.getNome() + " " + atleta1.verificarSituacao());
		System.out.println("O atleta: " + atleta2.getNome() + " " + atleta2.verificarSituacao());
		System.out.println("O atleta: " + atleta3.getNome() + " " + atleta3.verificarSituacao());
		System.out.println("Total de participantes: " + Atleta.getTotalParticipantes());

	}

}
