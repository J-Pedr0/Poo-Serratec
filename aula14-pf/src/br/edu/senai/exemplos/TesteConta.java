package br.edu.senai.exemplos;

import br.edu.senai.interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
		// Classe Anônima baseada em uma interface
		Conta conta = new Conta() {
			@Override
			public void transacao() {
				System.out.println("Transação efetuada !");
			}
		};
		conta.transacao();
		// Programação Funcional - A partir do 8
		Conta conta2 = () -> System.out.println("Transação efetuada conta2");
		conta2.transacao();

		// Para transformar o código acima em um lambda, selecionar desde o new Conta()
		// até a chaves antes do ponto e vírgula, após isso dar ctrl+1 e converter.

	}

}
