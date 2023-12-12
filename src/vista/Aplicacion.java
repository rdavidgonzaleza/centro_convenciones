/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.TextAlignment;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import javax.swing.JOptionPane;
import model.Asistente;
import model.Eventos;

/**
 *
 * @author rdavi
 */
public class Aplicacion extends javax.swing.JFrame {
    Asistente[] asistentes = new Asistente[10];
    public Aplicacion() {
        initComponents();
        setLocation(200, 100);
    }
    
    public void generarCertificado(String id) throws MalformedURLException, FileNotFoundException{
        short edad =  18;
        asistentes[0] = new Asistente("Alex Karev", "Ponente", id, "324", edad);

        String nombreAsistente = "";
        String tipoAsistente = "";
        boolean existeId = false;
        //Evaluacion para cada objeto almacenado en el vector asistente 
        for (Asistente asistente : asistentes) {
            if(asistente.getId().equals(id)){
                nombreAsistente = asistente.getNombre();
                tipoAsistente = asistente.getTipo();
                existeId = true;
                break;
            }
        }
        if(!existeId)
            return;
        
        //generacion del pdf
        String filename = id;
        String pathPdf = "certificados/"+filename+".pdf";
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(pathPdf));
        pdfDoc.setDefaultPageSize(new PageSize(400f,250f));
        Document document = new Document(pdfDoc);
        
        //creacion de imagen de fondo del pdf y agregacion al pdf
        Image bgImage = new Image(ImageDataFactory.create("imgs/imgbackg.png"));
        bgImage.scaleAbsolute(400f, 250f);
        bgImage.setFixedPosition(0, 0);
        document.add(bgImage);
        
        //creacion y agregacion de parrafo
        String certificadoP1 = "La presente certifica que "+nombreAsistente+" participó como "+tipoAsistente+" en ";
        Paragraph p1 = new Paragraph(certificadoP1);
        
        //creacion de firmas
        Image firma = new Image(ImageDataFactory.create("imgs/firmac.png"));
        firma.scaleAbsolute(110, 76);
        document.add(p1);
        document.setTextAlignment(TextAlignment.JUSTIFIED_ALL);
        document.setFontSize(10);
        document.add(firma);
        document.close();
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
        eventosVentana = new javax.swing.JButton();
        gCertificadoButton = new javax.swing.JButton();
        salirVentana = new javax.swing.JButton();
        salonButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Centro de Convenciones");
        setAutoRequestFocus(false);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eventosVentana.setText("EVENTOS");
        eventosVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosVentanaActionPerformed(evt);
            }
        });
        bg.add(eventosVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        gCertificadoButton.setText("GENERAR CERTIFICADO");
        gCertificadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gCertificadoButtonActionPerformed(evt);
            }
        });
        bg.add(gCertificadoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 160, -1));

        salirVentana.setText("SALIR");
        salirVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirVentanaActionPerformed(evt);
            }
        });
        bg.add(salirVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        salonButton.setText("REGISTRAR SALON");
        salonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salonButtonActionPerformed(evt);
            }
        });
        bg.add(salonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestor de eventos");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 50));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventosVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosVentanaActionPerformed
        // TODO add your handling code here:
        new EVENTOS().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_eventosVentanaActionPerformed

    private void salirVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirVentanaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirVentanaActionPerformed

    private void gCertificadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gCertificadoButtonActionPerformed
        // TODO add your handling code here:
        try{
            String id = JOptionPane.showInputDialog("Ingrese id: ");
            generarCertificado(id);
        }catch(MalformedURLException murlex){
        }catch(FileNotFoundException fnfex){
        }
    }//GEN-LAST:event_gCertificadoButtonActionPerformed

    private void salonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salonButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_salonButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton eventosVentana;
    private javax.swing.JButton gCertificadoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton salirVentana;
    private javax.swing.JButton salonButton;
    // End of variables declaration//GEN-END:variables
}
