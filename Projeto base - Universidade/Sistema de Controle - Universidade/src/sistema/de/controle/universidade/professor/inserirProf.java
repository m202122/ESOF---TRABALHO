package sistema.de.controle.universidade.professor;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistema.de.controle.universidade.ConectarAOBanco;
public class inserirProf extends javax.swing.JFrame {
javax.swing.DefaultListModel modelolistafac = new javax.swing.DefaultListModel();
    public inserirProf() {
        setTitle("Inserir professor");
        initComponents();
        try {
            getFacList();
        } catch (SQLException ex) {
            Logger.getLogger(inserirProf.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        TextMatricularAluno = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("Identificador:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Faculdade:");

        jLabel5.setText("Salario (R$):");

        jButton1.setText("Inserir professor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        TextMatricularAluno.setAlignment(java.awt.Label.CENTER);
        TextMatricularAluno.setFont(new java.awt.Font("Corbel", 1, 18));
        TextMatricularAluno.setName(""); // NOI18N
        TextMatricularAluno.setText("Inserir professor");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setText("RETORNAR AO CONTROLE DA SECRETARIA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextMatricularAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextMatricularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int teste=1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConectarAOBanco cd = new ConectarAOBanco();
        cd.ConectarBanco();
        String id = jTextField1.getText();
        String nome = jTextField2.getText();
        String faculdade;
        if(jList1.isSelectionEmpty())
            faculdade="";
        else
             faculdade= jList1.getSelectedValue().toString();
        String sal = jTextField4.getText();
        if(id.equals("") || nome.equals("") || faculdade.equals("")){
            JOptionPane.showMessageDialog( this, "Professor nao inserido!" );
            return;
        }
        if(teste==1){
            ResultSet rs = null;
            cd.ConectarBanco();
            String query = "SELECT * FROM universidade.professor WHERE id='"+id+"'";
            rs = cd.query(query);
            try {
                String teste = getInfo(rs);
                if(teste!=null){
                    JOptionPane.showMessageDialog( this, "Identificador já existe! Professor não inserido." );
                    return;
                }
            } catch (SQLException ex) {
                Logger.getLogger(inserirProf.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(teste==1)
        {
            if(sal.equals(""))
                 sal = "NULL";
            int r;
            String query = "INSERT INTO universidade.professor VALUES('"+id+"','"+nome+"','"+faculdade+"',"+sal+")";
            r = cd.updatequery(query);
            if(r == 1)
            {
                JOptionPane.showMessageDialog( this, "Professor inserido com sucesso!" );
            }
            else
            {
                JOptionPane.showMessageDialog( this, "Professor nao inserido!" );
            }
        }
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                default: 
                    System.out.println( "Type was: " + rsmd.getColumnTypeName( i ) );
         }
         return currentRow;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TextMatricularAluno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
