package br.org.serratec.teste;

import br.org.serratec.model.Cidade;
import br.org.serratec.model.Contato;
import br.org.serratec.model.Endereco;
import br.org.serratec.model.Estado;
import br.org.serratec.model.Telefone;

public class TesteEndereco {

	public static void main(String[] args) {

		Estado estado = new Estado(" Rio de Janeiro", "RJ");
		Cidade cidade = new Cidade(" Friburgo", estado);
		Endereco endereco = new Endereco("Rua: Eduardo Fransisco do camto", " Bairro: Quase Mury", "13165-00", cidade);
		Telefone telefone = new Telefone("Telefone: (22)91234-5678");
		Contato contato = new Contato("Nome: Matheus", telefone, endereco);

		System.out.println(contato.getNome() + "\n" + endereco + "\n" + contato.mostrarTelefone(telefone));

	}
}
