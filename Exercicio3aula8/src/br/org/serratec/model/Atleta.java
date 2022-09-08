package br.org.serratec.model;

public class Atleta {
	private String nome;
	private int idade;
	private String posicao;

	public Atleta(String nome, int idade, String posicao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
	}

	@Override
	public String toString() {
		return "\nNome do Atleta: " + nome + " Idade do Atleta: " + idade + " Posição do atleta: " + posicao;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getPosicao() {
		return posicao;
	}

}
