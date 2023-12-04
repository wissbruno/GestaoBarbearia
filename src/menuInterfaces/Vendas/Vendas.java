package menuInterfaces.Vendas;

import controller.ControllerVendas;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import menuInterfaces.MenuPrincipal;

/**
 *
 * @author Bruno Urccella Wiss
 */
public class Vendas extends javax.swing.JFrame {

    private ControllerVendas controllerVendas;
    
    public Vendas() {
        initComponents();
        btnPagar.setVisible(false);
        controllerVendas = new ControllerVendas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblServicos = new javax.swing.JLabel();
        ckbCorte = new javax.swing.JCheckBox();
        ckbBarba = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ckbGel = new javax.swing.JCheckBox();
        ckbPomada = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ckbAgua = new javax.swing.JCheckBox();
        ckbRefri = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTOTAL = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblServicos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblServicos.setText("Serviços:");

        ckbCorte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ckbCorte.setText("Corte de Cabelo");

        ckbBarba.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ckbBarba.setText("Barba");

        jLabel2.setText("(R$  30,00)");

        jLabel3.setText("(R$ 25,00)");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Produtos:");

        ckbGel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ckbGel.setText("Gel para Cabelo");

        ckbPomada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ckbPomada.setText("Pomada Capilar");

        jLabel5.setText("(R$ 15,00)");

        jLabel6.setText("(R$30,00)");

        ckbAgua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ckbAgua.setText("Água 500 ml ");

        ckbRefri.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ckbRefri.setText("Refri 300 ml");

        jLabel7.setText("(R$5,00)");

        jLabel8.setText("(R$6,00)");

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblServicos)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbCorte)
                                    .addComponent(ckbBarba))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbGel)
                                    .addComponent(ckbPomada)
                                    .addComponent(ckbAgua)
                                    .addComponent(ckbRefri))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblServicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbCorte)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbBarba)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbGel)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbPomada)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbAgua)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbRefri)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnLimpar)
                    .addComponent(btnTotal))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTOTAL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTOTAL.setText("Total:");

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));

        btnPagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTOTAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPagar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTOTAL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPagar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        btnPagar.setVisible(true);
        BigDecimal totalServ = BigDecimal.ZERO;
        BigDecimal totalProd = BigDecimal.ZERO;
        String servFinal = "";
        String prodFinal = "";

        if (ckbCorte.isSelected()) {
            totalServ = totalServ.add(controllerVendas.getPrecoServicos("Corte de Cabelo"));
            servFinal += "Corte de Cabelo: ";
        }

        if (ckbBarba.isSelected()) {
            totalServ = totalServ.add(controllerVendas.getPrecoServicos("Barba"));
            servFinal += "Barba: ";
        }

        if (ckbGel.isSelected()) {
            totalProd = totalProd.add(controllerVendas.getPrecoProduto("Gel para Cabelo"));
            prodFinal += "Gel para Cabelo: ";
        }

        if (ckbPomada.isSelected()) {
            totalProd = totalProd.add(controllerVendas.getPrecoProduto("Pomada Capilar"));
            prodFinal += "Pomada Capilar: ";
        }

        if (ckbAgua.isSelected()) {
            totalProd = totalProd.add(controllerVendas.getPrecoProduto("Agua"));
            prodFinal += "Água 500ml: ";
        }

        if (ckbRefri.isSelected()) {
            totalProd = totalProd.add(controllerVendas.getPrecoProduto("Refri"));
            prodFinal += "Refri 300ml: ";
        }

        BigDecimal totalGeral = totalServ.add(totalProd);

        String total = ("<html>Total Geral: " + "R$"
                + totalGeral + "<br>" + servFinal + totalServ + "<br>" + prodFinal + totalProd + "</html>");

        lblTotal.setText(total);

    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        ckbAgua.setSelected(false);
        ckbBarba.setSelected(false);
        ckbCorte.setSelected(false);
        ckbGel.setSelected(false);
        ckbPomada.setSelected(false);
        ckbRefri.setSelected(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if (ckbCorte.isSelected() || ckbBarba.isSelected() || ckbGel.isSelected()
                || ckbPomada.isSelected() || ckbAgua.isSelected() || ckbRefri.isSelected()) {

            new FormasPagamentos().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione pelo menos um serviço "
                    + "ou produto antes de prosseguir com o pagamento.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox ckbAgua;
    private javax.swing.JCheckBox ckbBarba;
    private javax.swing.JCheckBox ckbCorte;
    private javax.swing.JCheckBox ckbGel;
    private javax.swing.JCheckBox ckbPomada;
    private javax.swing.JCheckBox ckbRefri;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblServicos;
    private javax.swing.JLabel lblTOTAL;
    public javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
