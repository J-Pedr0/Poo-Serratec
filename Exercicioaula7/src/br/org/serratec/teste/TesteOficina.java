package br.org.serratec.teste;

import java.time.LocalDate;

import br.org.serratec.model.Carro;
import br.org.serratec.model.Moto;
import br.org.serratec.model.Proprietario;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario proprietario1 = new Proprietario("João");
		Proprietario proprietario2 = new Proprietario("Matheus");
		Carro carro1 = new Carro("Mustang", 0.0, LocalDate.of(2022, 8, 6), proprietario1, "Esportivo");
		Moto moto1 = new Moto("Hornet", 0.0, LocalDate.of(2022, 8, 24), proprietario2, 599.3);

		carro1.trocarOleo();
		carro1.revisao();

		moto1.revisao();
		moto1.lavarVeiculo();

		System.out.println(carro1.toString());
		System.out.println(moto1.toString());

	}

}
