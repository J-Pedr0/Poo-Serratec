package aula2;

public class Treinar {

	public static void main(String[] args) {
		double valor1 = 5.0;
		double valor2 = 7.0;
		
		double mairValor = 0;
		
		if (valor1 > valor2) {
			mairValor = valor1;
		}else {
			mairValor = valor2;
		}
		
		System.out.println("O valor mair é: " + mairValor);
		
		String resposta = valor1 > valor2 ? "O valor mair é: " + valor1:"O valor mair é: " + valor2;
		System.out.println(resposta);
		
	}

}
