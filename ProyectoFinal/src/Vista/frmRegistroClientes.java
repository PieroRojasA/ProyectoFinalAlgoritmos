/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author vboxuser
 */
public class frmRegistroClientes extends javax.swing.JFrame {

    /**
     * Creates new form frmRegistroClientes
     */
    public frmRegistroClientes() {
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

        jtxtApellido = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtCosto = new javax.swing.JTextField();
        jtxtBuscarCliente = new javax.swing.JTextField();
        jtxtFechaInicial = new javax.swing.JTextField();
        jtxtFechaFinal = new javax.swing.JTextField();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnBuscar = new javax.swing.JButton();
        jtxtDNI = new javax.swing.JTextField();
        jbtnGenerarBoucher = new javax.swing.JButton();
        jbtnConsultar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtApellido.setBackground(new java.awt.Color(0,0,0,1));
        jtxtApellido.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtxtApellido.setForeground(new java.awt.Color(255, 255, 255));
        jtxtApellido.setBorder(null);
        getContentPane().add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 198, 260, 30));

        jtxtNombre.setBackground(new java.awt.Color(0,0,0,1));
        jtxtNombre.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNombre.setBorder(null);
        getContentPane().add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 198, 260, 30));

        jtxtTelefono.setBackground(new java.awt.Color(0,0,0,1));
        jtxtTelefono.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtxtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jtxtTelefono.setBorder(null);
        getContentPane().add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 264, 260, 30));

        jtxtCosto.setBackground(new java.awt.Color(0,0,0,1));
        jtxtCosto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtxtCosto.setForeground(new java.awt.Color(255, 255, 255));
        jtxtCosto.setBorder(null);
        getContentPane().add(jtxtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 100, 30));

        jtxtBuscarCliente.setBackground(new java.awt.Color(0,0,0,1));
        jtxtBuscarCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtxtBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jtxtBuscarCliente.setBorder(null);
        getContentPane().add(jtxtBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 894, 200, 30));
        getContentPane().add(jtxtFechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 190, 30));
        getContentPane().add(jtxtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 190, 30));

        jbtnLimpiar.setBorder(null);
        jbtnLimpiar.setBorderPainted(false);
        jbtnLimpiar.setContentAreaFilled(false);
        jbtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 110, 30));

        jbtnRegistrar.setBorder(null);
        jbtnRegistrar.setBorderPainted(false);
        jbtnRegistrar.setContentAreaFilled(false);
        jbtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 110, 30));

        jbtnBuscar.setBorder(null);
        jbtnBuscar.setBorderPainted(false);
        jbtnBuscar.setContentAreaFilled(false);
        jbtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 890, 30, 40));

        jtxtDNI.setBackground(new java.awt.Color(0,0,0,1));
        jtxtDNI.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jtxtDNI.setForeground(new java.awt.Color(255, 255, 255));
        jtxtDNI.setBorder(null);
        getContentPane().add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 264, 260, 30));

        jbtnGenerarBoucher.setBorder(null);
        jbtnGenerarBoucher.setBorderPainted(false);
        jbtnGenerarBoucher.setContentAreaFilled(false);
        jbtnGenerarBoucher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbtnGenerarBoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 890, 130, 30));

        jbtnConsultar.setBorder(null);
        jbtnConsultar.setBorderPainted(false);
        jbtnConsultar.setContentAreaFilled(false);
        jbtnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 890, 100, 40));

        jbtnModificar.setBorder(null);
        jbtnModificar.setBorderPainted(false);
        jbtnModificar.setContentAreaFilled(false);
        jbtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 890, 110, 40));

        jbtnEliminar.setBorder(null);
        jbtnEliminar.setBorderPainted(false);
        jbtnEliminar.setContentAreaFilled(false);
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 890, 110, 40));

        jbtnActualizar.setBorder(null);
        jbtnActualizar.setBorderPainted(false);
        jbtnActualizar.setContentAreaFilled(false);
        jbtnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 110, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nombre", "Apellido", "DNI", "Teléfono", "Fecha de inicio", "Fecha final", "Costo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 920, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/RegistroCliente.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 950));

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
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnActualizar;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnConsultar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGenerarBoucher;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtBuscarCliente;
    private javax.swing.JTextField jtxtCosto;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtFechaFinal;
    private javax.swing.JTextField jtxtFechaInicial;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
