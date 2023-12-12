/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import model.Asistente;
import model.Eventos;

/**
 *
 * @author E1504FA-NJ475W
 */
public class ASISTENTES extends javax.swing.JFrame {

    /**
     * Creates new form ASISTENTES
     */
    public ASISTENTES() {
        initComponents();
    }

    public void cleanInputs(){
        nombreField.setText("");
        celularField.setText("");
        edadField.setText("");
        idField.setText("");
        tipoField.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        celularField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edadField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tipoField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        guardarButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(600, 400));
        bg.setMinimumSize(new java.awt.Dimension(600, 400));
        bg.setPreferredSize(new java.awt.Dimension(600, 400));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, -1));

        jLabel2.setText("MENU ASISTENTES");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        bg.add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 200, -1));

        jLabel3.setText("Celular");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        bg.add(celularField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 230, -1));

        jLabel4.setText("Edad");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 30, -1));
        bg.add(edadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 200, -1));

        jLabel5.setText("Tipo");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));
        bg.add(tipoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 230, -1));

        jLabel6.setText("Id");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        bg.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 210, -1));

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });
        bg.add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });
        bg.add(actualizarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });
        bg.add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });
        bg.add(eliminarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        // TODO add your handling code here:
        Asistente asistente = new Asistente(nombreField.getText(), tipoField.getText(), idField.getText(), celularField.getText(), 
                Short.parseShort(edadField.getText()));
        
        cleanInputs();
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        // TODO add your handling code here:
        cleanInputs();
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
        cleanInputs();
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // TODO add your handling code here:
        cleanInputs();
    }//GEN-LAST:event_cancelarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ASISTENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ASISTENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ASISTENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ASISTENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ASISTENTES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarButton;
    private javax.swing.JPanel bg;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField celularField;
    private javax.swing.JTextField edadField;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton guardarButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField tipoField;
    // End of variables declaration//GEN-END:variables
}
