package br.org.senai.teste;

import br.edu.senai.control.ControlePagamento;
import br.org.senai.model.Anestesista;
import br.org.senai.model.Clinica;
import br.org.senai.model.Medico;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Amil", "Checkup", "2343899890");
		Medico medico = new Medico("Golden Cross", 1233, "Antônio Carlos");
		Anestesista anestesista = new Anestesista("Amil", 134, "Silvana", "Geral");
		ControlePagamento cp = new ControlePagamento();

		clinica.calcularPagamnto();
		cp.calcularTotalPAgo(clinica);

		medico.calcularPagamnto();
		cp.calcularTotalPAgo(medico);

		anestesista.calcularPagamnto();
		cp.calcularTotalPAgo(anestesista);

		System.out.println(clinica + "Valor a Receber do Plano:" + clinica.getValorPago());
		System.out.println(medico + "Valor a Receber do Plano:" + medico.getValorPago());
		System.out.println(anestesista + "Valor a Receber do Plano:" + anestesista.getValorPago());
		
		System.out.println("Total geral pago pelos planos:" + cp.getTotalGeral());
		
	}

}
