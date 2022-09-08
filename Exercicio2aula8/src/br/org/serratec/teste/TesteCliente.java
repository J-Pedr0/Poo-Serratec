package br.org.serratec.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.org.serratec.model.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Cliente> clientes = new ArrayList<Cliente>();
		Integer id = 0;

		while (id >= 0) {

			System.out.println("\nDigite o ID do cliente:");
			id = sc.nextInt();
			if (id < 0) {
				break;
			}

			System.out.println("Digite o nome do cliente:");
			String nome = sc.next();

			System.out.println("Digite a idade do cliente:");
			Integer idade = sc.nextInt();

			System.out.println("Digite o telefone do cliente:");
			String telefone = sc.next();

			clientes.add(new Cliente(id, nome, idade, telefone));
			
		}
		System.out.println("Dados dos clientes:");
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}

	}

}
