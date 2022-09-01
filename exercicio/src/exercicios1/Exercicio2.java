package exercicios1;

import java.util.Scanner;

import model.Pessoa;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double maiorAltura = 0.0, maiorPeso= 0.0;
		String pessoaMaiorAltura = null, pessoaMaiorPeso = null;
		
		System.out.println("Digite o nome, peso e altura de 4 pessoas!");
		
		for (int i = 1; i <= 4; i++) {
			
			System.out.println("\nDigite o nome da pessoa "+i+":");
			String nome = sc.next();
			
			System.out.println("Digite o peso da pessoa "+i+":");
			Double peso = sc.nextDouble();
			
			System.out.println("Digite a altura da pessoa "+i+":");
			Double altura = sc.nextDouble();
			
			Pessoa pessoa = new Pessoa(nome, peso, altura);
			
			if(peso > maiorPeso) {
				maiorPeso = peso;
				pessoaMaiorPeso = nome;
			}
			if (altura > maiorAltura) {
				maiorAltura = altura;
				pessoaMaiorAltura = nome;
				
			}
			
		}
		System.out.println("\nA pessoa com maior peso: " + pessoaMaiorPeso);
		System.out.println("pessoa com maior altura: " + pessoaMaiorAltura);
		
		System.out.println("\nA média de peso: " + Pessoa.getMediaPeso()/4);
		System.out.println("A média de altura: " + Pessoa.getMediaAltura()/4);
	}

}
