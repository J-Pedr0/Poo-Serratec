package br.org.serratec.teste;

import java.util.ArrayList;
import java.util.List;

import br.org.serratec.model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Pedrão", 8.7, 9.0);
		Aluno aluno2 = new Aluno("João", 8.7, 9.2);
		Aluno aluno3 = new Aluno("Matheus", 8.7, 9.0);
		Aluno aluno4 = new Aluno("José", 8.7, 9.5);

		List<Aluno> alunos = new ArrayList<>();

		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);

		for (Aluno aluno : alunos) {
			System.out.println(aluno +" "+ aluno.calcularMedia());
		}

	}

}
