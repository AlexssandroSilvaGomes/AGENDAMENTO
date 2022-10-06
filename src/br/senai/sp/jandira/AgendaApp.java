package br.senai.sp.jandira;

//import java.time.LocalDate;

import br.senai.sp.jandira.ui.HomeFrame;

//import java.time.LocalTime;
//
//import javax.swing.JOptionPane;
//
//import br.senai.sp.jandira.model.Agenda;
//import br.senai.sp.jandira.model.Endereco;
//import br.senai.sp.jandira.model.Especialidade;
//import br.senai.sp.jandira.model.Medico;
//import br.senai.sp.jandira.model.Paciente;
//import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

    public static void main(String[] args) {
        
        HomeFrame tela = new HomeFrame();
        tela.setVisible(true);
        
//
//        //5 especialidade
//        //cardiologia, otorrinolaringologista, gastroenterologia, fisioterapia, clinica geral
//        Especialidade especialidade1 = new Especialidade();
//        especialidade1.setNome("Cardiologia");
//        especialidade1.setDescricao("O Cardiologista é aquele que cuida da saúde do coração.");
//
//        Especialidade especialidade2 = new Especialidade();
//        especialidade2.setNome("Otorrinolaringologia");
//        especialidade2.setDescricao("O otorrinolaringologista é o médico especializado no diagnóstico e tratamento, clínico e cirúrgico, das doenças dos ouvidos, nariz, garganta, laringe e pescoço.");
//
//        Especialidade especialidade3 = new Especialidade();
//        especialidade3.setNome("Gastroenterologia");
//        especialidade3.setDescricao("Gastroenterologia é a especialidade médica dedicada à prevenção, ao diagnóstico e ao tratamento clínico de várias doenças que afetam glândulas e órgãos do aparelho digestivo.");
//
//        Especialidade especialidade4 = new Especialidade();
//        especialidade4.setNome("Fisioterapia");
//        especialidade4.setDescricao("Fisioterapia atua no tratamento e prevenção de doenças e lesões, decorrentes de fraturas ou má-formação ou vícios de postura.");
//
//        Especialidade especialidade5 = new Especialidade();
//        especialidade5.setNome("Clínico Geral");
//        especialidade5.setDescricao("Este médico trata de todas as doenças não-cirúrgicas, não ginecológicas e não obstétricas, e apenas em adultos.");
//        
//        Especialidade especialidade6 = new Especialidade();
//        especialidade6.setNome("especialidade 6");
//        
//        //Exibir a quantidade do contador
//        System.out.println("TOTAL DE ESPECIALIDADES -------> " + Especialidade.getContador());
//        System.out.println(especialidade1.getCodigo() + " - " + especialidade1.getNome());
//        System.out.println(especialidade2.getCodigo() + " - " + especialidade2.getNome());
//        System.out.println(especialidade3.getCodigo() + " - " + especialidade3.getNome());
//        System.out.println(especialidade4.getCodigo() + " - " + especialidade4.getNome());
//        System.out.println(especialidade5.getCodigo() + " - " + especialidade5.getNome());
//        System.out.println(especialidade6.getCodigo() + " - " + especialidade6.getNome());
//       
//        
//        //criar 2 médicos 
//        //medico 1 é clinico geral e cardiologista
//        //medico 2 é fisioterapeuta, cardiologista e clinico geral
//        Medico medico1 = new Medico();
//        medico1.setNome("Marcos");
//        medico1.setTelefone("(11)99999-9999");
//        medico1.setEmail("marcossilva211@gmail.com");
//        medico1.setCrm("000-000");
//        Especialidade[] especialidades1 = {especialidade1, especialidade5};
//        medico1.setEspecialidades(especialidades1);
//
////		System.out.println(especialidades1[0].getNome());
////		System.out.println(especialidades1[0].getDescricao());
//        Medico medico2 = new Medico();
//        medico2.setNome("Marcia");
//        medico2.setTelefone("(11)99999-9999");
//        medico2.setEmail("marciasoares11@gmail.com");
//        medico2.setCrm("000-000");
//        Especialidade[] especialidades2 = {especialidade1, especialidade4, especialidade5};
//        medico2.setEspecialidades(especialidades2);
//
////		System.out.println(especialidades2[2].getNome());
////		System.out.println(especialidades2[2].getDescricao());
////		
//        //exibir os dados dos 2 medicos
//        //nome do medico: ????
//        //crm do medico: ???
//        //Especialidades: ????, ????, ????
//        //medico 1
//        System.out.println("Médico: " + medico1.getNome());
//        System.out.println("CRM: " + medico1.getCrm());
//        System.out.print("Especialidades: ");
//        int i = 0;
//        while (i < medico1.getEspecialidades().length) {
//            System.out.print(medico1.getEspecialidades()[i].getNome() + " ");
//            i++;
//        }
//
//        System.out.println("\n");
//
//        //medico 2
//        System.out.println("Médico: " + medico2.getNome());
//        System.out.println("CRM: " + medico2.getCrm());
//        System.out.print("Especialidades: ");
//        i = 0;
//        while (i < medico2.getEspecialidades().length) {
//            System.out.print(medico2.getEspecialidades()[i].getNome() + " ");
//            i++;
//        }
//
//        System.out.println("\n");
//
//        //endereço 1
//        Endereco endereco1 = new Endereco();
//        endereco1.setLogradouro("Rua Takashi da Silva");
//        endereco1.setNumero("312");
//        endereco1.setBairro("Gabriela II");
//        endereco1.setCidade("Jandira");
//        endereco1.setComplemento("Ao lado");
//        endereco1.setEstado("São Paulo");
//        endereco1.setCep("04356-798");
//
//        //endereço 2
//        Endereco endereco2 = new Endereco();
//        endereco2.setLogradouro("Rua Raposão Pub");
//        endereco2.setNumero("321");
//        endereco2.setBairro("Cohab");
//        endereco2.setCidade("Itapevi");
//        endereco2.setComplemento("Ao lado");
//        endereco2.setEstado("São Paulo");
//        endereco2.setCep("03849-123");
//
//        System.out.println("\n");
//
//        //plano de saude 1
//        PlanoDeSaude plano1 = new PlanoDeSaude();
//        plano1.setOperadora("Vivo");
//        plano1.setCategoria("premio");
//        plano1.setNumero("1290-1");
//        plano1.setValidade(LocalDate.of(2023, 1, 1));
//
//        //plano de saude 2
//        PlanoDeSaude plano2 = new PlanoDeSaude();
//        plano2.setOperadora("Tim");
//        plano2.setCategoria("Estilo");
//        plano2.setNumero("1123-1");
//        plano2.setValidade(LocalDate.of(2022, 12, 30));
//
//        System.out.println("\n");
//
//        //paciente 1
//        Paciente paciente1 = new Paciente();
//        paciente1.setNome("Negão");
//        paciente1.setDataDeNascimento(LocalDate.of(2005, 6, 22));
//        paciente1.setTelefone("(11)85645-3434");
//        paciente1.setEndereco(endereco1);
//        paciente1.setRg("48.151.623-47");
//        paciente1.setCpf("123.002.171-32");
//        paciente1.setPlanoDeSaude(plano1);
//
//        //paciente 1
//        Paciente paciente2 = new Paciente();
//        paciente2.setNome("Juju");
//        paciente2.setDataDeNascimento(LocalDate.of(2004, 12, 23));
//        paciente2.setTelefone("(11)85123-3543");
//        paciente2.setEndereco(endereco2);
//        paciente2.setRg("48.151.623-47");
//        paciente2.setCpf("123.002.171-32");
//        paciente2.setPlanoDeSaude(plano2);
//
//        System.out.println("\n");
//
//        //exibir um relatorio com os dados dos pacientes
//        //nome do paciente:
//        //Data de nascimento:
//        //Telefone do paciente:
//        //Cidade do paciente:
//        //Estado de residência:
//        //Operadora do plano de saude:
//        System.out.println("------------------ LISTA DE PACIENTES ---------------------------");
//        //relatorio paciente 1
//        System.out.println("Nome do paciente: " + paciente1.getNome());
//        System.out.println("Data de nascimento: " + paciente1.getDataDeNascimento());
//        System.out.println("Telefone: " + paciente1.getTelefone());
//        System.out.println("Cidade: " + paciente1.getEndereco().getCidade());
//        System.out.println("UF: " + paciente1.getEndereco().getEstado());
//        System.out.println("Operadora do plano de saude: " + paciente1.getPlanoDeSaude().getOperadora());
//        System.out.println("Categoria do Plano de saúde: " + paciente1.getPlanoDeSaude().getCategoria());
//        System.out.println("-----------------------------------------------------------------");
//        //relatorio paciente 2
//        System.out.println("Nome do paciente: " + paciente2.getNome());
//        System.out.println("Data de nascimento: " + paciente2.getDataDeNascimento());
//        System.out.println("Telefone: " + paciente2.getTelefone());
//        System.out.println("Cidade: " + paciente2.getEndereco().getCidade());
//        System.out.println("UF: " + paciente2.getEndereco().getEstado());
//        System.out.println("Operadora do plano de saude: " + paciente2.getPlanoDeSaude().getOperadora());
//        System.out.println("Categoria do Plano de saúde: " + paciente2.getPlanoDeSaude().getCategoria());
//        System.out.println("\n");
//
//        //agendar para o paciente1 uma consulta com fisioterapeuta
//        //para o dia 27/09/2023 às 15h45
//        Agenda agenda1 = new Agenda();
//        agenda1.setDataDaConsulta(LocalDate.of(2023, 9, 27));
//        agenda1.setHoraDaConsulta(LocalTime.of(15, 45));
//        agenda1.setPaciente(paciente1);
//        agenda1.setMedico(medico2);
//        agenda1.setEspecialidade(medico2.getEspecialidades()[1]);
//
//        //exibir a agenda do paciente1
//        //Nome do paciente:
//        //Data da consulta:
//        //Hora da consulta:
//        //Nome do médico:
//        //Nome da especialidade:
//        //Plano de saúde:
//        //Telefone do paciente:
//        System.out.println("----------------------- Agenda do Paciente 1 -----------------------");
//        System.out.println("Nome do paciente: " + agenda1.getPaciente().getNome());
//        System.out.println("Data da consulta: " + agenda1.getDataDaConsulta());
//        System.out.println("Hora da consulta: " + agenda1.getHoraDaConsulta());
//        System.out.println("Nome do médico: " + agenda1.getMedico().getNome());
//        System.out.println("Nome da especialidade: " + agenda1.getMedico().getEspecialidades()[1].getNome());
//        System.out.println("Plano de saúde: " + agenda1.getPaciente().getPlanoDeSaude().getOperadora());
//        System.out.println("Telefone do paciente: " + agenda1.getPaciente().getTelefone());
//
    }

}
