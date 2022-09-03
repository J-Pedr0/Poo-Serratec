package br.org.senai.teste;

import br.org.senai.model.Imovel;
import br.org.senai.model.Pessoa;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Ana", "ana@gmail.com");
		Pessoa pessoa2 = new Pessoa("Maria", "maria@gmail.com");

		
		Imovel imovel = new Imovel("Casa", "Cemtro", 350500., pessoa2);
		
		System.out.println(imovel.getLocal()+"-"+imovel.getPessoa());
	}

}
