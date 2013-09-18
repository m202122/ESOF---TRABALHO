package sistema.de.controle.universidade;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class NotaProf extends javax.swing.JFrame {
    
    javax.swing.DefaultListModel modelolistaNome = new javax.swing.DefaultListModel();
    String colunas[] = {"Disciplina", "Turma", "Codigo da turma"}; 
    DefaultTableModel model = new DefaultTableModel(colunas, 0); 
    ConectarAOBanco cd;
    
    String codigo;
    String id_aluno;
    String id;
    String disc;
    String nome;
        
    public NotaProf(String id) {
        initComponents();
        this.id = id;
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        turma = new java.awt.Label();
        turma2 = new java.awt.Label();
        TextSistemaDeControleDisDos = new java.awt.Label();
        TextInf2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        turma1 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        turma3 = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        notaAluno = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        turma.setFont(new java.awt.Font("Gulim", 1, 14)); // NOI18N
        turma.setText("Turmas encontradas");

        turma2.setFont(new java.awt.Font("Gulim", 1, 14)); // NOI18N
        turma2.setText("Alunos encontrados");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextSistemaDeControleDisDos.setAlignment(java.awt.Label.CENTER);
        TextSistemaDeControleDisDos.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        TextSistemaDeControleDisDos.setText("PROFESSOR");

        TextInf2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        TextInf2.setText("Enviar nota do aluno");

        jLabel1.setText("Turma:");

        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        turma1.setFont(new java.awt.Font("Gulim", 1, 14)); // NOI18N
        turma1.setText("Turmas encontradas");

        jButton2.setText("Buscar alunos da turma selecionada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        turma3.setFont(new java.awt.Font("Gulim", 1, 14)); // NOI18N
        turma3.setText("Alunos encontrados");

        jScrollPane3.setViewportView(jList1);

        jButton3.setText("Enviar Nota");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Voltar ao Painel anterior");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(TextSistemaDeControleDisDos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TextInf2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(turma3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(notaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addComponent(jButton4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextSistemaDeControleDisDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextInf2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(turma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(turma3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        model.setRowCount(0);
        ResultSet rs = null;
        cd = new ConectarAOBanco();
        String nome = jTextField1.getText();
        nome = nome.toUpperCase();
            String query = "SELECT DISTINCT d.nome, t.turma, t.id FROM universidade.professor p, universidade.turma t, universidade.ensina e, universidade.disciplina d WHERE p.id='"+id+"' AND p.id=e.id_prof AND e.id_turma=t.id AND t.cod_disc=d.codigo ORDER BY d.nome";
            cd.ConectarBanco();
            rs = cd.query(query);
            getTable(rs);
        //String query = "SELECT DISTINCT d.nome, t.turma FROM universidade.professor p, universidade.turma t, universidade.ensina e, universidade.disciplina d WHERE p.id='"+id+"' AND p.id=e.id_prof AND e.id_turma=t.id AND t.cod_disc=d.codigo ORDER BY d.nome";


    }//GEN-LAST:event_jButton1ActionPerformed

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
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        modelolistaNome.clear();
        int linha = jTable1.getSelectedRow();
        if(linha == -1)
            JOptionPane.showMessageDialog( this, "Selecione uma turma" );
        else
        {
            codigo = jTable1.getValueAt(linha, 2).toString();
            ResultSet rs = null;
            ConectarAOBanco cd = new ConectarAOBanco();
            cd.ConectarBanco();
            String query = "SELECT e.nome FROM universidade.estudante e, universidade.frequenta f WHERE e.id=f.id_est and f.id_turma = "+codigo+" ORDER BY e.nome";
            rs = cd.query(query); 
            int resultado;
            try {
                resultado = exibirResultado(rs);
                if(resultado == 1){
                    jList1.setModel(modelolistaNome);
                }
                else{
                        JOptionPane.showMessageDialog(this, "Nao ha estudante nesta turma"); 
                }
            }catch ( SQLException sqlex ) 
            {
                sqlex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Selecione primeiro a turma"); 
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String query2;
        PegaAluno();
        System.out.println(id_aluno);
        int r;
        ResultSet rs = null;
        cd = new ConectarAOBanco();
        cd.ConectarBanco();
        String msg = notaAluno.getText().toString();
        int nota = Integer.parseInt(msg);
        if(nota > 100 || nota < 0)
        {
            JOptionPane.showMessageDialog( this, "Nota Incorreta, valor deve ser maior que 0 e menor que 100" );
        }
        else
        {
                String query = "SELECT f.nota FROM universidade.estudante e, universidade.frequenta f WHERE e.id='"+id_aluno+"' and e.id=f.id_est and f.id_turma = "+codigo+"";
                rs = cd.query(query); 
                int resultado;
                        System.out.println(id_aluno);
            try {
                resultado = exibirResultado(rs);
                if(resultado == 1){
                    query2 = "UPDATE universidade.frequenta SET nota="+nota+" WHERE id_est='"+id_aluno+"' and id_turma='"+codigo+"'";
                }
                else{
                    query2 = "INSERT INTO universidade.frequenta(id_est, id_turma, nota) VALUES ('"+id_aluno+"','"+codigo+"','"+nota+"')";
                }

            if(msg.isEmpty())
            {
                JOptionPane.showMessageDialog( this, "Digita a nota" );
            }
            else {
                    r = cd.updatequery(query2);
                    if(r == 1)
                    {
                        JOptionPane.showMessageDialog( this, "Crítica / Sugestão enviada!" );
                    }
                    else
                    {
                        JOptionPane.showMessageDialog( this, "Crítica / Sugestão não enviada!" );
                    }
                }
                            } catch (SQLException ex) {
                Logger.getLogger(NotaProf.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void PegaAluno()
    {
        if(jList1.isSelectionEmpty())
            JOptionPane.showMessageDialog(this, "Selecione alguem pra ser atualizado!"); 
        else
        {
            nome = jList1.getSelectedValue().toString();
            System.out.println(nome);
            ConectarAOBanco cd = new ConectarAOBanco();
            cd.ConectarBanco();
            ResultSet rs = null;
            try {
                
                String query = "SELECT e.id FROM universidade.estudante e, universidade.frequenta f WHERE e.nome = '"+nome+"' and e.id=f.id_est and f.id_turma='"+codigo+"'";
                rs = cd.query(query);
                this.id_aluno = getInfo(rs);
                
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        System.out.println(id_aluno);
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
    private java.awt.Label TextInf2;
    private java.awt.Label TextSistemaDeControleDisDos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField notaAluno;
    private java.awt.Label turma;
    private java.awt.Label turma1;
    private java.awt.Label turma2;
    private java.awt.Label turma3;
    // End of variables declaration//GEN-END:variables
}
