package br.senai.sp.jandira.testes;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {
        
        int[] a = {6, 5, 4, 3, 2};
        int[] b = new int [4];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;
        
        int[][] c = {
        
            {4, 6, 5}, 
            {5, 9, 7}, 
            {1, 13, 3}, 
            {3, 4, 0}
        
        };
        
        String[][] quitanda = {
            {"banana", "maça", "uva", "morango"},
            {"alface", "couve", "pepino", "salsinha", "pimentão", "brócolis"},
            {"abacate", "tomate", "jiló", "abobrinha"}
        };
        
        System.out.println(quitanda[1][4]);
        System.out.println(c[2][1]);
                
        System.out.println("-----------------------------------------------------------");

        Especialidade e1 = new Especialidade();
        e1.setNome("Cardio");
        e1.setDescricao("cuidar corasao");

        Especialidade e2 = new Especialidade("Gastronomia");
        e2.setDescricao("cuidar bariga");

        Especialidade e4 = new Especialidade("Clinica geral", "faz tudo");
//		JOptionPane.showMessageDialog(null, e1.getNome());

        Especialidade e3 = e4;
        e3.setNome("Qualquer Coisa!");
        e3.setDescricao("é literalemte qualqer ocisa");
        
        EspecialidadeDAO.gravar(e1);
        EspecialidadeDAO.gravar(e2);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " + EspecialidadeDAO.getEspecialidades().size());
        
        EspecialidadeDAO.gravar(e3);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " + EspecialidadeDAO.getEspecialidades().size());
        
//        System.out.println(EspecialidadeDAO.getEspecialidade(102).getNome());
        EspecialidadeDAO.excluir(101);
        System.out.println(EspecialidadeDAO.getEspecialidades().size());
        System.out.println(EspecialidadeDAO.getEspecialidade(102).getNome());
        
        Especialidade correta = new Especialidade("Wenamechainsama", "é literamente qualquer coisa");
        correta.setCodigo(e3.getCodigo());
        EspecialidadeDAO.atualizar(correta);
        System.out.println(EspecialidadeDAO.getEspecialidade(102).getNome());
        

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
