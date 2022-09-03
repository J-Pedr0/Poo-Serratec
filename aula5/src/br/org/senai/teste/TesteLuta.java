package br.org.senai.teste;

import br.org.senai.model.Categoria;
import br.org.senai.model.Luta;
import br.org.senai.model.Lutador;

public class TesteLuta {

	public static void main(String[] args) {
		Categoria categoria1 = new Categoria("PESO PESADO");
		Categoria categoria2 = new Categoria("PESO MÉDIO");
		
		Lutador lutador1 = new Lutador("José", 90., 40, categoria2);
		Lutador lutador2 = new Lutador("Marcos", 92., 43, categoria1);
		
		Luta luta = new Luta(lutador1, lutador2, false);
		
		System.out.println((luta.confimacaoLuta())?"Confirmada a luta":"Não Confirmada");;

	}

}
