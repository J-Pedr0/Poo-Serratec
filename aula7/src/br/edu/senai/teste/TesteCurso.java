package br.edu.senai.teste;

import br.edu.senai.enums.PeriodoCurso;
import br.edu.senai.model.Curso;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Java", PeriodoCurso.INTEGRAL);
		
		System.out.println("Nome do curso: "+curso.getNome());
		System.out.println("Dia da semana: "+curso.getPeriodo().getDiasDaSemana());

	}

}
