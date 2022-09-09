package br.org.serratec.model;

public abstract class Universidade {
	protected String nome;

	public Universidade(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome da Universidade : " + nome;
	}

	public String getNome() {
		return nome;
	}

	public abstract void fazerMatricula();

}
