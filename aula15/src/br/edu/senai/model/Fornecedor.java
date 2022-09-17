package br.edu.senai.model;

import java.io.Serializable;

/**
 * Classe para criação de objetos do tipo Fornecedor
 * 
 * @author Roni Schanuel
 * @since criada em 16-09-2022
 * @version 1.0
 * 
 * 
 */
public class Fornecedor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6893509539042885939L;
	/**
	 * identificação única da empresa no cadastro geral de pessoas jurídicas do
	 * Brasil.
	 */
	private String cnpj;
	/**
	 * Identifica a razão social da empresa.
	 */
	private String nome;
	/**
	 * Identifica o email para contato com a empresa
	 * 
	 */
	private String email;

	/**
	 * Construtor cheio do fornecedor
	 * 
	 * @param cnpj cnpj
	 * @param nome nome
	 * @param email email
	 */
	public Fornecedor(String cnpj, String nome, String email) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
	}

	/**
	 * Método usado para imprimir dados de um objeto
	 */
	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", nome=" + nome + ", email=" + email + "]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	/**
	 * Método para calcular o pagamento dos fornecedores onde o retorno deverá ser
	 * de 1% de comissão
	 * 
	 * @author Jpedro
	 * @param valor 
	 * @since16-09-2022
	 * @param valor recebe um valor como parâmetro
	 * @return Double retorna um valor acrescido de 1%
	 * @throws IllegalArgumentException Uma exeception onde poderá ser lançada caso um valor negativo seja
	 *             digitado.
	 */
	public Double calcularPagamento(Double valor) throws IllegalArgumentException {
		return 0.0;
	}

}
