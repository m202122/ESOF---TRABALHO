package sistema.de.controle.universidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AlunoVerificaMsg extends javax.swing.JFrame {
    
    javax.swing.DefaultListModel modelolistafac = new javax.swing.DefaultListModel();
    
    public AlunoVerificaMsg() {
        initComponents();
        Preenche();
        setVisible(true);
        setTitle("Verificando mensagens");
    }
    
    String val;
    private void Preenche()
    {
       ResultSet rs = null;
       ConectarAOBanco cd = new ConectarAOBanco();
       try {
            
            cd.ConectarBanco();
            String queryid = "SELECT DISTINCT m.msg FROM universidade.mensagem m, universidade.estudante e, universidade.login l WHERE e.id = l.usuario AND m.id_faculdade=e.fac_est AND m.tipo = 'aluno' AND l.usuario='"+ControleUniversidade.a+"'";
            rs = cd.query(queryid);
            int msg = exibirLista(rs);
            if(msg == 1)
                campoTexto1.setModel(modelolistafac);
        }
        catch ( SQLException sqlex ) {
            //sqlex.printStackTrace();
            JOptionPane.showMessageDialog( this, "ResultSet contained no records" );
        }
    }
    
    public int exibirLista(ResultSet rs) throws SQLException {
        // position to first record
        boolean moreRecords = rs.next();
        // If there are no records, display a message
        if (!moreRecords) {
            return 0;
        }
        modelolistafac.addElement(rs.getString(1));
        while (rs.next()) {
            modelolistafac.addElement(rs.getString(1));
        }
        return 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        campoTexto = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        TextMatricularAluno1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        campoTexto1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();

        jScrollPane2.setViewportView(campoTexto);

        jButton1.setText("VOLTAR AO MENU DE OPÇÕES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextMatricularAluno1.setAlignment(java.awt.Label.CENTER);
        TextMatricularAluno1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        TextMatricularAluno1.setName(""); // NOI18N
        TextMatricularAluno1.setText("Mensagens para alunos de sua faculdade");

        jScrollPane3.setViewportView(campoTexto1);

        jButton2.setText("VOLTAR AO MENU DE OPÇÕES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(TextMatricularAluno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextMatricularAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TextMatricularAluno1;
    private javax.swing.JList campoTexto;
    private javax.swing.JList campoTexto1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
