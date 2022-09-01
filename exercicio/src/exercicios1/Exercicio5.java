package exercicios1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, menos, mais;
		
		System.out.println("Escreva um número: ");
		numero = sc.nextInt();
		
		mais = numero + 1;
		menos = numero - 1;
		
		System.out.printf("O antecessor é: %d \nO sucessor é: %d", menos, mais);
		
	}

}
