package br.org.serratec.model;

public class AtletaProficional extends Maratona {
	private Double peso;

	public AtletaProficional(String nome, String sexo, Integer idade, Double altura, Double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Peso: " + peso;
	}

	public Double getPeso() {
		return peso;
	}
	
	
}
