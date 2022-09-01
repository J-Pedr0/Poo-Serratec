package exercicios1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int numero;
		int multiplicacao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número:");
		numero = sc.nextInt();
		
		System.out.println("\n*--Resultado--*\n");
		
		for(int i = 1; i <= 9; i++) {
			multiplicacao = i * numero;
			if (multiplicacao < 10) {
				System.out.printf("|  %d * %d =  %d |\n", i, numero, multiplicacao);
			}else {
				System.out.printf("|  %d * %d = %d |\n", i, numero, multiplicacao);
			}
			
		}
		System.out.println("-------------");
		
		sc.close();
	}

}