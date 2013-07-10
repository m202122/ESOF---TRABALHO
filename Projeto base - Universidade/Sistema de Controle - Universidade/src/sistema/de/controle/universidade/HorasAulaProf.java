package sistema.de.controle.universidade;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class HorasAulaProf extends javax.swing.JFrame {
    public HorasAulaProf() {
        setTitle("Professor / Horas aula ministradas");
        initComponents();
        getTable();
        setVisible(true);
    }
    private void getTable()
   {
       ResultSet rs = null;
       ConectarAOBanco cd = new ConectarAOBanco();
       try {
            cd.ConectarBanco();
            String querymes = "SELECT EXTRACT(MONTH FROM current_timestamp)";
            rs = cd.query(querymes);
            String mes = getInfo(rs);
            double mesf = Double.parseDouble(mes); 
            int mesi =(int) mesf;
            String queryano = "SELECT EXTRACT(YEAR FROM current_timestamp)";
            rs = cd.query(queryano);
            String ano = getInfo(rs);
            double anof = Double.parseDouble(ano); 
            int anoi =(int) anof;
            ano = ""+anoi+"";
            if(mesi >=1 && mesi <=6)
            {
                jLabel5.setText("1");
                jLabel3.setText(ano);
                String query = "SELECT p.nome, COUNT(p.nome) AS HorasAulas FROM universidade.professor p, universidade.ensina e, universidade.turma t,universidade.horario_aula ha,universidade.semana s,universidade.horario h WHERE t.ano = EXTRACT(YEAR FROM current_timestamp) AND t.semestre = 1 AND p.id=e.id_prof AND e.id_turma = t.id AND t.id = ha.id_turma AND ha.id_sem = s.id_sem AND ha.id_hora = h.id_hora GROUP BY p.nome ORDER BY HorasAulas DESC";
                rs = cd.query(query);
            }
            else
            {
                jLabel5.setText("2");
                jLabel3.setText(ano);
                String query = "SELECT p.nome, COUNT(p.nome) AS HorasAulas FROM universidade.professor p, universidade.ensina e, universidade.turma t,universidade.horario_aula ha,universidade.semana s,universidade.horario h WHERE t.ano = EXTRACT(YEAR FROM current_timestamp) AND t.semestre = 2 AND p.id=e.id_prof AND e.id_turma = t.id AND t.id = ha.id_turma AND ha.id_sem = s.id_sem AND ha.id_hora = h.id_hora GROUP BY p.nome ORDER BY HorasAulas DESC";
                rs = cd.query(query);
            }
            displayResultSet( rs,jTable1 );
       }
        catch ( SQLException sqlex ) {
            sqlex.printStackTrace();
            JOptionPane.showMessageDialog( this, "ResultSet contained no records" );
        }
    }
    
    private void displayResultSet( ResultSet rs, JTable table) throws SQLException {
        // position to first record
        boolean moreRecords = rs.next();  
        // If there are no records, display a message
        if ( ! moreRecords ) { 
            JOptionPane.showMessageDialog( this, "ResultSet contained no records" );
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
    
    private Vector getNextRow( ResultSet rs, ResultSetMetaData rsmd ) throws SQLException { 
        Vector currentRow = new Vector();
        for ( int i = 1; i <= rsmd.getColumnCount(); ++i )
             switch( rsmd.getColumnType( i ) ) {
                case Types.VARCHAR:
                    currentRow.addElement( rs.getString( i ) );
                    break;
                case Types.INTEGER:
                    currentRow.addElement( new Long( rs.getLong( i ) ) );
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
                    currentRow.addElement( new Long( rs.getLong( i ) ) );
                    break;
                case Types.DOUBLE:
                    currentRow.addElement(rs.getFloat(i));
                    break;
                case Types.SMALLINT:
                    currentRow.addElement( new Long( rs.getLong( i ) ) );
                    break;    
                case Types.BIGINT:
                    currentRow.addElement( new Long( rs.getLong( i ) ) );
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
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextMatricularAluno = new java.awt.Label();
        TextMatricularAluno1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setText("RETORNAR AO CONTROLE DA SECRETARIA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ano:");

        jLabel3.setText("ano");

        jLabel4.setText("Semestre:");

        jLabel5.setText("sem");

        TextMatricularAluno.setAlignment(java.awt.Label.CENTER);
        TextMatricularAluno.setFont(new java.awt.Font("Corbel", 1, 18));
        TextMatricularAluno.setName(""); // NOI18N
        TextMatricularAluno.setText("Remover aluno");

        TextMatricularAluno1.setAlignment(java.awt.Label.CENTER);
        TextMatricularAluno1.setFont(new java.awt.Font("Corbel", 1, 18));
        TextMatricularAluno1.setName(""); // NOI18N
        TextMatricularAluno1.setText("Professor / Horas aula ministradas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextMatricularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(381, 381, 381))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TextMatricularAluno1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TextMatricularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(TextMatricularAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(364, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TextMatricularAluno;
    private java.awt.Label TextMatricularAluno1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
