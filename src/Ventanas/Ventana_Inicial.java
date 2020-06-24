
package Ventanas;

public class Ventana_Inicial extends javax.swing.JFrame {

    private String usuario1,usuario2;
  
    public Ventana_Inicial() {
        initComponents();
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_usuario2 = new javax.swing.JTextField();
        txt_usuario1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        lblMuestra1 = new javax.swing.JLabel();
        lblMuestra2 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nombre usuario1:");
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 105, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Nombre usuario2:");
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 178, -1, -1));

        txt_usuario2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Panel.add(txt_usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 169, 251, 31));

        txt_usuario1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Panel.add(txt_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 102, 251, 32));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablero2.gif"))); // NOI18N
        Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 288, 230, 190));

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        Panel.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        titulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Tres en Raya");
        Panel.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 686, -1));

        lblMuestra1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Panel.add(lblMuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 370, 29));

        lblMuestra2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Panel.add(lblMuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 370, 32));

        btnJugar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnJugar.setText("Comenzar Juego");
        btnJugar.setVisible(false);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        Panel.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 204, 47));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      usuario1=txt_usuario1.getText();
      usuario2=txt_usuario2.getText();
      
      btnGuardar.setVisible(false);
      
      lblMuestra1.setText(usuario1+" jugara primero, su ficha es X");
      lblMuestra2.setText(usuario2+" jugara segundo, su ficha es O");
      
      btnJugar.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
       new Principal(usuario1,usuario2).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnJugarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMuestra1;
    private javax.swing.JLabel lblMuestra2;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txt_usuario1;
    private javax.swing.JTextField txt_usuario2;
    // End of variables declaration//GEN-END:variables
}
