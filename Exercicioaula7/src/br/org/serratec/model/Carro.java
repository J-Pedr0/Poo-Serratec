package br.org.serratec.model;

import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, Double valorCobrado, LocalDate dataConcerto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConcerto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public Double lavarVeiculo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double trcarOleo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double revisao() {
		// TODO Auto-generated method stub
		return null;
	}

}
