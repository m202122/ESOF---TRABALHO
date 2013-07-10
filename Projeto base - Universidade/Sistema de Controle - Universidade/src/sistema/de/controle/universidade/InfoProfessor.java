package sistema.de.controle.universidade;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class InfoProfessor extends javax.swing.JFrame {
    public InfoProfessor(String nome) {
        initComponents();
        TextRetornoNome.setText(nome);
        setVisible(true);
        getTable(nome);
        setTitle("Professores cadastrados");
        setSize(530,480);
    }
    @SuppressWarnings("unchecked")
    private void getTable(String nome)
   {
       ResultSet rs = null;
       ConectarAOBanco cd = new ConectarAOBanco();
       try {
            String queryid = "SELECT id FROM universidade.professor WHERE nome = '"+nome+"'";
            cd.ConectarBanco();
            rs = cd.query(queryid);
            String id = getInfo(rs);
            TextRetornoID.setText(id);
            String queryfac = "SELECT fac_prof FROM universidade.professor WHERE nome = '"+nome+"'";
            rs = cd.query(queryfac);
            String fac = getInfo(rs);
            TextRetornoFaculdade.setText(fac);
            String querysal = "SELECT salario FROM universidade.professor WHERE nome = '"+nome+"'";
            rs = cd.query(querysal);
            String sal = getInfo(rs);
            TextRetornoSalario.setText(sal);
            String querydisciplinas = "select d.nome,t.turma,t.semestre,t.ano from universidade.professor p, universidade.turma t, universidade.ensina e, universidade.disciplina d where p.id = e.id_prof and e.id_turma = t.id and t.cod_disc = d.codigo and p.nome = '"+ nome +"'";
            rs = cd.query(querydisciplinas);
            displayResultSet( rs,jTable1 );
        }
        catch ( SQLException sqlex ) {
            //sqlex.printStackTrace();
            JOptionPane.showMessageDialog( this, "ResultSet contained no records" );
        }
    }
    
    private void displayResultSet( ResultSet rs, JTable table) throws SQLException {
        // position to first record
        boolean moreRecords = rs.next();  
        // If there are no records, display a message
        if ( ! moreRecords ) { 
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
                default: 
                    System.out.println( "Type was: " + rsmd.getColumnTypeName( i ) );
            }
        return currentRow;
   }  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextBaseDadosProfessor = new java.awt.Label();
        TextFaculdade = new java.awt.Label();
        TextID = new java.awt.Label();
        TextRetornoID = new java.awt.Label();
        TextRetornoFaculdade = new java.awt.Label();
        jSeparator3 = new javax.swing.JSeparator();
        TextDisciplinas = new java.awt.Label();
        TextNomeProfessor = new java.awt.Label();
        TextRetornoNome = new java.awt.Label();
        BotaoVerificarOutroAluno = new javax.swing.JButton();
        TextSalario = new java.awt.Label();
        TextRetornoSalario = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        TextBaseDadosProfessor.setFont(new java.awt.Font("Corbel", 1, 18));
        TextBaseDadosProfessor.setText("Professor - Informações Acadêmicas");

        TextFaculdade.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextFaculdade.setText("- FACULDADE: ");

        TextID.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextID.setText("- IDENTIFICADOR: ");

        TextRetornoID.setText("label1");

        TextRetornoFaculdade.setText("label1");

        TextDisciplinas.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextDisciplinas.setName(""); // NOI18N
        TextDisciplinas.setText("- TURMAS E DISCIPLINAS -");

        TextNomeProfessor.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextNomeProfessor.setName(""); // NOI18N
        TextNomeProfessor.setText("- NOME: ");

        TextRetornoNome.setText("label1");

        BotaoVerificarOutroAluno.setText("OK! Verificar outro professor...");
        BotaoVerificarOutroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerificarOutroAlunoActionPerformed(evt);
            }
        });

        TextSalario.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextSalario.setText("- SALÁRIO: ");

        TextRetornoSalario.setText("label1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TextRetornoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TextFaculdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TextRetornoFaculdade, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(TextDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BotaoVerificarOutroAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(TextRetornoID, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(TextBaseDadosProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(TextNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(TextRetornoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextRetornoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextRetornoFaculdade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFaculdade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextRetornoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(TextDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoVerificarOutroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TextBaseDadosProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TextNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextRetornoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(457, 457, 457)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVerificarOutroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerificarOutroAlunoActionPerformed
        setVisible(false);     }//GEN-LAST:event_BotaoVerificarOutroAlunoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoVerificarOutroAluno;
    private java.awt.Label TextBaseDadosProfessor;
    private java.awt.Label TextDisciplinas;
    private java.awt.Label TextFaculdade;
    private java.awt.Label TextID;
    private java.awt.Label TextNomeProfessor;
    private java.awt.Label TextRetornoFaculdade;
    private java.awt.Label TextRetornoID;
    private java.awt.Label TextRetornoNome;
    private java.awt.Label TextRetornoSalario;
    private java.awt.Label TextSalario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
