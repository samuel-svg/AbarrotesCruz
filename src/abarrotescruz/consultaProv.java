package abarrotescruz;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class consultaProv extends javax.swing.JFrame {
    
    public String NOMBRE_BUSCAR;
    public SQLConnection bd ;

    public consultaProv() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null); 
        jTextArea1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultaProv = new javax.swing.JPanel();
        jTextFiledBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        agregarPrv = new javax.swing.JButton();
        eliminarPrv = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Cerrar3 = new javax.swing.JButton();
        Maximizar3 = new javax.swing.JButton();
        minimizar3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        consultaProv.setBackground(new java.awt.Color(255, 255, 255));
        consultaProv.setForeground(new java.awt.Color(255, 255, 255));

        jTextFiledBuscar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        jTextFiledBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jTextFiledBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextFiledBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFiledBuscarMouseClicked(evt);
            }
        });
        jTextFiledBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiledBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("    Consulta de proveedores");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa.png"))); // NOI18N

        buscar.setBackground(new java.awt.Color(240, 152, 152));
        buscar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        buscar.setForeground(new java.awt.Color(51, 51, 51));
        buscar.setText("Buscar");
        buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        agregarPrv.setBackground(new java.awt.Color(255, 204, 204));
        agregarPrv.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        agregarPrv.setForeground(new java.awt.Color(51, 51, 51));
        agregarPrv.setText("Agregar proveedor");
        agregarPrv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        agregarPrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPrvActionPerformed(evt);
            }
        });

        eliminarPrv.setBackground(new java.awt.Color(255, 153, 153));
        eliminarPrv.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        eliminarPrv.setForeground(new java.awt.Color(51, 51, 51));
        eliminarPrv.setText("Eliminar proveedor");
        eliminarPrv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        eliminarPrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPrvActionPerformed(evt);
            }
        });

        actualizar.setBackground(new java.awt.Color(218, 133, 133));
        actualizar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        actualizar.setForeground(new java.awt.Color(51, 51, 51));
        actualizar.setText("Actualizar");
        actualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(194, 119, 119));
        volver.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        volver.setForeground(new java.awt.Color(51, 51, 51));
        volver.setText("Volver");
        volver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/proveedor.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        Cerrar3.setBackground(new java.awt.Color(204, 204, 204));
        Cerrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/D.png"))); // NOI18N
        Cerrar3.setBorder(null);
        Cerrar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DD.png"))); // NOI18N
        Cerrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar3ActionPerformed(evt);
            }
        });

        Maximizar3.setBackground(new java.awt.Color(204, 204, 204));
        Maximizar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C.png"))); // NOI18N
        Maximizar3.setBorder(null);
        Maximizar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EE.png"))); // NOI18N
        Maximizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maximizar3ActionPerformed(evt);
            }
        });

        minimizar3.setBackground(new java.awt.Color(204, 204, 204));
        minimizar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/E.png"))); // NOI18N
        minimizar3.setBorder(null);
        minimizar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CC.png"))); // NOI18N
        minimizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Maximizar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minimizar3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Maximizar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout consultaProvLayout = new javax.swing.GroupLayout(consultaProv);
        consultaProv.setLayout(consultaProvLayout);
        consultaProvLayout.setHorizontalGroup(
            consultaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(consultaProvLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(consultaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(consultaProvLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiledBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(25, 25, 25)
                .addGroup(consultaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaProvLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(52, 52, 52))
                    .addGroup(consultaProvLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(consultaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eliminarPrv, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(consultaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(agregarPrv, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        consultaProvLayout.setVerticalGroup(
            consultaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaProvLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(consultaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaProvLayout.createSequentialGroup()
                        .addGroup(consultaProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFiledBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(consultaProvLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarPrv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarPrv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Ingrese nombre a buscar");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(consultaProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel6)
                .addContainerGap(435, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(consultaProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFiledBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFiledBuscarMouseClicked
        jTextFiledBuscar.setText("");
    }//GEN-LAST:event_jTextFiledBuscarMouseClicked

    private void agregarPrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPrvActionPerformed
        registroProv rp = new registroProv();
        rp.setVisible(true);
    }//GEN-LAST:event_agregarPrvActionPerformed

    private void eliminarPrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPrvActionPerformed
       eliminarProv ep = new eliminarProv();
       ep.setVisible(true);
    }//GEN-LAST:event_eliminarPrvActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void Cerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Cerrar3ActionPerformed

    private void Maximizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maximizar3ActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_Maximizar3ActionPerformed

    private void minimizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizar3ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizar3ActionPerformed
    private boolean InputValido(String str){
        return str.length()>0;
    }
            
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(InputValido(jTextFiledBuscar.getText())){
            try{
                NOMBRE_BUSCAR = jTextFiledBuscar.getText();

                bd.buscarProveedor(NOMBRE_BUSCAR);
                ResultSet rs = bd.getProveedor();
                jTextArea1.setText(""+rs);
            }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,"Algun error ocurrió "+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null,"Algun error ocurrió");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void jTextFiledBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiledBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiledBuscarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        busquedaProveedorAct act = new busquedaProveedorAct ();
        act.setVisible(true);
                
    }//GEN-LAST:event_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(consultaProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaProv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar3;
    private javax.swing.JButton Maximizar3;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregarPrv;
    private javax.swing.JButton buscar;
    private javax.swing.JPanel consultaProv;
    private javax.swing.JButton eliminarPrv;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFiledBuscar;
    private javax.swing.JButton minimizar3;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
