package sistema.de.controle.universidade;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class MatricularAlunos extends javax.swing.JFrame {
    javax.swing.DefaultListModel modelolistaNome = new javax.swing.DefaultListModel();
    /** Creates new form MatricularAlunos */
    public MatricularAlunos() {
        setTitle("Sistema para matricula de aluno");
        initComponents();
        setVisible(true);
    }
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
    private void displayResultSet( ResultSet rs, JTable table) throws SQLException {
        // position to first record
        boolean moreRecords = rs.next();  
        // If there are no records, display a message
        if ( ! moreRecords ) { 
            JOptionPane.showMessageDialog( this, "Disciplina correspondente não foi encontrada..." );
            return;
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
            table.setModel(new DefaultTableModel(rows,columnHeads));  
        }
        catch ( SQLException sqlex ) {
            sqlex.printStackTrace();
        }
    }
    
    private void getTable(ResultSet rs)
   {
       ConectarAOBanco cd = new ConectarAOBanco();
       try {
            cd.ConectarBanco();
            displayResultSet( rs,jTable1 );
       }
        catch ( SQLException sqlex ) {
            sqlex.printStackTrace();
            JOptionPane.showMessageDialog( this, "ResultSet contained no records" );
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
                case Types.DOUBLE:
                    currentRow.addElement(rs.getDouble(i));
                    break;  
                default: 
                    System.out.println( "Type was: " + rsmd.getColumnTypeName( i ) );
         }
         return currentRow;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton4 = new javax.swing.JButton();
        TextMatricularAluno = new java.awt.Label();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        TextInf1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Filtrar nome");
        jButton1.setActionCommand("Filtrar nome da disciplina");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Filtrar por codigo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Disciplina:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);

        jButton3.setText("Selecionar disciplina e identificar aluno...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Selecionar turma");

        jLabel4.setText("Alunos ainda não matriculados na disciplina selecionada");

        jScrollPane2.setViewportView(jList1);

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton4.setText("Matricular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TextMatricularAluno.setAlignment(java.awt.Label.CENTER);
        TextMatricularAluno.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        TextMatricularAluno.setName(""); // NOI18N
        TextMatricularAluno.setText("Sistema para matrícula de aluno");

        TextInf1.setFont(new java.awt.Font("Dialog", 2, 12));
        TextInf1.setText("* Para selecionar todas as disciplinas clique apenas em 'Filtrar nome'");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton5.setText("RETORNAR AO CONTROLE DA SECRETARIA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1181, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1181, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextInf1, javax.swing.GroupLayout.DEFAULT_SIZE, 1149, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                            .addComponent(jLabel4))))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1181, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(TextMatricularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 1181, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextMatricularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextInf1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ResultSet rs = null;
        ConectarAOBanco cd = new ConectarAOBanco();
        cd.ConectarBanco();
        String nome = jTextField1.getText();
        nome = nome.toUpperCase();
        try 
        {
            String querymes = "SELECT EXTRACT(MONTH FROM current_timestamp)";
            rs = cd.query(querymes);
            String mes = getInfo(rs);
            double mesf = Double.parseDouble(mes); 
            int mesi =(int) mesf;
            if(mesi >=1 && mesi <=6)
            {
                String querytabturma= "SELECT d.nome,t.id,t.turma,t.semestre,t.ano,t.cod_disc,t.predio_s,t.n_sala FROM universidade.disciplina d, universidade.turma t WHERE t.cod_disc = d.codigo AND t.ano = EXTRACT(YEAR FROM current_timestamp) AND t.semestre = 1 AND UPPER(d.nome) like'%"+nome+"%' ORDER BY d.nome";
                rs=cd.query(querytabturma);
                getTable(rs);
            }
            else
            {
                String querytabturma= "SELECT d.nome,t.id,t.turma,t.semestre,t.ano,t.cod_disc,t.predio_s,t.n_sala FROM universidade.disciplina d, universidade.turma t WHERE t.cod_disc = d.codigo AND t.ano = EXTRACT(YEAR FROM current_timestamp) AND t.semestre = 2 AND UPPER(d.nome) like'%"+nome+"%' ORDER BY d.nome";
                rs=cd.query(querytabturma);
                getTable(rs);
            }
            
        
        } catch ( SQLException sqlex ) 
        {
            sqlex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ResultSet rs = null;
        ConectarAOBanco cd = new ConectarAOBanco();
        cd.ConectarBanco();
        String cod = jTextField1.getText();
        cod = cod.toUpperCase();        
        try 
        {
            String querymes = "SELECT EXTRACT(MONTH FROM current_timestamp)";
            rs = cd.query(querymes);
            String mes = getInfo(rs);
            double mesf = Double.parseDouble(mes); 
            int mesi =(int) mesf;
            if(mesi >=1 && mesi <=6)
            {
                String querytabturma= "SELECT d.nome,t.id,t.turma,t.semestre,t.ano,t.cod_disc,t.predio_s,t.n_sala FROM universidade.disciplina d, universidade.turma t WHERE t.cod_disc = d.codigo AND t.ano = EXTRACT(YEAR FROM current_timestamp) AND t.semestre = 1 AND UPPER(d.codigo) like'%"+cod+"%' ORDER BY d.nome";
                rs=cd.query(querytabturma);
                getTable(rs);
            }
            else
            {
                String querytabturma= "SELECT d.nome,t.id,t.turma,t.semestre,t.ano,t.cod_disc,t.predio_s,t.n_sala FROM universidade.disciplina d, universidade.turma t WHERE t.cod_disc = d.codigo AND t.ano = EXTRACT(YEAR FROM current_timestamp) AND t.semestre = 2 AND UPPER(d.codigo) like'%"+cod+"%' ORDER BY d.nome";
                rs=cd.query(querytabturma);
                getTable(rs);
            }
            
        
        } catch ( SQLException sqlex ) 
        {
            sqlex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        modelolistaNome.clear();
        int linha = jTable1.getSelectedRow();
        if(linha == -1)
            JOptionPane.showMessageDialog( this, "Selecione uma turma" );
        else
        {
            String codigo = jTable1.getValueAt(linha, 5).toString();
            String idturma = jTable1.getValueAt(linha, 1).toString();
            ResultSet rs = null;
            ConectarAOBanco cd = new ConectarAOBanco();
            cd.ConectarBanco();
            String query = "SELECT e.nome FROM universidade.estudante e WHERE e.id NOT IN ( SELECT f.id_est FROM universidade.frequenta f WHERE f.id_turma ='"+idturma+"') ORDER BY e.nome";
            rs = cd.query(query); 
            int resultado;
            try {
                resultado = exibirResultado(rs);
                if(resultado == 1){
                    jList1.setModel(modelolistaNome);
                }
                else{
                        JOptionPane.showMessageDialog(this, "Todos estudante ja estao matriculados nessa turma"); 
                }
            }catch ( SQLException sqlex ) 
            {
                sqlex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Selecione primeiro a disciplina"); 
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if(jList1.isSelectionEmpty())
            JOptionPane.showMessageDialog(this, "Selecione o aluno a ser matriculado...");
        else
        {
            ResultSet rs = null;
            ConectarAOBanco cd = new ConectarAOBanco();
            cd.ConectarBanco();
            int i=0;
            int linha = jTable1.getSelectedRow();
            String idturma = jTable1.getValueAt(linha, 1).toString();
            Object nomes[] = jList1.getSelectedValues();
            int tam=nomes.length;
            System.out.println(tam);
            int r=0;
            for (i=0;i<tam;i++){         
                try {
                    String nome = nomes[i].toString();
                    String queryid = "SELECT e.id FROM universidade.estudante e WHERE e.nome = '"+nome+"'";
                    rs = cd.query(queryid);
                    String id = getInfo(rs);
                    String queryinsert = "INSERT INTO universidade.frequenta VALUES('"+id+"','"+idturma+"',NULL)";
                    r = cd.updatequery(queryinsert); 
                    modelolistaNome.removeElement(nomes[i]);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if(r==1){
                 JOptionPane.showMessageDialog(this, "Aluno foi matriculado!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Aluno nao foi matriculado!");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TextInf1;
    private java.awt.Label TextMatricularAluno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
