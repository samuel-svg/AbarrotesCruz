package abarrotescruz;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class busquedaProveedorAct extends javax.swing.JFrame {
    public String NOMBRE_BUSCAR;
    public SQLConnection bd ;
    public busquedaProveedorAct() {
        setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        busqueda = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Label14 = new javax.swing.JTextField();
        jTextFieldIDProveedor = new javax.swing.JTextField();
        botonEnviar = new javax.swing.JButton();
        volver3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Cerrar13 = new javax.swing.JButton();
        Maximizar13 = new javax.swing.JButton();
        minimizar13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        busqueda.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("        Búsqueda para actualizar provedor ");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        Label14.setEditable(false);
        Label14.setBackground(new java.awt.Color(204, 204, 204));
        Label14.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label14.setText("  Ingrese Nombre:");
        Label14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label14ActionPerformed(evt);
            }
        });

        jTextFieldIDProveedor.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        jTextFieldIDProveedor.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldIDProveedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextFieldIDProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldIDProveedorMouseClicked(evt);
            }
        });

        botonEnviar.setBackground(new java.awt.Color(255, 255, 255));
        botonEnviar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        botonEnviar.setForeground(new java.awt.Color(51, 51, 51));
        botonEnviar.setText("Aceptar");
        botonEnviar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        volver3.setBackground(new java.awt.Color(255, 255, 255));
        volver3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        volver3.setForeground(new java.awt.Color(51, 51, 51));
        volver3.setText("Volver");
        volver3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        volver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver3ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/actualizar.png"))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));

        Cerrar13.setBackground(new java.awt.Color(204, 204, 204));
        Cerrar13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/D.png"))); // NOI18N
        Cerrar13.setBorder(null);
        Cerrar13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DD.png"))); // NOI18N
        Cerrar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar13ActionPerformed(evt);
            }
        });

        Maximizar13.setBackground(new java.awt.Color(204, 204, 204));
        Maximizar13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C.png"))); // NOI18N
        Maximizar13.setBorder(null);
        Maximizar13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EE.png"))); // NOI18N
        Maximizar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maximizar13ActionPerformed(evt);
            }
        });

        minimizar13.setBackground(new java.awt.Color(204, 204, 204));
        minimizar13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/E.png"))); // NOI18N
        minimizar13.setBorder(null);
        minimizar13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CC.png"))); // NOI18N
        minimizar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizar13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizar13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Maximizar13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar13)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minimizar13)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Maximizar13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout busquedaLayout = new javax.swing.GroupLayout(busqueda);
        busqueda.setLayout(busquedaLayout);
        busquedaLayout.setHorizontalGroup(
            busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(busquedaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(busquedaLayout.createSequentialGroup()
                        .addComponent(Label14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(busquedaLayout.createSequentialGroup()
                        .addComponent(botonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volver3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        busquedaLayout.setVerticalGroup(
            busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGroup(busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(busquedaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(volver3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(busquedaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Label14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label14ActionPerformed

    private void jTextFieldIDProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldIDProveedorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDProveedorMouseClicked

    private void volver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_volver3ActionPerformed

    private void Cerrar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar13ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Cerrar13ActionPerformed

    private void Maximizar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maximizar13ActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_Maximizar13ActionPerformed

    private void minimizar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizar13ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizar13ActionPerformed
    private boolean InputValido(String str){
        return str.length()>0;
    }
    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
       if(InputValido(jTextFieldIDProveedor.getText())){
            try{
                NOMBRE_BUSCAR = jTextFieldIDProveedor.getText();
                bd.buscarProveedor(NOMBRE_BUSCAR);
                ResultSet rs = null;
                //rs = bd.getProveedor();
                
                registroProv rp = new registroProv ();
                rp.recibeProveedor(rs);
                rp.setVisible(true);
                
                setVisible(false);
                
            }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,"Algun error ocurrió "+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null,"Algun error ocurrió");
        }
        
    }//GEN-LAST:event_botonEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(busquedaProveedorAct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(busquedaProveedorAct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(busquedaProveedorAct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(busquedaProveedorAct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busquedaProveedorAct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar13;
    private javax.swing.JTextField Label14;
    private javax.swing.JButton Maximizar13;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JPanel busqueda;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextFieldIDProveedor;
    private javax.swing.JButton minimizar13;
    private javax.swing.JButton volver3;
    // End of variables declaration//GEN-END:variables
}
