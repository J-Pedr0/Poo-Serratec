package br.edu.senai.interfaces;

public interface Conta {
	public void transacao();
	
	//Para interface ser funcional ele somente pode ter um método abstrato
	
	//Método default - são métodos que contém implementação dentro da interface 
	
	default void investimento() {
		System.out.println("Você apicou em um investimento");
	}
	
	
}
