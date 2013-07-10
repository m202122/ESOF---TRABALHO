package sistema.de.controle.universidade;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
public class InfoAluno extends javax.swing.JFrame {
    javax.swing.DefaultListModel modelolistaDisc = new javax.swing.DefaultListModel();
    public InfoAluno(String nome) {
        initComponents();
        TextRetornoNome.setText(nome);
        setVisible(true);
        getTable(nome);
        setTitle("Aluno - Dados cadastrados");
        setSize(480,550);
    }
    private void getTable(String nome)
   {
       ResultSet rs = null;
       ConectarAOBanco cd = new ConectarAOBanco();
       try {
            String queryid = "SELECT id FROM universidade.estudante WHERE nome = '"+nome+"'";
            cd.ConectarBanco();
            rs = cd.query(queryid);
            String id = getInfo(rs);
            TextRetornoID.setText(id);
            String querydata = "SELECT datanasc FROM universidade.estudante WHERE nome = '"+nome+"'";
            rs = cd.query(querydata);       
            String data = getInfo(rs);
            TextRetornoNascimento.setText(data);
            String queryfac = "SELECT fac_est FROM universidade.estudante WHERE nome = '"+nome+"'";
            rs = cd.query(queryfac);
            String fac = getInfo(rs);
            TextRetornoFaculdade.setText(fac);
            String querycra = "SELECT cra FROM universidade.estudante WHERE nome = '"+nome+"'";
            rs = cd.query(querycra);
            String cra = getInfo(rs);
            TextRetornoCRA.setText(cra);
            String querytutor = "SELECT p.nome FROM universidade.estudante e,universidade.professor p WHERE p.id = e.tutor AND e.nome = '"+nome+"'";
            rs = cd.query(querytutor);
            String tutor = getInfo(rs);
            if(tutor!=null){
                TextRetornoTutor.setText(tutor);
            }
            String querydisciplinas = "select distinct d.nome from universidade.estudante e, universidade.disciplina d, universidade.turma t, universidade.frequenta f where e.id = f.id_est and f.id_turma = t.id and t.cod_disc = d.codigo and e.nome = '"+nome+"'";
            rs = cd.query(querydisciplinas);
            int disc = exibirDisc(rs);
            if(disc == 1)
                ListaDisciplinasCursadas.setModel(modelolistaDisc);
        }
      catch ( SQLException sqlex ) {
         //sqlex.printStackTrace();
         JOptionPane.showMessageDialog( this, "ResultSet contained no records" );
      }
   }
    
