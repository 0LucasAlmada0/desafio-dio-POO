package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("Descrição Curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Conteudo conteudo = new Curso();
		Conteudo conteudo1 = new Mentoria();
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("BootCamp Java Developer");
		bootcamp.setDescricao("Descrição");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devLucas = new Dev();
		devLucas.setNome("Lucas");
		devLucas.inscreverBootcamp(bootcamp);
		System.out.println("\nConteúdos Inscritos: " + devLucas.getConteudosIncritos());
		devLucas.progredir();
		devLucas.progredir();
		System.out.println("Conteúdos Inscritos: " + devLucas.getConteudosIncritos());
		System.out.println("Conteúdos Concluidos: " + devLucas.getConteudosConcluidos());
		System.out.println("XP: " + devLucas.calcularTotalXP());
		
		System.out.println("");
		
		Dev devLuciana = new Dev();
		devLuciana.setNome("Luciana");
		devLuciana.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + devLuciana.getConteudosIncritos());
		devLuciana.progredir();
		devLuciana.progredir();
		devLuciana.progredir();
		System.out.println("Conteúdos Inscritos: " + devLuciana.getConteudosIncritos());
		System.out.println("Conteúdos Concluidos: " + devLuciana.getConteudosConcluidos());
		System.out.println("XP: " + devLuciana.calcularTotalXP());

		

	}

}
