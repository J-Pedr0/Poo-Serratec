package model;

public class Pessoa {
	private String nome;
	private Double peso, altura;
	private static double mediaPeso;
	private static double mediaAltura;
	
	public Pessoa(String nome, Double peso, Double altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		
		mediaPeso = mediaPeso + peso;
		mediaAltura = mediaAltura + altura; 
	}

	public String getNome() {
		return nome;
	}

	public Double getPeso() {
		return peso;
	}

	public Double getAltura() {
		return altura;
	}

	public static double getMediaPeso() {
		return mediaPeso;
	}

	public static double getMediaAltura() {
		return mediaAltura;
	}
	
	
	
	
}
