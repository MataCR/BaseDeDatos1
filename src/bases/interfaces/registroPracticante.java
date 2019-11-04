/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.interfaces;

import bases.conexion.Correo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisg
 */

public class registroPracticante extends javax.swing.JFrame {
    private void loadcomboPeriodo(){
        periodoCombo.removeAllItems();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select id_periodo from periodo where cedula_encargado = " + encargadoCombo.getSelectedItem());
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                periodoCombo.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void loadcombo(){
        encargadoCombo.removeAllItems();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select cedula from profesor where id_tipo = 3");
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                encargadoCombo.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void loadcomboAsesor(){
        asesorCombo.removeAllItems();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select cedula from profesor where id_tipo = 1");
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                asesorCombo.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void loadcomboSupervisor(){
        supervisorCombo.removeAllItems();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select cedula from supervisor");
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                supervisorCombo.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void loadcomboProvincia(){
        provinciaCombo.removeAllItems();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select id_provincia from provincia");
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                provinciaCombo.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void loadcomboCanton(){
        cantonCombo.removeAllItems();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select id_canton from canton where id_provincia = " + provinciaCombo.getSelectedItem().toString());
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                cantonCombo.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void loadcomboDistrito(){
        try{
            distritoCombo.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select id_distrito from distrito where id_canton = " + cantonCombo.getSelectedItem().toString());
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                distritoCombo.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * Creates new form registroPracticante
     */
    public registroPracticante() {
        initComponents();
        loadcombo();
        loadcomboProvincia();
        loadcomboAsesor();
        loadcomboSupervisor();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        provinciaCombo = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        cantonCombo = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        distritoCombo = new javax.swing.JComboBox<>();
        telefonotxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDireccion = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        cedulatxt = new javax.swing.JTextField();
        carnettxt = new javax.swing.JTextField();
        primerNombretxt = new javax.swing.JTextField();
        segundoNombretxt = new javax.swing.JTextField();
        primerApellidotxt = new javax.swing.JTextField();
        segundoApellidotxt = new javax.swing.JTextField();
        birthdate = new org.netbeans.modules.form.InvalidComponent();
        correotxt = new javax.swing.JTextField();
        supervisorCombo = new javax.swing.JComboBox<>();
        asesorCombo = new javax.swing.JComboBox<>();
        encargadoCombo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        supervisorTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        asesorTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        encargadoTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        periodoCombo = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro Practicante");

        jLabel2.setText("Cedula");

        jLabel3.setText("Carnet");

        jLabel4.setText("Primer Nombre");

        jLabel5.setText("Segundo Apelldio");

        jLabel6.setText("Segundo Nombre");

        jLabel7.setText("Primer Apellido");

        jLabel8.setText("Fecha de nacimiento");

        jLabel9.setText("Telefono");

        jLabel10.setText("Correo");

        jLabel11.setText("Provincia");

        jLabel12.setText("Canton");

        jLabel13.setText("Distrito");

        jLabel14.setText("Supervisor");

        jLabel15.setText("Asesor");

        jLabel16.setText("Profesor Encargado");

        provinciaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        provinciaCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                provinciaComboMouseClicked(evt);
            }
        });

        jButton5.setText("Seleccionar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cantonCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton8.setText("Seleccionar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        distritoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        telefonotxt.setText("jTextField3");

        tablaDireccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id_provinvia", "Provincia"
            }
        ));
        jScrollPane1.setViewportView(tablaDireccion);

        jButton1.setText("Mostrar provincias");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("Mostrar cantones");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Mostrar distritos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        cedulatxt.setText("jTextField1");

        carnettxt.setText("jTextField2");

        primerNombretxt.setText("jTextField3");

        segundoNombretxt.setText("jTextField4");

        primerApellidotxt.setText("jTextField5");

        segundoApellidotxt.setText("jTextField6");

        correotxt.setText("jTextField7");

        supervisorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        asesorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        encargadoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        encargadoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encargadoComboActionPerformed(evt);
            }
        });

        supervisorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cedula", "Primer Nombre", "Primer Apellido", "Empresa"
            }
        ));
        jScrollPane2.setViewportView(supervisorTable);

        jButton2.setText("Mostrar supervisores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        asesorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cedula", "Primer Nombre", "Primer Apellido", "Detalle"
            }
        ));
        jScrollPane3.setViewportView(asesorTable);

        jButton3.setText("Mostrar Asesores");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        encargadoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cedula", "Primer Nombre", "Primer Apellido", "Detalle"
            }
        ));
        jScrollPane4.setViewportView(encargadoTable);

        jButton4.setText("Mostrar Encargados");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton9.setText("Registrar Practicante");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel17.setText("Periodo");

        periodoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton10.setText("Seleccionar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel17))
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(segundoApellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primerApellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segundoNombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primerNombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carnettxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cedulatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(distritoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supervisorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asesorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(provinciaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cantonCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8))
                            .addComponent(correotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(encargadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10))
                            .addComponent(periodoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton9)
                        .addGap(126, 126, 126)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(171, 171, 171)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jButton2)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(159, 159, 159)))))
                .addGap(361, 361, 361))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cedulatxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carnettxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(primerNombretxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(segundoNombretxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(primerApellidotxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(segundoApellidotxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(correotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(provinciaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cantonCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(distritoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(supervisorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(asesorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(encargadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(periodoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton6)
                                    .addComponent(jButton7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void provinciaComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provinciaComboMouseClicked
        //        // TODO add your handling code here:
        //        cantonCombo.removeAllItems();
        //        try{
            //            Class.forName("com.mysql.jdbc.Driver");
            //            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            //  //          PreparedStatement id = conn.prepareStatement("Select id_provincia from provincia where nombre_provincia = " + provinciaCombo.getSelectedItem().toString());
            //  //          ResultSet rsid=id.executeQuery();
            //            PreparedStatement pstnt=conn.prepareStatement("Select nombre_canton,id_canton from canton where id_provincia = " + provinciaCombo.getSelectedItem().toString());
            //            ResultSet rs=pstnt.executeQuery();
            //            while(rs.next()){
                //                cantonCombo.addItem(rs.getString(1));
                //            }
            //            conn.close();
            //        }
        //        catch (Exception e){
            //            System.out.println(e.getMessage());
            //        }
    }//GEN-LAST:event_provinciaComboMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        loadcomboCanton();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        loadcomboDistrito();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select * from provincia");
            ResultSet rs=pstnt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)tablaDireccion.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[]= {rs.getInt("id_provincia"),rs.getString("nombre_provincia")};
                tm.addRow(o);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select id_canton,nombre_canton from canton where id_provincia = " + provinciaCombo.getSelectedItem().toString());
            ResultSet rs=pstnt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)tablaDireccion.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[]= {rs.getInt("id_canton"),rs.getString("nombre_canton")};
                tm.addRow(o);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select id_distrito , nombre_distrito from distrito where id_canton = " + cantonCombo.getSelectedItem().toString());
            ResultSet rs=pstnt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)tablaDireccion.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[]= {rs.getInt("id_distrito"),rs.getString("nombre_distrito")};
                tm.addRow(o);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void encargadoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encargadoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encargadoComboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select cedula,primerNombre,primerApellido,empresa.nombre_empresa from supervisor,empresa where empresa.cedula_juridica = supervisor.cedula_juridica");
            ResultSet rs=pstnt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)supervisorTable.getModel();
            tm.setRowCount(0);
            while (rs.next()){
                Object o[]= {rs.getInt("cedula"),rs.getString("primerNombre"),rs.getString("primerApellido"),rs.getString("empresa.nombre_empresa")};
                tm.addRow(o);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select primerNombre,primer_Apellido,tipo_profesor.detalle_profesor, cedula from profesor,tipo_profesor where profesor.id_tipo = 1 and tipo_profesor.id_tipo = 1");
            ResultSet rs=pstnt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)asesorTable.getModel();
            tm.setRowCount(0);
            while (rs.next()){
                Object o[]= {rs.getInt("cedula"),rs.getString("primerNombre"),rs.getString("primer_Apellido"),rs.getString("tipo_profesor.detalle_profesor")};
                tm.addRow(o);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select primerNombre,primer_Apellido,tipo_profesor.detalle_profesor, cedula from profesor,tipo_profesor where profesor.id_tipo = 3 and tipo_profesor.id_tipo = 3");
            ResultSet rs=pstnt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)encargadoTable.getModel();
            tm.setRowCount(0);
            while (rs.next()){
                Object o[]= {rs.getInt("cedula"),rs.getString("primerNombre"),rs.getString("primer_Apellido"),rs.getString("tipo_profesor.detalle_profesor")};
                tm.addRow(o);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt = conn.prepareStatement("Insert into practicante values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstnt.setInt(1,Integer.parseInt(cedulatxt.getText()));
            pstnt.setInt(2,Integer.parseInt(carnettxt.getText()));
            pstnt.setString(3, primerNombretxt.getText());
            pstnt.setString(4, segundoNombretxt.getText());
            pstnt.setString(5, primerApellidotxt.getText());
            pstnt.setString(6, segundoApellidotxt.getText());
            pstnt.setString(7, birthdate.getDate().toString());
            pstnt.setInt(8, Integer.parseInt(telefonotxt.getText()));
            pstnt.setString(9, correotxt.getText());
            int value = Integer.parseInt(provinciaCombo.getSelectedItem().toString());
            pstnt.setInt(10, value);
            int value2 = Integer.parseInt(cantonCombo.getSelectedItem().toString());
            pstnt.setInt(11, value2);
            int value3 = Integer.parseInt(distritoCombo.getSelectedItem().toString());
            pstnt.setInt(12, value3);
            int value4 = Integer.parseInt(supervisorCombo.getSelectedItem().toString());
            pstnt.setInt(13, value4);
            int value5 = Integer.parseInt(asesorCombo.getSelectedItem().toString());
            pstnt.setInt(14, value5);
            int value6 = Integer.parseInt(encargadoCombo.getSelectedItem().toString());
            pstnt.setInt(15, value6);
            int value7 = Integer.parseInt(periodoCombo.getSelectedItem().toString());
            pstnt.setInt(16, value7);
            pstnt.executeUpdate();
            Correo.enviarCorreo(correotxt.getText());
            JOptionPane.showMessageDialog(null,"Sirvio");
            conn.close();
        }catch(Exception e){
                System.out.println(e.getMessage());
                }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        loadcomboPeriodo();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(registroPracticante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroPracticante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroPracticante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroPracticante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroPracticante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asesorCombo;
    private javax.swing.JTable asesorTable;
    private org.netbeans.modules.form.InvalidComponent birthdate;
    private javax.swing.JComboBox<String> cantonCombo;
    private javax.swing.JTextField carnettxt;
    private javax.swing.JTextField cedulatxt;
    private javax.swing.JTextField correotxt;
    private javax.swing.JComboBox<String> distritoCombo;
    private javax.swing.JComboBox<String> encargadoCombo;
    private javax.swing.JTable encargadoTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> periodoCombo;
    private javax.swing.JTextField primerApellidotxt;
    private javax.swing.JTextField primerNombretxt;
    private javax.swing.JComboBox<String> provinciaCombo;
    private javax.swing.JTextField segundoApellidotxt;
    private javax.swing.JTextField segundoNombretxt;
    private javax.swing.JComboBox<String> supervisorCombo;
    private javax.swing.JTable supervisorTable;
    private javax.swing.JTable tablaDireccion;
    private javax.swing.JTextField telefonotxt;
    // End of variables declaration//GEN-END:variables
}
