package br.org.serratec.model;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String modelo, Double valorCobrado, LocalDate dataConcerto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, valorCobrado, dataConcerto, proprietario);
		this.cilindradas = cilindradas;
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
