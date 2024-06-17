package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descção Java");
		curso.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descção JavaScript");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("descrição mentoria");
		mentoria.setData(LocalDate.now());
		
		
		System.out.println(mentoria);
		System.out.println(curso);
		System.out.println(curso2);
		
	}

}
