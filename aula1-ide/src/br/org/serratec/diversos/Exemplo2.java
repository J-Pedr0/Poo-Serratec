package br.org.serratec.diversos;

import java.time.LocalDate;
import java.util.List;

public class Exemplo2 {

	public static void main(String[] args) {
		// ALT+SHIFT+R - ALTERAR NOME DE VARIÁVEIS E MÉTODOS
		// CTRL+SHIFT+F - indentação do programa
		int preco = 100;
		preco = 300;
		//CTRL + SHIFT + O - importação de pacotes
		List Alunos;
		
		LocalDate data = LocalDate.now();
		System.out.println("Hoje é dia:" + data);
		System.out.println(preco);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

	}

}
