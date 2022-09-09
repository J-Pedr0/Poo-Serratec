package br.org.serratec.model;

public class Direito extends Faculdade implements Eventos, Oab {
	private int tempoDuracao;

	public Direito(String nome, String nomeFaculdade, int bloco, int tempoDuracao) {
		super(nome, nomeFaculdade, bloco);
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public String toString() {
		return "Direito [tempoDuracao=" + tempoDuracao + "]";
	}

	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public boolean realizarProva() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String programação() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void conteudoEventos() {
		// TODO Auto-generated method stub

	}

	@Override
	public String matrizCurricular() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub

	}

}
