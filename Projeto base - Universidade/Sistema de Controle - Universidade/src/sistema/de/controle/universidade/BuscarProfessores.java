package sistema.de.controle.universidade;
import java.sql.*;
import javax.swing.JOptionPane;
public class BuscarProfessores extends javax.swing.JFrame {
    public BuscarProfessores() {
        initComponents();
        setVisible(true);
        setTitle("Professores cadastrados");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        TextInf1 = new java.awt.Label();
        TextFiltrarProfessor = new javax.swing.JLabel();
        CaixaNomeProfessor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TextProfessoresEncontrados = new java.awt.Label();
        TextBaseDadosProfessor = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeProfessoresEncontrados = new javax.swing.JList();
        BotaoFiltrar = new javax.swing.JButton();
        BotaoBuscarInfProfessores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        TextInf1.setFont(new java.awt.Font("Dialog", 2, 12));
        TextInf1.setText("* Para selecionar todos os professores apenas clique em 'Filtrar'");

        TextFiltrarProfessor.setText("Filtrar nome do Professor*");

        TextProfessoresEncontrados.setFont(new java.awt.Font("Gulim", 1, 14));
        TextProfessoresEncontrados.setText("Professores encontrados");

        TextBaseDadosProfessor.setFont(new java.awt.Font("Corbel", 1, 18));
        TextBaseDadosProfessor.setName(""); // NOI18N
        TextBaseDadosProfessor.setText("Olá, Secretária(o)");

        jScrollPane1.setViewportView(ListaDeProfessoresEncontrados);

        BotaoFiltrar.setText("Filtrar");
        BotaoFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFiltrarActionPerformed(evt);
            }
        });

        BotaoBuscarInfProfessores.setText("Buscar informações do professor selecionado...");
        BotaoBuscarInfProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarInfProfessoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextFiltrarProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CaixaNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(BotaoFiltrar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextBaseDadosProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextInf1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextProfessoresEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoBuscarInfProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextBaseDadosProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFiltrarProfessor)
                    .addComponent(BotaoFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextInf1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextProfessoresEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoBuscarInfProfessores)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    javax.swing.DefaultListModel modelolistaNome = new javax.swing.DefaultListModel();
    private void BotaoFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFiltrarActionPerformed
        modelolistaNome.clear();
        ResultSet rs = null;
        ConectarAOBanco cd = new ConectarAOBanco();
        String nome = CaixaNomeProfessor.getText();
        nome = nome.toUpperCase();
        String query = "SELECT nome FROM universidade.professor WHERE UPPER(nome) like'%"+nome+"%' ORDER BY nome";
        cd.ConectarBanco();
        rs = cd.query(query);
        int resultado;
        try {
            resultado = exibirResultado(rs);
            if(resultado == 1){
                ListaDeProfessoresEncontrados.setModel(modelolistaNome);
            }
            else{
                    JOptionPane.showMessageDialog(this, "Professor não foi encontrado"); 
            }
        } catch ( SQLException sqlex ) 
        {
            sqlex.printStackTrace();
        }
    }//GEN-LAST:event_BotaoFiltrarActionPerformed

    private void BotaoBuscarInfProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarInfProfessoresActionPerformed
         try{
             String nome = ListaDeProfessoresEncontrados.getSelectedValue().toString();
            new InfoProfessor(nome);
         }
         catch( Exception e){
             JOptionPane.showMessageDialog(this, "Nenhum professor foi selecionado!");
         }
    }//GEN-LAST:event_BotaoBuscarInfProfessoresActionPerformed
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBuscarInfProfessores;
    private javax.swing.JButton BotaoFiltrar;
    private javax.swing.JTextField CaixaNomeProfessor;
    private javax.swing.JList ListaDeProfessoresEncontrados;
    private java.awt.Label TextBaseDadosProfessor;
    private javax.swing.JLabel TextFiltrarProfessor;
    private java.awt.Label TextInf1;
    private java.awt.Label TextProfessoresEncontrados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
