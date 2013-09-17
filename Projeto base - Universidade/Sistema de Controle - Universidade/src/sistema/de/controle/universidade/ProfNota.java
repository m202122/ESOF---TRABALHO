package sistema.de.controle.universidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProfNota extends javax.swing.JPanel {

    javax.swing.DefaultListModel modelolistaNome = new javax.swing.DefaultListModel();
    ConectarAOBanco cd;
    String id;
    
    public ProfNota(String id) {
        this.id = id;
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextSistemaDeControleDisDos1 = new java.awt.Label();
        TextInf1 = new java.awt.Label();
        jSeparator2 = new javax.swing.JSeparator();
        TextProfessoresEncontrados = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeProfessoresEncontrados = new javax.swing.JList();
        TextSistemaDeControleDisDos = new java.awt.Label();
        TextInf2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        turma = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaDeTurmas = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaDeTurmas1 = new javax.swing.JList();
        turma1 = new java.awt.Label();
        notaAluno = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        TextSistemaDeControleDisDos1.setAlignment(java.awt.Label.CENTER);
        TextSistemaDeControleDisDos1.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        TextSistemaDeControleDisDos1.setText("PROFESSOR");

        TextInf1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        TextInf1.setText("* Para selecionar todos os professores apenas clique em 'Filtrar'");

        TextProfessoresEncontrados.setFont(new java.awt.Font("Gulim", 1, 14)); // NOI18N
        TextProfessoresEncontrados.setText("Professores encontrados");

        jScrollPane1.setViewportView(ListaDeProfessoresEncontrados);

        TextSistemaDeControleDisDos.setAlignment(java.awt.Label.CENTER);
        TextSistemaDeControleDisDos.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        TextSistemaDeControleDisDos.setText("PROFESSOR");

        TextInf2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        TextInf2.setText("Colocar nota do aluno");

        jLabel1.setText("Turma:");

        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        turma.setFont(new java.awt.Font("Gulim", 1, 14)); // NOI18N
        turma.setText("Turmas encontradas");

        jScrollPane2.setViewportView(ListaDeTurmas);

        jButton2.setText("Buscar alunos da turma selecionada");

        jScrollPane3.setViewportView(ListaDeTurmas1);

        turma1.setFont(new java.awt.Font("Gulim", 1, 14)); // NOI18N
        turma1.setText("Alunos encontrados");

        jButton3.setText("Enviar Nota");

        jButton4.setText("Voltar ao Painel anterior");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextSistemaDeControleDisDos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextInf2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(notaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jButton4))
                        .addGap(0, 365, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(390, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextSistemaDeControleDisDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextInf2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(19, 19, 19)
                .addComponent(turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(6, 6, 6)
                .addComponent(turma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(364, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        modelolistaNome.clear();        
        ResultSet rs = null;
        cd = new ConectarAOBanco();
        String nome = jTextField1.getText();
        nome = nome.toUpperCase();
        String query = "SELECT DISTINCT d.nome, t.turma FROM universidade.professor p, universidade.turma t, universidade.ensina e, universidade.disciplina d WHERE p.id='"+id+"' AND p.id=e.id_prof AND e.id_turma=t.id AND t.cod_disc=d.codigo ORDER BY d.nome";
        cd.ConectarBanco();
        rs = cd.query(query);
        
        int resultado;
        try {
            resultado = exibirResultado(rs);
            if(resultado == 1){
                ListaDeTurmas.setModel(modelolistaNome);
            }
            else{
                    JOptionPane.showMessageDialog(this, "Professor não foi encontrado"); 
            }
            cd.shutDown();
        } catch ( SQLException sqlex ) 
        {
            sqlex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
       public int exibirResultado(ResultSet rs) throws SQLException {
        // position to first record
        boolean moreRecords = rs.next();
        // If there are no records, display a message
        if (!moreRecords) {
            return 0;
        }
        modelolistaNome.addElement(rs.getString(1));
        while (rs.next()) {
            modelolistaNome.addElement(rs.getString(1));
        }
        return 1;
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaDeProfessoresEncontrados;
    private javax.swing.JList ListaDeTurmas;
    private javax.swing.JList ListaDeTurmas1;
    private java.awt.Label TextInf1;
    private java.awt.Label TextInf2;
    private java.awt.Label TextProfessoresEncontrados;
    private java.awt.Label TextSistemaDeControleDisDos;
    private java.awt.Label TextSistemaDeControleDisDos1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField notaAluno;
    private java.awt.Label turma;
    private java.awt.Label turma1;
    // End of variables declaration//GEN-END:variables
}
