package br.org.senai.model;

import java.util.Iterator;

public class Time {
	private String nomeTime;
	private String nomeTreinador;
	private Atleta[] atletas;

	public Time(String nomeTime, String nomeTreinador, Atleta[] atleta) {
		super();
		this.nomeTime = nomeTime;
		this.nomeTreinador = nomeTreinador;
		this.atletas = atleta;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public String getNomeTreinador() {
		return nomeTreinador;
	}

	public Atleta[] getAtleta() {
		return atletas;
	}
	
	public void adicionarAtletas(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				break;
			}
		}
	}
	
	public void listarAtletas() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println(atletas[i].getNomeAtleta());
		}
	}
	
}
