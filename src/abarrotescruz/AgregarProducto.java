package abarrotescruz;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AgregarProducto extends javax.swing.JFrame {
    
    public String NombreProd;
    public int cantidad;
    public float precio ;
    
    public SQLConnection bd ;

    public AgregarProducto() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actualizarInvent = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        Label21 = new javax.swing.JTextField();
        Label22 = new javax.swing.JTextField();
        Label23 = new javax.swing.JTextField();
        jtextFieldNombreProd = new javax.swing.JTextField();
        jTextFieldCantidadExistencia = new javax.swing.JTextField();
        jTextFieldPrecioProd = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        botonEnviar = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        Cerrar16 = new javax.swing.JButton();
        Maximizar16 = new javax.swing.JButton();
        minimizar16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actualizarInvent.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("               Agregar Nuevo Producto");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        Label21.setEditable(false);
        Label21.setBackground(new java.awt.Color(255, 204, 153));
        Label21.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label21.setText("  Nombre:");
        Label21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label21ActionPerformed(evt);
            }
        });

        Label22.setEditable(false);
        Label22.setBackground(new java.awt.Color(255, 153, 153));
        Label22.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label22.setText("  Cantidad:");
        Label22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label22ActionPerformed(evt);
            }
        });

        Label23.setEditable(false);
        Label23.setBackground(new java.awt.Color(255, 204, 102));
        Label23.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label23.setText("  Precio:");
        Label23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label23ActionPerformed(evt);
            }
        });

        jtextFieldNombreProd.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        jtextFieldNombreProd.setForeground(new java.awt.Color(51, 51, 51));
        jtextFieldNombreProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jtextFieldNombreProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtextFieldNombreProdMouseClicked(evt);
            }
        });

        jTextFieldCantidadExistencia.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        jTextFieldCantidadExistencia.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldCantidadExistencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jTextFieldCantidadExistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCantidadExistenciaMouseClicked(evt);
            }
        });

        jTextFieldPrecioProd.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        jTextFieldPrecioProd.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldPrecioProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jTextFieldPrecioProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPrecioProdMouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/actualizar2.png"))); // NOI18N

        botonEnviar.setBackground(new java.awt.Color(255, 255, 255));
        botonEnviar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        botonEnviar.setForeground(new java.awt.Color(51, 51, 51));
        botonEnviar.setText("Enviar ");
        botonEnviar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
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

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setForeground(new java.awt.Color(153, 153, 153));

        Cerrar16.setBackground(new java.awt.Color(204, 204, 204));
        Cerrar16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/D.png"))); // NOI18N
        Cerrar16.setBorder(null);
        Cerrar16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DD.png"))); // NOI18N
        Cerrar16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar16ActionPerformed(evt);
            }
        });

        Maximizar16.setBackground(new java.awt.Color(204, 204, 204));
        Maximizar16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C.png"))); // NOI18N
        Maximizar16.setBorder(null);
        Maximizar16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EE.png"))); // NOI18N
        Maximizar16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maximizar16ActionPerformed(evt);
            }
        });

        minimizar16.setBackground(new java.awt.Color(204, 204, 204));
        minimizar16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/E.png"))); // NOI18N
        minimizar16.setBorder(null);
        minimizar16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CC.png"))); // NOI18N
        minimizar16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizar16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizar16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Maximizar16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar16)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minimizar16)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Maximizar16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout actualizarInventLayout = new javax.swing.GroupLayout(actualizarInvent);
        actualizarInvent.setLayout(actualizarInventLayout);
        actualizarInventLayout.setHorizontalGroup(
            actualizarInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(actualizarInventLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(actualizarInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(actualizarInventLayout.createSequentialGroup()
                        .addComponent(botonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(actualizarInventLayout.createSequentialGroup()
                        .addGroup(actualizarInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Label22, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(actualizarInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldCantidadExistencia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtextFieldNombreProd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        actualizarInventLayout.setVerticalGroup(
            actualizarInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarInventLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(actualizarInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(actualizarInventLayout.createSequentialGroup()
                        .addGroup(actualizarInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextFieldNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(actualizarInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCantidadExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(actualizarInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(actualizarInventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actualizarInvent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actualizarInvent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Label21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label21ActionPerformed

    private void Label22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label22ActionPerformed

    private void Label23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label23ActionPerformed

    private void jtextFieldNombreProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtextFieldNombreProdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextFieldNombreProdMouseClicked

    private void jTextFieldCantidadExistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCantidadExistenciaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadExistenciaMouseClicked

    private void jTextFieldPrecioProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPrecioProdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioProdMouseClicked
    private boolean InputValido(String str){
        return str.length()>0;
    }
    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        if(InputValido(jTextFieldCantidadExistencia.getText())
                && InputValido(jTextFieldPrecioProd.getText())
                && InputValido(jtextFieldNombreProd.getText()) ){
            try{
                NombreProd = jtextFieldNombreProd.getText();
                precio = Float.parseFloat(jTextFieldPrecioProd.getText());
                cantidad = Integer.parseInt(jTextFieldCantidadExistencia.getText());
                
                bd.recibeProducto(NombreProd,precio,cantidad);
                
                setVisible(false);
                
            }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,"Algun error ocurrió "+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null,"No has llenado algún campo");
        }
    }//GEN-LAST:event_botonEnviarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
         setVisible(false);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void Cerrar16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar16ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Cerrar16ActionPerformed

    private void Maximizar16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maximizar16ActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_Maximizar16ActionPerformed

    private void minimizar16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizar16ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizar16ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar16;
    private javax.swing.JTextField Label21;
    private javax.swing.JTextField Label22;
    private javax.swing.JTextField Label23;
    private javax.swing.JButton Maximizar16;
    private javax.swing.JPanel actualizarInvent;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextFieldCantidadExistencia;
    private javax.swing.JTextField jTextFieldPrecioProd;
    private javax.swing.JTextField jtextFieldNombreProd;
    private javax.swing.JButton minimizar16;
    // End of variables declaration//GEN-END:variables
}
