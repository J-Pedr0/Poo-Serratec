package br.org.serratec.teste;

import java.util.Scanner;

import br.org.serratec.model.FazerUmaVenda;
import br.org.serratec.model.Fixo;

public class Teste {

	static Double valor1 = 0.0;
	static Double valor2 = 0.0;

	public static void main(String[] args) {

		Fixo fixo = new Fixo("Joana", "123.456.789-00", 2000., 0., 2000.);
		Fixo fixo2 = new Fixo("Maria", "321.654.987-00", 2000., 0., 2000.);
		FazerUmaVenda fuv = new FazerUmaVenda();

		funcaoInicio(fixo, fixo2, fuv);

		System.out.println("---------Salário dos vendedores:---------");
		System.out.println(fixo);
		System.out.println(fixo2);

		System.out.println("---------Total Vendidos:---------");
		System.out.println("Valor total: " + (valor1 + valor2));

	}

	public static void funcaoInicio(Fixo fixo, Fixo fixo2, FazerUmaVenda fuv) {
		Scanner sc = new Scanner(System.in);

		Double valorVenda;
		String escolhaVendedor, escolhaSaida;

		System.out.println("----------Sistema de Vendas----------\n" + "Vendedores:\n" + "1-Joana\n2-Maria\n0-Sair\n"
				+ "Escolha o vendedor?");

		escolhaVendedor = sc.next();

		switch (escolhaVendedor) {
		case "1":
			System.out.println("Digite o valor da venda: ");
			valorVenda = sc.nextDouble();
			valor1 += valorVenda;

			fuv.vendaFeita(fixo, valorVenda);

			System.out.println("Deseja encerrar o programa? (s/n)");
			escolhaSaida = sc.next();

			switch (escolhaSaida) {
			case "s":
				System.out.println("Volte sempre!");
				System.out.println("-------------------------------");

				break;
			case "n":
				funcaoInicio(fixo, fixo2, fuv);
				break;
			default:
				System.out.println("Não é uma das opções!");
				break;
			}

			break;

		case "2":
			System.out.println("Digite o valor da venda: ");
			valorVenda = sc.nextDouble();
			fuv.vendaFeita(fixo2, valorVenda);
			valor2 += valorVenda;

			System.out.println("Deseja encerrar o programa? (s/n)");
			escolhaSaida = sc.next();

			switch (escolhaSaida) {
			case "s":
				System.out.println("Volte sempre!");
				System.out.println("-------------------------------");

				break;
			case "n":
				funcaoInicio(fixo, fixo2, fuv);
				break;
			default:
				System.out.println("Não é uma das opções!");
				break;
			}
			break;

		case "0":
			System.out.println("Volte sempre!");
			System.out.println("-------------------------------");
			break;

		default:
			System.out.println("Não é uma das opções!");
			main(null);
			break;
		}
	}

}
