package br.org.serratec.model;

public class Operacao implements Livraria {

	private String tipo;
	private Double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, Double valorOperacao, Livro livro) {
		super();
		this.tipo = tipo;
		this.valorOperacao = valorOperacao;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Tipo: " + tipo + " || Valor: " + String.format("%.2f", valorOperacao);
	}

	public String getTipo() {
		return tipo;
	}

	public Double getOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public void venderLivro() {
		valorOperacao = livro.getValor() + (livro.getValor() * 0.09);
	}

	public void emprestarLivro() {
		valorOperacao = (livro.getValor() * 0.02) + taxaEmprestimo;
	}

}
