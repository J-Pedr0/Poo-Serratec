package br.edu.senai.exercicio;

import java.time.LocalDate;

public abstract class Cavalo extends Mamifero implements AnimalCompeticao {
	private String marcaFerradura;

	public Cavalo(String nome, LocalDate dataVacinacao, String raça, String marcaFerradura) {
		super(nome, dataVacinacao, raça);
		this.marcaFerradura = marcaFerradura;
	}

	public String getMarcaFerradura() {
		return marcaFerradura;
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

	public void trocarFerradura() {

	}

	public void viajar() {

	}

}
