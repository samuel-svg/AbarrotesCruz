package abarrotescruz;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class realizarVenta extends javax.swing.JFrame {
    
    
    public SQLConnection bd ;

    public realizarVenta() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null); 
        jTextArea2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        realizarVenta = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Label15 = new javax.swing.JTextField();
        Label16 = new javax.swing.JTextField();
        Label17 = new javax.swing.JTextField();
        Label18 = new javax.swing.JTextField();
        Label19 = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        subtotal = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        volver8 = new javax.swing.JButton();
        Label20 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        Cerrar15 = new javax.swing.JButton();
        Maximizar15 = new javax.swing.JButton();
        minimizar15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        realizarVenta.setBackground(new java.awt.Color(255, 255, 255));
        realizarVenta.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("    Realizar venta");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        Label15.setEditable(false);
        Label15.setBackground(new java.awt.Color(204, 255, 204));
        Label15.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label15.setText("  ID del producto:");
        Label15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label15ActionPerformed(evt);
            }
        });

        Label16.setEditable(false);
        Label16.setBackground(new java.awt.Color(204, 204, 255));
        Label16.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label16.setText("  Cantidad:");
        Label16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label16ActionPerformed(evt);
            }
        });

        Label17.setEditable(false);
        Label17.setBackground(new java.awt.Color(173, 173, 119));
        Label17.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label17.setText("  Subtotal:");
        Label17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label17ActionPerformed(evt);
            }
        });

        Label18.setEditable(false);
        Label18.setBackground(new java.awt.Color(153, 255, 153));
        Label18.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label18.setText("  Total:");
        Label18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label18ActionPerformed(evt);
            }
        });

        Label19.setEditable(false);
        Label19.setBackground(new java.awt.Color(147, 161, 127));
        Label19.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label19.setText("Agregar Nuevo Producto");
        Label19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label19ActionPerformed(evt);
            }
        });

        usuario.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        usuario.setForeground(new java.awt.Color(51, 51, 51));
        usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });

        cantidad.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        cantidad.setForeground(new java.awt.Color(51, 51, 51));
        cantidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidadMouseClicked(evt);
            }
        });

        subtotal.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        subtotal.setForeground(new java.awt.Color(51, 51, 51));
        subtotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        subtotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtotalMouseClicked(evt);
            }
        });

        total.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        total.setForeground(new java.awt.Color(51, 51, 51));
        total.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalMouseClicked(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jScrollPane3.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/carrito.png"))); // NOI18N

        volver8.setBackground(new java.awt.Color(255, 255, 255));
        volver8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        volver8.setForeground(new java.awt.Color(51, 51, 51));
        volver8.setText("Volver");
        volver8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        volver8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver8ActionPerformed(evt);
            }
        });

        Label20.setEditable(false);
        Label20.setBackground(new java.awt.Color(147, 161, 127));
        Label20.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label20.setText("Finalizar Venta");
        Label20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout realizarVentaLayout = new javax.swing.GroupLayout(realizarVenta);
        realizarVenta.setLayout(realizarVentaLayout);
        realizarVentaLayout.setHorizontalGroup(
            realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(realizarVentaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(realizarVentaLayout.createSequentialGroup()
                        .addComponent(Label15, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usuario))
                    .addGroup(realizarVentaLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(volver8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(realizarVentaLayout.createSequentialGroup()
                        .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Label18)
                                .addComponent(Label17, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Label16, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                            .addComponent(Label19, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(realizarVentaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cantidad)
                                    .addComponent(subtotal)
                                    .addComponent(total)))
                            .addGroup(realizarVentaLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(Label20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        realizarVentaLayout.setVerticalGroup(
            realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realizarVentaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel15)
                .addGap(42, 42, 42)
                .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(realizarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, realizarVentaLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volver8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setForeground(new java.awt.Color(153, 153, 153));

        Cerrar15.setBackground(new java.awt.Color(204, 204, 204));
        Cerrar15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/D.png"))); // NOI18N
        Cerrar15.setBorder(null);
        Cerrar15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DD.png"))); // NOI18N
        Cerrar15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar15ActionPerformed(evt);
            }
        });

        Maximizar15.setBackground(new java.awt.Color(204, 204, 204));
        Maximizar15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C.png"))); // NOI18N
        Maximizar15.setBorder(null);
        Maximizar15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EE.png"))); // NOI18N
        Maximizar15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maximizar15ActionPerformed(evt);
            }
        });

        minimizar15.setBackground(new java.awt.Color(204, 204, 204));
        minimizar15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/E.png"))); // NOI18N
        minimizar15.setBorder(null);
        minimizar15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CC.png"))); // NOI18N
        minimizar15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizar15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizar15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Maximizar15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar15)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minimizar15)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Maximizar15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(realizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(realizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Label15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label15ActionPerformed

    private void Label16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label16ActionPerformed

    private void Label17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label17ActionPerformed

    private void Label18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label18ActionPerformed

    private void Label19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label19ActionPerformed

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        usuario.setText("");
    }//GEN-LAST:event_usuarioMouseClicked

    private void cantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadMouseClicked

    private void subtotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtotalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalMouseClicked

    private void totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMouseClicked

    private void volver8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver8ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_volver8ActionPerformed

    private void Cerrar15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar15ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Cerrar15ActionPerformed

    private void Maximizar15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maximizar15ActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_Maximizar15ActionPerformed

    private void minimizar15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizar15ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizar15ActionPerformed

    private void Label20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label20ActionPerformed

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
            java.util.logging.Logger.getLogger(realizarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(realizarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(realizarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(realizarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new realizarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar15;
    private javax.swing.JTextField Label15;
    private javax.swing.JTextField Label16;
    private javax.swing.JTextField Label17;
    private javax.swing.JTextField Label18;
    private javax.swing.JTextField Label19;
    private javax.swing.JTextField Label20;
    private javax.swing.JButton Maximizar15;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton minimizar15;
    private javax.swing.JPanel realizarVenta;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTextField total;
    private javax.swing.JTextField usuario;
    private javax.swing.JButton volver8;
    // End of variables declaration//GEN-END:variables
}
