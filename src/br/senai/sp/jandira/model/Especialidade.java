package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private String nome;
    private String descricao;
    private static int contador = 99;
    private Integer codigo;

    //Construtores de Classe
    //construtores são métodos inicializadores
    //método construtor default
    public Especialidade() {
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade(String nome) {
        this.nome = nome;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.contador++;
        this.codigo = contador;
    }

    //metodos de acesso aos atributos
    //codigo
    public Integer getCodigo() {    
        return codigo;
    }

    //contador
    public static int getContador() {    
        return contador;
    }

    //nome
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

    //descrição
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
