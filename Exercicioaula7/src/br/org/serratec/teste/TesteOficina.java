package br.org.serratec.teste;

import java.time.LocalDate;

import br.org.serratec.model.Carro;
import br.org.serratec.model.Proprietario;

public class TesteOficina {

	public static void main(String[] args) {
		
		Proprietario proprietario1 = new Proprietario("João");
		Carro carro1 = new Carro("Mustang", 0.0,LocalDate.of(2022, 9, 5), proprietario1, "Esportivo");
		
		
		

	}

}
