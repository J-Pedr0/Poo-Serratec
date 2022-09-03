package br.org.serratec.model;
//Uma interface não pede ter instâncias
//Não posso fazer - Conta conta = new Conta();
//É uma forma de substituir a herença em alguns coisas
//Toda interface é criada para ter somente assinaturas
//Interfaces não tem implementação.

public interface Conta {
	Double taxaBancaria = 2.50;
	
	//Não é necessário colocar o abstract porque fica implícito
	public Boolean saque(Double valor);
	public Boolean deposito(Double valor);
	
}
