package br.org.serratec.model;

public class Empresa implements Tributacao {
	private String razaoSocial;
	private Double rendimentos;

	public Empresa(String razaoSocial, Double rendimento) {
		super();
		this.razaoSocial = razaoSocial;
		this.rendimentos = rendimento;
	}

	@Override
	public String toString() {
		return "Empresa [razaoSocial=" + razaoSocial + ", rendimento=" + rendimentos + "]";
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public Double getRendimento() {
		return rendimentos;
	}

	@Override
	public Double calcularImpostoDeRenda() {
		return rendimentos * impostoDeRendaPJ;
	}

	@Override
	public Double calcularICMS() {
		return rendimentos * icms;
	}

}
