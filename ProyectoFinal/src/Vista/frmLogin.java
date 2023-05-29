/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author vboxuser
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
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

        jtxtUsuario = new javax.swing.JTextField();
        jtxtContrasena = new javax.swing.JPasswordField();
        jbtnIngresar = new javax.swing.JButton();
        jlblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión - Iron Fit");
        setMaximumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtUsuario.setBackground(new java.awt.Color(0,0,0,1));
        jtxtUsuario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtxtUsuario.setBorder(null);
        getContentPane().add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 311, 320, 30));

        jtxtContrasena.setBackground(new java.awt.Color(0,0,0,1));
        jtxtContrasena.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtxtContrasena.setForeground(new java.awt.Color(255, 255, 255));
        jtxtContrasena.setBorder(null);
        getContentPane().add(jtxtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 398, 320, 30));

        jbtnIngresar.setBorder(null);
        jbtnIngresar.setBorderPainted(false);
        jbtnIngresar.setContentAreaFilled(false);
        jbtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 220, 40));

        jlblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Login.png"))); // NOI18N
        getContentPane().add(jlblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnIngresar;
    private javax.swing.JLabel jlblFondo;
    private javax.swing.JPasswordField jtxtContrasena;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}