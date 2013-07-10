package sistema.de.controle.universidade;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
public class ControleUniversidade extends javax.swing.JFrame {
    public ControleUniversidade() {
        initComponents();
        setTitle("UNIVERSIDADE - SISTEMA DE CONTROLE");
        setSize(365,210);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextSistemaDeControleUniversidade = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        CampoUsuario = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JPasswordField();
        BotaoEntrar = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        Sobre = new javax.swing.JMenu();
        MenuSobre = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        TextSistemaDeControleUniversidade.setFont(new java.awt.Font("Georgia", 1, 16));
        TextSistemaDeControleUniversidade.setText("UNIVERSIDADE - SISTEMA DE CONTROLE");

        CampoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoUsuarioKeyPressed(evt);
            }
        });

        CampoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoSenhaKeyReleased(evt);
            }
        });

        BotaoEntrar.setText("ENTRAR");
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12));
        label1.setText("USUARIO");

        label2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12));
        label2.setText("SENHA");

        Sobre.setText("Opções");

        MenuSobre.setText("Sobre...");
        MenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreActionPerformed(evt);
            }
        });
        Sobre.add(MenuSobre);
        Sobre.add(jSeparator2);

        MenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        Sobre.add(MenuSair);

        jMenuBar1.add(Sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextSistemaDeControleUniversidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(CampoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                    .addComponent(BotaoEntrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextSistemaDeControleUniversidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoEntrar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String UserPass( ResultSet rs ) throws SQLException {
        String userpass1;
        boolean moreRecords = rs.next();  
        if ( ! moreRecords ) {
             JOptionPane.showMessageDialog(null, "Usuario inválido");
             return null;
        }
        Vector columnHeads = new Vector();
        Vector rows = new Vector();
        try {
            // get column heads
            ResultSetMetaData rsmd = rs.getMetaData();
            for ( int i = 1; i <= rsmd.getColumnCount(); ++i )
                 columnHeads.addElement( rsmd.getColumnName(i) );
            // get row data
            do {
                rows.addElement( getNextRow( rs, rsmd ) ); 
            } while ( rs.next() );
            userpass1 = rows.get(0).toString(); 
            return userpass1;
        }
        catch ( SQLException sqlex ) {
            sqlex.printStackTrace();
            return null;
        }
    }
   
    private Vector getNextRow( ResultSet rs,  ResultSetMetaData rsmd ) throws SQLException {
            Vector currentRow = new Vector();
            for ( int i = 1; i <= rsmd.getColumnCount(); ++i )
                switch( rsmd.getColumnType( i ) ) {
                    case Types.VARCHAR:
                        currentRow.addElement( rs.getString( i ) );
                        break;
                    case Types.CHAR:
                        currentRow.addElement( rs.getString( i ) );
                        break;
                    case Types.INTEGER:
                        currentRow.addElement(  new Long( rs.getLong( i ) ) );
                        break;
                    case Types.BOOLEAN:
                        currentRow.addElement( rs.getBoolean( i ));
                        break;
                    case Types.REAL:
                        currentRow.addElement( new Float ( rs.getFloat ( i ) ) );
                        break;
                    default: 
                        System.out.println( "Type was: " + rsmd.getColumnTypeName( i ) );
                }
            return currentRow;
    }    
    
    private void MenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSobreActionPerformed
        JOptionPane.showMessageDialog(null,"=> Ciência da Computação\n      _Desenvolvedores_\n* Gustavo Alves Falleiros\n* Marco Aurélio Bosque\n* Rodrigo Moraes Pinto","UNIVERSIDADE FEDERAL DE UBERLÂNDIA",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_MenuSobreActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        int showConfirmDialog1 = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?","Sair?", JOptionPane.YES_OPTION,JOptionPane.NO_OPTION, null);
        if(showConfirmDialog1==JOptionPane.YES_OPTION){
                System.exit(0);
        }
    }//GEN-LAST:event_MenuSairActionPerformed

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed
        String usuario = CampoUsuario.getText();
        String senha = CampoSenha.getText();
        ResultSet rs = null;
        ConectarAOBanco cd = null;
        if (CampoSenha.getPassword() == null || usuario.equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Digite Usuario e Senha", "Erro", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        String queryUsuario = "SELECT usuario FROM universidade.login WHERE usuario = '" + usuario +"'";
        cd = new ConectarAOBanco();
        try {
            cd.ConectarBanco();
            rs = cd.query(queryUsuario);
            String loginUser = UserPass(rs);
            if(loginUser!=null){
                    if((loginUser.equals("["+usuario+"]"))){
                        String querySenha = "SELECT senha FROM universidade.login WHERE login.usuario ='"+usuario+"'";
                        rs = cd.query(querySenha);
                        String senhaUser = UserPass(rs);
                        if(senhaUser.equals("["+senha+"]")){
                                setVisible(false);
                                String ocupacaoUser = "SELECT ocupacao FROM universidade.login WHERE login.usuario ='"+usuario+"'"; 
                                rs =cd.query(ocupacaoUser);
                                String frameOcupacao = UserPass(rs);
                                if(frameOcupacao.equals("[professor]")){
                                    //professor
                                    new BuscarAluno();
                                }
                                if(frameOcupacao.equals("[secretario]")){
                                    //secretario
                                     new Secretario();
                                }
                        }else{
                                JOptionPane.showMessageDialog(null, "Senha inválida");
                        }
                     }
    
                    }   
        } catch (Exception x) {
            javax.swing.JOptionPane.showMessageDialog(null, "Não foi possível conectar no Banco de dados", "Erro", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    private void CampoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoUsuarioKeyPressed
        // TODO add your handling code here:
        int tecla = evt.getKeyCode();
        if(tecla == 10  && CampoUsuario.hasFocus())
            BotaoEntrar.doClick();
    }//GEN-LAST:event_CampoUsuarioKeyPressed

    private void CampoSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoSenhaKeyReleased
        // TODO add your handling code here:
        int tecla = evt.getKeyCode();
        if(tecla == 10  && CampoSenha.hasFocus())
            BotaoEntrar.doClick();
    }//GEN-LAST:event_CampoSenhaKeyReleased
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControleUniversidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleUniversidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleUniversidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleUniversidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleUniversidade().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenuItem MenuSobre;
    private javax.swing.JMenu Sobre;
    private java.awt.Label TextSistemaDeControleUniversidade;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
