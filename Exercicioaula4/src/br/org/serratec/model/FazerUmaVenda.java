package br.org.serratec.model;

import java.util.Scanner;

public class FazerUmaVenda {

	
	public void vendaFeita(Fixo fixo, Double valorVenda) {
		Scanner sc = new Scanner(System.in);
		
		fixo.setComissao(valorVenda * 0.1);
	
		fixo.calcularSalario();	
		
		
	}
	
	
}
