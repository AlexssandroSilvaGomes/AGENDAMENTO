package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescricao("é o cara que cuida do coração lá");
		JOptionPane.showMessageDialog(null, especialidade.getNome());
		JOptionPane.showMessageDialog(null, especialidade.getDescricao());
		
		
//		Especialidade especialidade2 = new Especialidade();
//		especialidade2.setNome("otorrinolaringologia");
		

	}

}
