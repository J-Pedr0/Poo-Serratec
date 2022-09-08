package br.org.serratec.model;

import java.util.List;

public class Time {
	private String nomeTime;
	private String tecnico;
	private String diretor;
	private List<Atleta> atleta;

	public Time(String nomeTime, String tecnico, String diretor, List<Atleta> atletas) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
		this.atleta = atletas;
	}

	@Override
	public String toString() {
		return "\nTime do time: " + nomeTime + " Técnico do time: " + tecnico + " Diretor: " + diretor + "\nAtletas: "
				+ atleta;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public String getDiretor() {
		return diretor;
	}

	public Atleta getAtleta() {
		return (Atleta) atleta;
	}

}
