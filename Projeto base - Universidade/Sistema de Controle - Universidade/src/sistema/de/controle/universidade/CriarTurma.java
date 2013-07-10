package sistema.de.controle.universidade;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class CriarTurma extends javax.swing.JFrame {
    javax.swing.DefaultListModel modelolistaDisc = new javax.swing.DefaultListModel();
    javax.swing.DefaultListModel modelolistaDia = new javax.swing.DefaultListModel();    
    public CriarTurma() {
        setTitle("Criar turma");
        initComponents();
        ResultSet rs = null;
        ConectarAOBanco cd = new ConectarAOBanco();
        String query = "SELECT descricao FROM universidade.semana";
        cd.ConectarBanco();
        rs = cd.query(query);
        try {
            int r = exibirDia(rs);
            if(r == 1){
                jList2.setModel(modelolistaDia);
            }
            String querymes = "SELECT EXTRACT(MONTH FROM current_timestamp)";
            rs = cd.query(querymes);
            String mes = getInfo(rs);
            double mesf = Double.parseDouble(mes); 
            int mesi =(int) mesf;
            if(mesi>=1 && mesi <=6)
                jLabel5.setText("1");
            else
                jLabel5.setText("2");
            String queryano = "SELECT EXTRACT(YEAR FROM current_timestamp)";
            rs = cd.query(queryano);
            String ano = getInfo(rs);
            double anof = Double.parseDouble(ano); 
            int anoi =(int) anof;
            ano = ""+anoi+"";
            jLabel7.setText(ano);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String queryhorario = "SELECT * FROM universidade.horario";
        rs = cd.query(queryhorario);
        getTableHorario(rs);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TextMatricularAluno = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("ID:");

        jLabel3.setText("Turma:");

        jLabel4.setText("Semestre:");

        jLabel5.setText("semestre");

        jLabel6.setText("Ano:");

        jLabel7.setText("ano");

        jLabel8.setText("* Disciplina:");

        jButton1.setText("Filtrar por nome");
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

        jScrollPane1.setViewportView(jList1);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("- Dia - ");

        jScrollPane2.setViewportView(jList2);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("- Horário - ");
        jLabel10.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(jTable1);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("- Salas disponiveis -");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jButton3.setText("Atualizar salas ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 11));
        jButton4.setText("Criar turma");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TextMatricularAluno.setAlignment(java.awt.Label.CENTER);
        TextMatricularAluno.setFont(new java.awt.Font("Corbel", 1, 18));
        TextMatricularAluno.setName(""); // NOI18N
        TextMatricularAluno.setText("Criar Turma");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("- Disciplinas encontradas - ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel12.setText("* Para filtrar todas as disciplinas clique em 'Filtrar por nome'");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextMatricularAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField3))
                        .addContainerGap(22, Short.MAX_VALUE))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextMatricularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(7, 7, 7)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, 0, 0, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap())
        );

        TextMatricularAluno.getAccessibleContext().setAccessibleName("Criar turma");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        modelolistaDisc.clear();
        ResultSet rs = null;
        ConectarAOBanco cd = new ConectarAOBanco();
        String nome = jTextField3.getText();
        nome = nome.toUpperCase();
        String query = "SELECT nome FROM universidade.disciplina WHERE UPPER(nome) like'%"+nome+"%' ORDER BY nome";
        cd.ConectarBanco();
        rs = cd.query(query);
        int resultado;
        try {
            resultado = exibirDisc(rs);
            if(resultado == 1){
                jList1.setModel(modelolistaDisc);
            }
            else{
                    JOptionPane.showMessageDialog(this, "Disciplina não foi encontrada"); 
            }
        } catch ( SQLException sqlex ) 
        {
            sqlex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
            
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
    
        public int exibirDia(ResultSet rs) throws SQLException {
        // position to first record
        boolean moreRecords = rs.next();
        // If there are no records, display a message
        if (!moreRecords) {
            return 0;
        }
        modelolistaDia.addElement(rs.getString(1));
        while (rs.next()) {
            modelolistaDia.addElement(rs.getString(1));
        }
        return 1;
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
    
    private void getTableHorario(ResultSet rs)
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
    
        private void getTableSala(ResultSet rs)
   {
       ConectarAOBanco cd = new ConectarAOBanco();
       try {
            cd.ConectarBanco();
            displayResultSet( rs,jTable2 );
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
                case Types.TIME:
                    currentRow.addElement(rs.getString(i));
                    break;
                case Types.SMALLINT:
                    currentRow.addElement( 
                    new Long( rs.getLong( i ) ) );
                    break;
                default: 
                    System.out.println( "Type was: " + rsmd.getColumnTypeName( i ) );
         }
         return currentRow;
    }
        
        
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        modelolistaDisc.clear();
        ResultSet rs = null;
        ConectarAOBanco cd = new ConectarAOBanco();
        String cod = jTextField3.getText();
        cod = cod.toUpperCase();
        String query = "SELECT nome FROM universidade.disciplina WHERE UPPER(codigo) ='"+cod+"' ORDER BY nome";
        cd.ConectarBanco();
        rs = cd.query(query);
        int resultado;
        try {
            resultado = exibirDisc(rs);
            if(resultado == 1){
                jList1.setModel(modelolistaDisc);
            }
            else{
                    JOptionPane.showMessageDialog(this, "Disciplina não foi encontrada"); 
            }
        } catch ( SQLException sqlex ) 
        {
            sqlex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int linha = jTable1.getSelectedRow();
        if(linha == -1)
            JOptionPane.showMessageDialog(this, "Selecione um horario"); 
        else 
        {
            if(jList2.isSelectionEmpty())
            {
                JOptionPane.showMessageDialog(this, "Selecione um dia da semana");
            }
            else
            {
                String iddia=null;
                String dia = jList2.getSelectedValue().toString();
                if(dia.equals("Domingo"))
                   iddia = "1";
                if(dia.equals("Segunda-Feira"))
                   iddia = "2";
                if(dia.equals("Terça-Feira"))
                   iddia = "3"; 
                if(dia.equals("Quarta-Feira"))
                   iddia = "4"; 
                if(dia.equals("Quinta-Feira"))
                   iddia = "5";
                if(dia.equals("Sexta-Feira"))
                   iddia = "6";    
                if(dia.equals("Sábado"))
                   iddia = "7"; 
                String idhora = jTable1.getValueAt(linha, 0).toString();
                String query = "SELECT sa.predio,sa.numero FROM universidade.sala sa "
                +" WHERE sa.numero  NOT IN "
                +" ( "
                +" 	SELECT sa.numero FROM universidade.turma t, universidade.sala sa, universidade.horario_aula ha "
                +" 	WHERE t.predio_s = sa.predio AND t.n_sala = sa.numero AND t.id = ha.id_turma AND ha.id_sem='"+iddia+"' AND ha.id_hora = '"+idhora+"' "
                +" ) ";
                ResultSet rs = null;
                ConectarAOBanco cd = new ConectarAOBanco();
                cd.ConectarBanco();
                rs = cd.query(query);
                getTableSala(rs);
                
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ResultSet rs = null;
        ConectarAOBanco cd = new ConectarAOBanco();
        cd.ConectarBanco();
        String id = "";
        String turma = "";
        String sem = "";
        String ano = "";
        String cod  = "";
        String idhora = "";
        String predio = "";
        String nsala  = "";      
        String dia  = "";   
        String iddia = "";   
        int linhahora = jTable1.getSelectedRow();
        int linhasala = jTable2.getSelectedRow();
        id=jTextField1.getText();
        turma=jTextField2.getText();
        sem=jLabel5.getText();
        ano=jLabel7.getText();
        cod = null;
        if(linhahora !=-1)
        {
            idhora=jTable1.getValueAt(linhahora,0).toString();
        }
        if(linhasala !=-1)
        {
            predio=jTable2.getValueAt(linhasala, 0 ).toString();
            nsala=jTable2.getValueAt(linhasala, 1 ).toString();

        }
        if(!jList2.isSelectionEmpty())
        {
            dia = jList2.getSelectedValue().toString();
            iddia=null;
            if(dia.equals("Domingo"))
               iddia = "1";
            if(dia.equals("Segunda-Feira"))
               iddia = "2";
            if(dia.equals("Terça-Feira"))
               iddia = "3"; 
            if(dia.equals("Quarta-Feira"))
               iddia = "4"; 
            if(dia.equals("Quinta-Feira"))
               iddia = "5";
            if(dia.equals("Sexta-Feira"))
               iddia = "6";    
            if(dia.equals("Sábado"))
               iddia = "7"; 
        }
        
        try
        {
            if(!jList1.isSelectionEmpty())
            {
                String discnome = jList1.getSelectedValue().toString();
                String querycod = "SELECT codigo FROM universidade.disciplina WHERE nome = '"+discnome+"'";
                rs = cd.query(querycod);
                cod = getInfo(rs);
            }
        }catch ( SQLException sqlex ) 
        {
            sqlex.printStackTrace();
        }        
        if(id.equals("")||turma.equals("")||sem.equals("")||ano.equals("")||cod.equals("")||predio.equals("")||nsala.equals("")||iddia.equals(""))  
            JOptionPane.showMessageDialog(this, "Turma nao criada, confira os dados inseridos e selecionados"); 
        else 
        {
                String queryconfid = "select id from universidade.turma where id="+id;
                rs = cd.query(queryconfid);
                String id1 = null;
                try
                {
                   id1 = getInfo(rs);
                     }catch ( SQLException sqlex ) 
                {
                    JOptionPane.showMessageDialog(this, "Turma nao criada");
                    sqlex.printStackTrace();
                }  
                if(id1 == null)
                {
                    int r = 0,r1 = 0;
                    String queryturma = "INSERT INTO universidade.turma VALUES("+id+",'"+turma+"',"+sem+","+ano+",'"+cod+"','"+predio+"',"+nsala+")";
                    r1 = cd.updatequery(queryturma);
                    String queryhorarioaula = "INSERT INTO universidade.horario_aula VALUES ('"+iddia+"','"+idhora+"',"+id+")";
                    r = cd.updatequery(queryhorarioaula);
                    if(r!=1)
                        JOptionPane.showMessageDialog(this, "Turma nao inserida na horario_aula"); 
                    if(r1!=1)
                        JOptionPane.showMessageDialog(this, "Turma nao inserida");
                    if(r==1 && r1 == 1)
                        JOptionPane.showMessageDialog(this, "Turma criada com sucesso");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Id ja existente");
                }
               
            
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TextMatricularAluno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
