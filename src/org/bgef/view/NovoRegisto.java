/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bgef.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.bgef.bsl.MainManager;
import org.bgef.bsl.domains.Utilizador;
import org.bgef.bsl.exceptions.MainManagerInitException;

/**
 *
 * @author duarteduarte
 */
public class NovoRegisto extends javax.swing.JDialog {

    final ImageIcon icon = new ImageIcon("images/BananaLOGOpequeno.png");
    JFrame parent = null;
    MainManager mm = null;

    /**
     * Creates new form NovoRegisto
     */
    public NovoRegisto(JFrame parent) {
        super(parent);
        try {
            mm = new MainManager();
        } catch (MainManagerInitException ex) {
            Logger.getLogger(NovoRegisto.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.parent = parent;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setText("Novo Registo");

        jLabel2.setText("username");

        jLabel3.setText("password");

        jLabel4.setText("password (repetir)");

        jButton1.setText("Criar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(layout.createSequentialGroup()
                        .add(43, 43, 43)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jButton1)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(jLabel2)
                                        .add(jLabel3))
                                    .add(layout.createSequentialGroup()
                                        .add(1, 1, 1)
                                        .add(jLabel4)))
                                .add(28, 28, 28)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jFormattedTextField1)
                                    .add(jPasswordField1)
                                    .add(jPasswordField2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 114, Short.MAX_VALUE)
                        .add(jLabel6)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel5)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(jFormattedTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(34, 34, 34))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jPasswordField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel3)))
                .add(6, 6, 6)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jPasswordField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String user = jFormattedTextField1.getText();
        char[] password1 = jPasswordField1.getPassword();
        char[] password2 = jPasswordField2.getPassword();

        StringBuilder pass1 = new StringBuilder();
        StringBuilder pass2 = new StringBuilder();
        for (char a : password1) {
            pass1.append(a);
        }
        for (char a : password2) {
            pass2.append(a);
        }
        String pass1feita = pass1.toString();
        String pass2feira = pass2.toString();

        if (!pass1feita.equals(pass2feira)) {
            JOptionPane.showMessageDialog(this, "As passwords não coeincidem", "Error", JOptionPane.ERROR_MESSAGE, icon);
        } else {
            Utilizador aProcurar = new Utilizador();
            aProcurar.setUsername(user);
            if (mm.getUtilizadoresByCriteria(aProcurar).size() > 0) {
                JOptionPane.showMessageDialog(this, "Utilizador já existe", "Error", JOptionPane.ERROR_MESSAGE, icon);
            } else {
                Utilizador novo = new Utilizador(user, pass1feita);
                mm.insereUtilizador(novo);
            }
        }

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NovoRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoRegisto(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    // End of variables declaration//GEN-END:variables
}
