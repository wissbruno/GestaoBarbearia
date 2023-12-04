package menuInterfaces.Agendamentos;

import controller.AutenticacaoAgendamentos;
import controller.ControllerAgendamentos;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Bruno Urccella Wiss
 */
public class MenuAgendarAtt extends javax.swing.JFrame {

    private ControllerAgendamentos controllerAgendamentos;
    private AutenticacaoAgendamentos autenticacaoAgendamentos;

    public MenuAgendarAtt() {
        initComponents();
        controllerAgendamentos = new ControllerAgendamentos();
        autenticacaoAgendamentos = new AutenticacaoAgendamentos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAgendar = new javax.swing.JLabel();
        lblDataHora = new javax.swing.JLabel();
        txtDataHora = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblAgendar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAgendar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendar.setText("ATUALIZAR AGENDAMENTO");

        lblDataHora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataHora.setText("Data e Hora:");

        txtDataHora.setText("2023-12-00 / 00:00");
        txtDataHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataHoraActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCliente.setText("Nome do Cliente:");

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefone.setText("Telefone:");

        txtTelefone.setText("(11) ");
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setText("Informe o ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdCliente)
                    .addComponent(lblAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(txtDataHora)
                    .addComponent(txtNomeCliente)
                    .addComponent(txtTelefone)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataHora)
                            .addComponent(lblCliente)
                            .addComponent(lblTelefone)
                            .addComponent(lblId))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDataHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnConfirmar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataHoraActionPerformed

    }//GEN-LAST:event_txtDataHoraActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new MenuAgendamentos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String idCliente = txtIdCliente.getText();
        String nome = txtNomeCliente.getText();
        String telefone = txtTelefone.getText();
        String dataHora = txtDataHora.getText();

        try {
            if (controllerAgendamentos.verificarId(idCliente)) {
                JOptionPane.showMessageDialog(rootPane,
                        "ID de Agendamento encontrado no banco de dados!");
            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "ID de Agendamento não encontrado no banco de dados!");
            }
            if (controllerAgendamentos.verificarId(idCliente)) {
                controllerAgendamentos.atualizarDado(nome, telefone, dataHora, idCliente);
                JOptionPane.showMessageDialog(rootPane,
                        "Agendamento atualizado com sucesso!",
                        "Sucesso!", 0);

                new MenuAgendamentos().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "Este horário já está agendado. Por favor, escolha outro horário.",
                        "Erro!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Erro ao atualizar o agendamento, por favor verifique se os campos estão preenchidos.",
                    "Erro!", 0);
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed

    }//GEN-LAST:event_txtTelefoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgendar;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDataHora;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtDataHora;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
