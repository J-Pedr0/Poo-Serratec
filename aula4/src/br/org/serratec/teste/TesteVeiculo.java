package br.org.serratec.teste;

import br.org.serratec.model.Caminhao;

public class TesteVeiculo {

	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao("123", "KYO-8239", "Preto", 90000., 5000);
		caminhao.calcularIPVA();
		System.out.println("Valor IPVA:"+ caminhao.getValorIPVA());
		System.out.println(caminhao.toString());
	}

}
