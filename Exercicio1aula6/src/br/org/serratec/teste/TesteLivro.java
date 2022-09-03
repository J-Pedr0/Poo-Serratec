package br.org.serratec.teste;

import br.org.serratec.model.Livro;
import br.org.serratec.model.Operacao;

public class TesteLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Marco Ântonio", "Cisco CCNA", 85.);
		Livro livro2 = new Livro("Kathy Sierra", "Use a cabeça Java", 98.);
		
		Operacao op1 = new Operacao("Venda", 0.,livro1);
		Operacao op2 = new Operacao("Empréstimo", 0.,livro2);
		
		livro1.reajuste(85.);
		
		op1.venderLivro();
		
		op2.emprestarLivro();
		
		System.out.println(op1.toString()+" || "+livro1.toString());
		System.out.println(op2.toString()+" || "+livro2.toString());
		
	}

}