    public int exibirDisc(ResultSet rs) throws SQLException {
        // position to first record
        boolean moreRecords = rs.next();
        // If there are no records, display a message
        if (!moreRecords) {
            return 0;
        }
        modelolistaDisc.addElement(rs.getString(1));
        while (rs.next()) {
            modelolistaDisc.addElement(rs.getString(1));
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
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextBaseDadosProfessor = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        TextID = new java.awt.Label();
        TextNascimento = new java.awt.Label();
        TextFaculdade = new java.awt.Label();
        TextFaculdade1 = new java.awt.Label();
        canvas1 = new java.awt.Canvas();
        jSeparator2 = new javax.swing.JSeparator();
        TextRetornoID = new java.awt.Label();
        TextRetornoNascimento = new java.awt.Label();
        TextRetornoFaculdade = new java.awt.Label();
        jSeparator3 = new javax.swing.JSeparator();
        TextCRA = new java.awt.Label();
        TextRetornoCRA = new java.awt.Label();
        TextTutor = new java.awt.Label();
        TextRetornoTutor = new java.awt.Label();
        TextDisciplinas = new java.awt.Label();
        TextNomeAluno = new java.awt.Label();
        TextRetornoNome = new java.awt.Label();
        BotaoVerificarOutroAluno = new javax.swing.JButton();
        jList1 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDisciplinasCursadas = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        TextBaseDadosProfessor.setFont(new java.awt.Font("Corbel", 1, 18));
        TextBaseDadosProfessor.setText("Aluno - Informações Acadêmicas");
        getContentPane().add(TextBaseDadosProfessor);
        TextBaseDadosProfessor.setBounds(10, 0, 320, 27);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(531, 201, 66, 0);

        TextID.setFont(new java.awt.Font("Georgia", 0, 12));
        TextID.setText("- IDENTIFICAÇÃO:");
        getContentPane().add(TextID);
        TextID.setBounds(398, 557, 112, 0);

        TextNascimento.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextNascimento.setText("- DATA DE NASCIMENTO:");
        getContentPane().add(TextNascimento);
        TextNascimento.setBounds(10, 102, 151, 21);

        TextFaculdade.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextFaculdade.setText("- FACULDADE: ");
        getContentPane().add(TextFaculdade);
        TextFaculdade.setBounds(10, 133, 95, 22);

        TextFaculdade1.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextFaculdade1.setText("- MATRICULA: ");
        getContentPane().add(TextFaculdade1);
        TextFaculdade1.setBounds(10, 71, 95, 21);
        getContentPane().add(canvas1);
        canvas1.setBounds(398, 396, 0, 0);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(73, 1012, 0, 2);

        TextRetornoID.setText("label1");
        getContentPane().add(TextRetornoID);
        TextRetornoID.setBounds(110, 70, 194, 20);

        TextRetornoNascimento.setText("label1");
        getContentPane().add(TextRetornoNascimento);
        TextRetornoNascimento.setBounds(171, 103, 66, 20);

        TextRetornoFaculdade.setText("label1");
        getContentPane().add(TextRetornoFaculdade);
        TextRetornoFaculdade.setBounds(115, 133, 194, 22);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 28, 597, 2);

        TextCRA.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextCRA.setText("- CRA: ");
        getContentPane().add(TextCRA);
        TextCRA.setBounds(10, 165, 56, 21);

        TextRetornoCRA.setText("label1");
        getContentPane().add(TextRetornoCRA);
        TextRetornoCRA.setBounds(76, 165, 197, 21);

        TextTutor.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextTutor.setText("- TUTOR:");
        getContentPane().add(TextTutor);
        TextTutor.setBounds(10, 197, 60, 21);

        TextRetornoTutor.setText("NÃO POSSUI TUTOR");
        getContentPane().add(TextRetornoTutor);
        TextRetornoTutor.setBounds(80, 196, 200, 22);

        TextDisciplinas.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextDisciplinas.setName(""); // NOI18N
        TextDisciplinas.setText("- DISCIPLINAS CURSADAS -");
        getContentPane().add(TextDisciplinas);
        TextDisciplinas.setBounds(140, 230, 167, 21);

        TextNomeAluno.setFont(new java.awt.Font("Monospaced", 0, 12));
        TextNomeAluno.setName(""); // NOI18N
        TextNomeAluno.setText("- NOME: ");
        getContentPane().add(TextNomeAluno);
        TextNomeAluno.setBounds(10, 40, 60, 21);

        TextRetornoNome.setText("label1");
        getContentPane().add(TextRetornoNome);
        TextRetornoNome.setBounds(80, 40, 194, 20);

        BotaoVerificarOutroAluno.setText("OK! Verificar outro aluno...");
        BotaoVerificarOutroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerificarOutroAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVerificarOutroAluno);
        BotaoVerificarOutroAluno.setBounds(10, 490, 450, 30);

        getContentPane().add(jList1);
        jList1.setBounds(0, 0, 0, 0);

        jScrollPane1.setViewportView(ListaDisciplinasCursadas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 260, 450, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVerificarOutroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerificarOutroAlunoActionPerformed
        setVisible(false);
    }//GEN-LAST:event_BotaoVerificarOutroAlunoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoVerificarOutroAluno;
    private javax.swing.JList ListaDisciplinasCursadas;
    private java.awt.Label TextBaseDadosProfessor;
    private java.awt.Label TextCRA;
    private java.awt.Label TextDisciplinas;
    private java.awt.Label TextFaculdade;
    private java.awt.Label TextFaculdade1;
    private java.awt.Label TextID;
    private java.awt.Label TextNascimento;
    private java.awt.Label TextNomeAluno;
    private java.awt.Label TextRetornoCRA;
    private java.awt.Label TextRetornoFaculdade;
    private java.awt.Label TextRetornoID;
    private java.awt.Label TextRetornoNascimento;
    private java.awt.Label TextRetornoNome;
    private java.awt.Label TextRetornoTutor;
    private java.awt.Label TextTutor;
    private java.awt.Canvas canvas1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
