package br.org.serratec.model;

public class FreeLancer {
	private int diaTrabalhados;
	private Double valorDia;

	public FreeLancer(int diaTrabalhados, Double valorDia) {
		super();
		this.diaTrabalhados = diaTrabalhados;
		this.valorDia = valorDia;
	}

	public int getDiaTrabalhados() {
		return diaTrabalhados;
	}

	public void setDiaTrabalhados(int diaTrabalhados) {
		this.diaTrabalhados = diaTrabalhados;
	}

	public Double getValorDia() {
		return valorDia;
	}

	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}

}
