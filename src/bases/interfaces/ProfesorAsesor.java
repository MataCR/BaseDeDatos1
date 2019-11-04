/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mata
 */
public class ProfesorAsesor extends javax.swing.JFrame {
    
    private void tablaPeriodo(){
                        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
        PreparedStatement pstnt=conn.prepareStatement("SELECT id_periodo,numero_semestre, año\n" +
"FROM periodo");
        ResultSet rs=pstnt.executeQuery();
        DefaultTableModel tm=(DefaultTableModel)tablePeriodo.getModel();
        tm.setRowCount(0);
        
        while (rs.next()){
            Object o[]= {rs.getInt("id_periodo"),rs.getString("numero_semestre"),rs.getString("año")};
            tm.addRow(o);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        } 
    }
    private void loadcombo(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select cedula from profesor WHERE id_tipo=3");
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                comboBoxPA.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void loadcombo2(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select id_periodo from periodo");
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                comboBoxPeriodo.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    } 
    
    private void loadcomboEntregables(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("SELECT id_entregable from entrega WHERE entrega.cedula_practicante ="+comboBoxPracticantes1.getSelectedItem());
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                comboEntregable.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }     
    private void loadcomboPeriodo2(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select id_periodo from periodo");
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                comboBoxPeriodo3.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }    
    private void loadcomboPracticantes(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select practicante.cedula from practicante JOIN practica on practicante.cedula=practica.cedula_practicante where practica.id_periodo ="+comboBoxPeriodo3.getSelectedItem()+"  AND practica.idProfesorAsesor="+comboBoxPA.getSelectedItem());
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                comboBoxPracticantes1.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }   
    private void loadcomboPracticantes2(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select practicante.cedula from practicante JOIN practica on practicante.cedula=practica.cedula_practicante where practica.id_periodo ="+comboBoxPeriodo3.getSelectedItem()+"  AND practica.idProfesorAsesor="+comboBoxPA.getSelectedItem());
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                comboBoxPracticantes2.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }     
    
    public ProfesorAsesor() {
        initComponents();
        loadcombo();
        loadcombo2();
        loadcomboPeriodo2();
        tablaPeriodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label3 = new java.awt.Label();
        label1 = new java.awt.Label();
        comboBoxPA = new javax.swing.JComboBox<>();
        btnConsultarEvaluaciones = new javax.swing.JButton();
        comboBoxPeriodo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEvaluaciones = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePeriodo = new javax.swing.JTable();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        txtFecha = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        txtNotaSupervisor = new javax.swing.JTextField();
        txtNotaAsesor = new javax.swing.JTextField();
        label9 = new java.awt.Label();
        txtComentarios = new javax.swing.JTextField();
        label10 = new java.awt.Label();
        txtCedulaSupervisor = new javax.swing.JTextField();
        comboBoxEntregasDisp = new javax.swing.JComboBox<>();
        btnIndicar = new javax.swing.JButton();
        btnAsignarNota = new javax.swing.JButton();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        comboEntregable = new javax.swing.JComboBox<>();
        btnVerPracticantes = new javax.swing.JButton();
        comboBoxPracticantes1 = new javax.swing.JComboBox<>();
        btnEntregas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEntregas = new javax.swing.JTable();
        comboBoxPeriodo3 = new javax.swing.JComboBox<>();
        label14 = new java.awt.Label();
        btnVerEntregables = new javax.swing.JButton();
        label15 = new java.awt.Label();
        label16 = new java.awt.Label();
        comboBoxPracticantes2 = new javax.swing.JComboBox<>();
        label17 = new java.awt.Label();
        btnVerPracticantes2 = new javax.swing.JButton();
        label8 = new java.awt.Label();
        txthoraFinalReunion = new javax.swing.JTextField();
        label18 = new java.awt.Label();
        label19 = new java.awt.Label();
        txtTemaR = new javax.swing.JTextField();
        txtLugarR = new javax.swing.JTextField();
        label20 = new java.awt.Label();
        label21 = new java.awt.Label();
        label22 = new java.awt.Label();
        txtAgendaR = new javax.swing.JTextField();
        txtFechaReunion = new javax.swing.JTextField();
        txthoraInicialReunion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        label23 = new java.awt.Label();
        btnVerMinutas = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableMinutas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label3.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        label3.setText("Profesor Asesor");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("Profesor:");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        getContentPane().add(comboBoxPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 130, 30));

        btnConsultarEvaluaciones.setText("Consultar Evaluaciones");
        btnConsultarEvaluaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEvaluacionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarEvaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, 30));

        getContentPane().add(comboBoxPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 80, 30));

        tableEvaluaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Encargado", "Porcentaje", "Descripción", "Fecha de entrega"
            }
        ));
        jScrollPane1.setViewportView(tableEvaluaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 500, 370));

        tablePeriodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Semestre", "Año"
            }
        ));
        jScrollPane2.setViewportView(tablePeriodo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 210, 100));

        label2.setText("Periodos");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        label4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label4.setText("Consultar Entregable");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 50, -1, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 150, 30));

        label5.setText("Hora final:");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 790, -1, -1));

        label6.setText("comentarios");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, -1, -1));

        label7.setText("Entregas disponibles");
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, -1, -1));
        getContentPane().add(txtNotaSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 150, 30));
        getContentPane().add(txtNotaAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 150, 40));

        label9.setText("Nota del supervisor");
        getContentPane().add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));
        getContentPane().add(txtComentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 180, 30));

        label10.setText("Cedula del supervisor");
        getContentPane().add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, -1, 20));
        getContentPane().add(txtCedulaSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 180, 30));

        getContentPane().add(comboBoxEntregasDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 120, 30));

        btnIndicar.setText("Indicar Periodo");
        btnIndicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        btnAsignarNota.setText("Asignar Nota");
        btnAsignarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarNotaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsignarNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 120, 50));

        label11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label11.setText("Ver minutas");
        getContentPane().add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 570, -1, -1));

        label12.setText("Practicantes a cargo:");
        getContentPane().add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 130, -1));

        label13.setText("Entregables: ");
        getContentPane().add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 220, 80, -1));

        getContentPane().add(comboEntregable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 220, 110, -1));

        btnVerPracticantes.setText("Ver practicantes a cargo");
        btnVerPracticantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPracticantesActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerPracticantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 140, -1, -1));

        getContentPane().add(comboBoxPracticantes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 140, 110, -1));

        btnEntregas.setText("Ver entregas");
        btnEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregasActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntregas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 260, 110, 30));

        tablaEntregas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cedula", "Tipo", "Fecha Entrega", "Archivo"
            }
        ));
        jScrollPane3.setViewportView(tablaEntregas);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 330, 440, 330));

        getContentPane().add(comboBoxPeriodo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 180, 110, -1));

        label14.setText("Periodo: ");
        getContentPane().add(label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 180, 50, -1));

        btnVerEntregables.setText("Ver Entregables");
        btnVerEntregables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEntregablesActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerEntregables, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 210, 120, 30));

        label15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label15.setText("Asignar Nota");
        getContentPane().add(label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        label16.setText("Nota del asesor");
        getContentPane().add(label16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        getContentPane().add(comboBoxPracticantes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 110, 20));

        label17.setText("Practicantes a cargo:");
        getContentPane().add(label17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 140, 130, -1));

        btnVerPracticantes2.setText("Ver participantes");
        btnVerPracticantes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPracticantes2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerPracticantes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, -1, -1));

        label8.setText("Fecha(y-m-d)");
        getContentPane().add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));
        getContentPane().add(txthoraFinalReunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 780, 140, 30));

        label18.setText("Fecha(y-m-d)");
        getContentPane().add(label18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, -1, -1));

        label19.setText("Lugar");
        getContentPane().add(label19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 780, -1, -1));
        getContentPane().add(txtTemaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, 170, 30));
        getContentPane().add(txtLugarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 770, 170, 30));

        label20.setText("Hora inicial:");
        getContentPane().add(label20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, -1, -1));

        label21.setText("Tema:");
        getContentPane().add(label21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 680, -1, -1));

        label22.setText("Agenda: ");
        getContentPane().add(label22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 720, -1, -1));
        getContentPane().add(txtAgendaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 720, 170, 30));
        getContentPane().add(txtFechaReunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 680, 140, 30));
        getContentPane().add(txthoraInicialReunion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 730, 140, 20));

        jButton1.setText("Solicitar reunion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 830, 150, 40));

        label23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label23.setText("Solicitar reunion");
        getContentPane().add(label23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, -1, -1));

        btnVerMinutas.setText("Ver mintuas");
        btnVerMinutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMinutasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerMinutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 130, 30));

        tableMinutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Titulo", "Lugar", "Hora Inicial", "Hora Final", "ID reunion"
            }
        ));
        jScrollPane4.setViewportView(tableMinutas);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 600, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarEvaluacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEvaluacionesActionPerformed
                        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
        PreparedStatement pstnt=conn.prepareStatement("SELECT id_entregable,cedula_encargado, porcentaje,descripcion,fecha_entrega_maxima\n" +
"FROM entregable WHERE id_periodo = "+comboBoxPeriodo.getSelectedItem());
        ResultSet rs=pstnt.executeQuery();
        DefaultTableModel tm=(DefaultTableModel)tableEvaluaciones.getModel();
        tm.setRowCount(0);
        
        while (rs.next()){
            Object o[]= {rs.getInt("id_entregable"),rs.getInt("cedula_encargado"),rs.getInt("porcentaje"),rs.getString("descripcion"),rs.getString("fecha_entrega_maxima")};
            tm.addRow(o);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarEvaluacionesActionPerformed

    private void btnIndicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndicarActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt=conn.prepareStatement("Select entrega.id_entrega from entrega JOIN entregable on entrega.id_entregable = entregable.id_entregable WHERE id_periodo = "+comboBoxPeriodo.getSelectedItem().toString());
            ResultSet rs=pstnt.executeQuery();
            while(rs.next()){
                comboBoxEntregasDisp.addItem(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnIndicarActionPerformed

    private void btnAsignarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarNotaActionPerformed
        try{
                try{
        int NotaAsesor= Integer.parseInt(this.txtNotaAsesor.getText());
        int NotaSupervisor= Integer.parseInt(this.txtNotaSupervisor.getText());
        String fecha = this.txtFecha.getText();
        String comentarios = this.txtComentarios.getText();
        int cedulaSupervisor= Integer.parseInt(this.txtCedulaSupervisor.getText());
        int idEntrega = Integer.parseInt(this.comboBoxEntregasDisp.getSelectedItem().toString());
        int cedulaAsesor = Integer.parseInt(this.comboBoxPA.getSelectedItem().toString());
//       Calendar calendar = Calendar.getInstance();
//       java.sql.Date fecha1 = new java.sql.Date(fecha);       
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt = conn.prepareStatement("Insert into nota(nota_asesor,nota_supervisor,fecha,comentarios,cedula_asesor,cedula_supervisor,id_entrega) values (?,?,?,?,?,?,?)");
            pstnt.setInt(1,NotaAsesor);
            pstnt.setInt(2,NotaSupervisor);
            pstnt.setString(3,fecha);
            pstnt.setString(4,comentarios);
            pstnt.setInt(5, cedulaAsesor);
            pstnt.setInt(6, cedulaSupervisor);
            pstnt.setInt(7, idEntrega);
            pstnt.execute();
            JOptionPane.showMessageDialog(null,"Se asigno nota");
            conn.close();
        }catch(Exception e){
                System.out.println(e);
                }    
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error en el ingreso de datos");
                }

    }//GEN-LAST:event_btnAsignarNotaActionPerformed

    private void btnVerPracticantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPracticantesActionPerformed
        loadcomboPracticantes();
    }//GEN-LAST:event_btnVerPracticantesActionPerformed

    private void btnVerEntregablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEntregablesActionPerformed
     loadcomboEntregables();
    }//GEN-LAST:event_btnVerEntregablesActionPerformed

    private void btnEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregasActionPerformed

                        try{
        int cedula = Integer.parseInt(this.comboBoxPracticantes1.getSelectedItem().toString());
                            System.out.println(cedula);
        int periodo = Integer.parseInt(this.comboBoxPeriodo3.getSelectedItem().toString());
                            System.out.println(periodo);
       
                 
                            
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
        PreparedStatement pstnt=conn.prepareStatement("SELECT cedula_practicante,id_tipo, fecha_entrega,archivo FROM entrega JOIN entregable on entrega.id_entregable = entregable.id_entregable WHERE cedula_practicante= "+cedula+" AND entrega.id_entregable= "+comboEntregable.getSelectedItem()+" AND entregable.id_periodo = "+periodo);
        ResultSet rs=pstnt.executeQuery();
        DefaultTableModel tm=(DefaultTableModel)tablaEntregas.getModel();
        tm.setRowCount(0);
        
        while (rs.next()){
            Object o[]= {rs.getInt("cedula_practicante"),rs.getInt("id_tipo"),rs.getString("fecha_entrega"),rs.getString("archivo")};
            tm.addRow(o);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }          
    }//GEN-LAST:event_btnEntregasActionPerformed

    private void btnVerPracticantes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPracticantes2ActionPerformed
 loadcomboPracticantes2();
    }//GEN-LAST:event_btnVerPracticantes2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                try{
          String fecha = this.txtFechaReunion.getText();
          int horaInicio = Integer.parseInt(this.txthoraInicialReunion.getText());
          int horaFinal = Integer.parseInt(this.txthoraFinalReunion.getText());
          String tema = this.txtTemaR.getText();
          String agenda = this.txtAgendaR.getText();
          String lugar = this.txtLugarR.getText();
                    System.out.println(comboBoxPA.getSelectedItem().toString());
                    System.out.println(comboBoxPracticantes2.getSelectedItem().toString());
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
            PreparedStatement pstnt = conn.prepareStatement("Insert into reunion(cedula_asesor,cedula_practicante,fecha,hora_inicial,hora_final,tema,agenda,lugar,id_periodo) values (?,?,?,?,?,?,?,?,?)");
            pstnt.setInt(1,Integer.parseInt(comboBoxPA.getSelectedItem().toString()));
            pstnt.setInt(2,Integer.parseInt(comboBoxPracticantes2.getSelectedItem().toString()));
            pstnt.setString(3,fecha);
            pstnt.setInt(4,horaInicio);
            pstnt.setInt(5, horaFinal);
            pstnt.setString(6, tema);
            pstnt.setString(7, agenda);
            pstnt.setString(8, lugar);
            pstnt.setInt(9, Integer.parseInt(comboBoxPeriodo.getSelectedItem().toString()));
            pstnt.execute();
            JOptionPane.showMessageDialog(null,"Se solicito reunion");
            conn.close();
        }catch(Exception e){
                System.out.println(e);
                }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVerMinutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMinutasActionPerformed
                        try{                                                 
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/progra2?", "root", "");
        PreparedStatement pstnt=conn.prepareStatement("SELECT minuta.id_minuta, minuta.fecha, minuta.titulo, minuta.lugar,minuta.hora_inicial, minuta.hora_final,minuta.id_reunion from minuta where minuta.cedula_practicante = "+comboBoxPracticantes2.getSelectedItem());
        ResultSet rs=pstnt.executeQuery();
        DefaultTableModel tm=(DefaultTableModel)tableMinutas.getModel();
        tm.setRowCount(0);
        
        while (rs.next()){
            Object o[]= {rs.getInt("id_minuta"),rs.getString("fecha"),rs.getString("titulo"),rs.getString("lugar"),rs.getInt("hora_inicial"),rs.getInt("hora_final"),rs.getInt("id_reunion")};
            tm.addRow(o);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnVerMinutasActionPerformed

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
            java.util.logging.Logger.getLogger(ProfesorAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfesorAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfesorAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfesorAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfesorAsesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarNota;
    private javax.swing.JButton btnConsultarEvaluaciones;
    private javax.swing.JButton btnEntregas;
    private javax.swing.JButton btnIndicar;
    private javax.swing.JButton btnVerEntregables;
    private javax.swing.JButton btnVerMinutas;
    private javax.swing.JButton btnVerPracticantes;
    private javax.swing.JButton btnVerPracticantes2;
    private javax.swing.JComboBox<String> comboBoxEntregasDisp;
    private javax.swing.JComboBox<String> comboBoxPA;
    private javax.swing.JComboBox<String> comboBoxPeriodo;
    private javax.swing.JComboBox<String> comboBoxPeriodo3;
    private javax.swing.JComboBox<String> comboBoxPracticantes1;
    private javax.swing.JComboBox<String> comboBoxPracticantes2;
    private javax.swing.JComboBox<String> comboEntregable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label2;
    private java.awt.Label label20;
    private java.awt.Label label21;
    private java.awt.Label label22;
    private java.awt.Label label23;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTable tablaEntregas;
    private javax.swing.JTable tableEvaluaciones;
    private javax.swing.JTable tableMinutas;
    private javax.swing.JTable tablePeriodo;
    private javax.swing.JTextField txtAgendaR;
    private javax.swing.JTextField txtCedulaSupervisor;
    private javax.swing.JTextField txtComentarios;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaReunion;
    private javax.swing.JTextField txtLugarR;
    private javax.swing.JTextField txtNotaAsesor;
    private javax.swing.JTextField txtNotaSupervisor;
    private javax.swing.JTextField txtTemaR;
    private javax.swing.JTextField txthoraFinalReunion;
    private javax.swing.JTextField txthoraInicialReunion;
    // End of variables declaration//GEN-END:variables
}
