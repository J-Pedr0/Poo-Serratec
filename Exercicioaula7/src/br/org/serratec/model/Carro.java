package br.org.serratec.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import br.org.serratec.enums.TipoServico;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, Double valorCobrado, LocalDate dataConcerto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConcerto, proprietario);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return proprietario + " Modelo: " + modelo + " Categoria: " + categoria + " Valor Cobrado: " + valorCobrado;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public Double lavarVeiculo() {
		valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public Double trocarOleo() {
		if (dataConcerto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			valorCobrado = valorCobrado + (TipoServico.OLEO.getValorPorServico() - 50.00);
		} else {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
		}
		return valorCobrado;
	}

	@Override
	public Double revisao() {
		if (dataConcerto.getMonth().equals(Month.AUGUST)) {
			valorCobrado = valorCobrado
					+ (TipoServico.REVISAO.getValorPorServico() - (TipoServico.REVISAO.getValorPorServico() * 0.1));

		} else {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
		}
		return valorCobrado;
	}

}
