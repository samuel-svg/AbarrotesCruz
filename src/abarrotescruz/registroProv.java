package abarrotescruz;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class registroProv extends javax.swing.JFrame {
    
    public boolean enviar = true;
    public SQLConnection bd ;

    public registroProv() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null); 
        guardar.setText("Registrar");
        enviar = true ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registroProv = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        Label6 = new javax.swing.JTextField();
        Label7 = new javax.swing.JTextField();
        Label8 = new javax.swing.JTextField();
        Label9 = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        producto = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        volver2 = new javax.swing.JButton();
        limpiarCampos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Cerrar11 = new javax.swing.JButton();
        Maximizar11 = new javax.swing.JButton();
        minimizar11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registroProv.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTitulo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTitulo.setText("    Registro de proveedores");
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        Label6.setEditable(false);
        Label6.setBackground(new java.awt.Color(218, 183, 253));
        Label6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label6.setText("  Nombre:");
        Label6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label6ActionPerformed(evt);
            }
        });

        Label7.setEditable(false);
        Label7.setBackground(new java.awt.Color(255, 216, 140));
        Label7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label7.setText("  Producto:");
        Label7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label7ActionPerformed(evt);
            }
        });

        Label8.setEditable(false);
        Label8.setBackground(new java.awt.Color(187, 119, 255));
        Label8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label8.setText("  Dirección:");
        Label8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label8ActionPerformed(evt);
            }
        });

        Label9.setEditable(false);
        Label9.setBackground(new java.awt.Color(130, 102, 145));
        Label9.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Label9.setText("  Teléfono:");
        Label9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Label9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label9ActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        nombre.setForeground(new java.awt.Color(51, 51, 51));
        nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });

        direccion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        direccion.setForeground(new java.awt.Color(51, 51, 51));
        direccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direccionMouseClicked(evt);
            }
        });

        producto.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        producto.setForeground(new java.awt.Color(51, 51, 51));
        producto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productoMouseClicked(evt);
            }
        });

        telefono.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        telefono.setForeground(new java.awt.Color(51, 51, 51));
        telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefonoMouseClicked(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        guardar.setForeground(new java.awt.Color(51, 51, 51));
        guardar.setText("Guardar");
        guardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/añadir.png"))); // NOI18N

        volver2.setBackground(new java.awt.Color(255, 255, 255));
        volver2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        volver2.setForeground(new java.awt.Color(51, 51, 51));
        volver2.setText("Cancelar");
        volver2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        volver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver2ActionPerformed(evt);
            }
        });

        limpiarCampos.setBackground(new java.awt.Color(255, 255, 255));
        limpiarCampos.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        limpiarCampos.setForeground(new java.awt.Color(51, 51, 51));
        limpiarCampos.setText("Limpiar campos");
        limpiarCampos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        limpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCamposActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setForeground(new java.awt.Color(153, 153, 153));

        Cerrar11.setBackground(new java.awt.Color(204, 204, 204));
        Cerrar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/D.png"))); // NOI18N
        Cerrar11.setBorder(null);
        Cerrar11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DD.png"))); // NOI18N
        Cerrar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar11ActionPerformed(evt);
            }
        });

        Maximizar11.setBackground(new java.awt.Color(204, 204, 204));
        Maximizar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C.png"))); // NOI18N
        Maximizar11.setBorder(null);
        Maximizar11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EE.png"))); // NOI18N
        Maximizar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maximizar11ActionPerformed(evt);
            }
        });

        minimizar11.setBackground(new java.awt.Color(204, 204, 204));
        minimizar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/E.png"))); // NOI18N
        minimizar11.setBorder(null);
        minimizar11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CC.png"))); // NOI18N
        minimizar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizar11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizar11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Maximizar11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar11)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minimizar11)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Maximizar11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registroProvLayout = new javax.swing.GroupLayout(registroProv);
        registroProv.setLayout(registroProvLayout);
        registroProvLayout.setHorizontalGroup(
            registroProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(registroProvLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(registroProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registroProvLayout.createSequentialGroup()
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(limpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(volver2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registroProvLayout.createSequentialGroup()
                        .addGroup(registroProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Label9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(Label7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(registroProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(direccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(producto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(32, 32, 32))
        );
        registroProvLayout.setVerticalGroup(
            registroProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroProvLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitulo)
                .addGap(35, 35, 35)
                .addGroup(registroProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(registroProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registroProvLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(registroProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(registroProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(registroProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(registroProvLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)))
                .addGap(43, 43, 43)
                .addGroup(registroProvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volver2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registroProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registroProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Label6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label6ActionPerformed

    private void Label7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label7ActionPerformed

    private void Label8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label8ActionPerformed

    private void Label9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label9ActionPerformed

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMouseClicked

    private void direccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionMouseClicked

    private void productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_productoMouseClicked

    private void telefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoMouseClicked

    private void volver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver2ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_volver2ActionPerformed

    private void Cerrar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar11ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_Cerrar11ActionPerformed

    private void Maximizar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maximizar11ActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_Maximizar11ActionPerformed

    private void minimizar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizar11ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizar11ActionPerformed

    private void limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposActionPerformed
       nombre.setText("");
       direccion.setText("");
       producto.setText("");
       telefono.setText("");
    }//GEN-LAST:event_limpiarCamposActionPerformed
    private boolean InputValido(String str){
        return str.length()>0;
    }
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if(InputValido(nombre.getText()) 
                && InputValido(direccion.getText())
                && InputValido(telefono.getText())
                && InputValido(producto.getText()) ){
            String n = nombre.getText();
            String p = producto.getText();
            String d = direccion.getText();
            String t = telefono.getText();
            try{
                if(enviar){
                    bd.insertaProveedor(n,p,d,t);
                }else{
                    bd.ActualizaProveedor(n,p,d,t);
                }
                setVisible(false);
            }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,"Algun error ocurrió "+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null,"Algun error ocurrió");
        }
    }//GEN-LAST:event_guardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registroProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroProv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar11;
    private javax.swing.JTextField Label6;
    private javax.swing.JTextField Label7;
    private javax.swing.JTextField Label8;
    private javax.swing.JTextField Label9;
    private javax.swing.JButton Maximizar11;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton limpiarCampos;
    private javax.swing.JButton minimizar11;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField producto;
    private javax.swing.JPanel registroProv;
    private javax.swing.JTextField telefono;
    private javax.swing.JButton volver2;
    // End of variables declaration//GEN-END:variables

    void recibeProveedor(ResultSet rs) {
        enviar = false ;
        String nombrep = "#NOMBRE#";
        String productop = "#PRODUCTO#";
        String direccionp = "#DIRECCION#";
        String telefonop = "#%&#$#";
        jLabelTitulo.setText("Actualizar proveedor");
        guardar.setText("Actualizar");
        
        nombre.setText(nombrep);
        producto.setText(productop);
        direccion.setText(direccionp);
        telefono.setText(telefonop);
        
    }
}
