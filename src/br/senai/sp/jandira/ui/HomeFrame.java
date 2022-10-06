/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282169
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/macaco.png")));
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        scheduleIcon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        buttonAgenda = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        panelEspecialidades = new javax.swing.JPanel();
        scrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonEditarEspecialidade = new javax.swing.JButton();
        buttonNovaEspecialidade = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agendamento de consultas");
        setPreferredSize(new java.awt.Dimension(900, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.setMinimumSize(new java.awt.Dimension(900, 100));
        header.setPreferredSize(new java.awt.Dimension(900, 100));
        header.setLayout(null);

        scheduleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/schedule.png"))); // NOI18N
        scheduleIcon.setToolTipText("");
        header.add(scheduleIcon);
        scheduleIcon.setBounds(200, 10, 70, 64);

        title.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Agenda de Consultas");
        header.add(title);
        title.setBounds(290, 20, 320, 50);

        getContentPane().add(header);
        header.setBounds(0, 0, 830, 80);

        main.setMinimumSize(new java.awt.Dimension(900, 300));
        main.setPreferredSize(new java.awt.Dimension(900, 300));
        main.setLayout(null);

        buttonAgenda.setBackground(new java.awt.Color(255, 153, 153));
        buttonAgenda.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/clipboard.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        main.add(buttonAgenda);
        buttonAgenda.setBounds(20, 20, 100, 40);

        buttonMedico.setBackground(new java.awt.Color(255, 102, 204));
        buttonMedico.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/medico.png"))); // NOI18N
        buttonMedico.setToolTipText("Médico");
        buttonMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        main.add(buttonMedico);
        buttonMedico.setBounds(350, 20, 100, 40);

        buttonEspecialidades.setBackground(new java.awt.Color(255, 204, 0));
        buttonEspecialidades.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/especialista.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        main.add(buttonEspecialidades);
        buttonEspecialidades.setBounds(460, 20, 100, 40);

        panelEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades Médicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 18))); // NOI18N
        panelEspecialidades.setName(""); // NOI18N
        panelEspecialidades.setLayout(null);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollEspecialidades.setViewportView(tableEspecialidades);

        panelEspecialidades.add(scrollEspecialidades);
        scrollEspecialidades.setBounds(22, 30, 740, 260);

        buttonExcluirEspecialidade.setBackground(new java.awt.Color(255, 51, 0));
        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete.png"))); // NOI18N
        buttonExcluirEspecialidade.setToolTipText("deletar");
        buttonExcluirEspecialidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        panelEspecialidades.add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(500, 300, 80, 40);

        buttonEditarEspecialidade.setBackground(new java.awt.Color(255, 204, 0));
        buttonEditarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pencil.png"))); // NOI18N
        buttonEditarEspecialidade.setToolTipText("editar");
        buttonEditarEspecialidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonEditarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadeActionPerformed(evt);
            }
        });
        panelEspecialidades.add(buttonEditarEspecialidade);
        buttonEditarEspecialidade.setBounds(590, 300, 80, 40);

        buttonNovaEspecialidade.setBackground(new java.awt.Color(0, 153, 102));
        buttonNovaEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        buttonNovaEspecialidade.setToolTipText("criar");
        buttonNovaEspecialidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelEspecialidades.add(buttonNovaEspecialidade);
        buttonNovaEspecialidade.setBounds(680, 300, 80, 40);

        main.add(panelEspecialidades);
        panelEspecialidades.setBounds(20, 80, 790, 360);

        buttonSair.setBackground(new java.awt.Color(255, 0, 51));
        buttonSair.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/sair.png"))); // NOI18N
        buttonSair.setToolTipText("Sair");
        buttonSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        main.add(buttonSair);
        buttonSair.setBounds(710, 20, 100, 40);

        buttonPaciente.setBackground(new java.awt.Color(0, 204, 204));
        buttonPaciente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/paciente.png"))); // NOI18N
        buttonPaciente.setToolTipText("Paciente");
        buttonPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        main.add(buttonPaciente);
        buttonPaciente.setBounds(130, 20, 100, 40);

        buttonPlanoDeSaude.setBackground(new java.awt.Color(0, 153, 153));
        buttonPlanoDeSaude.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plano-de-saude.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Plano de Saúde");
        buttonPlanoDeSaude.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        main.add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(240, 20, 100, 40);

        getContentPane().add(main);
        main.setBounds(0, 80, 830, 450);

        setSize(new java.awt.Dimension(844, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonEditarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarEspecialidadeActionPerformed

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEditarEspecialidade;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonNovaEspecialidade;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JPanel header;
    private javax.swing.JPanel main;
    private javax.swing.JPanel panelEspecialidades;
    private javax.swing.JLabel scheduleIcon;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        String[][] dados = {
            
            {"100", "Jandira", "SP"},
            {"200", "Itapevi", "SP"},
            {"300", "Cotia", "SP"},
            {"400", "barueri", "SP"},
            {"400", "Curitiba", "PR"},
            {"400", "Fortaleza", "CE"}
 
        };
        
        String[] titulos = {"CÓDIGO", "NOME DA CIDADE", "ESTADO"};
    
        DefaultTableModel modelo = new DefaultTableModel(dados, titulos);
    
        tableEspecialidades.setModel(modelo);
    }
}