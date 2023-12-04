package loginInterfaces;

import controller.AutenticacaoLogin;
import controller.ControllerJDBC;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import menuInterfaces.MenuPrincipal;

/**
 *
 * @author Bruno Urccella Wiss
 */
public class LoginBarb extends javax.swing.JFrame {
    
    private AutenticacaoLogin autenticacaoLogin;
    private ControllerJDBC controllerJDBC;

    public LoginBarb() {
        initComponents();
        autenticacaoLogin = new AutenticacaoLogin();
        controllerJDBC = new ControllerJDBC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        pwdSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login Barbearia");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(230, 230, 243));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Senha:");

        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(102, 255, 102));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Usuario:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Barbearia");

        btnLimpar.setBackground(new java.awt.Color(255, 102, 102));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        pwdSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdSenhaKeyPressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));

        lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuInterfaces/Imagens/Design sem nome.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntrar))
                    .addComponent(txtLogin)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pwdSenha)
                    .addComponent(lblBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnEntrar)
                    .addComponent(btnSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int escolha = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
        if (escolha == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (AutenticacaoLogin.getRealizarLogin(txtLogin.getText(), new String(pwdSenha.getPassword()))) {
            JOptionPane.showMessageDialog(rootPane,
                    "Login realizado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            new MenuPrincipal().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Nome de usuário ou senha incorretos.", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtLogin.setText("");
        pwdSenha.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed

    }//GEN-LAST:event_btnEntrarKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void pwdSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (AutenticacaoLogin.getRealizarLogin(txtLogin.getText(), new String(pwdSenha.getPassword()))) {
                JOptionPane.showMessageDialog(rootPane,
                        "Login realizado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                new MenuPrincipal().setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "Nome de usuário ou senha incorretos.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_pwdSenhaKeyPressed

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (AutenticacaoLogin.getRealizarLogin(txtLogin.getText(), new String(pwdSenha.getPassword()))) {
                JOptionPane.showMessageDialog(rootPane,
                        "Login realizado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                new MenuPrincipal().setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "Nome de usuário ou senha incorretos.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtLoginKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginBarb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables

    private LoginBarb(String perfil) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
