package exercicios1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, fatorial = 1;
		
		for (int i = 1; i <= 10; i++) {
			numero = i;
			while(numero > 0) {
				fatorial = fatorial * numero;
				numero--;
			}
			System.out.println("O Fatorial de "+i+" é : "+fatorial);
			fatorial = 1;
		}
		
		
		

	}

}
