package sistema.de.controle.universidade;
import java.sql.*;
import javax.swing.JOptionPane;
public class BuscarAluno extends javax.swing.JFrame {
    public BuscarAluno() {
        initComponents();
        setVisible(true);
        setTitle("Alunos cadastrados");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextFiltrarAluno = new javax.swing.JLabel();
        CaixaNomeAluno = new javax.swing.JTextField();
        BotaoBuscarInfAlunos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        TextAlunosEncontrados = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeAlunosEncontrados = new javax.swing.JList();
        jSeparator2 = new javax.swing.JSeparator();
        TextBaseDadosProfessor = new java.awt.Label();
        TextInf1 = new java.awt.Label();
        BotaoFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        TextFiltrarAluno.setText("Filtrar nome de Aluno*");

        BotaoBuscarInfAlunos.setText("Buscar informações do aluno selecionado...");
        BotaoBuscarInfAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarInfAlunosActionPerformed(evt);
            }
        });

        TextAlunosEncontrados.setFont(new java.awt.Font("Gulim", 1, 14));
        TextAlunosEncontrados.setText("Alunos encontrados");

        jScrollPane1.setViewportView(ListaDeAlunosEncontrados);

        TextBaseDadosProfessor.setFont(new java.awt.Font("Corbel", 1, 18));
        TextBaseDadosProfessor.setText("Olá, Professor(ra)");

        TextInf1.setFont(new java.awt.Font("Dialog", 2, 12));
        TextInf1.setText("* Para selecionar todos os alunos apenas clique em 'Filtrar'");

        BotaoFiltrar.setText("Filtrar");
        BotaoFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextFiltrarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CaixaNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextBaseDadosProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextInf1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextAlunosEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoBuscarInfAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
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
                    .addComponent(CaixaNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFiltrarAluno)
                    .addComponent(BotaoFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextInf1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextAlunosEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoBuscarInfAlunos)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    javax.swing.DefaultListModel modelolistaNome = new javax.swing.DefaultListModel();
    private void BotaoBuscarInfAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarInfAlunosActionPerformed
        try{
            String nome = ListaDeAlunosEncontrados.getSelectedValue().toString();
            new InfoAluno(nome);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Nenhum aluno foi selecionado!");
        }
    }//GEN-LAST:event_BotaoBuscarInfAlunosActionPerformed

    private void BotaoFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFiltrarActionPerformed
        // TODO add your handling code here:
        modelolistaNome.clear();
        ResultSet rs = null;
        ConectarAOBanco cd = new ConectarAOBanco();
        String nome = CaixaNomeAluno.getText();
        nome = nome.toUpperCase();
        String query = "SELECT nome FROM universidade.estudante WHERE UPPER(nome) like'%"+nome+"%' ORDER BY nome";
        cd.ConectarBanco();
        rs = cd.query(query);
        int resultado;
        try {
            resultado = exibirResultado(rs);
            if(resultado == 1){
                ListaDeAlunosEncontrados.setModel(modelolistaNome);
            }
            else{
                    JOptionPane.showMessageDialog(this, "Aluno não foi encontrado"); 
            }
        } catch ( SQLException sqlex ) 
        {
            sqlex.printStackTrace();
        }      
    }//GEN-LAST:event_BotaoFiltrarActionPerformed
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
    private javax.swing.JButton BotaoBuscarInfAlunos;
    private javax.swing.JButton BotaoFiltrar;
    private javax.swing.JTextField CaixaNomeAluno;
    private javax.swing.JList ListaDeAlunosEncontrados;
    private java.awt.Label TextAlunosEncontrados;
    private java.awt.Label TextBaseDadosProfessor;
    private javax.swing.JLabel TextFiltrarAluno;
    private java.awt.Label TextInf1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
