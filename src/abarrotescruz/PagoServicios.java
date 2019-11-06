package abarrotescruz;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class PagoServicios extends javax.swing.JFrame {
    
    public SQLConnection bd;

    public PagoServicios() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrarDetalles = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Label24 = new javax.swing.JTextField();
        Label25 = new javax.swing.JTextField();
        jComboBoxServicio = new javax.swing.JComboBox<>();
        jtextFieldImporte = new javax.swing.JTextField();
        botonPagar = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        Cerrar17 = new javax.swing.JButton();
        Maximizar17 = new javax.swing.JButton();
        minimizar17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mostrarDetalles.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("    Mostrar detalles");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        Label24.setEditable(false);
        Label24.setBackground(new java.awt.Color(167, 226, 226));
        Label24.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label24.setText("  Servicio:");
        Label24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label24ActionPerformed(evt);
            }
        });

        Label25.setEditable(false);
        Label25.setBackground(new java.awt.Color(204, 255, 204));
        Label25.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label25.setText("  Importe:");
        Label25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label25ActionPerformed(evt);
            }
        });

        jComboBoxServicio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jComboBoxServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione servicio", "Internet", "Electricidad" }));

        jtextFieldImporte.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        jtextFieldImporte.setForeground(new java.awt.Color(51, 51, 51));
        jtextFieldImporte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jtextFieldImporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtextFieldImporteMouseClicked(evt);
            }
        });

        botonPagar.setBackground(new java.awt.Color(255, 255, 255));
        botonPagar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        botonPagar.setForeground(new java.awt.Color(51, 51, 51));
        botonPagar.setText("Pagar");
        botonPagar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        botonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagarActionPerformed(evt);
            }
        });

        botonVolver.setBackground(new java.awt.Color(255, 255, 255));
        botonVolver.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(51, 51, 51));
        botonVolver.setText("Volver");
        botonVolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Lista2.png"))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setForeground(new java.awt.Color(153, 153, 153));

        Cerrar17.setBackground(new java.awt.Color(204, 204, 204));
        Cerrar17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/D.png"))); // NOI18N
        Cerrar17.setBorder(null);
        Cerrar17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DD.png"))); // NOI18N
        Cerrar17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar17ActionPerformed(evt);
            }
        });

        Maximizar17.setBackground(new java.awt.Color(204, 204, 204));
        Maximizar17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C.png"))); // NOI18N
        Maximizar17.setBorder(null);
        Maximizar17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EE.png"))); // NOI18N
        Maximizar17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maximizar17ActionPerformed(evt);
            }
        });

        minimizar17.setBackground(new java.awt.Color(204, 204, 204));
        minimizar17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/E.png"))); // NOI18N
        minimizar17.setBorder(null);
        minimizar17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CC.png"))); // NOI18N
        minimizar17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizar17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizar17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Maximizar17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar17)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minimizar17)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Maximizar17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mostrarDetallesLayout = new javax.swing.GroupLayout(mostrarDetalles);
        mostrarDetalles.setLayout(mostrarDetallesLayout);
        mostrarDetallesLayout.setHorizontalGroup(
            mostrarDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mostrarDetallesLayout.createSequentialGroup()
                .addGroup(mostrarDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mostrarDetallesLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(mostrarDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Label24, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(Label25))
                        .addGap(32, 32, 32)
                        .addGroup(mostrarDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxServicio, 0, 239, Short.MAX_VALUE)
                            .addComponent(jtextFieldImporte)))
                    .addGroup(mostrarDetallesLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(botonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(33, 33, 33))
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mostrarDetallesLayout.setVerticalGroup(
            mostrarDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarDetallesLayout.createSequentialGroup()
                .addGroup(mostrarDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mostrarDetallesLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addGap(125, 125, 125)
                        .addGroup(mostrarDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mostrarDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mostrarDetallesLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mostrarDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mostrarDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mostrarDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Label24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label24ActionPerformed

    private void Label25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label25ActionPerformed

    private void jtextFieldImporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtextFieldImporteMouseClicked

    }//GEN-LAST:event_jtextFieldImporteMouseClicked

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void Cerrar17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar17ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Cerrar17ActionPerformed

    private void Maximizar17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maximizar17ActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_Maximizar17ActionPerformed

    private void minimizar17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizar17ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizar17ActionPerformed

    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed
        try{
            String TipoServicio = jComboBoxServicio.getSelectedItem().toString();
            float importe = Float.parseFloat(jtextFieldImporte.getText());
            bd.pagaServicio(TipoServicio,importe);
            jtextFieldImporte.setText("");
        }catch(NumberFormatException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"Ingresa un dato valido "+e.getMessage());
        }
       
    }//GEN-LAST:event_botonPagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(PagoServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagoServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagoServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagoServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar17;
    private javax.swing.JTextField Label24;
    private javax.swing.JTextField Label25;
    private javax.swing.JButton Maximizar17;
    private javax.swing.JButton botonPagar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> jComboBoxServicio;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JTextField jtextFieldImporte;
    private javax.swing.JButton minimizar17;
    private javax.swing.JPanel mostrarDetalles;
    // End of variables declaration//GEN-END:variables
}
