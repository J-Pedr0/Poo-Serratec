package br.org.serratec.model;

public class Contato {
	private String nome;
	private Telefone telefone;
	private Endereco endereco;

	public Contato(String nome, Telefone telefone, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public String mostrarTelefone(Telefone telefone) {
		return telefone +"\nTelefone: (22)94321-6587";
	}

}
