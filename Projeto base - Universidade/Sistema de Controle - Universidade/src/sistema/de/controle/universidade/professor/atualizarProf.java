package sistema.de.controle.universidade.professor;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import sistema.de.controle.universidade.ConectarAOBanco;
public class atualizarProf extends javax.swing.JFrame {
    javax.swing.DefaultListModel modelolistaNome = new javax.swing.DefaultListModel();
    javax.swing.DefaultListModel modelolistafac = new javax.swing.DefaultListModel();
    String nome1;
    public atualizarProf() {
        setTitle("Atualizar dados de professor");
        initComponents();
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        TextMatricularAluno = new java.awt.Label();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        TextAlunosEncontrados = new java.awt.Label();
        jSeparator3 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        TextInf2 = new java.awt.Label();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Filtrar por nome");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Filtrar por id");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jButton3.setText("Selecionar professor e verficar dados");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setText("Nome:");

        jLabel4.setText("Salario:");

        jLabel7.setText("Faculdade:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("- FACULDADES DISPONIVEIS -");

        jScrollPane2.setViewportView(jList2);

        jLabel6.setText("Faculdade");

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton4.setText("Atualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TextMatricularAluno.setAlignment(java.awt.Label.CENTER);
        TextMatricularAluno.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        TextMatricularAluno.setName(""); // NOI18N
        TextMatricularAluno.setText("Atualizar dados de professor");

        jLabel1.setText("Professor:");

        TextAlunosEncontrados.setFont(new java.awt.Font("Gulim", 1, 14));
        TextAlunosEncontrados.setText("Dados acadêmicos");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("RETORNAR AO CONTROLE DA SECRETARIA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        TextInf2.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        TextInf2.setName(""); // NOI18N
        TextInf2.setText("* Para selecionar todos os professores clique em 'Filtrar por nome'");

        jLabel2.setText("Professores encontrados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextMatricularAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TextInf2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator4)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextAlunosEncontrados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addGap(77, 77, 77))
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextMatricularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(19, 19, 19)
                        .addComponent(TextInf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextAlunosEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        modelolistaNome.clear();
        ResultSet rs = null;
        ConectarAOBanco cd = new ConectarAOBanco();
        String nome = jTextField1.getText();
        nome = nome.toUpperCase();
        String query = "SELECT nome FROM universidade.professor WHERE UPPER(nome) like'%"+nome+"%' ORDER BY nome";
        cd.ConectarBanco();
        rs = cd.query(query);
        int resultado;
        try {
            resultado = exibirResultado(rs);
            if(resultado == 1){
                jList1.setModel(modelolistaNome);
            }
            else{
                    JOptionPane.showMessageDialog(this, "Professor não foi encontrado"); 
            }
        } catch ( SQLException sqlex ) 
        {
            sqlex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        modelolistaNome.clear();
        ResultSet rs = null;
        ConectarAOBanco cd = new ConectarAOBanco();
        String id = jTextField1.getText();
        String query = "SELECT nome FROM universidade.professor WHERE id = '"+id+"' ORDER BY nome";
        cd.ConectarBanco();
        rs = cd.query(query);
        int resultado;
        try {
            resultado = exibirResultado(rs);
            if(resultado == 1){
                jList1.setModel(modelolistaNome);
            }
            else{
                    JOptionPane.showMessageDialog(this, "Professor não foi encontrado"); 
            }
        } catch ( SQLException sqlex ) 
        {
            sqlex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jList1.isSelectionEmpty())
            JOptionPane.showMessageDialog(this, "Selecione alguem pra ser atualizado!"); 
        else
        {
            String nome = jList1.getSelectedValue().toString();
            nome1=nome;
            modelolistaNome.clear();
            jTextField2.setText(nome);
            ConectarAOBanco cd = new ConectarAOBanco();
            cd.ConectarBanco();
            ResultSet rs = null;
            try {
                String querysal = "SELECT salario FROM universidade.professor WHERE nome = '"+nome+"'";
                rs = cd.query(querysal);
                String sal = getInfo(rs);
                jTextField3.setText(sal);
                String queryfac = "SELECT fac_prof FROM universidade.professor WHERE nome = '"+nome+"'";
                rs = cd.query(queryfac);
                String fac = getInfo(rs);
                jLabel6.setText(fac);
                String queryfaclist = "SELECT sigla FROM universidade.faculdade";
                rs = cd.query(queryfaclist);
                int resultado = exibirResultado2(rs);
                if(resultado == 1){
                    jList2.setModel(modelolistafac);
                }    
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String fac;
        ConectarAOBanco cd = new ConectarAOBanco();
        cd.ConectarBanco();
        if(jList2.isSelectionEmpty())
            fac = jLabel6.getText();
        else
            fac = jList2.getSelectedValue().toString();         
        String queryUpdate = "UPDATE universidade.professor SET nome ='"+jTextField2.getText()+"', salario ="+jTextField3.getText()+" , fac_prof ='"+fac+"'  WHERE nome = '"+nome1+"'" ;
        int r = cd.updatequery(queryUpdate);
        if(r==1){
            jLabel6.setText(fac);
            JOptionPane.showMessageDialog(this, "Dados atualizados");
        }
        else
            JOptionPane.showMessageDialog(this, "Dados nao atualizados");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
     
            public int exibirResultado2(ResultSet rs) throws SQLException {
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
                case Types.NUMERIC:
                 currentRow.addElement(rs.getFloat(i));
                    break;
                default: 
                    System.out.println( "Type was: " + rsmd.getColumnTypeName( i ) );
         }
         return currentRow;
    }   
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TextAlunosEncontrados;
    private java.awt.Label TextInf2;
    private java.awt.Label TextMatricularAluno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
