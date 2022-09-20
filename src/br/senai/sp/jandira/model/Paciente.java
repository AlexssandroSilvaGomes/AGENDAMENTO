package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {
	
	private String nome;
	private LocalDate dataDeNascimento;
	private String telefone;
	private Endereco endereco;
	private String rg;
	private String cpf;
	private PlanoDeSaude planoDeSaude;
	
	//nome
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//data de nascimento
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	//telefone
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//endereço
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	//rg
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	//cpf
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//plano de saude
	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}
	
	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	
}
