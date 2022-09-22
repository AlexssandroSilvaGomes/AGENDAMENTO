package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

	public static void main(String[] args) {
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		
		Especialidade e1 = new Especialidade();
		e1.setNome("Cardio");
		e1.setDescricao("cuidar corasao");
		Especialidade e2 = new Especialidade();
		e2.setNome("Gastronomia");
		e2.setDescricao("cuidar bariga");
		Especialidade e3 = new Especialidade();
		e3.setNome("Fisicoterapista");
		e3.setDescricao("terapeuta do corpo");
		Especialidade e4 = new Especialidade();
		e4.setNome("Cinico geral");
		e4.setDescricao("ele é cinico de todos os condominios");
		
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		especialidades.add(e4);
		
//		Especialidade[] especialidades = {e1, e2, e3, e4};

		Especialidade e5 = new Especialidade();
		e5.setNome("pediatro");
		e5.setDescricao("pedreiro que gosta de teatro");
		
		especialidades.add(e5);
//		Especialidade[4] = e5;
		
		System.out.println(especialidades.size());
		
		//ver o nome do elemento que esta na posição 2
		System.out.println(especialidades.get(2).getNome());
		
		//troca o nome do elemento que esta na posição 2
		especialidades.get(2).setNome("Teste");
		System.out.println(especialidades.get(2).getNome());
		
		
		
		
	}

}
