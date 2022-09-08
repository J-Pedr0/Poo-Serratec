package br.org.serratec.model;

import java.time.LocalDate;

import br.org.serratec.enums.TipoServico;

public class Moto extends Veiculo {
	private Double cilindradas;

	public Moto(String modelo, Double valorCobrado, LocalDate dataConcerto, Proprietario proprietario,
			Double cilindradas) {
		super(modelo, valorCobrado, dataConcerto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return proprietario + " Modelo: " + modelo + " Cilindradas:" + cilindradas + " Valor Cobrado: " + valorCobrado;
	}

	@Override
	public Double lavarVeiculo() {
		valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
		return null;
	}

	@Override
	public Double trocarOleo() {
		valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public Double revisao() {
		valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
		return valorCobrado;
	}

}
