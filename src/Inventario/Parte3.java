/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Estrella
 */
public class Parte3 extends javax.swing.JFrame {

    /**
     * Creates new form Parte3
     */
    public Parte3() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage(){
        Image retValue =Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
        return retValue;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresarparte1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        crearfactura = new javax.swing.JButton();
        catalogo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(670, 640));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(670, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresarparte1.setBackground(new java.awt.Color(0, 0, 0));
        regresarparte1.setForeground(new java.awt.Color(255, 255, 255));
        regresarparte1.setText("REGRESAR");
        regresarparte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarparte1ActionPerformed(evt);
            }
        });
        getContentPane().add(regresarparte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, -1, -1));

        crearfactura.setBackground(new java.awt.Color(0, 0, 0));
        crearfactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        crearfactura.setForeground(new java.awt.Color(255, 255, 255));
        crearfactura.setText("CREAR FACTURA ");
        crearfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(crearfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 170, -1));

        catalogo.setBackground(new java.awt.Color(0, 0, 0));
        catalogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        catalogo.setForeground(new java.awt.Color(255, 255, 255));
        catalogo.setText("CATALOGO");
        catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogoActionPerformed(evt);
            }
        });
        getContentPane().add(catalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pescando.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(670, 640));
        jLabel1.setPreferredSize(new java.awt.Dimension(670, 640));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 730, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void regresarparte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarparte1ActionPerformed
       Parte1 CPP=new Parte1();
       CPP.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_regresarparte1ActionPerformed

    private void crearfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearfacturaActionPerformed
       Facturas CPF=new Facturas();
       CPF.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_crearfacturaActionPerformed

    private void catalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogoActionPerformed
        Catalago Cat=new Catalago();
        Cat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_catalogoActionPerformed

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
            java.util.logging.Logger.getLogger(Parte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parte3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton catalogo;
    private javax.swing.JButton crearfactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton regresarparte1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
