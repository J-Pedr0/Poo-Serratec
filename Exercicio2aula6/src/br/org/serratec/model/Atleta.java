package br.org.serratec.model;

public class Atleta implements Olimpiadas {
	private String nome;
	private Double peso;
	private String modalidade;
	private static int totalParticipantes=0;
	private Pais pais;

	public Atleta(String nome, Double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
	}

	public Pais getPais() {
		return pais;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPeso() {
		return peso;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	@Override
	public String verificarSituacao() {
		if (peso > 90) {
			modalidade = "Peso pesado";
			totalParticipantes+=1;
			return "Participará";
		} else if (peso >= 60) {
			modalidade = "Peso médio";
			totalParticipantes+=1;
			return "Participará";
		} else {
			return "Não participará";
		}
	}

}
