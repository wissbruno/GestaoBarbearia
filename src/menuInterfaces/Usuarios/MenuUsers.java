package menuInterfaces.Usuarios;

import controller.ControllerJDBC;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import menuInterfaces.MenuPrincipal;

/**
 *
 * @author Bruno Urccella Wiss
 */
public class MenuUsers extends javax.swing.JFrame {

    public MenuUsers() {
        initComponents();
        TabelaUsers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        lblAgendamentos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        tabela.setEnabled(false);
        jScrollPane1.setViewportView(tabela);

        jPanel2.setLayout(new java.awt.GridLayout(1, 3, 100, 0));

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(btnVoltar);

        btnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeletar);

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtualizar);

        btnInserir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        jPanel2.add(btnInserir);

        lblAgendamentos.setBackground(new java.awt.Color(255, 255, 255));
        lblAgendamentos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAgendamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendamentos.setText("CONTROLE DE USUÁRIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                    .addComponent(lblAgendamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgendamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        new MenuUserIns().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        new MenuUserDel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        new MenuUserAtt().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void TabelaUsers() {
        try (Connection conexao = ControllerJDBC.getConexao()) {

            String query = "SELECT * FROM usuario";
            Statement stmt = conexao.createStatement();
            ResultSet busca = stmt.executeQuery(query);

            DefaultTableModel modeloTabela = new DefaultTableModel();

            for (int a = 1; a <= busca.getMetaData().getColumnCount(); a++) {
                modeloTabela.addColumn(busca.getMetaData().getColumnName(a));
            }

            while (busca.next()) {
                Object[] linha = new Object[busca.getMetaData().getColumnCount()];
                for (int a = 1; a <= busca.getMetaData().getColumnCount(); a++) {
                    linha[a - 1] = busca.getObject(a);
                }
                modeloTabela.addRow(linha);
            }

            tabela.setModel(modeloTabela);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgendamentos;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
