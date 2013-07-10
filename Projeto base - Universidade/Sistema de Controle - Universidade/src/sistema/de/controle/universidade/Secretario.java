package sistema.de.controle.universidade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistema.de.controle.universidade.estudante.*;
import sistema.de.controle.universidade.professor.*;
public class Secretario extends javax.swing.JFrame {
    public Secretario() {
        initComponents();
        setTitle("Secretaria - Controle Docente / Discente");
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoProfBuscar = new javax.swing.JButton();
        BotaoProfInserir = new javax.swing.JButton();
        BotaoProfRemover = new javax.swing.JButton();
        BotaoProfAtualizar = new javax.swing.JButton();
        BotaoProfCriarTurma = new javax.swing.JButton();
        BotaoProfMinistraMaisAulas = new javax.swing.JButton();
        BotaoAlunoMatricular = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BotaoAlunoInserir = new javax.swing.JButton();
        BotaoAlunoRemover = new javax.swing.JButton();
        BotaoAlunoAtualizar = new javax.swing.JButton();
        TextSistemaDeControleDisDos = new java.awt.Label();
        jSeparator2 = new javax.swing.JSeparator();
        TextProfessores = new java.awt.Label();
        TextAlunos = new java.awt.Label();
        jSeparator3 = new javax.swing.JSeparator();
        BotaoSairSistema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BotaoProfBuscar.setText("BUSCAR");
        BotaoProfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProfBuscarActionPerformed(evt);
            }
        });

        BotaoProfInserir.setText("INSERIR");
        BotaoProfInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProfInserirActionPerformed(evt);
            }
        });

        BotaoProfRemover.setText("REMOVER");
        BotaoProfRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProfRemoverActionPerformed(evt);
            }
        });

        BotaoProfAtualizar.setText("ATUALIZAR");
        BotaoProfAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProfAtualizarActionPerformed(evt);
            }
        });

        BotaoProfCriarTurma.setText("CRIAR TURMA");
        BotaoProfCriarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProfCriarTurmaActionPerformed(evt);
            }
        });

        BotaoProfMinistraMaisAulas.setText("MINISTRA MAIS AULAS");
        BotaoProfMinistraMaisAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProfMinistraMaisAulasActionPerformed(evt);
            }
        });

        BotaoAlunoMatricular.setText("MATRICULAR ALUNOS");
        BotaoAlunoMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlunoMatricularActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BotaoAlunoInserir.setText("INSERIR");
        BotaoAlunoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlunoInserirActionPerformed(evt);
            }
        });

        BotaoAlunoRemover.setText("REMOVER");
        BotaoAlunoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlunoRemoverActionPerformed(evt);
            }
        });

        BotaoAlunoAtualizar.setText("ATUALIZAR");
        BotaoAlunoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlunoAtualizarActionPerformed(evt);
            }
        });

        TextSistemaDeControleDisDos.setAlignment(java.awt.Label.CENTER);
        TextSistemaDeControleDisDos.setFont(new java.awt.Font("Georgia", 3, 16));
        TextSistemaDeControleDisDos.setText("SECRETARIA - CONTROLE DOCENTE / DISCENTE ");

        TextProfessores.setAlignment(java.awt.Label.CENTER);
        TextProfessores.setFont(new java.awt.Font("Georgia", 2, 16));
        TextProfessores.setText("Professores");

        TextAlunos.setAlignment(java.awt.Label.CENTER);
        TextAlunos.setFont(new java.awt.Font("Georgia", 2, 16));
        TextAlunos.setText("Alunos");

        BotaoSairSistema.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotaoSairSistema.setText("SAIR DO SISTEMA");
        BotaoSairSistema.setActionCommand("SAIR DO SISTEMA");
        BotaoSairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextSistemaDeControleDisDos, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BotaoProfCriarTurma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoProfAtualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoProfMinistraMaisAulas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoProfRemover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoProfInserir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoProfBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoAlunoMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextAlunos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(BotaoAlunoInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoAlunoRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoAlunoAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(BotaoSairSistema, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextSistemaDeControleDisDos, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoProfBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoProfInserir)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoProfRemover)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoProfAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoProfMinistraMaisAulas)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoProfCriarTurma))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoAlunoInserir)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoAlunoRemover)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoAlunoAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoAlunoMatricular))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(BotaoSairSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(374, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(367, 367, 367)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BotaoProfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProfBuscarActionPerformed
        new BuscarProfessores();
    }//GEN-LAST:event_BotaoProfBuscarActionPerformed

    private void BotaoProfInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProfInserirActionPerformed
        new inserirProf();
    }//GEN-LAST:event_BotaoProfInserirActionPerformed

    private void BotaoProfRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProfRemoverActionPerformed
        new deletarProf();
    }//GEN-LAST:event_BotaoProfRemoverActionPerformed

    private void BotaoProfAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProfAtualizarActionPerformed
        new atualizarProf();
    }//GEN-LAST:event_BotaoProfAtualizarActionPerformed

    private void BotaoAlunoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlunoInserirActionPerformed
        new inserirAlu();
    }//GEN-LAST:event_BotaoAlunoInserirActionPerformed

    private void BotaoAlunoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlunoRemoverActionPerformed
        new deletarAlu();
    }//GEN-LAST:event_BotaoAlunoRemoverActionPerformed

    private void BotaoAlunoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlunoAtualizarActionPerformed
        new atualizarAlu();
    }//GEN-LAST:event_BotaoAlunoAtualizarActionPerformed

    private void BotaoProfMinistraMaisAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProfMinistraMaisAulasActionPerformed
        new HorasAulaProf();
    }//GEN-LAST:event_BotaoProfMinistraMaisAulasActionPerformed

    private void BotaoAlunoMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlunoMatricularActionPerformed
        new MatricularAlunos();
    }//GEN-LAST:event_BotaoAlunoMatricularActionPerformed

    private void BotaoProfCriarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProfCriarTurmaActionPerformed
        new CriarTurma();
    }//GEN-LAST:event_BotaoProfCriarTurmaActionPerformed

    private void BotaoSairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairSistemaActionPerformed
        int showConfirmDialog1 = JOptionPane.showConfirmDialog(null, "Deseja sair do sistema?","Sair?", JOptionPane.YES_OPTION,JOptionPane.NO_OPTION, null);
        if(showConfirmDialog1==JOptionPane.YES_OPTION){
                System.exit(0);
        }
    }//GEN-LAST:event_BotaoSairSistemaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlunoAtualizar;
    private javax.swing.JButton BotaoAlunoInserir;
    private javax.swing.JButton BotaoAlunoMatricular;
    private javax.swing.JButton BotaoAlunoRemover;
    private javax.swing.JButton BotaoProfAtualizar;
    private javax.swing.JButton BotaoProfBuscar;
    private javax.swing.JButton BotaoProfCriarTurma;
    private javax.swing.JButton BotaoProfInserir;
    private javax.swing.JButton BotaoProfMinistraMaisAulas;
    private javax.swing.JButton BotaoProfRemover;
    private javax.swing.JButton BotaoSairSistema;
    private java.awt.Label TextAlunos;
    private java.awt.Label TextProfessores;
    private java.awt.Label TextSistemaDeControleDisDos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
