/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt    @Override
    public int getWidth(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getHeight(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ImageProducer getSource() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Graphics getGraphics() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getProperty(String name, ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public int getWidth(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getHeight(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ImageProducer getSource() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Graphics getGraphics() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getProperty(String name, ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 to change this license
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
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import model.Actividades;
import model.Asistente;
import model.Congreso;
import model.EventoAcademico;
import model.Eventos;
import model.EventosCulturales;
import model.SalonesCdC;

/**
 *
 * @author rdavi
 */
public class Aplicacion extends javax.swing.JFrame {
    ArrayList <Eventos> eventos = new ArrayList<>();
    SalonesCdC salon;
    ArrayList<Asistente> asistentes = new ArrayList<>();
    ArrayList<Actividades> actividades = new ArrayList<>();
    
    public Aplicacion() {
        initComponents();
        setLocationRelativeTo(null);//Centrar la posicion del frame en la pantalla
        eventosVentana.setEnabled(false);
        gCertificadoButton.setEnabled(false);
    }
    
    public void cleanInputs(){
        //Ventana de asistentes
        nombreField.setText("");
        celularField.setText("");
        edadField.setText("");
        idField.setText("");
        tipoField.setText("");
        //Ventana de eventos
        nombreEvento.setText("");
        descEvento.setText("");
        valorEvento.setText("");
        capMaxEvento.setText("");
        diaIni.setText("");
        diaFin.setText("");
        mesIni.setText("");
        mesFin.setText("");
        anoIni.setText("");
        //Ventana de actividades
        descActividad.setText("");
        nPersonasActividad.setText("");
    }
    
    public void validInputsEventos(){
        if(nombreEvento.getText().equals("") || descEvento.getText().equals("") || capMaxEvento.getText().equals("") 
                || diaFin.getText().equals("") || diaIni.getText().equals("") || mesFin.getText().equals("")
                || mesIni.getText().equals("") || anoIni.getText().equals("") || valorEvento.getText().equals("")){
            registrarBoton.setEnabled(false);
        }else             
            registrarBoton.setEnabled(true);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salonesFrame = new javax.swing.JFrame();
        bgSalones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        seleccionar2Label = new javax.swing.JLabel();
        seleccionar1Label = new javax.swing.JLabel();
        eventosFrame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        nombreEvento = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        capMaxEvento = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        valorEvento = new javax.swing.JTextField();
        descEvento = new javax.swing.JTextField();
        anadirActividadButton = new javax.swing.JButton();
        registrarBoton = new javax.swing.JButton();
        cerrarEventos = new javax.swing.JButton();
        anadirAsistentesButton = new javax.swing.JButton();
        anoIni = new javax.swing.JTextField();
        diaIni = new javax.swing.JTextField();
        mesIni = new javax.swing.JTextField();
        diaFin = new javax.swing.JTextField();
        mesFin = new javax.swing.JTextField();
        tipoEvento = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        actividadesFrame = new javax.swing.JFrame();
        bgActividades = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        descActividad = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        nPersonasActividad = new javax.swing.JTextField();
        salonSeleccionado = new javax.swing.JLabel();
        cerrarActividad = new javax.swing.JLabel();
        guardarActividad = new javax.swing.JLabel();
        asistentesFrame = new javax.swing.JFrame();
        bg4 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        celularField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        edadField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tipoField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        guardarButton = new javax.swing.JButton();
        cerrarAsistentes = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        eventosVentana = new javax.swing.JButton();
        gCertificadoButton = new javax.swing.JButton();
        salirVentana = new javax.swing.JButton();
        salonButton = new javax.swing.JButton();

        salonesFrame.setUndecorated(true);
        salonesFrame.setSize(new java.awt.Dimension(400, 320));
        salonesFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgSalones.setBackground(new java.awt.Color(255, 255, 255));
        bgSalones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bgSalones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("100");
        bgSalones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 90, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nro. Sillas");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgSalones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nro. Mesas");
        bgSalones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Salon 1:");
        bgSalones.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 70, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Capacidad");
        bgSalones.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 90, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("500");
        bgSalones.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("500");
        bgSalones.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("50");
        bgSalones.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 90, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nro. Sillas");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgSalones.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 90, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nro. Mesas");
        bgSalones.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 90, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Salon 2:");
        bgSalones.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 70, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Capacidad");
        bgSalones.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 90, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("120");
        bgSalones.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 90, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("120");
        bgSalones.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 90, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/salon1.jpg"))); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bgSalones.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 100));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/salon2.jpg"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bgSalones.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 150, 100));

        seleccionar2Label.setBackground(new java.awt.Color(255, 255, 255));
        seleccionar2Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seleccionar2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccionar2Label.setText("Seleccionar");
        seleccionar2Label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        seleccionar2Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionar2Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionar2LabelMouseClicked(evt);
            }
        });
        bgSalones.add(seleccionar2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 90, 30));

        seleccionar1Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seleccionar1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccionar1Label.setText("Seleccionar");
        seleccionar1Label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        seleccionar1Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionar1Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionar1LabelMouseClicked(evt);
            }
        });
        bgSalones.add(seleccionar1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 280, 90, 30));

        salonesFrame.getContentPane().add(bgSalones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 320));

        eventosFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        eventosFrame.setAutoRequestFocus(false);
        eventosFrame.setLocation(new java.awt.Point(0, 0));
        eventosFrame.setLocationByPlatform(true);
        eventosFrame.setUndecorated(true);
        eventosFrame.setSize(new java.awt.Dimension(590, 320));
        eventosFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Nombre");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        nombreEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreEventoKeyReleased(evt);
            }
        });
        jPanel1.add(nombreEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 230, -1));

        jLabel18.setText("Descripcion");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel19.setText("Fecha Inicio");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel20.setText("Fecha final");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 60, -1));

        jLabel21.setText("Capacidad Maxima");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, 20));

        capMaxEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                capMaxEventoKeyReleased(evt);
            }
        });
        jPanel1.add(capMaxEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 140, -1));

        jLabel22.setText("Valor");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        valorEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorEventoActionPerformed(evt);
            }
        });
        valorEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valorEventoKeyReleased(evt);
            }
        });
        jPanel1.add(valorEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 230, -1));

        descEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descEventoKeyReleased(evt);
            }
        });
        jPanel1.add(descEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 230, 60));

        anadirActividadButton.setText("Anadir actividad");
        anadirActividadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActividadButtonActionPerformed(evt);
            }
        });
        jPanel1.add(anadirActividadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 250, -1));

        registrarBoton.setText("Registrar");
        registrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(registrarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        cerrarEventos.setText("Cerrar");
        cerrarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarEventosActionPerformed(evt);
            }
        });
        jPanel1.add(cerrarEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        anadirAsistentesButton.setText("Anadir asistentes");
        anadirAsistentesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirAsistentesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(anadirAsistentesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        anoIni.setForeground(new java.awt.Color(204, 204, 204));
        anoIni.setText("Año");
        anoIni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anoIniMouseClicked(evt);
            }
        });
        anoIni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                anoIniKeyReleased(evt);
            }
        });
        jPanel1.add(anoIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 50, -1));

        diaIni.setForeground(new java.awt.Color(204, 204, 204));
        diaIni.setText("Dia");
        diaIni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diaIniMouseClicked(evt);
            }
        });
        diaIni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diaIniKeyReleased(evt);
            }
        });
        jPanel1.add(diaIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 40, -1));

        mesIni.setForeground(new java.awt.Color(204, 204, 204));
        mesIni.setText("Mes");
        mesIni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesIniMouseClicked(evt);
            }
        });
        mesIni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mesIniKeyReleased(evt);
            }
        });
        jPanel1.add(mesIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 40, -1));

        diaFin.setForeground(new java.awt.Color(204, 204, 204));
        diaFin.setText("Dia");
        diaFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diaFinMouseClicked(evt);
            }
        });
        diaFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diaFinKeyReleased(evt);
            }
        });
        jPanel1.add(diaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 40, -1));

        mesFin.setForeground(new java.awt.Color(204, 204, 204));
        mesFin.setText("Mes");
        mesFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesFinMouseClicked(evt);
            }
        });
        mesFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mesFinKeyReleased(evt);
            }
        });
        jPanel1.add(mesFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 40, -1));

        tipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Academico", "Congreso", "Cultural" }));
        jPanel1.add(tipoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Tipo");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 40, -1));

        eventosFrame.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 320));

        actividadesFrame.setLocationByPlatform(true);
        actividadesFrame.setMaximumSize(new java.awt.Dimension(400, 300));
        actividadesFrame.setMinimumSize(new java.awt.Dimension(400, 135));
        actividadesFrame.setUndecorated(true);
        actividadesFrame.setResizable(false);
        actividadesFrame.setSize(new java.awt.Dimension(400, 135));

        bgActividades.setBackground(new java.awt.Color(255, 255, 255));
        bgActividades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bgActividades.setAlignmentX(500.0F);
        bgActividades.setAlignmentY(400.0F);
        bgActividades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setText("Descripcion");
        bgActividades.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        descActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActividadActionPerformed(evt);
            }
        });
        bgActividades.add(descActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, 60));

        jLabel24.setText("Numero de personas");
        bgActividades.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));
        bgActividades.add(nPersonasActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 110, 30));

        salonSeleccionado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salonSeleccionado.setText("Salon seleccionado para el evento:");
        bgActividades.add(salonSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        cerrarActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarActividad.setText("Cerrar");
        cerrarActividad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cerrarActividad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarActividadMouseClicked(evt);
            }
        });
        bgActividades.add(cerrarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 60, -1));

        guardarActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardarActividad.setText("Guardar");
        guardarActividad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        guardarActividad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarActividadMouseClicked(evt);
            }
        });
        bgActividades.add(guardarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, -1));

        javax.swing.GroupLayout actividadesFrameLayout = new javax.swing.GroupLayout(actividadesFrame.getContentPane());
        actividadesFrame.getContentPane().setLayout(actividadesFrameLayout);
        actividadesFrameLayout.setHorizontalGroup(
            actividadesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgActividades, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        actividadesFrameLayout.setVerticalGroup(
            actividadesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        asistentesFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        asistentesFrame.setLocationByPlatform(true);
        asistentesFrame.setMaximumSize(new java.awt.Dimension(600, 400));
        asistentesFrame.setMinimumSize(new java.awt.Dimension(600, 300));
        asistentesFrame.setUndecorated(true);
        asistentesFrame.setResizable(false);
        asistentesFrame.setSize(new java.awt.Dimension(600, 300));

        bg4.setBackground(new java.awt.Color(255, 255, 255));
        bg4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg4.setMaximumSize(new java.awt.Dimension(600, 400));
        bg4.setMinimumSize(new java.awt.Dimension(600, 400));
        bg4.setPreferredSize(new java.awt.Dimension(600, 400));
        bg4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setText("Nombre");
        bg4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, -1));

        jLabel33.setText("MENU ASISTENTES");
        bg4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));
        bg4.add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 200, -1));

        jLabel34.setText("Celular");
        bg4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        bg4.add(celularField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 230, -1));

        jLabel35.setText("Edad");
        bg4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 30, -1));
        bg4.add(edadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 200, -1));

        jLabel36.setText("Tipo");
        bg4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));
        bg4.add(tipoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 230, -1));

        jLabel37.setText("Id");
        bg4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        bg4.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 210, -1));

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });
        bg4.add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        cerrarAsistentes.setText("Cerrar");
        cerrarAsistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarAsistentesActionPerformed(evt);
            }
        });
        bg4.add(cerrarAsistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        javax.swing.GroupLayout asistentesFrameLayout = new javax.swing.GroupLayout(asistentesFrame.getContentPane());
        asistentesFrame.getContentPane().setLayout(asistentesFrameLayout);
        asistentesFrameLayout.setHorizontalGroup(
            asistentesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        asistentesFrameLayout.setVerticalGroup(
            asistentesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Centro de Convenciones");
        setAutoRequestFocus(false);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eventosVentana.setText("EVENTOS");
        eventosVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosVentanaActionPerformed(evt);
            }
        });
        bg.add(eventosVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

        gCertificadoButton.setText("GENERAR CERTIFICADO");
        gCertificadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gCertificadoButtonActionPerformed(evt);
            }
        });
        bg.add(gCertificadoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 160, -1));

        salirVentana.setText("SALIR");
        salirVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirVentanaActionPerformed(evt);
            }
        });
        bg.add(salirVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        salonButton.setText("ELEGIR SALON");
        salonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salonButtonActionPerformed(evt);
            }
        });
        bg.add(salonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventosVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosVentanaActionPerformed
        // TODO add your handling code here:
        if(salon==null){
            JOptionPane.showMessageDialog(null, "Debe existir un salon para poder registrar un evento.");
        }else{
            eventosFrame.setVisible(true);
            eventosFrame.setLocationRelativeTo(null);
            gCertificadoButton.setEnabled(true);
        }
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
            }catch(MalformedURLException ex){
            }catch(FileNotFoundException ex){
            }
        
    }//GEN-LAST:event_gCertificadoButtonActionPerformed

    private void salonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salonButtonActionPerformed
        // TODO add your handling code here:
        salonesFrame.setVisible(true);
        salonesFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_salonButtonActionPerformed

    private void seleccionar1LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionar1LabelMouseClicked
        // TODO add your handling code here:
        salon = new SalonesCdC("salon 1",false, 500, 500, 100, null);
        salonesFrame.setVisible(false);
        eventosVentana.setEnabled(true);
    }//GEN-LAST:event_seleccionar1LabelMouseClicked

    private void seleccionar2LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionar2LabelMouseClicked
        // TODO add your handling code here:
        salon = new SalonesCdC("salon 2",false, 100, 100, 50, null);
        salonesFrame.setVisible(false);
        eventosVentana.setEnabled(true);
    }//GEN-LAST:event_seleccionar2LabelMouseClicked

    private void valorEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorEventoActionPerformed

    private void anadirActividadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActividadButtonActionPerformed
        // TODO add your handling code here:
        actividadesFrame.setVisible(true);
        actividadesFrame.setLocationRelativeTo(null);
        salonSeleccionado.setText(salonSeleccionado.getText()+" "+salon.getNombre());
    }//GEN-LAST:event_anadirActividadButtonActionPerformed

    private void anadirAsistentesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirAsistentesButtonActionPerformed
        // TODO add your handling code here:
        //Ver ventana de Asistentes
        asistentesFrame.setVisible(true);
        asistentesFrame.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_anadirAsistentesButtonActionPerformed

    private void descActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descActividadActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        // TODO add your handling code here:
        asistentes.add(new Asistente(nombreField.getText(), tipoField.getText(), idField.getText(),
                celularField.getText(), Short.parseShort(edadField.getText())));
        System.out.println(asistentes.isEmpty());
        nombreField.setText(""); tipoField.setText(""); idField.setText("");
        celularField.setText(""); edadField.setText("");
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void cerrarAsistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarAsistentesActionPerformed
        // TODO add your handling code here:
        asistentesFrame.setVisible(false);
        nombreField.setText(""); tipoField.setText(""); idField.setText("");
        celularField.setText(""); edadField.setText("");
    }//GEN-LAST:event_cerrarAsistentesActionPerformed

    private void cerrarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarEventosActionPerformed
        // TODO add your handling code here:
        cleanInputs();
        
        actividades = null;
        eventosFrame.setVisible(false);
    }//GEN-LAST:event_cerrarEventosActionPerformed

    private void registrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBotonActionPerformed
        // TODO add your handling code here:
        String nombre = nombreEvento.getText();
        String descripcion = descEvento.getText();
        int diaInicio = Integer.parseInt(this.diaIni.getText()), mesInicio = Integer.parseInt(this.mesIni.getText()),
                anio = Integer.parseInt(this.anoIni.getText()), diaFinal = Integer.parseInt(this.diaFin.getText()),
                mesFinal = Integer.parseInt(this.mesFin.getText());
        LocalDate fechaInicio = LocalDate.of(anio, mesInicio, diaInicio);
        LocalDate fechaFin = LocalDate.of(anio, mesFinal, diaFinal);
        short capMax = Short.parseShort(capMaxEvento.getText());
        long valor = Long.parseLong(valorEvento.getText());
        switch(tipoEvento.getItemAt(tipoEvento.getSelectedIndex())){
            case "Academico"->eventos.add(new EventoAcademico(nombre, descripcion, fechaInicio, fechaFin, capMax, valor, actividades, asistentes));
            case "Congreso"->eventos.add(new Congreso(nombre, descripcion, fechaInicio, fechaFin, capMax, valor, actividades, asistentes));
            case "Cultural"->eventos.add(new EventosCulturales(nombre, descripcion, fechaInicio, fechaFin, capMax, valor, actividades, asistentes));
        }
        
    }//GEN-LAST:event_registrarBotonActionPerformed

    private void diaIniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaIniMouseClicked
        // TODO add your handling code here:
        diaIni.setText("");
        diaIni.setForeground(Color.BLACK);
    }//GEN-LAST:event_diaIniMouseClicked

    private void guardarActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarActividadMouseClicked
        // TODO add your handling code here:
        String descripcion = descActividad.getText();
        int nroPersonas = Integer.parseInt(nPersonasActividad.getText());
        actividades.add(new Actividades(descripcion, nroPersonas, asistentes, salon));
        descActividad.setText("");
        nPersonasActividad.setText("");
    }//GEN-LAST:event_guardarActividadMouseClicked

    private void cerrarActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarActividadMouseClicked
        // TODO add your handling code here:
        actividadesFrame.setVisible(false);
        descActividad.setText("");
        nPersonasActividad.setText("");
    }//GEN-LAST:event_cerrarActividadMouseClicked

    private void mesIniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesIniMouseClicked
        // TODO add your handling code here:
        mesIni.setText("");
        mesIni.setForeground(Color.BLACK);
    }//GEN-LAST:event_mesIniMouseClicked

    private void anoIniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anoIniMouseClicked
        // TODO add your handling code here:
        anoIni.setText("");
        anoIni.setForeground(Color.BLACK);
    }//GEN-LAST:event_anoIniMouseClicked

    private void diaFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaFinMouseClicked
        // TODO add your handling code here:
        diaFin.setText("");
        diaFin.setForeground(Color.BLACK);
    }//GEN-LAST:event_diaFinMouseClicked

    private void mesFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesFinMouseClicked
        // TODO add your handling code here:
        mesFin.setText("");
        mesFin.setForeground(Color.BLACK);
    }//GEN-LAST:event_mesFinMouseClicked

    private void nombreEventoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreEventoKeyReleased
        // TODO add your handling code here:
        validInputsEventos();
    }//GEN-LAST:event_nombreEventoKeyReleased

    private void diaIniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diaIniKeyReleased
        // TODO add your handling code here:
        validInputsEventos();
    }//GEN-LAST:event_diaIniKeyReleased

    private void mesIniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesIniKeyReleased
        // TODO add your handling code here:
        validInputsEventos();
    }//GEN-LAST:event_mesIniKeyReleased

    private void anoIniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anoIniKeyReleased
        // TODO add your handling code here:
        validInputsEventos();
    }//GEN-LAST:event_anoIniKeyReleased

    private void diaFinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diaFinKeyReleased
        // TODO add your handling code here:
        validInputsEventos();
    }//GEN-LAST:event_diaFinKeyReleased

    private void mesFinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesFinKeyReleased
        // TODO add your handling code here:
        validInputsEventos();
    }//GEN-LAST:event_mesFinKeyReleased

    private void capMaxEventoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capMaxEventoKeyReleased
        // TODO add your handling code here:
        validInputsEventos();
    }//GEN-LAST:event_capMaxEventoKeyReleased

    private void descEventoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descEventoKeyReleased
        // TODO add your handling code here:
        validInputsEventos();
    }//GEN-LAST:event_descEventoKeyReleased

    private void valorEventoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorEventoKeyReleased
        // TODO add your handling code here:
        validInputsEventos();
    }//GEN-LAST:event_valorEventoKeyReleased
    
    public void generarCertificado(String id) throws MalformedURLException, FileNotFoundException{
        String nombreAsistente = "";
        String tipoAsistente = "";
        boolean existeId = false;
        //Evaluacion para cada objeto almacenado en el arraylist eventos y cada objeto en el arraylist asistentes
        for (Asistente asistente: asistentes){
                if(asistente.getId().equals(id)){
                    nombreAsistente = asistente.getNombre();
                    tipoAsistente = asistente.getTipo();
                    existeId = true;
                }
        }
        if(!existeId){
            System.out.println("No encontrado");
            return;
        }
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
        String certificadoP1 = "La presente certifica que "+nombreAsistente+" participó como "+tipoAsistente+" en "+eventos.getLast().getNombre();
        Paragraph p1 = new Paragraph(certificadoP1);
        
        //creacion de firmas
        Image firma = new Image(ImageDataFactory.create("imgs/firmac.png"));
        firma.scaleAbsolute(110, 76);
        document.add(p1);
        document.setTextAlignment(TextAlignment.JUSTIFIED_ALL);
        document.setFontSize(8);
        document.add(firma);
        document.close();
    }
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
    private javax.swing.JFrame actividadesFrame;
    private javax.swing.JButton anadirActividadButton;
    private javax.swing.JButton anadirAsistentesButton;
    private javax.swing.JTextField anoIni;
    private javax.swing.JFrame asistentesFrame;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg4;
    private javax.swing.JPanel bgActividades;
    private javax.swing.JPanel bgSalones;
    private javax.swing.JTextField capMaxEvento;
    private javax.swing.JTextField celularField;
    private javax.swing.JLabel cerrarActividad;
    private javax.swing.JButton cerrarAsistentes;
    private javax.swing.JButton cerrarEventos;
    private javax.swing.JTextField descActividad;
    private javax.swing.JTextField descEvento;
    private javax.swing.JTextField diaFin;
    private javax.swing.JTextField diaIni;
    private javax.swing.JTextField edadField;
    private javax.swing.JFrame eventosFrame;
    private javax.swing.JButton eventosVentana;
    private javax.swing.JButton gCertificadoButton;
    private javax.swing.JLabel guardarActividad;
    private javax.swing.JButton guardarButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mesFin;
    private javax.swing.JTextField mesIni;
    private javax.swing.JTextField nPersonasActividad;
    private javax.swing.JTextField nombreEvento;
    private javax.swing.JTextField nombreField;
    private javax.swing.JButton registrarBoton;
    private javax.swing.JButton salirVentana;
    private javax.swing.JButton salonButton;
    private javax.swing.JLabel salonSeleccionado;
    private javax.swing.JFrame salonesFrame;
    private javax.swing.JLabel seleccionar1Label;
    private javax.swing.JLabel seleccionar2Label;
    private javax.swing.JComboBox<String> tipoEvento;
    private javax.swing.JTextField tipoField;
    private javax.swing.JTextField valorEvento;
    // End of variables declaration//GEN-END:variables
}
