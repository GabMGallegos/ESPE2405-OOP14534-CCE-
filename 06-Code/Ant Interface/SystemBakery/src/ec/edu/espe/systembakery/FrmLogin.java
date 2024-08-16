/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.systembakery;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.systembakery.model.Costumer;
import ec.edu.espe.utils.MethodosCostumer;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

/**
 *

 * @author CodeCrafting Engineers
 */
public class FrmLogin extends javax.swing.JFrame {

    private static MongoDatabase database;
    private MethodosCostumer methodosCostumer;
    public FrmLogin(MongoDatabase database) {
        initComponents();
        this.database = database;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblView = new javax.swing.JLabel();
        lblDisguise = new javax.swing.JLabel();
        btnStartSection = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(102, 255, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenes/Login.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 140, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenes/usuario (2).png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 218, -1, -1));

        txtUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 238, 170, 28));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenes/contraseña.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 284, 48, -1));

        lblView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenes/ver_32px.png"))); // NOI18N
        lblView.setText("jLabel5");
        lblView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewMouseClicked(evt);
            }
        });
        jPanel2.add(lblView, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 30, 20));

        lblDisguise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenes/ocultar_32px.png"))); // NOI18N
        lblDisguise.setText("jLabel6");
        lblDisguise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDisguiseMouseClicked(evt);
            }
        });
        jPanel2.add(lblDisguise, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 294, 30, 30));

        btnStartSection.setText("Iniciar Sesion");
        btnStartSection.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStartSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartSectionMouseClicked(evt);
            }
        });
        jPanel2.add(btnStartSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 84, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel5.setText("Welcome");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 170, 28));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 310, 400));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagenes/fondo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewMouseClicked
        lblView.setVisible(false);
        lblDisguise.setVisible(true);
        txtPassword.setEchoChar((char)0);
    }//GEN-LAST:event_lblViewMouseClicked

    private void lblDisguiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisguiseMouseClicked
        lblView.setVisible(true);
        lblDisguise.setVisible(false);
        txtPassword.setEchoChar('●');
    }//GEN-LAST:event_lblDisguiseMouseClicked

    private void btnStartSectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartSectionMouseClicked
        try {
            String user = txtUser.getText();
            String password = new String(txtPassword.getPassword());

            Costumer costumer = new Costumer(user, password);
            MethodosCostumer methodosCostumer = new MethodosCostumer();

            boolean isVerified = methodosCostumer.verifyCostumer(costumer);

            if (isVerified) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
                // Proceder con el siguiente paso
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
    }//GEN-LAST:event_btnStartSectionMouseClicked

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin(database).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStartSection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDisguise;
    private javax.swing.JLabel lblView;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
