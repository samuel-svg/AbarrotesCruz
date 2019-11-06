package abarrotescruz;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null); 
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        consultProv = new javax.swing.JButton();
        consultInvent = new javax.swing.JButton();
        realizarVent = new javax.swing.JButton();
        pagarServ = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JButton();
        Maximizar = new javax.swing.JButton();
        minimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("    Menú principal");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/store.png"))); // NOI18N

        consultProv.setBackground(new java.awt.Color(255, 204, 153));
        consultProv.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        consultProv.setForeground(new java.awt.Color(51, 51, 51));
        consultProv.setText("Consultar proveedor");
        consultProv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        consultProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultProvActionPerformed(evt);
            }
        });

        consultInvent.setBackground(new java.awt.Color(255, 255, 153));
        consultInvent.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        consultInvent.setForeground(new java.awt.Color(51, 51, 51));
        consultInvent.setText("Consultar inventario");
        consultInvent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        consultInvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultInventActionPerformed(evt);
            }
        });

        realizarVent.setBackground(new java.awt.Color(169, 140, 82));
        realizarVent.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        realizarVent.setForeground(new java.awt.Color(51, 51, 51));
        realizarVent.setText("Realizar venta");
        realizarVent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        realizarVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarVentActionPerformed(evt);
            }
        });

        pagarServ.setBackground(new java.awt.Color(255, 153, 153));
        pagarServ.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        pagarServ.setForeground(new java.awt.Color(51, 51, 51));
        pagarServ.setText("Pagar servicio");
        pagarServ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pagarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarServActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        Cerrar.setBackground(new java.awt.Color(204, 204, 204));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/D.png"))); // NOI18N
        Cerrar.setBorder(null);
        Cerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DD.png"))); // NOI18N
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        Maximizar.setBackground(new java.awt.Color(204, 204, 204));
        Maximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C.png"))); // NOI18N
        Maximizar.setBorder(null);
        Maximizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EE.png"))); // NOI18N
        Maximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaximizarActionPerformed(evt);
            }
        });

        minimizar.setBackground(new java.awt.Color(204, 204, 204));
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/E.png"))); // NOI18N
        minimizar.setBorder(null);
        minimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CC.png"))); // NOI18N
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Maximizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Maximizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPrincipalLayout = new javax.swing.GroupLayout(menuPrincipal);
        menuPrincipal.setLayout(menuPrincipalLayout);
        menuPrincipalLayout.setHorizontalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPrincipalLayout.createSequentialGroup()
                        .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pagarServ, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consultProv, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuPrincipalLayout.createSequentialGroup()
                        .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consultInvent, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(realizarVent, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(116, 116, 116))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPrincipalLayout.setVerticalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(consultProv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPrincipalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(consultInvent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(realizarVent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuPrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addGap(11, 11, 11)
                .addComponent(pagarServ, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultProvActionPerformed
       consultaProv cp = new consultaProv ();
       cp.setVisible(true);
    }//GEN-LAST:event_consultProvActionPerformed

    private void consultInventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultInventActionPerformed
        consultarInvent ci = new consultarInvent() ;
        ci.setVisible(true);
    }//GEN-LAST:event_consultInventActionPerformed

    private void realizarVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarVentActionPerformed
        realizarVenta vender = new  realizarVenta ();
        vender.setVisible(true);
    }//GEN-LAST:event_realizarVentActionPerformed

    private void pagarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarServActionPerformed
        PagoServicios ps = new PagoServicios ();
        ps.setVisible(true);
    }//GEN-LAST:event_pagarServActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

    private void MaximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaximizarActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
        //setExtendedState(NORMAL);
    }//GEN-LAST:event_MaximizarActionPerformed

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Maximizar;
    private javax.swing.JButton consultInvent;
    private javax.swing.JButton consultProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel menuPrincipal;
    private javax.swing.JButton minimizar;
    private javax.swing.JButton pagarServ;
    private javax.swing.JButton realizarVent;
    // End of variables declaration//GEN-END:variables
}
