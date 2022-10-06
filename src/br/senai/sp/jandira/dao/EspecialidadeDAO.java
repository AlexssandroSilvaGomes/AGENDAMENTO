package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDAO {
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    //pseudo banco de dados:
    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    
    //read
    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (codigo == e.getCodigo()) {
                return e;
            }
        }
        
        return null;
        
    }
    
    //create
    public static void gravar(Especialidade e) {
        especialidades.add(e);
    }
    
    //update
    public static void atualizar(Especialidade correta) {
        for (Especialidade e : especialidades) {
            if (correta.getCodigo() == e.getCodigo()) {
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, correta);
            }
        }
    }
    
    //delete
    public static void excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (codigo == e.getCodigo()) {
                especialidades.remove(e);
                break;
            }
        }
    }
    
    //lista inicial de especialidades
    public static void criarListaDeEspecialidades() {
        Especialidade e1 = new Especialidade("Cardiologia", "area da medicina que cuida do coração");
        Especialidade e2 = new Especialidade("Fisioterapia", "area da medicina que cuida dos movimentos musculares");
        Especialidade e3 = new Especialidade("Pediatria", "area da medicina que cuida de crianças");
        Especialidade e4 = new Especialidade("Otorrinolaringologia", "area da medicina que cuida das narinas");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
    }
}
