package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

	private String nome;
	private String descricao;
	
	//metodos de acesso aos atributos
	public void setNome(String nome) {
		if (nome.length() >= 3) {
			this.nome = nome;
		} else {
			JOptionPane.showMessageDialog(null, nome + " não é um nome válido!\n" + "Deve conter pelo menos 3 letras.");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		if (descricao.length() >= 10) {
			this.descricao = descricao;
		} else {
			JOptionPane.showMessageDialog(null, "a descrição precisa ter pelo menos 10 carcteres!");
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
}
