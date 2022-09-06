package br.org.serratec.model;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected Double valorCobrado;
	protected LocalDate dataConcerto;
	protected Proprietario proprietario;

	public Veiculo(String modelo, Double valorCobrado, LocalDate dataConcerto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.valorCobrado = valorCobrado;
		this.dataConcerto = dataConcerto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConcerto=" + dataConcerto + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

	public LocalDate getDataConcerto() {
		return dataConcerto;
	}

	public Proprietario getProprietario() {
		return proprietario;
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
