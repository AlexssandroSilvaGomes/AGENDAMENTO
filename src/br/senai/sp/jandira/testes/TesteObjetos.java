package br.senai.sp.jandira.testes;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

	public static void main(String[] args) {
		
		Especialidade e1 = new Especialidade();
		e1.setNome("Cardio");
		e1.setDescricao("cuidar corasao");
		
		Especialidade e2 = new Especialidade("Gastronomia");
		e2.setDescricao("cuidar bariga");
		
		Especialidade e4 = new Especialidade("Clinica geral", "faz tudo");
//		JOptionPane.showMessageDialog(null, e1.getNome());
		
		Especialidade e3 = e1;
		e3.setNome("Qualquer Coisa!");
		
//		JOptionPane.showMessageDialog(null, e1.getNome());
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e4);
//		System.out.println(especialidades.size());
		

		System.out.println("--------------------- while ---------------------");
		//usando o while para mostrar os nomes das especialidades (iteração)
		int i = 0;
		while (i < especialidades.size()) {
			System.out.println(especialidades.get(i).getNome());
			i++;
		}

		System.out.println("--------------------- FOR -----------------------");
		
		//usando o for loop para mostrar os nomes das especialidades (iteração)
		for (int o = 0; o < especialidades.size(); o++) {
			System.out.println(especialidades.get(o).getNome());
		}

		System.out.println("--------------------- FOR EACH ------------------");
		
		//usando o for each para mostrar os nomes das especialidades (iteração)
		//usado para fazer a leitura de vetores ou arralist
		//a forma mais resumida de um looping comum
		for (Especialidade e : especialidades) {
			System.out.println(e.getNome());
		}
		
		//criar 3 planos de saude e armazenar em im arraylist
		//exibir i nome da operadora
		System.out.println("--------------------- Planos de Saúde FOR EACH ------------------");
		ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
		
		PlanoDeSaude planoSaude1 = new PlanoDeSaude("Amil");
		PlanoDeSaude planoSaude2 = new PlanoDeSaude("Unimed");
		PlanoDeSaude planoSaude3 = new PlanoDeSaude("Porto Seguro");
		
		planosDeSaude.add(planoSaude1);
		planosDeSaude.add(planoSaude2);
		planosDeSaude.add(planoSaude3);
		
		for (PlanoDeSaude p : planosDeSaude) {
			System.out.println(p.getOperadora());
			System.out.println(p.getQuantidade());
		}
		
		System.out.println("---------> " + PlanoDeSaude.getQuantidade());
		
		AgendaApp.main(args);
		
		System.out.println("---------> " + PlanoDeSaude.getQuantidade());
		
	}

}