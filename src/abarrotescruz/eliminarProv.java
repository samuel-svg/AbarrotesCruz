package abarrotescruz;

import javax.swing.JOptionPane;

public class eliminarProv extends javax.swing.JFrame {
    
    public SQLConnection bd;

    public eliminarProv() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eliminarProv = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Label11 = new javax.swing.JTextField();
        Label12 = new javax.swing.JTextField();
        Label13 = new javax.swing.JTextField();
        id2 = new javax.swing.JTextField();
        nombre2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Cerrar12 = new javax.swing.JButton();
        Maximizar12 = new javax.swing.JButton();
        minimizar12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eliminarProv.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("    Eliminar proveedor");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        Label11.setEditable(false);
        Label11.setBackground(new java.awt.Color(167, 139, 111));
        Label11.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label11.setText("  Ingrese ID o nombre:");
        Label11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label11ActionPerformed(evt);
            }
        });

        Label12.setEditable(false);
        Label12.setBackground(new java.awt.Color(255, 255, 153));
        Label12.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label12.setText("  ID:");
        Label12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label12ActionPerformed(evt);
            }
        });

        Label13.setEditable(false);
        Label13.setBackground(new java.awt.Color(255, 204, 153));
        Label13.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label13.setText("  Nombre:");
        Label13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label13ActionPerformed(evt);
            }
        });

        id2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        id2.setForeground(new java.awt.Color(51, 51, 51));
        id2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        id2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id2MouseClicked(evt);
            }
        });

        nombre2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        nombre2.setForeground(new java.awt.Color(51, 51, 51));
        nombre2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        nombre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombre2MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/basura.png"))); // NOI18N

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        eliminar.setForeground(new java.awt.Color(51, 51, 51));
        eliminar.setText("Eliminar");
        eliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(255, 255, 255));
        cancelar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        cancelar.setForeground(new java.awt.Color(51, 51, 51));
        cancelar.setText("Cancelar y volver");
        cancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setForeground(new java.awt.Color(153, 153, 153));

        Cerrar12.setBackground(new java.awt.Color(204, 204, 204));
        Cerrar12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/D.png"))); // NOI18N
        Cerrar12.setBorder(null);
        Cerrar12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DD.png"))); // NOI18N
        Cerrar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar12ActionPerformed(evt);
            }
        });

        Maximizar12.setBackground(new java.awt.Color(204, 204, 204));
        Maximizar12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C.png"))); // NOI18N
        Maximizar12.setBorder(null);
        Maximizar12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EE.png"))); // NOI18N
        Maximizar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maximizar12ActionPerformed(evt);
            }
        });

        minimizar12.setBackground(new java.awt.Color(204, 204, 204));
        minimizar12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/E.png"))); // NOI18N
        minimizar12.setBorder(null);
        minimizar12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CC.png"))); // NOI18N
        minimizar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizar12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizar12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Maximizar12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar12)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minimizar12)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Maximizar12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout eliminarProvLayout = new javax.swing.GroupLayout(eliminarProv);
        eliminarProv.setLayout(eliminarProvLayout);
        eliminarProvLayout.setHorizontalGroup(
            eliminarProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(eliminarProvLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(eliminarProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eliminarProvLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(eliminarProvLayout.createSequentialGroup()
                        .addComponent(Label13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(eliminarProvLayout.createSequentialGroup()
                        .addComponent(Label12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Label11, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(30, 30, 30))
        );
        eliminarProvLayout.setVerticalGroup(
            eliminarProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarProvLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGroup(eliminarProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eliminarProvLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel9))
                    .addGroup(eliminarProvLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(Label11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(eliminarProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(eliminarProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(eliminarProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(eliminarProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(eliminarProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Label11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label11ActionPerformed

    private void Label12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label12ActionPerformed

    private void Label13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label13ActionPerformed

    private void id2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_id2MouseClicked

    private void nombre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre2MouseClicked

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void Cerrar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar12ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Cerrar12ActionPerformed

    private void Maximizar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maximizar12ActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_Maximizar12ActionPerformed

    private void minimizar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizar12ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizar12ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(id2.getText().length()==0) bd.eliminarProveedor(nombre2.getText(),"NOMBRE_PROVEEDOR");
        else if(nombre2.getText().length()==0) bd.eliminarProveedor(id2.getText(),"ID_PROVEEDOR");
        else JOptionPane.showMessageDialog(null,"Ingresa algo valido");
    }//GEN-LAST:event_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(eliminarProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminarProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminarProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminarProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminarProv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar12;
    private javax.swing.JTextField Label11;
    private javax.swing.JTextField Label12;
    private javax.swing.JTextField Label13;
    private javax.swing.JButton Maximizar12;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton eliminar;
    private javax.swing.JPanel eliminarProv;
    private javax.swing.JTextField id2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton minimizar12;
    private javax.swing.JTextField nombre2;
    // End of variables declaration//GEN-END:variables
}
