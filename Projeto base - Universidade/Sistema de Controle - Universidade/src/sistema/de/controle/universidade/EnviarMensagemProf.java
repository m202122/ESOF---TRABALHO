package sistema.de.controle.universidade;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Vector;
import javax.swing.JOptionPane;

public class EnviarMensagemProf extends javax.swing.JFrame {

    javax.swing.DefaultListModel modelolistafac = new javax.swing.DefaultListModel();
    
    public EnviarMensagemProf() throws SQLException{
        setTitle("Enviar mensagem para professores");
        initComponents();
        getFacList();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextBaseDadosProfessor = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botaoEnviaMsg = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextBaseDadosProfessor.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        TextBaseDadosProfessor.setText("Enviar mensagem para professores de uma faculdade");

        jScrollPane1.setViewportView(jList1);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("- Faculdades disponiveis -");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        botaoEnviaMsg.setText("Enviar mensagem!");
        botaoEnviaMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviaMsgActionPerformed(evt);
            }
        });

        jButton1.setText("VOLTAR AO PAINEL ANTERIOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(TextBaseDadosProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(botaoEnviaMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextBaseDadosProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEnviaMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEnviaMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviaMsgActionPerformed
        // TODO add your handling code here:
        String faculdade;
        String msg = jTextArea1.getText();
        ConectarAOBanco cd = new ConectarAOBanco();
        cd.ConectarBanco();
        if(jList1.isSelectionEmpty()) {
            JOptionPane.showMessageDialog( this, "Selecione a faculdade" );
            return;
        }
        else faculdade = jList1.getSelectedValue().toString();
        if(msg.equals(""))
        {
            JOptionPane.showMessageDialog( this, "Digite a mensagem" );
            return;
        }
        else {
            if(msg.length()>400)
            {
                JOptionPane.showMessageDialog( this, "Mensagem de no máximo 400 caracteres" );
                return;
            }
            ResultSet rs = null;
            cd.ConectarBanco();
            String query = "INSERT INTO universidade.mensagem(id_faculdade,msg,tipo) VALUES ('"+faculdade+"','"+msg+"','professor')";
            int r;
            r = cd.updatequery(query);
            if(r == 1)
            {
                JOptionPane.showMessageDialog( this, "Mensagem inserida com sucesso!" );
            }
            else
            {
                JOptionPane.showMessageDialog( this, "Mensagem nao inserida!" );
            }
            dispose();
        }
    }//GEN-LAST:event_botaoEnviaMsgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private Vector getNextRow( ResultSet rs, ResultSetMetaData rsmd ) throws SQLException {
        Vector currentRow = new Vector();
        for ( int i = 1; i <= rsmd.getColumnCount(); ++i )
            switch( rsmd.getColumnType( i ) ) {
                case Types.VARCHAR:
                    currentRow.addElement( rs.getString( i ) );
                    break;
                case Types.INTEGER:
                    currentRow.addElement( 
                    new Long( rs.getLong( i ) ) );
                    break;
                case Types.DATE:
                    currentRow.addElement(rs.getDate( i ));
                    break;
                case Types.FLOAT:
                    currentRow.addElement(rs.getFloat(i));
                    break;
                case Types.CHAR:
                    currentRow.addElement(rs.getString(i));
                    break;
                case Types.REAL:
                    currentRow.addElement(rs.getFloat(i));
                    break;  
                default: 
                    System.out.println( "Type was: " + rsmd.getColumnTypeName( i ) );
         }
         return currentRow;
    }
    
    private String getInfo( ResultSet rs ) throws SQLException {
      // position to first record
      boolean moreRecords = rs.next();  
      // If there are no records, display a message
      if ( ! moreRecords ) { 
         return null;
      }
      Vector columnHeads = new Vector();
      Vector rows = new Vector();
      try {
         // get column heads
         ResultSetMetaData rsmd = rs.getMetaData();
         for ( int i = 1; i <= rsmd.getColumnCount(); ++i ) 
            columnHeads.addElement( rsmd.getColumnName( i ) );
         // get row data
         do {
            rows.addElement( getNextRow( rs, rsmd ) ); 
         } while ( rs.next() );
          String info;
          String aux = rows.get(0).toString();
          info = aux.substring(1,aux.length()-1);
          return info;
      }
      catch ( SQLException sqlex ) {
         sqlex.printStackTrace();
	 return null;
      }
   }
    
    private void getFacList() throws SQLException
    {
        ResultSet rs = null;
        ConectarAOBanco cd = new ConectarAOBanco();
        cd.ConectarBanco();
        String query = "SELECT sigla FROM universidade.faculdade";
        rs = cd.query(query);
        int fac = exibirLista(rs);
        if(fac == 1)
            jList1.setModel(modelolistafac);
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TextBaseDadosProfessor;
    private javax.swing.JButton botaoEnviaMsg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
