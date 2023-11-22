/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import GtpConected.GtpConectedapi;
import dbconnection.ConeccionBasicas;
import dbconnection.ConeccionCcu;
import dbconnection.Usuario;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author eduar
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard(Usuario usuario) {
        
        initComponents();

        this.setLocationRelativeTo(null);

        panel6a7amlunes.setVisible(true); 
        panel7a8amlunes.setVisible(false); 
        panel8a9amlunes.setVisible(false);
        panel9a10amlunes.setVisible(false);
        panel10a11amlunes.setVisible(false);
        panel11a12amlunes.setVisible(false);
        panel12a13lunes.setVisible(false);
        panel13a14lunes.setVisible(false); 
        panel14a15lunes.setVisible(false);
        panel15a16lunes.setVisible(false);
        panel16a17lunes.setVisible(false); 
        panel17a18lunes.setVisible(false); 
        panel18a19lunes.setVisible(false);
        panel19a20lunes.setVisible(false);
        panel20a21lunes.setVisible(false);
        panel6a7amMartes.setVisible(false);
        panel7a8amMartes.setVisible(false);
        panel8a9amMartes.setVisible(false);
        panel9a10amMartes.setVisible(false);  
        panel10a11amMartes.setVisible(false); 
        panel11a12amMartes.setVisible(false); 
        panel12a13Martes.setVisible(false);
        panel13a14Martes.setVisible(false);
        panel14a15Martes.setVisible(false);
        panel15a16Martes.setVisible(false); 
        panel16a17Martes.setVisible(false); 
        panel17a18Martes.setVisible(false); 
        panel18a19Martes.setVisible(false);
        panel19a20Martes.setVisible(false);
        panel20a21Martes.setVisible(false); 
        panel6a7amMiercoles.setVisible(false); 
        panel7a8amMiercoles.setVisible(false);  
        panel8a9amMiercoles.setVisible(false); 
        panel9a10amMiercoles.setVisible(false); 
        panel10a11amMiercoles.setVisible(false); 
        panel11a12amMiercoles.setVisible(false); 
        panel12a13Miercoles.setVisible(false); 
        panel13a14Miercoles.setVisible(false);  
        panel14a15Miercoles.setVisible(false); 
        panel15a16Miercoles.setVisible(false); 
        panel16a17Miercoles.setVisible(false);  
        panel17a18Miercoles.setVisible(false); 
        panel18a19Miercoles.setVisible(false); 
        panel19a20Miercoles.setVisible(false); 
        panel20a21Miercoles.setVisible(false); 
        panel6a7amJueves.setVisible(false);  
        panel7a8amJueves.setVisible(false);  
        panel8a9amJueves.setVisible(false); 
        panel9a10amJueves.setVisible(false);  
        panel10a11amJueves.setVisible(false); 
        panel11a12amJueves.setVisible(false); 
        panel12a13Jueves.setVisible(false);  
        panel13a14Jueves.setVisible(false); 
        panel14a15Jueves.setVisible(false); 
        panel15a16Jueves.setVisible(false);  
        panel16a17Jueves.setVisible(false); 
        panel17a18Jueves.setVisible(false); 
        panel18a19Jueves.setVisible(false);  
        panel19a20Jueves.setVisible(false); 
        panel20a21Jueves.setVisible(false); 
        panel6a7amViernes.setVisible(false);  
        panel7a8amViernes.setVisible(false); 
        panel8a9amViernes.setVisible(false); 
        panel9a10amViernes.setVisible(false); 
        panel10a11amViernes.setVisible(false); 
        panel11a12amViernes.setVisible(false); 
        panel12a13Viernes.setVisible(false);  
        panel13a14Viernes.setVisible(false); 
        panel14a15Viernes.setVisible(false); 
        panel15a16Viernes.setVisible(false);  
        panel16a17Viernes.setVisible(false); 
        panel17a18Viernes.setVisible(false); 
        panel18a19Viernes.setVisible(false);  
        panel19a20Viernes.setVisible(false); 
        panel20a21Viernes.setVisible(false);  
        panel6a8amlunes.setVisible(false); 
        panel8a10amlunes.setVisible(false);
        panel10a12amlunes.setVisible(false); 
        panel14a16Martes.setVisible(false);
        panel15a17Martes.setVisible(false);  
        panel14a16Miercoles.setVisible(false);
        panel14a16Jueves.setVisible(false);
        panel10a12Miercoles.setVisible(false);
        panel8a10amViernes.setVisible(false);
        panel10a13lunes.setVisible(false);
        panel16a19lunes.setVisible(false);
        panel7a10amMartes.setVisible(false);
        
        String nombre = usuario.getNombre();
        String carrera = usuario.getCarrera();
        String semestre = usuario.getSemestre();
        
        nombreEstudianteJlabel.setText(nombre);
        carrera_estudiante.setText(carrera);
        semestre_estudiante.setText(semestre);
        
        LocalDate fechaActual = LocalDate.now();

        String mesActual = fechaActual.getMonth().toString();

        int diaActual = fechaActual.getDayOfMonth();
        
        mesjtime.setText(mesActual +", ");
        diajtime.setText("23");
        
        

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tituloMiHorario = new javax.swing.JLabel();
        diajtime = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelRound1 = new com.login.PanelRound();
        nuevoHorario_jlabel = new javax.swing.JLabel();
        mas_horario_jlabel = new javax.swing.JLabel();
        lunesJlabel = new javax.swing.JLabel();
        miercolesjLabel = new javax.swing.JLabel();
        martesjLabel7 = new javax.swing.JLabel();
        juevesjLabel = new javax.swing.JLabel();
        viernesjLabel = new javax.swing.JLabel();
        clase_14pm = new javax.swing.JLabel();
        clase_6am = new javax.swing.JLabel();
        clase_7am = new javax.swing.JLabel();
        clase_8am = new javax.swing.JLabel();
        clase_9am = new javax.swing.JLabel();
        clase_10am = new javax.swing.JLabel();
        clase_11am = new javax.swing.JLabel();
        clase_12am = new javax.swing.JLabel();
        clase_13pm = new javax.swing.JLabel();
        clase_18pm = new javax.swing.JLabel();
        clase_15pm = new javax.swing.JLabel();
        clase_16pm = new javax.swing.JLabel();
        clase_17pm = new javax.swing.JLabel();
        clase_21pm = new javax.swing.JLabel();
        clase_20pm = new javax.swing.JLabel();
        clase_19pm = new javax.swing.JLabel();
        panel10a13lunes = new com.login.PanelRound();
        panelinterno6amlunes36 = new com.login.PanelRound();
        salon6a8lunes36 = new javax.swing.JLabel();
        materia6a8amlunes36 = new javax.swing.JLabel();
        docente6a8lunes36 = new javax.swing.JLabel();
        horariode6a8lunes36 = new javax.swing.JLabel();
        panel16a19lunes = new com.login.PanelRound();
        panelinterno6amlunes42 = new com.login.PanelRound();
        salon6a8lunes42 = new javax.swing.JLabel();
        materia6a8amlunes42 = new javax.swing.JLabel();
        docente6a8lunes42 = new javax.swing.JLabel();
        horariode6a8lunes42 = new javax.swing.JLabel();
        panel6a7amlunes = new com.login.PanelRound();
        panelRound7 = new com.login.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        materia6a7lunes = new javax.swing.JLabel();
        docente6a7lunes = new javax.swing.JLabel();
        horariode6a7lunes = new javax.swing.JLabel();
        panel7a8amlunes = new com.login.PanelRound();
        panelRound18 = new com.login.PanelRound();
        jLabel15 = new javax.swing.JLabel();
        materia6a7lunes11 = new javax.swing.JLabel();
        docente6a7lunes11 = new javax.swing.JLabel();
        horariode6a7lunes11 = new javax.swing.JLabel();
        panel8a9amlunes = new com.login.PanelRound();
        panelRound19 = new com.login.PanelRound();
        jLabel16 = new javax.swing.JLabel();
        materia6a7lunes12 = new javax.swing.JLabel();
        docente6a7lunes12 = new javax.swing.JLabel();
        horariode6a7lunes12 = new javax.swing.JLabel();
        panel9a10amlunes = new com.login.PanelRound();
        panelRound17 = new com.login.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        materia6a7lunes10 = new javax.swing.JLabel();
        docente6a7lunes10 = new javax.swing.JLabel();
        horariode6a7lunes10 = new javax.swing.JLabel();
        panel10a11amlunes = new com.login.PanelRound();
        panelRound12 = new com.login.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        materia6a7lunes5 = new javax.swing.JLabel();
        docente6a7lunes5 = new javax.swing.JLabel();
        horariode6a7lunes5 = new javax.swing.JLabel();
        panel11a12amlunes = new com.login.PanelRound();
        panelRound20 = new com.login.PanelRound();
        jLabel17 = new javax.swing.JLabel();
        materia6a7lunes13 = new javax.swing.JLabel();
        docente6a7lunes13 = new javax.swing.JLabel();
        horariode6a7lunes13 = new javax.swing.JLabel();
        panel12a13lunes = new com.login.PanelRound();
        panelRound21 = new com.login.PanelRound();
        jLabel18 = new javax.swing.JLabel();
        materia6a7lunes14 = new javax.swing.JLabel();
        docente6a7lunes14 = new javax.swing.JLabel();
        horariode6a7lunes14 = new javax.swing.JLabel();
        panel13a14lunes = new com.login.PanelRound();
        panelRound22 = new com.login.PanelRound();
        jLabel19 = new javax.swing.JLabel();
        materia6a7lunes15 = new javax.swing.JLabel();
        docente6a7lunes15 = new javax.swing.JLabel();
        horariode6a7lunes15 = new javax.swing.JLabel();
        panel14a15lunes = new com.login.PanelRound();
        panelRound23 = new com.login.PanelRound();
        jLabel20 = new javax.swing.JLabel();
        materia6a7lunes16 = new javax.swing.JLabel();
        docente6a7lunes16 = new javax.swing.JLabel();
        horariode6a7lunes16 = new javax.swing.JLabel();
        panel15a16lunes = new com.login.PanelRound();
        panelRound24 = new com.login.PanelRound();
        jLabel21 = new javax.swing.JLabel();
        materia6a7lunes17 = new javax.swing.JLabel();
        docente6a7lunes17 = new javax.swing.JLabel();
        horariode6a7lunes17 = new javax.swing.JLabel();
        panel16a17lunes = new com.login.PanelRound();
        panelRound25 = new com.login.PanelRound();
        jLabel22 = new javax.swing.JLabel();
        materia6a7lunes18 = new javax.swing.JLabel();
        docente6a7lunes18 = new javax.swing.JLabel();
        horariode6a7lunes18 = new javax.swing.JLabel();
        panel17a18lunes = new com.login.PanelRound();
        panelRound26 = new com.login.PanelRound();
        jLabel23 = new javax.swing.JLabel();
        materia6a7lunes19 = new javax.swing.JLabel();
        docente6a7lunes19 = new javax.swing.JLabel();
        horariode6a7lunes19 = new javax.swing.JLabel();
        panel18a19lunes = new com.login.PanelRound();
        panelRound28 = new com.login.PanelRound();
        jLabel25 = new javax.swing.JLabel();
        materia6a7lunes21 = new javax.swing.JLabel();
        docente6a7lunes21 = new javax.swing.JLabel();
        horariode6a7lunes21 = new javax.swing.JLabel();
        panel19a20lunes = new com.login.PanelRound();
        panelRound13 = new com.login.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        materia6a7lunes6 = new javax.swing.JLabel();
        docente6a7lunes6 = new javax.swing.JLabel();
        horariode6a7lunes6 = new javax.swing.JLabel();
        panel20a21lunes = new com.login.PanelRound();
        panelRound16 = new com.login.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        materia6a7lunes9 = new javax.swing.JLabel();
        docente6a7lunes9 = new javax.swing.JLabel();
        horariode6a7lunes9 = new javax.swing.JLabel();
        panel6a8amlunes = new com.login.PanelRound();
        panelinterno6amlunes20 = new com.login.PanelRound();
        salon6a8lunes20 = new javax.swing.JLabel();
        materia6a8amlunes20 = new javax.swing.JLabel();
        docente6a8lunes20 = new javax.swing.JLabel();
        horariode6a8lunes20 = new javax.swing.JLabel();
        panel8a10amlunes = new com.login.PanelRound();
        panelinterno6amlunes22 = new com.login.PanelRound();
        salon6a8lunes22 = new javax.swing.JLabel();
        materia6a8amlunes22 = new javax.swing.JLabel();
        docente6a8lunes22 = new javax.swing.JLabel();
        horariode6a8lunes22 = new javax.swing.JLabel();
        panel10a12amlunes = new com.login.PanelRound();
        panelinterno6amlunes24 = new com.login.PanelRound();
        salon6a8lunes24 = new javax.swing.JLabel();
        materia6a8amlunes24 = new javax.swing.JLabel();
        docente6a8lunes24 = new javax.swing.JLabel();
        horariode6a8lunes24 = new javax.swing.JLabel();
        panel7a10amMartes = new com.login.PanelRound();
        panelinterno6amlunes45 = new com.login.PanelRound();
        salon6a8lunes45 = new javax.swing.JLabel();
        materia6a8amlunes45 = new javax.swing.JLabel();
        docente6a8lunes45 = new javax.swing.JLabel();
        horariode6a8lunes45 = new javax.swing.JLabel();
        panel6a7amMartes = new com.login.PanelRound();
        panelRound8 = new com.login.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        materia6a7lunes1 = new javax.swing.JLabel();
        docente6a7lunes1 = new javax.swing.JLabel();
        horariode6a7lunes1 = new javax.swing.JLabel();
        panel7a8amMartes = new com.login.PanelRound();
        panelRound27 = new com.login.PanelRound();
        jLabel24 = new javax.swing.JLabel();
        materia6a7lunes20 = new javax.swing.JLabel();
        docente6a7lunes20 = new javax.swing.JLabel();
        horariode6a7lunes20 = new javax.swing.JLabel();
        panel8a9amMartes = new com.login.PanelRound();
        panelRound29 = new com.login.PanelRound();
        jLabel26 = new javax.swing.JLabel();
        materia6a7lunes22 = new javax.swing.JLabel();
        docente6a7lunes22 = new javax.swing.JLabel();
        horariode6a7lunes22 = new javax.swing.JLabel();
        panel9a10amMartes = new com.login.PanelRound();
        panelRound30 = new com.login.PanelRound();
        jLabel27 = new javax.swing.JLabel();
        materia6a7lunes23 = new javax.swing.JLabel();
        docente6a7lunes23 = new javax.swing.JLabel();
        horariode6a7lunes23 = new javax.swing.JLabel();
        panel10a11amMartes = new com.login.PanelRound();
        panelRound14 = new com.login.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        materia6a7lunes7 = new javax.swing.JLabel();
        docente6a7lunes7 = new javax.swing.JLabel();
        horariode6a7lunes7 = new javax.swing.JLabel();
        panel11a12amMartes = new com.login.PanelRound();
        panelRound31 = new com.login.PanelRound();
        jLabel28 = new javax.swing.JLabel();
        materia6a7lunes24 = new javax.swing.JLabel();
        docente6a7lunes24 = new javax.swing.JLabel();
        horariode6a7lunes24 = new javax.swing.JLabel();
        panel12a13Martes = new com.login.PanelRound();
        panelRound32 = new com.login.PanelRound();
        jLabel29 = new javax.swing.JLabel();
        materia6a7lunes25 = new javax.swing.JLabel();
        docente6a7lunes25 = new javax.swing.JLabel();
        horariode6a7lunes25 = new javax.swing.JLabel();
        panel13a14Martes = new com.login.PanelRound();
        panelRound33 = new com.login.PanelRound();
        jLabel30 = new javax.swing.JLabel();
        materia6a7lunes26 = new javax.swing.JLabel();
        docente6a7lunes26 = new javax.swing.JLabel();
        horariode6a7lunes26 = new javax.swing.JLabel();
        panel14a15Martes = new com.login.PanelRound();
        panelRound34 = new com.login.PanelRound();
        jLabel31 = new javax.swing.JLabel();
        materia6a7lunes27 = new javax.swing.JLabel();
        docente6a7lunes27 = new javax.swing.JLabel();
        horariode6a7lunes27 = new javax.swing.JLabel();
        panel15a16Martes = new com.login.PanelRound();
        panelRound35 = new com.login.PanelRound();
        jLabel32 = new javax.swing.JLabel();
        materia6a7lunes28 = new javax.swing.JLabel();
        docente6a7lunes28 = new javax.swing.JLabel();
        horariode6a7lunes28 = new javax.swing.JLabel();
        panel16a17Martes = new com.login.PanelRound();
        panelRound36 = new com.login.PanelRound();
        jLabel33 = new javax.swing.JLabel();
        materia6a7lunes29 = new javax.swing.JLabel();
        docente6a7lunes29 = new javax.swing.JLabel();
        horariode6a7lunes29 = new javax.swing.JLabel();
        panel17a18Martes = new com.login.PanelRound();
        panelRound37 = new com.login.PanelRound();
        jLabel34 = new javax.swing.JLabel();
        materia6a7lunes30 = new javax.swing.JLabel();
        docente6a7lunes30 = new javax.swing.JLabel();
        horariode6a7lunes30 = new javax.swing.JLabel();
        panel18a19Martes = new com.login.PanelRound();
        panelRound38 = new com.login.PanelRound();
        jLabel35 = new javax.swing.JLabel();
        materia6a7lunes31 = new javax.swing.JLabel();
        docente6a7lunes31 = new javax.swing.JLabel();
        horariode6a7lunes31 = new javax.swing.JLabel();
        panel19a20Martes = new com.login.PanelRound();
        panelRound15 = new com.login.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        materia6a7lunes8 = new javax.swing.JLabel();
        docente6a7lunes8 = new javax.swing.JLabel();
        horariode6a7lunes8 = new javax.swing.JLabel();
        panel20a21Martes = new com.login.PanelRound();
        panelRound39 = new com.login.PanelRound();
        jLabel36 = new javax.swing.JLabel();
        materia6a7lunes32 = new javax.swing.JLabel();
        docente6a7lunes32 = new javax.swing.JLabel();
        horariode6a7lunes32 = new javax.swing.JLabel();
        panel14a16Martes = new com.login.PanelRound();
        panelinterno6amlunes65 = new com.login.PanelRound();
        salon6a8lunes65 = new javax.swing.JLabel();
        materia6a8amlunes65 = new javax.swing.JLabel();
        docente6a8lunes65 = new javax.swing.JLabel();
        horariode6a8lunes65 = new javax.swing.JLabel();
        panel15a17Martes = new com.login.PanelRound();
        panelinterno6amlunes66 = new com.login.PanelRound();
        salon6a8lunes66 = new javax.swing.JLabel();
        materia6a8amlunes66 = new javax.swing.JLabel();
        docente6a8lunes66 = new javax.swing.JLabel();
        horariode6a8lunes66 = new javax.swing.JLabel();
        panel6a7amMiercoles = new com.login.PanelRound();
        panelRound10 = new com.login.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        materia6a7lunes3 = new javax.swing.JLabel();
        docente6a7lunes3 = new javax.swing.JLabel();
        horariode6a7lunes3 = new javax.swing.JLabel();
        panel7a8amMiercoles = new com.login.PanelRound();
        panelRound54 = new com.login.PanelRound();
        jLabel51 = new javax.swing.JLabel();
        materia6a7lunes47 = new javax.swing.JLabel();
        docente6a7lunes47 = new javax.swing.JLabel();
        horariode6a7lunes47 = new javax.swing.JLabel();
        panel8a9amMiercoles = new com.login.PanelRound();
        panelRound55 = new com.login.PanelRound();
        jLabel52 = new javax.swing.JLabel();
        materia6a7lunes48 = new javax.swing.JLabel();
        docente6a7lunes48 = new javax.swing.JLabel();
        horariode6a7lunes48 = new javax.swing.JLabel();
        panel9a10amMiercoles = new com.login.PanelRound();
        panelRound56 = new com.login.PanelRound();
        jLabel53 = new javax.swing.JLabel();
        materia6a7lunes49 = new javax.swing.JLabel();
        docente6a7lunes49 = new javax.swing.JLabel();
        horariode6a7lunes49 = new javax.swing.JLabel();
        panel10a11amMiercoles = new com.login.PanelRound();
        panelRound57 = new com.login.PanelRound();
        jLabel54 = new javax.swing.JLabel();
        materia6a7lunes50 = new javax.swing.JLabel();
        docente6a7lunes50 = new javax.swing.JLabel();
        horariode6a7lunes50 = new javax.swing.JLabel();
        panel11a12amMiercoles = new com.login.PanelRound();
        panelRound58 = new com.login.PanelRound();
        jLabel55 = new javax.swing.JLabel();
        materia6a7lunes51 = new javax.swing.JLabel();
        docente6a7lunes51 = new javax.swing.JLabel();
        horariode6a7lunes51 = new javax.swing.JLabel();
        panel12a13Miercoles = new com.login.PanelRound();
        panelRound59 = new com.login.PanelRound();
        jLabel56 = new javax.swing.JLabel();
        materia6a7lunes52 = new javax.swing.JLabel();
        docente6a7lunes52 = new javax.swing.JLabel();
        horariode6a7lunes52 = new javax.swing.JLabel();
        panel13a14Miercoles = new com.login.PanelRound();
        panelRound60 = new com.login.PanelRound();
        jLabel57 = new javax.swing.JLabel();
        materia6a7lunes53 = new javax.swing.JLabel();
        docente6a7lunes53 = new javax.swing.JLabel();
        horariode6a7lunes53 = new javax.swing.JLabel();
        panel14a15Miercoles = new com.login.PanelRound();
        panelRound61 = new com.login.PanelRound();
        jLabel58 = new javax.swing.JLabel();
        materia6a7lunes54 = new javax.swing.JLabel();
        docente6a7lunes54 = new javax.swing.JLabel();
        horariode6a7lunes54 = new javax.swing.JLabel();
        panel15a16Miercoles = new com.login.PanelRound();
        panelRound62 = new com.login.PanelRound();
        jLabel59 = new javax.swing.JLabel();
        materia6a7lunes55 = new javax.swing.JLabel();
        docente6a7lunes55 = new javax.swing.JLabel();
        horariode6a7lunes55 = new javax.swing.JLabel();
        panel16a17Miercoles = new com.login.PanelRound();
        panelRound63 = new com.login.PanelRound();
        jLabel60 = new javax.swing.JLabel();
        materia6a7lunes56 = new javax.swing.JLabel();
        docente6a7lunes56 = new javax.swing.JLabel();
        horariode6a7lunes56 = new javax.swing.JLabel();
        panel17a18Miercoles = new com.login.PanelRound();
        panelRound64 = new com.login.PanelRound();
        jLabel61 = new javax.swing.JLabel();
        materia6a7lunes57 = new javax.swing.JLabel();
        docente6a7lunes57 = new javax.swing.JLabel();
        horariode6a7lunes57 = new javax.swing.JLabel();
        panel18a19Miercoles = new com.login.PanelRound();
        panelRound65 = new com.login.PanelRound();
        jLabel62 = new javax.swing.JLabel();
        materia6a7lunes58 = new javax.swing.JLabel();
        docente6a7lunes58 = new javax.swing.JLabel();
        horariode6a7lunes58 = new javax.swing.JLabel();
        panel19a20Miercoles = new com.login.PanelRound();
        panelRound66 = new com.login.PanelRound();
        jLabel63 = new javax.swing.JLabel();
        materia6a7lunes59 = new javax.swing.JLabel();
        docente6a7lunes59 = new javax.swing.JLabel();
        horariode6a7lunes59 = new javax.swing.JLabel();
        panel20a21Miercoles = new com.login.PanelRound();
        panelRound67 = new com.login.PanelRound();
        jLabel64 = new javax.swing.JLabel();
        materia6a7lunes60 = new javax.swing.JLabel();
        docente6a7lunes60 = new javax.swing.JLabel();
        horariode6a7lunes60 = new javax.swing.JLabel();
        panel10a12Miercoles = new com.login.PanelRound();
        panelinterno6amlunes118 = new com.login.PanelRound();
        salon6a8lunes118 = new javax.swing.JLabel();
        materia6a8amlunes118 = new javax.swing.JLabel();
        docente6a8lunes118 = new javax.swing.JLabel();
        horariode6a8lunes118 = new javax.swing.JLabel();
        panel14a16Miercoles = new com.login.PanelRound();
        panelinterno6amlunes117 = new com.login.PanelRound();
        salon6a8lunes117 = new javax.swing.JLabel();
        materia6a8amlunes117 = new javax.swing.JLabel();
        docente6a8lunes117 = new javax.swing.JLabel();
        horariode6a8lunes117 = new javax.swing.JLabel();
        panel6a7amJueves = new com.login.PanelRound();
        panelRound82 = new com.login.PanelRound();
        jLabel79 = new javax.swing.JLabel();
        materia6a7lunes75 = new javax.swing.JLabel();
        docente6a7lunes75 = new javax.swing.JLabel();
        horariode6a7lunes75 = new javax.swing.JLabel();
        panel7a8amJueves = new com.login.PanelRound();
        panelRound83 = new com.login.PanelRound();
        jLabel80 = new javax.swing.JLabel();
        materia6a7lunes76 = new javax.swing.JLabel();
        docente6a7lunes76 = new javax.swing.JLabel();
        horariode6a7lunes76 = new javax.swing.JLabel();
        panel8a9amJueves = new com.login.PanelRound();
        panelRound84 = new com.login.PanelRound();
        jLabel81 = new javax.swing.JLabel();
        materia6a7lunes77 = new javax.swing.JLabel();
        docente6a7lunes77 = new javax.swing.JLabel();
        horariode6a7lunes77 = new javax.swing.JLabel();
        panel9a10amJueves = new com.login.PanelRound();
        panelRound85 = new com.login.PanelRound();
        jLabel82 = new javax.swing.JLabel();
        materia6a7lunes78 = new javax.swing.JLabel();
        docente6a7lunes78 = new javax.swing.JLabel();
        horariode6a7lunes78 = new javax.swing.JLabel();
        panel10a11amJueves = new com.login.PanelRound();
        panelRound86 = new com.login.PanelRound();
        jLabel83 = new javax.swing.JLabel();
        materia6a7lunes79 = new javax.swing.JLabel();
        docente6a7lunes79 = new javax.swing.JLabel();
        horariode6a7lunes79 = new javax.swing.JLabel();
        panel11a12amJueves = new com.login.PanelRound();
        panelRound87 = new com.login.PanelRound();
        jLabel84 = new javax.swing.JLabel();
        materia6a7lunes80 = new javax.swing.JLabel();
        docente6a7lunes80 = new javax.swing.JLabel();
        horariode6a7lunes80 = new javax.swing.JLabel();
        panel12a13Jueves = new com.login.PanelRound();
        panelRound88 = new com.login.PanelRound();
        jLabel85 = new javax.swing.JLabel();
        materia6a7lunes81 = new javax.swing.JLabel();
        docente6a7lunes81 = new javax.swing.JLabel();
        horariode6a7lunes81 = new javax.swing.JLabel();
        panel13a14Jueves = new com.login.PanelRound();
        panelRound89 = new com.login.PanelRound();
        jLabel86 = new javax.swing.JLabel();
        materia6a7lunes82 = new javax.swing.JLabel();
        docente6a7lunes82 = new javax.swing.JLabel();
        horariode6a7lunes82 = new javax.swing.JLabel();
        panel14a15Jueves = new com.login.PanelRound();
        panelRound90 = new com.login.PanelRound();
        jLabel87 = new javax.swing.JLabel();
        materia6a7lunes83 = new javax.swing.JLabel();
        docente6a7lunes83 = new javax.swing.JLabel();
        horariode6a7lunes83 = new javax.swing.JLabel();
        panel15a16Jueves = new com.login.PanelRound();
        panelRound91 = new com.login.PanelRound();
        jLabel88 = new javax.swing.JLabel();
        materia6a7lunes84 = new javax.swing.JLabel();
        docente6a7lunes84 = new javax.swing.JLabel();
        horariode6a7lunes84 = new javax.swing.JLabel();
        panel16a17Jueves = new com.login.PanelRound();
        panelRound92 = new com.login.PanelRound();
        jLabel89 = new javax.swing.JLabel();
        materia6a7lunes85 = new javax.swing.JLabel();
        docente6a7lunes85 = new javax.swing.JLabel();
        horariode6a7lunes85 = new javax.swing.JLabel();
        panel17a18Jueves = new com.login.PanelRound();
        panelRound93 = new com.login.PanelRound();
        jLabel90 = new javax.swing.JLabel();
        materia6a7lunes86 = new javax.swing.JLabel();
        docente6a7lunes86 = new javax.swing.JLabel();
        horariode6a7lunes86 = new javax.swing.JLabel();
        panel18a19Jueves = new com.login.PanelRound();
        panelRound94 = new com.login.PanelRound();
        jLabel91 = new javax.swing.JLabel();
        materia6a7lunes87 = new javax.swing.JLabel();
        docente6a7lunes87 = new javax.swing.JLabel();
        horariode6a7lunes87 = new javax.swing.JLabel();
        panel19a20Jueves = new com.login.PanelRound();
        panelRound95 = new com.login.PanelRound();
        jLabel92 = new javax.swing.JLabel();
        materia6a7lunes88 = new javax.swing.JLabel();
        docente6a7lunes88 = new javax.swing.JLabel();
        horariode6a7lunes88 = new javax.swing.JLabel();
        panel20a21Jueves = new com.login.PanelRound();
        panelRound96 = new com.login.PanelRound();
        jLabel93 = new javax.swing.JLabel();
        materia6a7lunes89 = new javax.swing.JLabel();
        docente6a7lunes89 = new javax.swing.JLabel();
        horariode6a7lunes89 = new javax.swing.JLabel();
        panel14a16Jueves = new com.login.PanelRound();
        panelinterno6amlunes169 = new com.login.PanelRound();
        salon6a8lunes169 = new javax.swing.JLabel();
        materia6a8amlunes169 = new javax.swing.JLabel();
        docente6a8lunes169 = new javax.swing.JLabel();
        horariode6a8lunes169 = new javax.swing.JLabel();
        panel6a7amViernes = new com.login.PanelRound();
        panelRound112 = new com.login.PanelRound();
        jLabel109 = new javax.swing.JLabel();
        materia6a7lunes105 = new javax.swing.JLabel();
        docente6a7lunes105 = new javax.swing.JLabel();
        horariode6a7lunes105 = new javax.swing.JLabel();
        panel7a8amViernes = new com.login.PanelRound();
        panelRound113 = new com.login.PanelRound();
        jLabel110 = new javax.swing.JLabel();
        materia6a7lunes106 = new javax.swing.JLabel();
        docente6a7lunes106 = new javax.swing.JLabel();
        horariode6a7lunes106 = new javax.swing.JLabel();
        panel8a9amViernes = new com.login.PanelRound();
        panelRound114 = new com.login.PanelRound();
        jLabel111 = new javax.swing.JLabel();
        materia6a7lunes107 = new javax.swing.JLabel();
        docente6a7lunes107 = new javax.swing.JLabel();
        horariode6a7lunes107 = new javax.swing.JLabel();
        panel9a10amViernes = new com.login.PanelRound();
        panelRound115 = new com.login.PanelRound();
        jLabel112 = new javax.swing.JLabel();
        materia6a7lunes108 = new javax.swing.JLabel();
        docente6a7lunes108 = new javax.swing.JLabel();
        horariode6a7lunes108 = new javax.swing.JLabel();
        panel10a11amViernes = new com.login.PanelRound();
        panelRound116 = new com.login.PanelRound();
        jLabel113 = new javax.swing.JLabel();
        materia6a7lunes109 = new javax.swing.JLabel();
        docente6a7lunes109 = new javax.swing.JLabel();
        horariode6a7lunes109 = new javax.swing.JLabel();
        panel11a12amViernes = new com.login.PanelRound();
        panelRound117 = new com.login.PanelRound();
        jLabel114 = new javax.swing.JLabel();
        materia6a7lunes110 = new javax.swing.JLabel();
        docente6a7lunes110 = new javax.swing.JLabel();
        horariode6a7lunes110 = new javax.swing.JLabel();
        panel12a13Viernes = new com.login.PanelRound();
        panelRound118 = new com.login.PanelRound();
        jLabel115 = new javax.swing.JLabel();
        materia6a7lunes111 = new javax.swing.JLabel();
        docente6a7lunes111 = new javax.swing.JLabel();
        horariode6a7lunes111 = new javax.swing.JLabel();
        panel13a14Viernes = new com.login.PanelRound();
        panelRound119 = new com.login.PanelRound();
        jLabel116 = new javax.swing.JLabel();
        materia6a7lunes112 = new javax.swing.JLabel();
        docente6a7lunes112 = new javax.swing.JLabel();
        horariode6a7lunes112 = new javax.swing.JLabel();
        panel14a15Viernes = new com.login.PanelRound();
        panelRound120 = new com.login.PanelRound();
        jLabel117 = new javax.swing.JLabel();
        materia6a7lunes113 = new javax.swing.JLabel();
        docente6a7lunes113 = new javax.swing.JLabel();
        horariode6a7lunes113 = new javax.swing.JLabel();
        panel15a16Viernes = new com.login.PanelRound();
        panelRound121 = new com.login.PanelRound();
        jLabel118 = new javax.swing.JLabel();
        materia6a7lunes114 = new javax.swing.JLabel();
        docente6a7lunes114 = new javax.swing.JLabel();
        horariode6a7lunes114 = new javax.swing.JLabel();
        panel16a17Viernes = new com.login.PanelRound();
        panelRound122 = new com.login.PanelRound();
        jLabel119 = new javax.swing.JLabel();
        materia6a7lunes115 = new javax.swing.JLabel();
        docente6a7lunes115 = new javax.swing.JLabel();
        horariode6a7lunes115 = new javax.swing.JLabel();
        panel17a18Viernes = new com.login.PanelRound();
        panelRound123 = new com.login.PanelRound();
        jLabel120 = new javax.swing.JLabel();
        materia6a7lunes116 = new javax.swing.JLabel();
        docente6a7lunes116 = new javax.swing.JLabel();
        horariode6a7lunes116 = new javax.swing.JLabel();
        panel18a19Viernes = new com.login.PanelRound();
        panelRound124 = new com.login.PanelRound();
        jLabel121 = new javax.swing.JLabel();
        materia6a7lunes117 = new javax.swing.JLabel();
        docente6a7lunes117 = new javax.swing.JLabel();
        horariode6a7lunes117 = new javax.swing.JLabel();
        panel19a20Viernes = new com.login.PanelRound();
        panelRound125 = new com.login.PanelRound();
        jLabel122 = new javax.swing.JLabel();
        materia6a7lunes118 = new javax.swing.JLabel();
        docente6a7lunes118 = new javax.swing.JLabel();
        horariode6a7lunes118 = new javax.swing.JLabel();
        panel20a21Viernes = new com.login.PanelRound();
        panelRound126 = new com.login.PanelRound();
        jLabel123 = new javax.swing.JLabel();
        materia6a7lunes119 = new javax.swing.JLabel();
        docente6a7lunes119 = new javax.swing.JLabel();
        horariode6a7lunes119 = new javax.swing.JLabel();
        panel8a10amViernes = new com.login.PanelRound();
        panelinterno6amlunes215 = new com.login.PanelRound();
        salon6a8lunes215 = new javax.swing.JLabel();
        materia6a8amlunes215 = new javax.swing.JLabel();
        docente6a8lunes215 = new javax.swing.JLabel();
        horariode6a8lunes215 = new javax.swing.JLabel();
        Separator6am = new javax.swing.JSeparator();
        Separator7am = new javax.swing.JSeparator();
        Separator8am = new javax.swing.JSeparator();
        Separator9am = new javax.swing.JSeparator();
        Separator10am = new javax.swing.JSeparator();
        Separator11am = new javax.swing.JSeparator();
        Separator12am = new javax.swing.JSeparator();
        Separator13pm = new javax.swing.JSeparator();
        Separator14pm = new javax.swing.JSeparator();
        Separator15pm = new javax.swing.JSeparator();
        Separator16pm = new javax.swing.JSeparator();
        Separator17pm = new javax.swing.JSeparator();
        Separator18pm = new javax.swing.JSeparator();
        Separator19pm = new javax.swing.JSeparator();
        Separator20pm = new javax.swing.JSeparator();
        Separator21pm = new javax.swing.JSeparator();
        mesjtime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nombreEstudianteJlabel = new javax.swing.JLabel();
        semestre_estudiante = new javax.swing.JLabel();
        carrera_estudiante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMiHorario.setFont(new java.awt.Font("Inter Black", 0, 18)); // NOI18N
        tituloMiHorario.setText("Mi horario");
        jPanel1.add(tituloMiHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 111, 36));

        diajtime.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        diajtime.setText("Dia");
        jPanel1.add(diajtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 30, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horario 1", "Horario 2", "Horario 3" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 110, 50));

        panelRound1.setBackground(new java.awt.Color(255, 51, 51));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);
        panelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound1MouseClicked(evt);
            }
        });
        panelRound1.setLayout(new java.awt.GridBagLayout());

        nuevoHorario_jlabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        nuevoHorario_jlabel.setText("+ ");
        panelRound1.add(nuevoHorario_jlabel, new java.awt.GridBagConstraints());

        mas_horario_jlabel.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        mas_horario_jlabel.setText("Nuevo horario");
        panelRound1.add(mas_horario_jlabel, new java.awt.GridBagConstraints());

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 120, 50));

        lunesJlabel.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        lunesJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lunesJlabel.setText("Lunes");
        jPanel1.add(lunesJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 100, 20));

        miercolesjLabel.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        miercolesjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miercolesjLabel.setText("Miercoles");
        jPanel1.add(miercolesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 100, 20));

        martesjLabel7.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        martesjLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        martesjLabel7.setText("Martes");
        jPanel1.add(martesjLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 100, 20));

        juevesjLabel.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        juevesjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        juevesjLabel.setText("Jueves");
        jPanel1.add(juevesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 100, 20));

        viernesjLabel.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        viernesjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viernesjLabel.setText("Viernes");
        jPanel1.add(viernesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 100, 20));

        clase_14pm.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_14pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_14pm.setText("14:00");
        jPanel1.add(clase_14pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, 20));

        clase_6am.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_6am.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_6am.setText("6:00");
        jPanel1.add(clase_6am, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 20));

        clase_7am.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_7am.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_7am.setText("7:00");
        jPanel1.add(clase_7am, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 20));

        clase_8am.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_8am.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_8am.setText("8:00");
        jPanel1.add(clase_8am, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, 20));

        clase_9am.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_9am.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_9am.setText("9:00");
        jPanel1.add(clase_9am, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 20));

        clase_10am.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_10am.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_10am.setText("10:00");
        jPanel1.add(clase_10am, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, 20));

        clase_11am.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_11am.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_11am.setText("11:00");
        jPanel1.add(clase_11am, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 100, 20));

        clase_12am.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_12am.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_12am.setText("12:00");
        jPanel1.add(clase_12am, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 100, 20));

        clase_13pm.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_13pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_13pm.setText("13:00");
        jPanel1.add(clase_13pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, 20));

        clase_18pm.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_18pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_18pm.setText("18:00");
        jPanel1.add(clase_18pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 100, 20));

        clase_15pm.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_15pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_15pm.setText("15:00");
        jPanel1.add(clase_15pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 100, 20));

        clase_16pm.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_16pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_16pm.setText("16:00");
        jPanel1.add(clase_16pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 100, 20));

        clase_17pm.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_17pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_17pm.setText("17:00");
        jPanel1.add(clase_17pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 100, 20));

        clase_21pm.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_21pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_21pm.setText("21:00");
        jPanel1.add(clase_21pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 100, 20));

        clase_20pm.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_20pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_20pm.setText("20:00");
        jPanel1.add(clase_20pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 100, 20));

        clase_19pm.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        clase_19pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clase_19pm.setText("19:00");
        jPanel1.add(clase_19pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 100, 20));

        panel10a13lunes.setBackground(new java.awt.Color(255, 255, 255));
        panel10a13lunes.setRoundBottomLeft(20);
        panel10a13lunes.setRoundBottomRight(20);
        panel10a13lunes.setRoundTopLeft(20);
        panel10a13lunes.setRoundTopRight(20);
        panel10a13lunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes36.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes36.setRoundBottomLeft(20);
        panelinterno6amlunes36.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes36Layout = new javax.swing.GroupLayout(panelinterno6amlunes36);
        panelinterno6amlunes36.setLayout(panelinterno6amlunes36Layout);
        panelinterno6amlunes36Layout.setHorizontalGroup(
            panelinterno6amlunes36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes36Layout.setVerticalGroup(
            panelinterno6amlunes36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        panel10a13lunes.add(panelinterno6amlunes36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 110));

        salon6a8lunes36.setText("Salon");
        panel10a13lunes.add(salon6a8lunes36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 50, 20));

        materia6a8amlunes36.setText("Materia");
        panel10a13lunes.add(materia6a8amlunes36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes36.setText("Docente");
        panel10a13lunes.add(docente6a8lunes36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        horariode6a8lunes36.setText("Horario");
        panel10a13lunes.add(horariode6a8lunes36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 20));

        jPanel1.add(panel10a13lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 110, 110));

        panel16a19lunes.setBackground(new java.awt.Color(255, 255, 255));
        panel16a19lunes.setRoundBottomLeft(20);
        panel16a19lunes.setRoundBottomRight(20);
        panel16a19lunes.setRoundTopLeft(20);
        panel16a19lunes.setRoundTopRight(20);
        panel16a19lunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes42.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes42.setRoundBottomLeft(20);
        panelinterno6amlunes42.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes42Layout = new javax.swing.GroupLayout(panelinterno6amlunes42);
        panelinterno6amlunes42.setLayout(panelinterno6amlunes42Layout);
        panelinterno6amlunes42Layout.setHorizontalGroup(
            panelinterno6amlunes42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes42Layout.setVerticalGroup(
            panelinterno6amlunes42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        panel16a19lunes.add(panelinterno6amlunes42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 110));

        salon6a8lunes42.setText("Salon");
        panel16a19lunes.add(salon6a8lunes42, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 50, 20));

        materia6a8amlunes42.setText("Materia");
        panel16a19lunes.add(materia6a8amlunes42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes42.setText("Docente");
        panel16a19lunes.add(docente6a8lunes42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        horariode6a8lunes42.setText("Horario");
        panel16a19lunes.add(horariode6a8lunes42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 20));

        jPanel1.add(panel16a19lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 110, 110));

        panel6a7amlunes.setBackground(new java.awt.Color(255, 255, 255));
        panel6a7amlunes.setRoundBottomLeft(20);
        panel6a7amlunes.setRoundBottomRight(20);
        panel6a7amlunes.setRoundTopLeft(20);
        panel6a7amlunes.setRoundTopRight(20);
        panel6a7amlunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound7.setBackground(new java.awt.Color(255, 51, 51));
        panelRound7.setRoundBottomLeft(20);
        panelRound7.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel6a7amlunes.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel4.setText("Salon");
        panel6a7amlunes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes.setText("Materia");
        panel6a7amlunes.add(materia6a7lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes.setText("Docente");
        panel6a7amlunes.add(docente6a7lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes.setText("Horario");
        panel6a7amlunes.add(horariode6a7lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel6a7amlunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 110, 50));

        panel7a8amlunes.setBackground(new java.awt.Color(255, 255, 255));
        panel7a8amlunes.setRoundBottomLeft(20);
        panel7a8amlunes.setRoundBottomRight(20);
        panel7a8amlunes.setRoundTopLeft(20);
        panel7a8amlunes.setRoundTopRight(20);
        panel7a8amlunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound18.setBackground(new java.awt.Color(255, 51, 51));
        panelRound18.setRoundBottomLeft(20);
        panelRound18.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound18Layout = new javax.swing.GroupLayout(panelRound18);
        panelRound18.setLayout(panelRound18Layout);
        panelRound18Layout.setHorizontalGroup(
            panelRound18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound18Layout.setVerticalGroup(
            panelRound18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel7a8amlunes.add(panelRound18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel15.setText("Salon");
        panel7a8amlunes.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes11.setText("Materia");
        panel7a8amlunes.add(materia6a7lunes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes11.setText("Docente");
        panel7a8amlunes.add(docente6a7lunes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes11.setText("Horario");
        panel7a8amlunes.add(horariode6a7lunes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel7a8amlunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, 50));

        panel8a9amlunes.setBackground(new java.awt.Color(255, 255, 255));
        panel8a9amlunes.setRoundBottomLeft(20);
        panel8a9amlunes.setRoundBottomRight(20);
        panel8a9amlunes.setRoundTopLeft(20);
        panel8a9amlunes.setRoundTopRight(20);
        panel8a9amlunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound19.setBackground(new java.awt.Color(255, 51, 51));
        panelRound19.setRoundBottomLeft(20);
        panelRound19.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound19Layout = new javax.swing.GroupLayout(panelRound19);
        panelRound19.setLayout(panelRound19Layout);
        panelRound19Layout.setHorizontalGroup(
            panelRound19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound19Layout.setVerticalGroup(
            panelRound19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel8a9amlunes.add(panelRound19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel16.setText("Salon");
        panel8a9amlunes.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes12.setText("Materia");
        panel8a9amlunes.add(materia6a7lunes12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes12.setText("Docente");
        panel8a9amlunes.add(docente6a7lunes12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes12.setText("Horario");
        panel8a9amlunes.add(horariode6a7lunes12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel8a9amlunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 110, 50));

        panel9a10amlunes.setBackground(new java.awt.Color(255, 255, 255));
        panel9a10amlunes.setRoundBottomLeft(20);
        panel9a10amlunes.setRoundBottomRight(20);
        panel9a10amlunes.setRoundTopLeft(20);
        panel9a10amlunes.setRoundTopRight(20);
        panel9a10amlunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound17.setBackground(new java.awt.Color(255, 51, 51));
        panelRound17.setRoundBottomLeft(20);
        panelRound17.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound17Layout = new javax.swing.GroupLayout(panelRound17);
        panelRound17.setLayout(panelRound17Layout);
        panelRound17Layout.setHorizontalGroup(
            panelRound17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound17Layout.setVerticalGroup(
            panelRound17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel9a10amlunes.add(panelRound17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel14.setText("Salon");
        panel9a10amlunes.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes10.setText("Materia");
        panel9a10amlunes.add(materia6a7lunes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes10.setText("Docente");
        panel9a10amlunes.add(docente6a7lunes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes10.setText("Horario");
        panel9a10amlunes.add(horariode6a7lunes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel9a10amlunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 110, 50));

        panel10a11amlunes.setBackground(new java.awt.Color(255, 255, 255));
        panel10a11amlunes.setRoundBottomLeft(20);
        panel10a11amlunes.setRoundBottomRight(20);
        panel10a11amlunes.setRoundTopLeft(20);
        panel10a11amlunes.setRoundTopRight(20);
        panel10a11amlunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound12.setBackground(new java.awt.Color(255, 51, 51));
        panelRound12.setRoundBottomLeft(20);
        panelRound12.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound12Layout = new javax.swing.GroupLayout(panelRound12);
        panelRound12.setLayout(panelRound12Layout);
        panelRound12Layout.setHorizontalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound12Layout.setVerticalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel10a11amlunes.add(panelRound12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel9.setText("Salon");
        panel10a11amlunes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes5.setText("Materia");
        panel10a11amlunes.add(materia6a7lunes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes5.setText("Docente");
        panel10a11amlunes.add(docente6a7lunes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes5.setText("Horario");
        panel10a11amlunes.add(horariode6a7lunes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel10a11amlunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 110, 50));

        panel11a12amlunes.setBackground(new java.awt.Color(255, 255, 255));
        panel11a12amlunes.setRoundBottomLeft(20);
        panel11a12amlunes.setRoundBottomRight(20);
        panel11a12amlunes.setRoundTopLeft(20);
        panel11a12amlunes.setRoundTopRight(20);
        panel11a12amlunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound20.setBackground(new java.awt.Color(255, 51, 51));
        panelRound20.setRoundBottomLeft(20);
        panelRound20.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound20Layout = new javax.swing.GroupLayout(panelRound20);
        panelRound20.setLayout(panelRound20Layout);
        panelRound20Layout.setHorizontalGroup(
            panelRound20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound20Layout.setVerticalGroup(
            panelRound20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel11a12amlunes.add(panelRound20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel17.setText("Salon");
        panel11a12amlunes.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes13.setText("Materia");
        panel11a12amlunes.add(materia6a7lunes13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes13.setText("Docente");
        panel11a12amlunes.add(docente6a7lunes13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes13.setText("Horario");
        panel11a12amlunes.add(horariode6a7lunes13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel11a12amlunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 110, 50));

        panel12a13lunes.setBackground(new java.awt.Color(255, 255, 255));
        panel12a13lunes.setRoundBottomLeft(20);
        panel12a13lunes.setRoundBottomRight(20);
        panel12a13lunes.setRoundTopLeft(20);
        panel12a13lunes.setRoundTopRight(20);
        panel12a13lunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound21.setBackground(new java.awt.Color(255, 51, 51));
        panelRound21.setRoundBottomLeft(20);
        panelRound21.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound21Layout = new javax.swing.GroupLayout(panelRound21);
        panelRound21.setLayout(panelRound21Layout);
        panelRound21Layout.setHorizontalGroup(
            panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound21Layout.setVerticalGroup(
            panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel12a13lunes.add(panelRound21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel18.setText("Salon");
        panel12a13lunes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes14.setText("Materia");
        panel12a13lunes.add(materia6a7lunes14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes14.setText("Docente");
        panel12a13lunes.add(docente6a7lunes14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes14.setText("Horario");
        panel12a13lunes.add(horariode6a7lunes14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel12a13lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 110, 50));

        panel13a14lunes.setBackground(new java.awt.Color(255, 255, 255));
        panel13a14lunes.setRoundBottomLeft(20);
        panel13a14lunes.setRoundBottomRight(20);
        panel13a14lunes.setRoundTopLeft(20);
        panel13a14lunes.setRoundTopRight(20);
        panel13a14lunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound22.setBackground(new java.awt.Color(255, 51, 51));
        panelRound22.setRoundBottomLeft(20);
        panelRound22.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound22Layout = new javax.swing.GroupLayout(panelRound22);
        panelRound22.setLayout(panelRound22Layout);
        panelRound22Layout.setHorizontalGroup(
            panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound22Layout.setVerticalGroup(
            panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel13a14lunes.add(panelRound22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel19.setText("Salon");
        panel13a14lunes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes15.setText("Materia");
        panel13a14lunes.add(materia6a7lunes15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes15.setText("Docente");
        panel13a14lunes.add(docente6a7lunes15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes15.setText("Horario");
        panel13a14lunes.add(horariode6a7lunes15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel13a14lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 110, 50));

        panel14a15lunes.setBackground(new java.awt.Color(255, 255, 255));
        panel14a15lunes.setRoundBottomLeft(20);
        panel14a15lunes.setRoundBottomRight(20);
        panel14a15lunes.setRoundTopLeft(20);
        panel14a15lunes.setRoundTopRight(20);
        panel14a15lunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound23.setBackground(new java.awt.Color(255, 51, 51));
        panelRound23.setRoundBottomLeft(20);
        panelRound23.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound23Layout = new javax.swing.GroupLayout(panelRound23);
        panelRound23.setLayout(panelRound23Layout);
        panelRound23Layout.setHorizontalGroup(
            panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound23Layout.setVerticalGroup(
            panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel14a15lunes.add(panelRound23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel20.setText("Salon");
        panel14a15lunes.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes16.setText("Materia");
        panel14a15lunes.add(materia6a7lunes16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes16.setText("Docente");
        panel14a15lunes.add(docente6a7lunes16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes16.setText("Horario");
        panel14a15lunes.add(horariode6a7lunes16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel14a15lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 110, 50));

        panel15a16lunes.setBackground(new java.awt.Color(255, 255, 255));
        panel15a16lunes.setRoundBottomLeft(20);
        panel15a16lunes.setRoundBottomRight(20);
        panel15a16lunes.setRoundTopLeft(20);
        panel15a16lunes.setRoundTopRight(20);
        panel15a16lunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound24.setBackground(new java.awt.Color(255, 51, 51));
        panelRound24.setRoundBottomLeft(20);
        panelRound24.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound24Layout = new javax.swing.GroupLayout(panelRound24);
        panelRound24.setLayout(panelRound24Layout);
        panelRound24Layout.setHorizontalGroup(
            panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound24Layout.setVerticalGroup(
            panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel15a16lunes.add(panelRound24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel21.setText("Salon");
        panel15a16lunes.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes17.setText("Materia");
        panel15a16lunes.add(materia6a7lunes17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes17.setText("Docente");
        panel15a16lunes.add(docente6a7lunes17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes17.setText("Horario");
        panel15a16lunes.add(horariode6a7lunes17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel15a16lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 110, 50));

        panel16a17lunes.setBackground(new java.awt.Color(255, 255, 255));
        panel16a17lunes.setRoundBottomLeft(20);
        panel16a17lunes.setRoundBottomRight(20);
        panel16a17lunes.setRoundTopLeft(20);
        panel16a17lunes.setRoundTopRight(20);
        panel16a17lunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound25.setBackground(new java.awt.Color(255, 51, 51));
        panelRound25.setRoundBottomLeft(20);
        panelRound25.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound25Layout = new javax.swing.GroupLayout(panelRound25);
        panelRound25.setLayout(panelRound25Layout);
        panelRound25Layout.setHorizontalGroup(
            panelRound25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound25Layout.setVerticalGroup(
            panelRound25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel16a17lunes.add(panelRound25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel22.setText("Salon");
        panel16a17lunes.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes18.setText("Materia");
        panel16a17lunes.add(materia6a7lunes18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes18.setText("Docente");
        panel16a17lunes.add(docente6a7lunes18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes18.setText("Horario");
        panel16a17lunes.add(horariode6a7lunes18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel16a17lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 110, 50));

        panel17a18lunes.setBackground(new java.awt.Color(255, 255, 255));
        panel17a18lunes.setRoundBottomLeft(20);
        panel17a18lunes.setRoundBottomRight(20);
        panel17a18lunes.setRoundTopLeft(20);
        panel17a18lunes.setRoundTopRight(20);
        panel17a18lunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound26.setBackground(new java.awt.Color(255, 51, 51));
        panelRound26.setRoundBottomLeft(20);
        panelRound26.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound26Layout = new javax.swing.GroupLayout(panelRound26);
        panelRound26.setLayout(panelRound26Layout);
        panelRound26Layout.setHorizontalGroup(
            panelRound26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound26Layout.setVerticalGroup(
            panelRound26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel17a18lunes.add(panelRound26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel23.setText("Salon");
        panel17a18lunes.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes19.setText("Materia");
        panel17a18lunes.add(materia6a7lunes19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes19.setText("Docente");
        panel17a18lunes.add(docente6a7lunes19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes19.setText("Horario");
        panel17a18lunes.add(horariode6a7lunes19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel17a18lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 110, 50));

        panel18a19lunes.setBackground(new java.awt.Color(255, 255, 255));
        panel18a19lunes.setRoundBottomLeft(20);
        panel18a19lunes.setRoundBottomRight(20);
        panel18a19lunes.setRoundTopLeft(20);
        panel18a19lunes.setRoundTopRight(20);
        panel18a19lunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound28.setBackground(new java.awt.Color(255, 51, 51));
        panelRound28.setRoundBottomLeft(20);
        panelRound28.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound28Layout = new javax.swing.GroupLayout(panelRound28);
        panelRound28.setLayout(panelRound28Layout);
        panelRound28Layout.setHorizontalGroup(
            panelRound28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound28Layout.setVerticalGroup(
            panelRound28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel18a19lunes.add(panelRound28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel25.setText("Salon");
        panel18a19lunes.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes21.setText("Materia");
        panel18a19lunes.add(materia6a7lunes21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes21.setText("Docente");
        panel18a19lunes.add(docente6a7lunes21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes21.setText("Horario");
        panel18a19lunes.add(horariode6a7lunes21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel18a19lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 110, 50));

        panel19a20lunes.setBackground(new java.awt.Color(255, 255, 255));
        panel19a20lunes.setRoundBottomLeft(20);
        panel19a20lunes.setRoundBottomRight(20);
        panel19a20lunes.setRoundTopLeft(20);
        panel19a20lunes.setRoundTopRight(20);
        panel19a20lunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound13.setBackground(new java.awt.Color(255, 51, 51));
        panelRound13.setRoundBottomLeft(20);
        panelRound13.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound13Layout = new javax.swing.GroupLayout(panelRound13);
        panelRound13.setLayout(panelRound13Layout);
        panelRound13Layout.setHorizontalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound13Layout.setVerticalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel19a20lunes.add(panelRound13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel10.setText("Salon");
        panel19a20lunes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes6.setText("Materia");
        panel19a20lunes.add(materia6a7lunes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes6.setText("Docente");
        panel19a20lunes.add(docente6a7lunes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes6.setText("Horario");
        panel19a20lunes.add(horariode6a7lunes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel19a20lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 110, 50));

        panel20a21lunes.setBackground(new java.awt.Color(255, 255, 255));
        panel20a21lunes.setRoundBottomLeft(20);
        panel20a21lunes.setRoundBottomRight(20);
        panel20a21lunes.setRoundTopLeft(20);
        panel20a21lunes.setRoundTopRight(20);
        panel20a21lunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound16.setBackground(new java.awt.Color(255, 51, 51));
        panelRound16.setRoundBottomLeft(20);
        panelRound16.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound16Layout = new javax.swing.GroupLayout(panelRound16);
        panelRound16.setLayout(panelRound16Layout);
        panelRound16Layout.setHorizontalGroup(
            panelRound16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound16Layout.setVerticalGroup(
            panelRound16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel20a21lunes.add(panelRound16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel13.setText("Salon");
        panel20a21lunes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes9.setText("Materia");
        panel20a21lunes.add(materia6a7lunes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes9.setText("Docente");
        panel20a21lunes.add(docente6a7lunes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes9.setText("Horario");
        panel20a21lunes.add(horariode6a7lunes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel20a21lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 110, 50));

        panel6a8amlunes.setBackground(new java.awt.Color(255, 255, 255));
        panel6a8amlunes.setRoundBottomLeft(20);
        panel6a8amlunes.setRoundBottomRight(20);
        panel6a8amlunes.setRoundTopLeft(20);
        panel6a8amlunes.setRoundTopRight(20);
        panel6a8amlunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes20.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes20.setRoundBottomLeft(20);
        panelinterno6amlunes20.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes20Layout = new javax.swing.GroupLayout(panelinterno6amlunes20);
        panelinterno6amlunes20.setLayout(panelinterno6amlunes20Layout);
        panelinterno6amlunes20Layout.setHorizontalGroup(
            panelinterno6amlunes20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes20Layout.setVerticalGroup(
            panelinterno6amlunes20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panel6a8amlunes.add(panelinterno6amlunes20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        salon6a8lunes20.setText("Salon");
        panel6a8amlunes.add(salon6a8lunes20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 20));

        materia6a8amlunes20.setText("Materia");
        panel6a8amlunes.add(materia6a8amlunes20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes20.setText("Docente");
        panel6a8amlunes.add(docente6a8lunes20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        horariode6a8lunes20.setText("Horario");
        panel6a8amlunes.add(horariode6a8lunes20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));

        jPanel1.add(panel6a8amlunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        panel8a10amlunes.setBackground(new java.awt.Color(255, 255, 255));
        panel8a10amlunes.setRoundBottomLeft(20);
        panel8a10amlunes.setRoundBottomRight(20);
        panel8a10amlunes.setRoundTopLeft(20);
        panel8a10amlunes.setRoundTopRight(20);
        panel8a10amlunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes22.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes22.setRoundBottomLeft(20);
        panelinterno6amlunes22.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes22Layout = new javax.swing.GroupLayout(panelinterno6amlunes22);
        panelinterno6amlunes22.setLayout(panelinterno6amlunes22Layout);
        panelinterno6amlunes22Layout.setHorizontalGroup(
            panelinterno6amlunes22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes22Layout.setVerticalGroup(
            panelinterno6amlunes22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panel8a10amlunes.add(panelinterno6amlunes22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        salon6a8lunes22.setText("Salon");
        panel8a10amlunes.add(salon6a8lunes22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 20));

        materia6a8amlunes22.setText("Materia");
        panel8a10amlunes.add(materia6a8amlunes22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes22.setText("Docente");
        panel8a10amlunes.add(docente6a8lunes22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        horariode6a8lunes22.setText("Horario");
        panel8a10amlunes.add(horariode6a8lunes22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));

        jPanel1.add(panel8a10amlunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, 80));

        panel10a12amlunes.setBackground(new java.awt.Color(255, 255, 255));
        panel10a12amlunes.setRoundBottomLeft(20);
        panel10a12amlunes.setRoundBottomRight(20);
        panel10a12amlunes.setRoundTopLeft(20);
        panel10a12amlunes.setRoundTopRight(20);
        panel10a12amlunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes24.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes24.setRoundBottomLeft(20);
        panelinterno6amlunes24.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes24Layout = new javax.swing.GroupLayout(panelinterno6amlunes24);
        panelinterno6amlunes24.setLayout(panelinterno6amlunes24Layout);
        panelinterno6amlunes24Layout.setHorizontalGroup(
            panelinterno6amlunes24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes24Layout.setVerticalGroup(
            panelinterno6amlunes24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panel10a12amlunes.add(panelinterno6amlunes24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        salon6a8lunes24.setText("Salon");
        panel10a12amlunes.add(salon6a8lunes24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 20));

        materia6a8amlunes24.setText("Materia");
        panel10a12amlunes.add(materia6a8amlunes24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes24.setText("Docente");
        panel10a12amlunes.add(docente6a8lunes24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        horariode6a8lunes24.setText("Horario");
        panel10a12amlunes.add(horariode6a8lunes24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));

        jPanel1.add(panel10a12amlunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, 80));

        panel7a10amMartes.setBackground(new java.awt.Color(255, 255, 255));
        panel7a10amMartes.setRoundBottomLeft(20);
        panel7a10amMartes.setRoundBottomRight(20);
        panel7a10amMartes.setRoundTopLeft(20);
        panel7a10amMartes.setRoundTopRight(20);
        panel7a10amMartes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes45.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes45.setRoundBottomLeft(20);
        panelinterno6amlunes45.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes45Layout = new javax.swing.GroupLayout(panelinterno6amlunes45);
        panelinterno6amlunes45.setLayout(panelinterno6amlunes45Layout);
        panelinterno6amlunes45Layout.setHorizontalGroup(
            panelinterno6amlunes45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes45Layout.setVerticalGroup(
            panelinterno6amlunes45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        panel7a10amMartes.add(panelinterno6amlunes45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 110));

        salon6a8lunes45.setText("Salon");
        panel7a10amMartes.add(salon6a8lunes45, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 50, 20));

        materia6a8amlunes45.setText("Materia");
        panel7a10amMartes.add(materia6a8amlunes45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes45.setText("Docente");
        panel7a10amMartes.add(docente6a8lunes45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        horariode6a8lunes45.setText("Horario");
        panel7a10amMartes.add(horariode6a8lunes45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 20));

        jPanel1.add(panel7a10amMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, 110));

        panel6a7amMartes.setBackground(new java.awt.Color(255, 255, 255));
        panel6a7amMartes.setRoundBottomLeft(20);
        panel6a7amMartes.setRoundBottomRight(20);
        panel6a7amMartes.setRoundTopLeft(20);
        panel6a7amMartes.setRoundTopRight(20);
        panel6a7amMartes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound8.setBackground(new java.awt.Color(255, 51, 51));
        panelRound8.setRoundBottomLeft(20);
        panelRound8.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel6a7amMartes.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel5.setText("Salon");
        panel6a7amMartes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes1.setText("Materia");
        panel6a7amMartes.add(materia6a7lunes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes1.setText("Docente");
        panel6a7amMartes.add(docente6a7lunes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes1.setText("Horario");
        panel6a7amMartes.add(horariode6a7lunes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel6a7amMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 110, 50));

        panel7a8amMartes.setBackground(new java.awt.Color(255, 255, 255));
        panel7a8amMartes.setRoundBottomLeft(20);
        panel7a8amMartes.setRoundBottomRight(20);
        panel7a8amMartes.setRoundTopLeft(20);
        panel7a8amMartes.setRoundTopRight(20);
        panel7a8amMartes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound27.setBackground(new java.awt.Color(255, 51, 51));
        panelRound27.setRoundBottomLeft(20);
        panelRound27.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound27Layout = new javax.swing.GroupLayout(panelRound27);
        panelRound27.setLayout(panelRound27Layout);
        panelRound27Layout.setHorizontalGroup(
            panelRound27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound27Layout.setVerticalGroup(
            panelRound27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel7a8amMartes.add(panelRound27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel24.setText("Salon");
        panel7a8amMartes.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes20.setText("Materia");
        panel7a8amMartes.add(materia6a7lunes20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes20.setText("Docente");
        panel7a8amMartes.add(docente6a7lunes20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes20.setText("Horario");
        panel7a8amMartes.add(horariode6a7lunes20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel7a8amMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, 50));

        panel8a9amMartes.setBackground(new java.awt.Color(255, 255, 255));
        panel8a9amMartes.setRoundBottomLeft(20);
        panel8a9amMartes.setRoundBottomRight(20);
        panel8a9amMartes.setRoundTopLeft(20);
        panel8a9amMartes.setRoundTopRight(20);
        panel8a9amMartes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound29.setBackground(new java.awt.Color(255, 51, 51));
        panelRound29.setRoundBottomLeft(20);
        panelRound29.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound29Layout = new javax.swing.GroupLayout(panelRound29);
        panelRound29.setLayout(panelRound29Layout);
        panelRound29Layout.setHorizontalGroup(
            panelRound29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound29Layout.setVerticalGroup(
            panelRound29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel8a9amMartes.add(panelRound29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel26.setText("Salon");
        panel8a9amMartes.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes22.setText("Materia");
        panel8a9amMartes.add(materia6a7lunes22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes22.setText("Docente");
        panel8a9amMartes.add(docente6a7lunes22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes22.setText("Horario");
        panel8a9amMartes.add(horariode6a7lunes22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel8a9amMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 110, 50));

        panel9a10amMartes.setBackground(new java.awt.Color(255, 255, 255));
        panel9a10amMartes.setRoundBottomLeft(20);
        panel9a10amMartes.setRoundBottomRight(20);
        panel9a10amMartes.setRoundTopLeft(20);
        panel9a10amMartes.setRoundTopRight(20);
        panel9a10amMartes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound30.setBackground(new java.awt.Color(255, 51, 51));
        panelRound30.setRoundBottomLeft(20);
        panelRound30.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound30Layout = new javax.swing.GroupLayout(panelRound30);
        panelRound30.setLayout(panelRound30Layout);
        panelRound30Layout.setHorizontalGroup(
            panelRound30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound30Layout.setVerticalGroup(
            panelRound30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel9a10amMartes.add(panelRound30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel27.setText("Salon");
        panel9a10amMartes.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes23.setText("Materia");
        panel9a10amMartes.add(materia6a7lunes23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes23.setText("Docente");
        panel9a10amMartes.add(docente6a7lunes23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes23.setText("Horario");
        panel9a10amMartes.add(horariode6a7lunes23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel9a10amMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 110, 50));

        panel10a11amMartes.setBackground(new java.awt.Color(255, 255, 255));
        panel10a11amMartes.setRoundBottomLeft(20);
        panel10a11amMartes.setRoundBottomRight(20);
        panel10a11amMartes.setRoundTopLeft(20);
        panel10a11amMartes.setRoundTopRight(20);
        panel10a11amMartes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound14.setBackground(new java.awt.Color(255, 51, 51));
        panelRound14.setRoundBottomLeft(20);
        panelRound14.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound14Layout = new javax.swing.GroupLayout(panelRound14);
        panelRound14.setLayout(panelRound14Layout);
        panelRound14Layout.setHorizontalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound14Layout.setVerticalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel10a11amMartes.add(panelRound14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel11.setText("Salon");
        panel10a11amMartes.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes7.setText("Materia");
        panel10a11amMartes.add(materia6a7lunes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes7.setText("Docente");
        panel10a11amMartes.add(docente6a7lunes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes7.setText("Horario");
        panel10a11amMartes.add(horariode6a7lunes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel10a11amMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 110, 50));

        panel11a12amMartes.setBackground(new java.awt.Color(255, 255, 255));
        panel11a12amMartes.setRoundBottomLeft(20);
        panel11a12amMartes.setRoundBottomRight(20);
        panel11a12amMartes.setRoundTopLeft(20);
        panel11a12amMartes.setRoundTopRight(20);
        panel11a12amMartes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound31.setBackground(new java.awt.Color(255, 51, 51));
        panelRound31.setRoundBottomLeft(20);
        panelRound31.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound31Layout = new javax.swing.GroupLayout(panelRound31);
        panelRound31.setLayout(panelRound31Layout);
        panelRound31Layout.setHorizontalGroup(
            panelRound31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound31Layout.setVerticalGroup(
            panelRound31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel11a12amMartes.add(panelRound31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel28.setText("Salon");
        panel11a12amMartes.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes24.setText("Materia");
        panel11a12amMartes.add(materia6a7lunes24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes24.setText("Docente");
        panel11a12amMartes.add(docente6a7lunes24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes24.setText("Horario");
        panel11a12amMartes.add(horariode6a7lunes24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel11a12amMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 110, 50));

        panel12a13Martes.setBackground(new java.awt.Color(255, 255, 255));
        panel12a13Martes.setRoundBottomLeft(20);
        panel12a13Martes.setRoundBottomRight(20);
        panel12a13Martes.setRoundTopLeft(20);
        panel12a13Martes.setRoundTopRight(20);
        panel12a13Martes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound32.setBackground(new java.awt.Color(255, 51, 51));
        panelRound32.setRoundBottomLeft(20);
        panelRound32.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound32Layout = new javax.swing.GroupLayout(panelRound32);
        panelRound32.setLayout(panelRound32Layout);
        panelRound32Layout.setHorizontalGroup(
            panelRound32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound32Layout.setVerticalGroup(
            panelRound32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel12a13Martes.add(panelRound32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel29.setText("Salon");
        panel12a13Martes.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes25.setText("Materia");
        panel12a13Martes.add(materia6a7lunes25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes25.setText("Docente");
        panel12a13Martes.add(docente6a7lunes25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes25.setText("Horario");
        panel12a13Martes.add(horariode6a7lunes25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel12a13Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 110, 50));

        panel13a14Martes.setBackground(new java.awt.Color(255, 255, 255));
        panel13a14Martes.setRoundBottomLeft(20);
        panel13a14Martes.setRoundBottomRight(20);
        panel13a14Martes.setRoundTopLeft(20);
        panel13a14Martes.setRoundTopRight(20);
        panel13a14Martes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound33.setBackground(new java.awt.Color(255, 51, 51));
        panelRound33.setRoundBottomLeft(20);
        panelRound33.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound33Layout = new javax.swing.GroupLayout(panelRound33);
        panelRound33.setLayout(panelRound33Layout);
        panelRound33Layout.setHorizontalGroup(
            panelRound33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound33Layout.setVerticalGroup(
            panelRound33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel13a14Martes.add(panelRound33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel30.setText("Salon");
        panel13a14Martes.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes26.setText("Materia");
        panel13a14Martes.add(materia6a7lunes26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes26.setText("Docente");
        panel13a14Martes.add(docente6a7lunes26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes26.setText("Horario");
        panel13a14Martes.add(horariode6a7lunes26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel13a14Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 110, 50));

        panel14a15Martes.setBackground(new java.awt.Color(255, 255, 255));
        panel14a15Martes.setRoundBottomLeft(20);
        panel14a15Martes.setRoundBottomRight(20);
        panel14a15Martes.setRoundTopLeft(20);
        panel14a15Martes.setRoundTopRight(20);
        panel14a15Martes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound34.setBackground(new java.awt.Color(255, 51, 51));
        panelRound34.setRoundBottomLeft(20);
        panelRound34.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound34Layout = new javax.swing.GroupLayout(panelRound34);
        panelRound34.setLayout(panelRound34Layout);
        panelRound34Layout.setHorizontalGroup(
            panelRound34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound34Layout.setVerticalGroup(
            panelRound34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel14a15Martes.add(panelRound34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel31.setText("Salon");
        panel14a15Martes.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes27.setText("Materia");
        panel14a15Martes.add(materia6a7lunes27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes27.setText("Docente");
        panel14a15Martes.add(docente6a7lunes27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes27.setText("Horario");
        panel14a15Martes.add(horariode6a7lunes27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel14a15Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 110, 50));

        panel15a16Martes.setBackground(new java.awt.Color(255, 255, 255));
        panel15a16Martes.setRoundBottomLeft(20);
        panel15a16Martes.setRoundBottomRight(20);
        panel15a16Martes.setRoundTopLeft(20);
        panel15a16Martes.setRoundTopRight(20);
        panel15a16Martes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound35.setBackground(new java.awt.Color(255, 51, 51));
        panelRound35.setRoundBottomLeft(20);
        panelRound35.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound35Layout = new javax.swing.GroupLayout(panelRound35);
        panelRound35.setLayout(panelRound35Layout);
        panelRound35Layout.setHorizontalGroup(
            panelRound35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound35Layout.setVerticalGroup(
            panelRound35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel15a16Martes.add(panelRound35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel32.setText("Salon");
        panel15a16Martes.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes28.setText("Materia");
        panel15a16Martes.add(materia6a7lunes28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes28.setText("Docente");
        panel15a16Martes.add(docente6a7lunes28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes28.setText("Horario");
        panel15a16Martes.add(horariode6a7lunes28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel15a16Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 110, 50));

        panel16a17Martes.setBackground(new java.awt.Color(255, 255, 255));
        panel16a17Martes.setRoundBottomLeft(20);
        panel16a17Martes.setRoundBottomRight(20);
        panel16a17Martes.setRoundTopLeft(20);
        panel16a17Martes.setRoundTopRight(20);
        panel16a17Martes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound36.setBackground(new java.awt.Color(255, 51, 51));
        panelRound36.setRoundBottomLeft(20);
        panelRound36.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound36Layout = new javax.swing.GroupLayout(panelRound36);
        panelRound36.setLayout(panelRound36Layout);
        panelRound36Layout.setHorizontalGroup(
            panelRound36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound36Layout.setVerticalGroup(
            panelRound36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel16a17Martes.add(panelRound36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel33.setText("Salon");
        panel16a17Martes.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes29.setText("Materia");
        panel16a17Martes.add(materia6a7lunes29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes29.setText("Docente");
        panel16a17Martes.add(docente6a7lunes29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes29.setText("Horario");
        panel16a17Martes.add(horariode6a7lunes29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel16a17Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 110, 50));

        panel17a18Martes.setBackground(new java.awt.Color(255, 255, 255));
        panel17a18Martes.setRoundBottomLeft(20);
        panel17a18Martes.setRoundBottomRight(20);
        panel17a18Martes.setRoundTopLeft(20);
        panel17a18Martes.setRoundTopRight(20);
        panel17a18Martes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound37.setBackground(new java.awt.Color(255, 51, 51));
        panelRound37.setRoundBottomLeft(20);
        panelRound37.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound37Layout = new javax.swing.GroupLayout(panelRound37);
        panelRound37.setLayout(panelRound37Layout);
        panelRound37Layout.setHorizontalGroup(
            panelRound37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound37Layout.setVerticalGroup(
            panelRound37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel17a18Martes.add(panelRound37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel34.setText("Salon");
        panel17a18Martes.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes30.setText("Materia");
        panel17a18Martes.add(materia6a7lunes30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes30.setText("Docente");
        panel17a18Martes.add(docente6a7lunes30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes30.setText("Horario");
        panel17a18Martes.add(horariode6a7lunes30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel17a18Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 110, 50));

        panel18a19Martes.setBackground(new java.awt.Color(255, 255, 255));
        panel18a19Martes.setRoundBottomLeft(20);
        panel18a19Martes.setRoundBottomRight(20);
        panel18a19Martes.setRoundTopLeft(20);
        panel18a19Martes.setRoundTopRight(20);
        panel18a19Martes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound38.setBackground(new java.awt.Color(255, 51, 51));
        panelRound38.setRoundBottomLeft(20);
        panelRound38.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound38Layout = new javax.swing.GroupLayout(panelRound38);
        panelRound38.setLayout(panelRound38Layout);
        panelRound38Layout.setHorizontalGroup(
            panelRound38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound38Layout.setVerticalGroup(
            panelRound38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel18a19Martes.add(panelRound38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel35.setText("Salon");
        panel18a19Martes.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes31.setText("Materia");
        panel18a19Martes.add(materia6a7lunes31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes31.setText("Docente");
        panel18a19Martes.add(docente6a7lunes31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes31.setText("Horario");
        panel18a19Martes.add(horariode6a7lunes31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel18a19Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 110, 50));

        panel19a20Martes.setBackground(new java.awt.Color(255, 255, 255));
        panel19a20Martes.setRoundBottomLeft(20);
        panel19a20Martes.setRoundBottomRight(20);
        panel19a20Martes.setRoundTopLeft(20);
        panel19a20Martes.setRoundTopRight(20);
        panel19a20Martes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound15.setBackground(new java.awt.Color(255, 51, 51));
        panelRound15.setRoundBottomLeft(20);
        panelRound15.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound15Layout = new javax.swing.GroupLayout(panelRound15);
        panelRound15.setLayout(panelRound15Layout);
        panelRound15Layout.setHorizontalGroup(
            panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound15Layout.setVerticalGroup(
            panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel19a20Martes.add(panelRound15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel12.setText("Salon");
        panel19a20Martes.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes8.setText("Materia");
        panel19a20Martes.add(materia6a7lunes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes8.setText("Docente");
        panel19a20Martes.add(docente6a7lunes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes8.setText("Horario");
        panel19a20Martes.add(horariode6a7lunes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel19a20Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 110, 50));

        panel20a21Martes.setBackground(new java.awt.Color(255, 255, 255));
        panel20a21Martes.setRoundBottomLeft(20);
        panel20a21Martes.setRoundBottomRight(20);
        panel20a21Martes.setRoundTopLeft(20);
        panel20a21Martes.setRoundTopRight(20);
        panel20a21Martes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound39.setBackground(new java.awt.Color(255, 51, 51));
        panelRound39.setRoundBottomLeft(20);
        panelRound39.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound39Layout = new javax.swing.GroupLayout(panelRound39);
        panelRound39.setLayout(panelRound39Layout);
        panelRound39Layout.setHorizontalGroup(
            panelRound39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound39Layout.setVerticalGroup(
            panelRound39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel20a21Martes.add(panelRound39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel36.setText("Salon");
        panel20a21Martes.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes32.setText("Materia");
        panel20a21Martes.add(materia6a7lunes32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes32.setText("Docente");
        panel20a21Martes.add(docente6a7lunes32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes32.setText("Horario");
        panel20a21Martes.add(horariode6a7lunes32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel20a21Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 110, 50));

        panel14a16Martes.setBackground(new java.awt.Color(255, 255, 255));
        panel14a16Martes.setRoundBottomLeft(20);
        panel14a16Martes.setRoundBottomRight(20);
        panel14a16Martes.setRoundTopLeft(20);
        panel14a16Martes.setRoundTopRight(20);
        panel14a16Martes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes65.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes65.setRoundBottomLeft(20);
        panelinterno6amlunes65.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes65Layout = new javax.swing.GroupLayout(panelinterno6amlunes65);
        panelinterno6amlunes65.setLayout(panelinterno6amlunes65Layout);
        panelinterno6amlunes65Layout.setHorizontalGroup(
            panelinterno6amlunes65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes65Layout.setVerticalGroup(
            panelinterno6amlunes65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panel14a16Martes.add(panelinterno6amlunes65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        salon6a8lunes65.setText("Salon");
        panel14a16Martes.add(salon6a8lunes65, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 20));

        materia6a8amlunes65.setText("Materia");
        panel14a16Martes.add(materia6a8amlunes65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes65.setText("Docente");
        panel14a16Martes.add(docente6a8lunes65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        horariode6a8lunes65.setText("Horario");
        panel14a16Martes.add(horariode6a8lunes65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));

        jPanel1.add(panel14a16Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, 80));

        panel15a17Martes.setBackground(new java.awt.Color(255, 255, 255));
        panel15a17Martes.setRoundBottomLeft(20);
        panel15a17Martes.setRoundBottomRight(20);
        panel15a17Martes.setRoundTopLeft(20);
        panel15a17Martes.setRoundTopRight(20);
        panel15a17Martes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes66.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes66.setRoundBottomLeft(20);
        panelinterno6amlunes66.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes66Layout = new javax.swing.GroupLayout(panelinterno6amlunes66);
        panelinterno6amlunes66.setLayout(panelinterno6amlunes66Layout);
        panelinterno6amlunes66Layout.setHorizontalGroup(
            panelinterno6amlunes66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes66Layout.setVerticalGroup(
            panelinterno6amlunes66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panel15a17Martes.add(panelinterno6amlunes66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        salon6a8lunes66.setText("Salon");
        panel15a17Martes.add(salon6a8lunes66, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 20));

        materia6a8amlunes66.setText("Materia");
        panel15a17Martes.add(materia6a8amlunes66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes66.setText("Docente");
        panel15a17Martes.add(docente6a8lunes66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        horariode6a8lunes66.setText("Horario");
        panel15a17Martes.add(horariode6a8lunes66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));

        jPanel1.add(panel15a17Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, 80));

        panel6a7amMiercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel6a7amMiercoles.setRoundBottomLeft(20);
        panel6a7amMiercoles.setRoundBottomRight(20);
        panel6a7amMiercoles.setRoundTopLeft(20);
        panel6a7amMiercoles.setRoundTopRight(20);
        panel6a7amMiercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound10.setBackground(new java.awt.Color(255, 51, 51));
        panelRound10.setRoundBottomLeft(20);
        panelRound10.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound10Layout = new javax.swing.GroupLayout(panelRound10);
        panelRound10.setLayout(panelRound10Layout);
        panelRound10Layout.setHorizontalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound10Layout.setVerticalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel6a7amMiercoles.add(panelRound10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel7.setText("Salon");
        panel6a7amMiercoles.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes3.setText("Materia");
        panel6a7amMiercoles.add(materia6a7lunes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes3.setText("Docente");
        panel6a7amMiercoles.add(docente6a7lunes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes3.setText("Horario");
        panel6a7amMiercoles.add(horariode6a7lunes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel6a7amMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 110, 50));

        panel7a8amMiercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel7a8amMiercoles.setRoundBottomLeft(20);
        panel7a8amMiercoles.setRoundBottomRight(20);
        panel7a8amMiercoles.setRoundTopLeft(20);
        panel7a8amMiercoles.setRoundTopRight(20);
        panel7a8amMiercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound54.setBackground(new java.awt.Color(255, 51, 51));
        panelRound54.setRoundBottomLeft(20);
        panelRound54.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound54Layout = new javax.swing.GroupLayout(panelRound54);
        panelRound54.setLayout(panelRound54Layout);
        panelRound54Layout.setHorizontalGroup(
            panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound54Layout.setVerticalGroup(
            panelRound54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel7a8amMiercoles.add(panelRound54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel51.setText("Salon");
        panel7a8amMiercoles.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes47.setText("Materia");
        panel7a8amMiercoles.add(materia6a7lunes47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes47.setText("Docente");
        panel7a8amMiercoles.add(docente6a7lunes47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes47.setText("Horario");
        panel7a8amMiercoles.add(horariode6a7lunes47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel7a8amMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 110, 50));

        panel8a9amMiercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel8a9amMiercoles.setRoundBottomLeft(20);
        panel8a9amMiercoles.setRoundBottomRight(20);
        panel8a9amMiercoles.setRoundTopLeft(20);
        panel8a9amMiercoles.setRoundTopRight(20);
        panel8a9amMiercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound55.setBackground(new java.awt.Color(255, 51, 51));
        panelRound55.setRoundBottomLeft(20);
        panelRound55.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound55Layout = new javax.swing.GroupLayout(panelRound55);
        panelRound55.setLayout(panelRound55Layout);
        panelRound55Layout.setHorizontalGroup(
            panelRound55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound55Layout.setVerticalGroup(
            panelRound55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel8a9amMiercoles.add(panelRound55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel52.setText("Salon");
        panel8a9amMiercoles.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes48.setText("Materia");
        panel8a9amMiercoles.add(materia6a7lunes48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes48.setText("Docente");
        panel8a9amMiercoles.add(docente6a7lunes48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes48.setText("Horario");
        panel8a9amMiercoles.add(horariode6a7lunes48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel8a9amMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 110, 50));

        panel9a10amMiercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel9a10amMiercoles.setRoundBottomLeft(20);
        panel9a10amMiercoles.setRoundBottomRight(20);
        panel9a10amMiercoles.setRoundTopLeft(20);
        panel9a10amMiercoles.setRoundTopRight(20);
        panel9a10amMiercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound56.setBackground(new java.awt.Color(255, 51, 51));
        panelRound56.setRoundBottomLeft(20);
        panelRound56.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound56Layout = new javax.swing.GroupLayout(panelRound56);
        panelRound56.setLayout(panelRound56Layout);
        panelRound56Layout.setHorizontalGroup(
            panelRound56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound56Layout.setVerticalGroup(
            panelRound56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel9a10amMiercoles.add(panelRound56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel53.setText("Salon");
        panel9a10amMiercoles.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes49.setText("Materia");
        panel9a10amMiercoles.add(materia6a7lunes49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes49.setText("Docente");
        panel9a10amMiercoles.add(docente6a7lunes49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes49.setText("Horario");
        panel9a10amMiercoles.add(horariode6a7lunes49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel9a10amMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 110, 50));

        panel10a11amMiercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel10a11amMiercoles.setRoundBottomLeft(20);
        panel10a11amMiercoles.setRoundBottomRight(20);
        panel10a11amMiercoles.setRoundTopLeft(20);
        panel10a11amMiercoles.setRoundTopRight(20);
        panel10a11amMiercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound57.setBackground(new java.awt.Color(255, 51, 51));
        panelRound57.setRoundBottomLeft(20);
        panelRound57.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound57Layout = new javax.swing.GroupLayout(panelRound57);
        panelRound57.setLayout(panelRound57Layout);
        panelRound57Layout.setHorizontalGroup(
            panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound57Layout.setVerticalGroup(
            panelRound57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel10a11amMiercoles.add(panelRound57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel54.setText("Salon");
        panel10a11amMiercoles.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes50.setText("Materia");
        panel10a11amMiercoles.add(materia6a7lunes50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes50.setText("Docente");
        panel10a11amMiercoles.add(docente6a7lunes50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes50.setText("Horario");
        panel10a11amMiercoles.add(horariode6a7lunes50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel10a11amMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 110, 50));

        panel11a12amMiercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel11a12amMiercoles.setRoundBottomLeft(20);
        panel11a12amMiercoles.setRoundBottomRight(20);
        panel11a12amMiercoles.setRoundTopLeft(20);
        panel11a12amMiercoles.setRoundTopRight(20);
        panel11a12amMiercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound58.setBackground(new java.awt.Color(255, 51, 51));
        panelRound58.setRoundBottomLeft(20);
        panelRound58.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound58Layout = new javax.swing.GroupLayout(panelRound58);
        panelRound58.setLayout(panelRound58Layout);
        panelRound58Layout.setHorizontalGroup(
            panelRound58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound58Layout.setVerticalGroup(
            panelRound58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel11a12amMiercoles.add(panelRound58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel55.setText("Salon");
        panel11a12amMiercoles.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes51.setText("Materia");
        panel11a12amMiercoles.add(materia6a7lunes51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes51.setText("Docente");
        panel11a12amMiercoles.add(docente6a7lunes51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes51.setText("Horario");
        panel11a12amMiercoles.add(horariode6a7lunes51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel11a12amMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 110, 50));

        panel12a13Miercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel12a13Miercoles.setRoundBottomLeft(20);
        panel12a13Miercoles.setRoundBottomRight(20);
        panel12a13Miercoles.setRoundTopLeft(20);
        panel12a13Miercoles.setRoundTopRight(20);
        panel12a13Miercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound59.setBackground(new java.awt.Color(255, 51, 51));
        panelRound59.setRoundBottomLeft(20);
        panelRound59.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound59Layout = new javax.swing.GroupLayout(panelRound59);
        panelRound59.setLayout(panelRound59Layout);
        panelRound59Layout.setHorizontalGroup(
            panelRound59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound59Layout.setVerticalGroup(
            panelRound59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel12a13Miercoles.add(panelRound59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel56.setText("Salon");
        panel12a13Miercoles.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes52.setText("Materia");
        panel12a13Miercoles.add(materia6a7lunes52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes52.setText("Docente");
        panel12a13Miercoles.add(docente6a7lunes52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes52.setText("Horario");
        panel12a13Miercoles.add(horariode6a7lunes52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel12a13Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 110, 50));

        panel13a14Miercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel13a14Miercoles.setRoundBottomLeft(20);
        panel13a14Miercoles.setRoundBottomRight(20);
        panel13a14Miercoles.setRoundTopLeft(20);
        panel13a14Miercoles.setRoundTopRight(20);
        panel13a14Miercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound60.setBackground(new java.awt.Color(255, 51, 51));
        panelRound60.setRoundBottomLeft(20);
        panelRound60.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound60Layout = new javax.swing.GroupLayout(panelRound60);
        panelRound60.setLayout(panelRound60Layout);
        panelRound60Layout.setHorizontalGroup(
            panelRound60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound60Layout.setVerticalGroup(
            panelRound60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel13a14Miercoles.add(panelRound60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel57.setText("Salon");
        panel13a14Miercoles.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes53.setText("Materia");
        panel13a14Miercoles.add(materia6a7lunes53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes53.setText("Docente");
        panel13a14Miercoles.add(docente6a7lunes53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes53.setText("Horario");
        panel13a14Miercoles.add(horariode6a7lunes53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel13a14Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 110, 50));

        panel14a15Miercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel14a15Miercoles.setRoundBottomLeft(20);
        panel14a15Miercoles.setRoundBottomRight(20);
        panel14a15Miercoles.setRoundTopLeft(20);
        panel14a15Miercoles.setRoundTopRight(20);
        panel14a15Miercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound61.setBackground(new java.awt.Color(255, 51, 51));
        panelRound61.setRoundBottomLeft(20);
        panelRound61.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound61Layout = new javax.swing.GroupLayout(panelRound61);
        panelRound61.setLayout(panelRound61Layout);
        panelRound61Layout.setHorizontalGroup(
            panelRound61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound61Layout.setVerticalGroup(
            panelRound61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel14a15Miercoles.add(panelRound61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel58.setText("Salon");
        panel14a15Miercoles.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes54.setText("Materia");
        panel14a15Miercoles.add(materia6a7lunes54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes54.setText("Docente");
        panel14a15Miercoles.add(docente6a7lunes54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes54.setText("Horario");
        panel14a15Miercoles.add(horariode6a7lunes54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel14a15Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 110, 50));

        panel15a16Miercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel15a16Miercoles.setRoundBottomLeft(20);
        panel15a16Miercoles.setRoundBottomRight(20);
        panel15a16Miercoles.setRoundTopLeft(20);
        panel15a16Miercoles.setRoundTopRight(20);
        panel15a16Miercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound62.setBackground(new java.awt.Color(255, 51, 51));
        panelRound62.setRoundBottomLeft(20);
        panelRound62.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound62Layout = new javax.swing.GroupLayout(panelRound62);
        panelRound62.setLayout(panelRound62Layout);
        panelRound62Layout.setHorizontalGroup(
            panelRound62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound62Layout.setVerticalGroup(
            panelRound62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel15a16Miercoles.add(panelRound62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel59.setText("Salon");
        panel15a16Miercoles.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes55.setText("Materia");
        panel15a16Miercoles.add(materia6a7lunes55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes55.setText("Docente");
        panel15a16Miercoles.add(docente6a7lunes55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes55.setText("Horario");
        panel15a16Miercoles.add(horariode6a7lunes55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel15a16Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 110, 50));

        panel16a17Miercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel16a17Miercoles.setRoundBottomLeft(20);
        panel16a17Miercoles.setRoundBottomRight(20);
        panel16a17Miercoles.setRoundTopLeft(20);
        panel16a17Miercoles.setRoundTopRight(20);
        panel16a17Miercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound63.setBackground(new java.awt.Color(255, 51, 51));
        panelRound63.setRoundBottomLeft(20);
        panelRound63.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound63Layout = new javax.swing.GroupLayout(panelRound63);
        panelRound63.setLayout(panelRound63Layout);
        panelRound63Layout.setHorizontalGroup(
            panelRound63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound63Layout.setVerticalGroup(
            panelRound63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel16a17Miercoles.add(panelRound63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel60.setText("Salon");
        panel16a17Miercoles.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes56.setText("Materia");
        panel16a17Miercoles.add(materia6a7lunes56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes56.setText("Docente");
        panel16a17Miercoles.add(docente6a7lunes56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes56.setText("Horario");
        panel16a17Miercoles.add(horariode6a7lunes56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel16a17Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 110, 50));

        panel17a18Miercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel17a18Miercoles.setRoundBottomLeft(20);
        panel17a18Miercoles.setRoundBottomRight(20);
        panel17a18Miercoles.setRoundTopLeft(20);
        panel17a18Miercoles.setRoundTopRight(20);
        panel17a18Miercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound64.setBackground(new java.awt.Color(255, 51, 51));
        panelRound64.setRoundBottomLeft(20);
        panelRound64.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound64Layout = new javax.swing.GroupLayout(panelRound64);
        panelRound64.setLayout(panelRound64Layout);
        panelRound64Layout.setHorizontalGroup(
            panelRound64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound64Layout.setVerticalGroup(
            panelRound64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel17a18Miercoles.add(panelRound64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel61.setText("Salon");
        panel17a18Miercoles.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes57.setText("Materia");
        panel17a18Miercoles.add(materia6a7lunes57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes57.setText("Docente");
        panel17a18Miercoles.add(docente6a7lunes57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes57.setText("Horario");
        panel17a18Miercoles.add(horariode6a7lunes57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel17a18Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 110, 50));

        panel18a19Miercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel18a19Miercoles.setRoundBottomLeft(20);
        panel18a19Miercoles.setRoundBottomRight(20);
        panel18a19Miercoles.setRoundTopLeft(20);
        panel18a19Miercoles.setRoundTopRight(20);
        panel18a19Miercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound65.setBackground(new java.awt.Color(255, 51, 51));
        panelRound65.setRoundBottomLeft(20);
        panelRound65.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound65Layout = new javax.swing.GroupLayout(panelRound65);
        panelRound65.setLayout(panelRound65Layout);
        panelRound65Layout.setHorizontalGroup(
            panelRound65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound65Layout.setVerticalGroup(
            panelRound65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel18a19Miercoles.add(panelRound65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel62.setText("Salon");
        panel18a19Miercoles.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes58.setText("Materia");
        panel18a19Miercoles.add(materia6a7lunes58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes58.setText("Docente");
        panel18a19Miercoles.add(docente6a7lunes58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes58.setText("Horario");
        panel18a19Miercoles.add(horariode6a7lunes58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel18a19Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 110, 50));

        panel19a20Miercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel19a20Miercoles.setRoundBottomLeft(20);
        panel19a20Miercoles.setRoundBottomRight(20);
        panel19a20Miercoles.setRoundTopLeft(20);
        panel19a20Miercoles.setRoundTopRight(20);
        panel19a20Miercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound66.setBackground(new java.awt.Color(255, 51, 51));
        panelRound66.setRoundBottomLeft(20);
        panelRound66.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound66Layout = new javax.swing.GroupLayout(panelRound66);
        panelRound66.setLayout(panelRound66Layout);
        panelRound66Layout.setHorizontalGroup(
            panelRound66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound66Layout.setVerticalGroup(
            panelRound66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel19a20Miercoles.add(panelRound66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel63.setText("Salon");
        panel19a20Miercoles.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes59.setText("Materia");
        panel19a20Miercoles.add(materia6a7lunes59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes59.setText("Docente");
        panel19a20Miercoles.add(docente6a7lunes59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes59.setText("Horario");
        panel19a20Miercoles.add(horariode6a7lunes59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel19a20Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 110, 50));

        panel20a21Miercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel20a21Miercoles.setRoundBottomLeft(20);
        panel20a21Miercoles.setRoundBottomRight(20);
        panel20a21Miercoles.setRoundTopLeft(20);
        panel20a21Miercoles.setRoundTopRight(20);
        panel20a21Miercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound67.setBackground(new java.awt.Color(255, 51, 51));
        panelRound67.setRoundBottomLeft(20);
        panelRound67.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound67Layout = new javax.swing.GroupLayout(panelRound67);
        panelRound67.setLayout(panelRound67Layout);
        panelRound67Layout.setHorizontalGroup(
            panelRound67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound67Layout.setVerticalGroup(
            panelRound67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel20a21Miercoles.add(panelRound67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel64.setText("Salon");
        panel20a21Miercoles.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes60.setText("Materia");
        panel20a21Miercoles.add(materia6a7lunes60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes60.setText("Docente");
        panel20a21Miercoles.add(docente6a7lunes60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes60.setText("Horario");
        panel20a21Miercoles.add(horariode6a7lunes60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel20a21Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 110, 50));

        panel10a12Miercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel10a12Miercoles.setRoundBottomLeft(20);
        panel10a12Miercoles.setRoundBottomRight(20);
        panel10a12Miercoles.setRoundTopLeft(20);
        panel10a12Miercoles.setRoundTopRight(20);
        panel10a12Miercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes118.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes118.setRoundBottomLeft(20);
        panelinterno6amlunes118.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes118Layout = new javax.swing.GroupLayout(panelinterno6amlunes118);
        panelinterno6amlunes118.setLayout(panelinterno6amlunes118Layout);
        panelinterno6amlunes118Layout.setHorizontalGroup(
            panelinterno6amlunes118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes118Layout.setVerticalGroup(
            panelinterno6amlunes118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panel10a12Miercoles.add(panelinterno6amlunes118, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        salon6a8lunes118.setText("Salon");
        panel10a12Miercoles.add(salon6a8lunes118, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 20));

        materia6a8amlunes118.setText("Materia");
        panel10a12Miercoles.add(materia6a8amlunes118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes118.setText("Docente");
        panel10a12Miercoles.add(docente6a8lunes118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        horariode6a8lunes118.setText("Horario");
        panel10a12Miercoles.add(horariode6a8lunes118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));

        jPanel1.add(panel10a12Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, 80));

        panel14a16Miercoles.setBackground(new java.awt.Color(255, 255, 255));
        panel14a16Miercoles.setRoundBottomLeft(20);
        panel14a16Miercoles.setRoundBottomRight(20);
        panel14a16Miercoles.setRoundTopLeft(20);
        panel14a16Miercoles.setRoundTopRight(20);
        panel14a16Miercoles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes117.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes117.setRoundBottomLeft(20);
        panelinterno6amlunes117.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes117Layout = new javax.swing.GroupLayout(panelinterno6amlunes117);
        panelinterno6amlunes117.setLayout(panelinterno6amlunes117Layout);
        panelinterno6amlunes117Layout.setHorizontalGroup(
            panelinterno6amlunes117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes117Layout.setVerticalGroup(
            panelinterno6amlunes117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panel14a16Miercoles.add(panelinterno6amlunes117, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        salon6a8lunes117.setText("Salon");
        panel14a16Miercoles.add(salon6a8lunes117, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 20));

        materia6a8amlunes117.setText("Materia");
        panel14a16Miercoles.add(materia6a8amlunes117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes117.setText("Docente");
        panel14a16Miercoles.add(docente6a8lunes117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        horariode6a8lunes117.setText("Horario");
        panel14a16Miercoles.add(horariode6a8lunes117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));

        jPanel1.add(panel14a16Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, 80));

        panel6a7amJueves.setBackground(new java.awt.Color(255, 255, 255));
        panel6a7amJueves.setRoundBottomLeft(20);
        panel6a7amJueves.setRoundBottomRight(20);
        panel6a7amJueves.setRoundTopLeft(20);
        panel6a7amJueves.setRoundTopRight(20);
        panel6a7amJueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound82.setBackground(new java.awt.Color(255, 51, 51));
        panelRound82.setRoundBottomLeft(20);
        panelRound82.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound82Layout = new javax.swing.GroupLayout(panelRound82);
        panelRound82.setLayout(panelRound82Layout);
        panelRound82Layout.setHorizontalGroup(
            panelRound82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound82Layout.setVerticalGroup(
            panelRound82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel6a7amJueves.add(panelRound82, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel79.setText("Salon");
        panel6a7amJueves.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes75.setText("Materia");
        panel6a7amJueves.add(materia6a7lunes75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes75.setText("Docente");
        panel6a7amJueves.add(docente6a7lunes75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes75.setText("Horario");
        panel6a7amJueves.add(horariode6a7lunes75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel6a7amJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 110, 50));

        panel7a8amJueves.setBackground(new java.awt.Color(255, 255, 255));
        panel7a8amJueves.setRoundBottomLeft(20);
        panel7a8amJueves.setRoundBottomRight(20);
        panel7a8amJueves.setRoundTopLeft(20);
        panel7a8amJueves.setRoundTopRight(20);
        panel7a8amJueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound83.setBackground(new java.awt.Color(255, 51, 51));
        panelRound83.setRoundBottomLeft(20);
        panelRound83.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound83Layout = new javax.swing.GroupLayout(panelRound83);
        panelRound83.setLayout(panelRound83Layout);
        panelRound83Layout.setHorizontalGroup(
            panelRound83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound83Layout.setVerticalGroup(
            panelRound83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel7a8amJueves.add(panelRound83, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel80.setText("Salon");
        panel7a8amJueves.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes76.setText("Materia");
        panel7a8amJueves.add(materia6a7lunes76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes76.setText("Docente");
        panel7a8amJueves.add(docente6a7lunes76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes76.setText("Horario");
        panel7a8amJueves.add(horariode6a7lunes76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel7a8amJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 110, 50));

        panel8a9amJueves.setBackground(new java.awt.Color(255, 255, 255));
        panel8a9amJueves.setRoundBottomLeft(20);
        panel8a9amJueves.setRoundBottomRight(20);
        panel8a9amJueves.setRoundTopLeft(20);
        panel8a9amJueves.setRoundTopRight(20);
        panel8a9amJueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound84.setBackground(new java.awt.Color(255, 51, 51));
        panelRound84.setRoundBottomLeft(20);
        panelRound84.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound84Layout = new javax.swing.GroupLayout(panelRound84);
        panelRound84.setLayout(panelRound84Layout);
        panelRound84Layout.setHorizontalGroup(
            panelRound84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound84Layout.setVerticalGroup(
            panelRound84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel8a9amJueves.add(panelRound84, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel81.setText("Salon");
        panel8a9amJueves.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes77.setText("Materia");
        panel8a9amJueves.add(materia6a7lunes77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes77.setText("Docente");
        panel8a9amJueves.add(docente6a7lunes77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes77.setText("Horario");
        panel8a9amJueves.add(horariode6a7lunes77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel8a9amJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 110, 50));

        panel9a10amJueves.setBackground(new java.awt.Color(255, 255, 255));
        panel9a10amJueves.setRoundBottomLeft(20);
        panel9a10amJueves.setRoundBottomRight(20);
        panel9a10amJueves.setRoundTopLeft(20);
        panel9a10amJueves.setRoundTopRight(20);
        panel9a10amJueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound85.setBackground(new java.awt.Color(255, 51, 51));
        panelRound85.setRoundBottomLeft(20);
        panelRound85.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound85Layout = new javax.swing.GroupLayout(panelRound85);
        panelRound85.setLayout(panelRound85Layout);
        panelRound85Layout.setHorizontalGroup(
            panelRound85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound85Layout.setVerticalGroup(
            panelRound85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel9a10amJueves.add(panelRound85, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel82.setText("Salon");
        panel9a10amJueves.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes78.setText("Materia");
        panel9a10amJueves.add(materia6a7lunes78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes78.setText("Docente");
        panel9a10amJueves.add(docente6a7lunes78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes78.setText("Horario");
        panel9a10amJueves.add(horariode6a7lunes78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel9a10amJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 110, 50));

        panel10a11amJueves.setBackground(new java.awt.Color(255, 255, 255));
        panel10a11amJueves.setRoundBottomLeft(20);
        panel10a11amJueves.setRoundBottomRight(20);
        panel10a11amJueves.setRoundTopLeft(20);
        panel10a11amJueves.setRoundTopRight(20);
        panel10a11amJueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound86.setBackground(new java.awt.Color(255, 51, 51));
        panelRound86.setRoundBottomLeft(20);
        panelRound86.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound86Layout = new javax.swing.GroupLayout(panelRound86);
        panelRound86.setLayout(panelRound86Layout);
        panelRound86Layout.setHorizontalGroup(
            panelRound86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound86Layout.setVerticalGroup(
            panelRound86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel10a11amJueves.add(panelRound86, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel83.setText("Salon");
        panel10a11amJueves.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes79.setText("Materia");
        panel10a11amJueves.add(materia6a7lunes79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes79.setText("Docente");
        panel10a11amJueves.add(docente6a7lunes79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes79.setText("Horario");
        panel10a11amJueves.add(horariode6a7lunes79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel10a11amJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 110, 50));

        panel11a12amJueves.setBackground(new java.awt.Color(255, 255, 255));
        panel11a12amJueves.setRoundBottomLeft(20);
        panel11a12amJueves.setRoundBottomRight(20);
        panel11a12amJueves.setRoundTopLeft(20);
        panel11a12amJueves.setRoundTopRight(20);
        panel11a12amJueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound87.setBackground(new java.awt.Color(255, 51, 51));
        panelRound87.setRoundBottomLeft(20);
        panelRound87.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound87Layout = new javax.swing.GroupLayout(panelRound87);
        panelRound87.setLayout(panelRound87Layout);
        panelRound87Layout.setHorizontalGroup(
            panelRound87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound87Layout.setVerticalGroup(
            panelRound87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel11a12amJueves.add(panelRound87, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel84.setText("Salon");
        panel11a12amJueves.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes80.setText("Materia");
        panel11a12amJueves.add(materia6a7lunes80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes80.setText("Docente");
        panel11a12amJueves.add(docente6a7lunes80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes80.setText("Horario");
        panel11a12amJueves.add(horariode6a7lunes80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel11a12amJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 110, 50));

        panel12a13Jueves.setBackground(new java.awt.Color(255, 255, 255));
        panel12a13Jueves.setRoundBottomLeft(20);
        panel12a13Jueves.setRoundBottomRight(20);
        panel12a13Jueves.setRoundTopLeft(20);
        panel12a13Jueves.setRoundTopRight(20);
        panel12a13Jueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound88.setBackground(new java.awt.Color(255, 51, 51));
        panelRound88.setRoundBottomLeft(20);
        panelRound88.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound88Layout = new javax.swing.GroupLayout(panelRound88);
        panelRound88.setLayout(panelRound88Layout);
        panelRound88Layout.setHorizontalGroup(
            panelRound88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound88Layout.setVerticalGroup(
            panelRound88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel12a13Jueves.add(panelRound88, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel85.setText("Salon");
        panel12a13Jueves.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes81.setText("Materia");
        panel12a13Jueves.add(materia6a7lunes81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes81.setText("Docente");
        panel12a13Jueves.add(docente6a7lunes81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes81.setText("Horario");
        panel12a13Jueves.add(horariode6a7lunes81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel12a13Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 110, 50));

        panel13a14Jueves.setBackground(new java.awt.Color(255, 255, 255));
        panel13a14Jueves.setRoundBottomLeft(20);
        panel13a14Jueves.setRoundBottomRight(20);
        panel13a14Jueves.setRoundTopLeft(20);
        panel13a14Jueves.setRoundTopRight(20);
        panel13a14Jueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound89.setBackground(new java.awt.Color(255, 51, 51));
        panelRound89.setRoundBottomLeft(20);
        panelRound89.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound89Layout = new javax.swing.GroupLayout(panelRound89);
        panelRound89.setLayout(panelRound89Layout);
        panelRound89Layout.setHorizontalGroup(
            panelRound89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound89Layout.setVerticalGroup(
            panelRound89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel13a14Jueves.add(panelRound89, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel86.setText("Salon");
        panel13a14Jueves.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes82.setText("Materia");
        panel13a14Jueves.add(materia6a7lunes82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes82.setText("Docente");
        panel13a14Jueves.add(docente6a7lunes82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes82.setText("Horario");
        panel13a14Jueves.add(horariode6a7lunes82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel13a14Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 110, 50));

        panel14a15Jueves.setBackground(new java.awt.Color(255, 255, 255));
        panel14a15Jueves.setRoundBottomLeft(20);
        panel14a15Jueves.setRoundBottomRight(20);
        panel14a15Jueves.setRoundTopLeft(20);
        panel14a15Jueves.setRoundTopRight(20);
        panel14a15Jueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound90.setBackground(new java.awt.Color(255, 51, 51));
        panelRound90.setRoundBottomLeft(20);
        panelRound90.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound90Layout = new javax.swing.GroupLayout(panelRound90);
        panelRound90.setLayout(panelRound90Layout);
        panelRound90Layout.setHorizontalGroup(
            panelRound90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound90Layout.setVerticalGroup(
            panelRound90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel14a15Jueves.add(panelRound90, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel87.setText("Salon");
        panel14a15Jueves.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes83.setText("Materia");
        panel14a15Jueves.add(materia6a7lunes83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes83.setText("Docente");
        panel14a15Jueves.add(docente6a7lunes83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes83.setText("Horario");
        panel14a15Jueves.add(horariode6a7lunes83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel14a15Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 110, 50));

        panel15a16Jueves.setBackground(new java.awt.Color(255, 255, 255));
        panel15a16Jueves.setRoundBottomLeft(20);
        panel15a16Jueves.setRoundBottomRight(20);
        panel15a16Jueves.setRoundTopLeft(20);
        panel15a16Jueves.setRoundTopRight(20);
        panel15a16Jueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound91.setBackground(new java.awt.Color(255, 51, 51));
        panelRound91.setRoundBottomLeft(20);
        panelRound91.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound91Layout = new javax.swing.GroupLayout(panelRound91);
        panelRound91.setLayout(panelRound91Layout);
        panelRound91Layout.setHorizontalGroup(
            panelRound91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound91Layout.setVerticalGroup(
            panelRound91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel15a16Jueves.add(panelRound91, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel88.setText("Salon");
        panel15a16Jueves.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes84.setText("Materia");
        panel15a16Jueves.add(materia6a7lunes84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes84.setText("Docente");
        panel15a16Jueves.add(docente6a7lunes84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes84.setText("Horario");
        panel15a16Jueves.add(horariode6a7lunes84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel15a16Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 110, 50));

        panel16a17Jueves.setBackground(new java.awt.Color(255, 255, 255));
        panel16a17Jueves.setRoundBottomLeft(20);
        panel16a17Jueves.setRoundBottomRight(20);
        panel16a17Jueves.setRoundTopLeft(20);
        panel16a17Jueves.setRoundTopRight(20);
        panel16a17Jueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound92.setBackground(new java.awt.Color(255, 51, 51));
        panelRound92.setRoundBottomLeft(20);
        panelRound92.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound92Layout = new javax.swing.GroupLayout(panelRound92);
        panelRound92.setLayout(panelRound92Layout);
        panelRound92Layout.setHorizontalGroup(
            panelRound92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound92Layout.setVerticalGroup(
            panelRound92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel16a17Jueves.add(panelRound92, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel89.setText("Salon");
        panel16a17Jueves.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes85.setText("Materia");
        panel16a17Jueves.add(materia6a7lunes85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes85.setText("Docente");
        panel16a17Jueves.add(docente6a7lunes85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes85.setText("Horario");
        panel16a17Jueves.add(horariode6a7lunes85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel16a17Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 110, 50));

        panel17a18Jueves.setBackground(new java.awt.Color(255, 255, 255));
        panel17a18Jueves.setRoundBottomLeft(20);
        panel17a18Jueves.setRoundBottomRight(20);
        panel17a18Jueves.setRoundTopLeft(20);
        panel17a18Jueves.setRoundTopRight(20);
        panel17a18Jueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound93.setBackground(new java.awt.Color(255, 51, 51));
        panelRound93.setRoundBottomLeft(20);
        panelRound93.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound93Layout = new javax.swing.GroupLayout(panelRound93);
        panelRound93.setLayout(panelRound93Layout);
        panelRound93Layout.setHorizontalGroup(
            panelRound93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound93Layout.setVerticalGroup(
            panelRound93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel17a18Jueves.add(panelRound93, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel90.setText("Salon");
        panel17a18Jueves.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes86.setText("Materia");
        panel17a18Jueves.add(materia6a7lunes86, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes86.setText("Docente");
        panel17a18Jueves.add(docente6a7lunes86, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes86.setText("Horario");
        panel17a18Jueves.add(horariode6a7lunes86, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel17a18Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 110, 50));

        panel18a19Jueves.setBackground(new java.awt.Color(255, 255, 255));
        panel18a19Jueves.setRoundBottomLeft(20);
        panel18a19Jueves.setRoundBottomRight(20);
        panel18a19Jueves.setRoundTopLeft(20);
        panel18a19Jueves.setRoundTopRight(20);
        panel18a19Jueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound94.setBackground(new java.awt.Color(255, 51, 51));
        panelRound94.setRoundBottomLeft(20);
        panelRound94.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound94Layout = new javax.swing.GroupLayout(panelRound94);
        panelRound94.setLayout(panelRound94Layout);
        panelRound94Layout.setHorizontalGroup(
            panelRound94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound94Layout.setVerticalGroup(
            panelRound94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel18a19Jueves.add(panelRound94, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel91.setText("Salon");
        panel18a19Jueves.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes87.setText("Materia");
        panel18a19Jueves.add(materia6a7lunes87, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes87.setText("Docente");
        panel18a19Jueves.add(docente6a7lunes87, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes87.setText("Horario");
        panel18a19Jueves.add(horariode6a7lunes87, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel18a19Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 110, 50));

        panel19a20Jueves.setBackground(new java.awt.Color(255, 255, 255));
        panel19a20Jueves.setRoundBottomLeft(20);
        panel19a20Jueves.setRoundBottomRight(20);
        panel19a20Jueves.setRoundTopLeft(20);
        panel19a20Jueves.setRoundTopRight(20);
        panel19a20Jueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound95.setBackground(new java.awt.Color(255, 51, 51));
        panelRound95.setRoundBottomLeft(20);
        panelRound95.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound95Layout = new javax.swing.GroupLayout(panelRound95);
        panelRound95.setLayout(panelRound95Layout);
        panelRound95Layout.setHorizontalGroup(
            panelRound95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound95Layout.setVerticalGroup(
            panelRound95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel19a20Jueves.add(panelRound95, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel92.setText("Salon");
        panel19a20Jueves.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes88.setText("Materia");
        panel19a20Jueves.add(materia6a7lunes88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes88.setText("Docente");
        panel19a20Jueves.add(docente6a7lunes88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes88.setText("Horario");
        panel19a20Jueves.add(horariode6a7lunes88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel19a20Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 580, 110, 50));

        panel20a21Jueves.setBackground(new java.awt.Color(255, 255, 255));
        panel20a21Jueves.setRoundBottomLeft(20);
        panel20a21Jueves.setRoundBottomRight(20);
        panel20a21Jueves.setRoundTopLeft(20);
        panel20a21Jueves.setRoundTopRight(20);
        panel20a21Jueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound96.setBackground(new java.awt.Color(255, 51, 51));
        panelRound96.setRoundBottomLeft(20);
        panelRound96.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound96Layout = new javax.swing.GroupLayout(panelRound96);
        panelRound96.setLayout(panelRound96Layout);
        panelRound96Layout.setHorizontalGroup(
            panelRound96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound96Layout.setVerticalGroup(
            panelRound96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel20a21Jueves.add(panelRound96, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel93.setText("Salon");
        panel20a21Jueves.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes89.setText("Materia");
        panel20a21Jueves.add(materia6a7lunes89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes89.setText("Docente");
        panel20a21Jueves.add(docente6a7lunes89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes89.setText("Horario");
        panel20a21Jueves.add(horariode6a7lunes89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel20a21Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, 110, 50));

        panel14a16Jueves.setBackground(new java.awt.Color(255, 255, 255));
        panel14a16Jueves.setRoundBottomLeft(20);
        panel14a16Jueves.setRoundBottomRight(20);
        panel14a16Jueves.setRoundTopLeft(20);
        panel14a16Jueves.setRoundTopRight(20);
        panel14a16Jueves.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes169.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes169.setRoundBottomLeft(20);
        panelinterno6amlunes169.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes169Layout = new javax.swing.GroupLayout(panelinterno6amlunes169);
        panelinterno6amlunes169.setLayout(panelinterno6amlunes169Layout);
        panelinterno6amlunes169Layout.setHorizontalGroup(
            panelinterno6amlunes169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes169Layout.setVerticalGroup(
            panelinterno6amlunes169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panel14a16Jueves.add(panelinterno6amlunes169, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        salon6a8lunes169.setText("Salon");
        panel14a16Jueves.add(salon6a8lunes169, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 20));

        materia6a8amlunes169.setText("Materia");
        panel14a16Jueves.add(materia6a8amlunes169, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes169.setText("Docente");
        panel14a16Jueves.add(docente6a8lunes169, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        horariode6a8lunes169.setText("Horario");
        panel14a16Jueves.add(horariode6a8lunes169, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));

        jPanel1.add(panel14a16Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, 80));

        panel6a7amViernes.setBackground(new java.awt.Color(255, 255, 255));
        panel6a7amViernes.setRoundBottomLeft(20);
        panel6a7amViernes.setRoundBottomRight(20);
        panel6a7amViernes.setRoundTopLeft(20);
        panel6a7amViernes.setRoundTopRight(20);
        panel6a7amViernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound112.setBackground(new java.awt.Color(255, 51, 51));
        panelRound112.setRoundBottomLeft(20);
        panelRound112.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound112Layout = new javax.swing.GroupLayout(panelRound112);
        panelRound112.setLayout(panelRound112Layout);
        panelRound112Layout.setHorizontalGroup(
            panelRound112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound112Layout.setVerticalGroup(
            panelRound112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel6a7amViernes.add(panelRound112, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel109.setText("Salon");
        panel6a7amViernes.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes105.setText("Materia");
        panel6a7amViernes.add(materia6a7lunes105, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes105.setText("Docente");
        panel6a7amViernes.add(docente6a7lunes105, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes105.setText("Horario");
        panel6a7amViernes.add(horariode6a7lunes105, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel6a7amViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 110, 50));

        panel7a8amViernes.setBackground(new java.awt.Color(255, 255, 255));
        panel7a8amViernes.setRoundBottomLeft(20);
        panel7a8amViernes.setRoundBottomRight(20);
        panel7a8amViernes.setRoundTopLeft(20);
        panel7a8amViernes.setRoundTopRight(20);
        panel7a8amViernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound113.setBackground(new java.awt.Color(255, 51, 51));
        panelRound113.setRoundBottomLeft(20);
        panelRound113.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound113Layout = new javax.swing.GroupLayout(panelRound113);
        panelRound113.setLayout(panelRound113Layout);
        panelRound113Layout.setHorizontalGroup(
            panelRound113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound113Layout.setVerticalGroup(
            panelRound113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel7a8amViernes.add(panelRound113, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel110.setText("Salon");
        panel7a8amViernes.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes106.setText("Materia");
        panel7a8amViernes.add(materia6a7lunes106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes106.setText("Docente");
        panel7a8amViernes.add(docente6a7lunes106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes106.setText("Horario");
        panel7a8amViernes.add(horariode6a7lunes106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel7a8amViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 110, 50));

        panel8a9amViernes.setBackground(new java.awt.Color(255, 255, 255));
        panel8a9amViernes.setRoundBottomLeft(20);
        panel8a9amViernes.setRoundBottomRight(20);
        panel8a9amViernes.setRoundTopLeft(20);
        panel8a9amViernes.setRoundTopRight(20);
        panel8a9amViernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound114.setBackground(new java.awt.Color(255, 51, 51));
        panelRound114.setRoundBottomLeft(20);
        panelRound114.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound114Layout = new javax.swing.GroupLayout(panelRound114);
        panelRound114.setLayout(panelRound114Layout);
        panelRound114Layout.setHorizontalGroup(
            panelRound114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound114Layout.setVerticalGroup(
            panelRound114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel8a9amViernes.add(panelRound114, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel111.setText("Salon");
        panel8a9amViernes.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes107.setText("Materia");
        panel8a9amViernes.add(materia6a7lunes107, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes107.setText("Docente");
        panel8a9amViernes.add(docente6a7lunes107, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes107.setText("Horario");
        panel8a9amViernes.add(horariode6a7lunes107, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel8a9amViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 110, 50));

        panel9a10amViernes.setBackground(new java.awt.Color(255, 255, 255));
        panel9a10amViernes.setRoundBottomLeft(20);
        panel9a10amViernes.setRoundBottomRight(20);
        panel9a10amViernes.setRoundTopLeft(20);
        panel9a10amViernes.setRoundTopRight(20);
        panel9a10amViernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound115.setBackground(new java.awt.Color(255, 51, 51));
        panelRound115.setRoundBottomLeft(20);
        panelRound115.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound115Layout = new javax.swing.GroupLayout(panelRound115);
        panelRound115.setLayout(panelRound115Layout);
        panelRound115Layout.setHorizontalGroup(
            panelRound115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound115Layout.setVerticalGroup(
            panelRound115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel9a10amViernes.add(panelRound115, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel112.setText("Salon");
        panel9a10amViernes.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes108.setText("Materia");
        panel9a10amViernes.add(materia6a7lunes108, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes108.setText("Docente");
        panel9a10amViernes.add(docente6a7lunes108, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes108.setText("Horario");
        panel9a10amViernes.add(horariode6a7lunes108, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel9a10amViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 110, 50));

        panel10a11amViernes.setBackground(new java.awt.Color(255, 255, 255));
        panel10a11amViernes.setRoundBottomLeft(20);
        panel10a11amViernes.setRoundBottomRight(20);
        panel10a11amViernes.setRoundTopLeft(20);
        panel10a11amViernes.setRoundTopRight(20);
        panel10a11amViernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound116.setBackground(new java.awt.Color(255, 51, 51));
        panelRound116.setRoundBottomLeft(20);
        panelRound116.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound116Layout = new javax.swing.GroupLayout(panelRound116);
        panelRound116.setLayout(panelRound116Layout);
        panelRound116Layout.setHorizontalGroup(
            panelRound116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound116Layout.setVerticalGroup(
            panelRound116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel10a11amViernes.add(panelRound116, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel113.setText("Salon");
        panel10a11amViernes.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes109.setText("Materia");
        panel10a11amViernes.add(materia6a7lunes109, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes109.setText("Docente");
        panel10a11amViernes.add(docente6a7lunes109, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes109.setText("Horario");
        panel10a11amViernes.add(horariode6a7lunes109, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel10a11amViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 110, 50));

        panel11a12amViernes.setBackground(new java.awt.Color(255, 255, 255));
        panel11a12amViernes.setRoundBottomLeft(20);
        panel11a12amViernes.setRoundBottomRight(20);
        panel11a12amViernes.setRoundTopLeft(20);
        panel11a12amViernes.setRoundTopRight(20);
        panel11a12amViernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound117.setBackground(new java.awt.Color(255, 51, 51));
        panelRound117.setRoundBottomLeft(20);
        panelRound117.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound117Layout = new javax.swing.GroupLayout(panelRound117);
        panelRound117.setLayout(panelRound117Layout);
        panelRound117Layout.setHorizontalGroup(
            panelRound117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound117Layout.setVerticalGroup(
            panelRound117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel11a12amViernes.add(panelRound117, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel114.setText("Salon");
        panel11a12amViernes.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes110.setText("Materia");
        panel11a12amViernes.add(materia6a7lunes110, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes110.setText("Docente");
        panel11a12amViernes.add(docente6a7lunes110, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes110.setText("Horario");
        panel11a12amViernes.add(horariode6a7lunes110, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel11a12amViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 110, 50));

        panel12a13Viernes.setBackground(new java.awt.Color(255, 255, 255));
        panel12a13Viernes.setRoundBottomLeft(20);
        panel12a13Viernes.setRoundBottomRight(20);
        panel12a13Viernes.setRoundTopLeft(20);
        panel12a13Viernes.setRoundTopRight(20);
        panel12a13Viernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound118.setBackground(new java.awt.Color(255, 51, 51));
        panelRound118.setRoundBottomLeft(20);
        panelRound118.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound118Layout = new javax.swing.GroupLayout(panelRound118);
        panelRound118.setLayout(panelRound118Layout);
        panelRound118Layout.setHorizontalGroup(
            panelRound118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound118Layout.setVerticalGroup(
            panelRound118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel12a13Viernes.add(panelRound118, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel115.setText("Salon");
        panel12a13Viernes.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes111.setText("Materia");
        panel12a13Viernes.add(materia6a7lunes111, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes111.setText("Docente");
        panel12a13Viernes.add(docente6a7lunes111, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes111.setText("Horario");
        panel12a13Viernes.add(horariode6a7lunes111, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel12a13Viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 110, 50));

        panel13a14Viernes.setBackground(new java.awt.Color(255, 255, 255));
        panel13a14Viernes.setRoundBottomLeft(20);
        panel13a14Viernes.setRoundBottomRight(20);
        panel13a14Viernes.setRoundTopLeft(20);
        panel13a14Viernes.setRoundTopRight(20);
        panel13a14Viernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound119.setBackground(new java.awt.Color(255, 51, 51));
        panelRound119.setRoundBottomLeft(20);
        panelRound119.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound119Layout = new javax.swing.GroupLayout(panelRound119);
        panelRound119.setLayout(panelRound119Layout);
        panelRound119Layout.setHorizontalGroup(
            panelRound119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound119Layout.setVerticalGroup(
            panelRound119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel13a14Viernes.add(panelRound119, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel116.setText("Salon");
        panel13a14Viernes.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes112.setText("Materia");
        panel13a14Viernes.add(materia6a7lunes112, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes112.setText("Docente");
        panel13a14Viernes.add(docente6a7lunes112, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes112.setText("Horario");
        panel13a14Viernes.add(horariode6a7lunes112, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel13a14Viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 110, 50));

        panel14a15Viernes.setBackground(new java.awt.Color(255, 255, 255));
        panel14a15Viernes.setRoundBottomLeft(20);
        panel14a15Viernes.setRoundBottomRight(20);
        panel14a15Viernes.setRoundTopLeft(20);
        panel14a15Viernes.setRoundTopRight(20);
        panel14a15Viernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound120.setBackground(new java.awt.Color(255, 51, 51));
        panelRound120.setRoundBottomLeft(20);
        panelRound120.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound120Layout = new javax.swing.GroupLayout(panelRound120);
        panelRound120.setLayout(panelRound120Layout);
        panelRound120Layout.setHorizontalGroup(
            panelRound120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound120Layout.setVerticalGroup(
            panelRound120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel14a15Viernes.add(panelRound120, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel117.setText("Salon");
        panel14a15Viernes.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes113.setText("Materia");
        panel14a15Viernes.add(materia6a7lunes113, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes113.setText("Docente");
        panel14a15Viernes.add(docente6a7lunes113, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes113.setText("Horario");
        panel14a15Viernes.add(horariode6a7lunes113, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel14a15Viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 110, 50));

        panel15a16Viernes.setBackground(new java.awt.Color(255, 255, 255));
        panel15a16Viernes.setRoundBottomLeft(20);
        panel15a16Viernes.setRoundBottomRight(20);
        panel15a16Viernes.setRoundTopLeft(20);
        panel15a16Viernes.setRoundTopRight(20);
        panel15a16Viernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound121.setBackground(new java.awt.Color(255, 51, 51));
        panelRound121.setRoundBottomLeft(20);
        panelRound121.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound121Layout = new javax.swing.GroupLayout(panelRound121);
        panelRound121.setLayout(panelRound121Layout);
        panelRound121Layout.setHorizontalGroup(
            panelRound121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound121Layout.setVerticalGroup(
            panelRound121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel15a16Viernes.add(panelRound121, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel118.setText("Salon");
        panel15a16Viernes.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes114.setText("Materia");
        panel15a16Viernes.add(materia6a7lunes114, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes114.setText("Docente");
        panel15a16Viernes.add(docente6a7lunes114, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes114.setText("Horario");
        panel15a16Viernes.add(horariode6a7lunes114, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel15a16Viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 110, 50));

        panel16a17Viernes.setBackground(new java.awt.Color(255, 255, 255));
        panel16a17Viernes.setRoundBottomLeft(20);
        panel16a17Viernes.setRoundBottomRight(20);
        panel16a17Viernes.setRoundTopLeft(20);
        panel16a17Viernes.setRoundTopRight(20);
        panel16a17Viernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound122.setBackground(new java.awt.Color(255, 51, 51));
        panelRound122.setRoundBottomLeft(20);
        panelRound122.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound122Layout = new javax.swing.GroupLayout(panelRound122);
        panelRound122.setLayout(panelRound122Layout);
        panelRound122Layout.setHorizontalGroup(
            panelRound122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound122Layout.setVerticalGroup(
            panelRound122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel16a17Viernes.add(panelRound122, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel119.setText("Salon");
        panel16a17Viernes.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes115.setText("Materia");
        panel16a17Viernes.add(materia6a7lunes115, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes115.setText("Docente");
        panel16a17Viernes.add(docente6a7lunes115, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes115.setText("Horario");
        panel16a17Viernes.add(horariode6a7lunes115, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel16a17Viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 110, 50));

        panel17a18Viernes.setBackground(new java.awt.Color(255, 255, 255));
        panel17a18Viernes.setRoundBottomLeft(20);
        panel17a18Viernes.setRoundBottomRight(20);
        panel17a18Viernes.setRoundTopLeft(20);
        panel17a18Viernes.setRoundTopRight(20);
        panel17a18Viernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound123.setBackground(new java.awt.Color(255, 51, 51));
        panelRound123.setRoundBottomLeft(20);
        panelRound123.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound123Layout = new javax.swing.GroupLayout(panelRound123);
        panelRound123.setLayout(panelRound123Layout);
        panelRound123Layout.setHorizontalGroup(
            panelRound123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound123Layout.setVerticalGroup(
            panelRound123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel17a18Viernes.add(panelRound123, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel120.setText("Salon");
        panel17a18Viernes.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes116.setText("Materia");
        panel17a18Viernes.add(materia6a7lunes116, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes116.setText("Docente");
        panel17a18Viernes.add(docente6a7lunes116, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes116.setText("Horario");
        panel17a18Viernes.add(horariode6a7lunes116, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel17a18Viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 110, 50));

        panel18a19Viernes.setBackground(new java.awt.Color(255, 255, 255));
        panel18a19Viernes.setRoundBottomLeft(20);
        panel18a19Viernes.setRoundBottomRight(20);
        panel18a19Viernes.setRoundTopLeft(20);
        panel18a19Viernes.setRoundTopRight(20);
        panel18a19Viernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound124.setBackground(new java.awt.Color(255, 51, 51));
        panelRound124.setRoundBottomLeft(20);
        panelRound124.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound124Layout = new javax.swing.GroupLayout(panelRound124);
        panelRound124.setLayout(panelRound124Layout);
        panelRound124Layout.setHorizontalGroup(
            panelRound124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound124Layout.setVerticalGroup(
            panelRound124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel18a19Viernes.add(panelRound124, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel121.setText("Salon");
        panel18a19Viernes.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes117.setText("Materia");
        panel18a19Viernes.add(materia6a7lunes117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes117.setText("Docente");
        panel18a19Viernes.add(docente6a7lunes117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes117.setText("Horario");
        panel18a19Viernes.add(horariode6a7lunes117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel18a19Viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 110, 50));

        panel19a20Viernes.setBackground(new java.awt.Color(255, 255, 255));
        panel19a20Viernes.setRoundBottomLeft(20);
        panel19a20Viernes.setRoundBottomRight(20);
        panel19a20Viernes.setRoundTopLeft(20);
        panel19a20Viernes.setRoundTopRight(20);
        panel19a20Viernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound125.setBackground(new java.awt.Color(255, 51, 51));
        panelRound125.setRoundBottomLeft(20);
        panelRound125.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound125Layout = new javax.swing.GroupLayout(panelRound125);
        panelRound125.setLayout(panelRound125Layout);
        panelRound125Layout.setHorizontalGroup(
            panelRound125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound125Layout.setVerticalGroup(
            panelRound125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel19a20Viernes.add(panelRound125, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel122.setText("Salon");
        panel19a20Viernes.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes118.setText("Materia");
        panel19a20Viernes.add(materia6a7lunes118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes118.setText("Docente");
        panel19a20Viernes.add(docente6a7lunes118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes118.setText("Horario");
        panel19a20Viernes.add(horariode6a7lunes118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel19a20Viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 110, 50));

        panel20a21Viernes.setBackground(new java.awt.Color(255, 255, 255));
        panel20a21Viernes.setRoundBottomLeft(20);
        panel20a21Viernes.setRoundBottomRight(20);
        panel20a21Viernes.setRoundTopLeft(20);
        panel20a21Viernes.setRoundTopRight(20);
        panel20a21Viernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound126.setBackground(new java.awt.Color(255, 51, 51));
        panelRound126.setRoundBottomLeft(20);
        panelRound126.setRoundTopLeft(20);

        javax.swing.GroupLayout panelRound126Layout = new javax.swing.GroupLayout(panelRound126);
        panelRound126.setLayout(panelRound126Layout);
        panelRound126Layout.setHorizontalGroup(
            panelRound126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelRound126Layout.setVerticalGroup(
            panelRound126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panel20a21Viernes.add(panelRound126, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel123.setText("Salon");
        panel20a21Viernes.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        materia6a7lunes119.setText("Materia");
        panel20a21Viernes.add(materia6a7lunes119, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        docente6a7lunes119.setText("Docente");
        panel20a21Viernes.add(docente6a7lunes119, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 60, -1));

        horariode6a7lunes119.setText("Horario");
        panel20a21Viernes.add(horariode6a7lunes119, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, -1));

        jPanel1.add(panel20a21Viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, 110, 50));

        panel8a10amViernes.setBackground(new java.awt.Color(255, 255, 255));
        panel8a10amViernes.setRoundBottomLeft(20);
        panel8a10amViernes.setRoundBottomRight(20);
        panel8a10amViernes.setRoundTopLeft(20);
        panel8a10amViernes.setRoundTopRight(20);
        panel8a10amViernes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinterno6amlunes215.setBackground(new java.awt.Color(255, 51, 51));
        panelinterno6amlunes215.setRoundBottomLeft(20);
        panelinterno6amlunes215.setRoundTopLeft(20);

        javax.swing.GroupLayout panelinterno6amlunes215Layout = new javax.swing.GroupLayout(panelinterno6amlunes215);
        panelinterno6amlunes215.setLayout(panelinterno6amlunes215Layout);
        panelinterno6amlunes215Layout.setHorizontalGroup(
            panelinterno6amlunes215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelinterno6amlunes215Layout.setVerticalGroup(
            panelinterno6amlunes215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panel8a10amViernes.add(panelinterno6amlunes215, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        salon6a8lunes215.setText("Salon");
        panel8a10amViernes.add(salon6a8lunes215, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 20));

        materia6a8amlunes215.setText("Materia");
        panel8a10amViernes.add(materia6a8amlunes215, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 20));

        docente6a8lunes215.setText("Docente");
        panel8a10amViernes.add(docente6a8lunes215, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        horariode6a8lunes215.setText("Horario");
        panel8a10amViernes.add(horariode6a8lunes215, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));

        jPanel1.add(panel8a10amViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, 80));
        jPanel1.add(Separator6am, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 600, 10));
        jPanel1.add(Separator7am, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 600, 10));
        jPanel1.add(Separator8am, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 600, 10));
        jPanel1.add(Separator9am, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 600, 10));
        jPanel1.add(Separator10am, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 600, 10));
        jPanel1.add(Separator11am, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 600, 10));
        jPanel1.add(Separator12am, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 600, 10));
        jPanel1.add(Separator13pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 600, 10));
        jPanel1.add(Separator14pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 600, 10));
        jPanel1.add(Separator15pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 600, 10));
        jPanel1.add(Separator16pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 600, 10));
        jPanel1.add(Separator17pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 600, 10));
        jPanel1.add(Separator18pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 600, 10));
        jPanel1.add(Separator19pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 600, 10));
        jPanel1.add(Separator20pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 600, 10));
        jPanel1.add(Separator21pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 600, 10));

        mesjtime.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        mesjtime.setText("Mes");
        jPanel1.add(mesjtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, -1));

        nombreEstudianteJlabel.setFont(new java.awt.Font("Inter ExtraBold", 0, 18)); // NOI18N
        nombreEstudianteJlabel.setText("Nombre del estudiante");

        semestre_estudiante.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        semestre_estudiante.setText("Semestre");

        carrera_estudiante.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        carrera_estudiante.setText("Carrera");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreEstudianteJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(carrera_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(semestre_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(nombreEstudianteJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semestre_estudiante)
                    .addComponent(carrera_estudiante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void panelRound1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseClicked
        
        
        String ccu_preferida = JOptionPane.showInputDialog("Ingresa alguna preferencia personal para tus ccu");
        String horario_manana_tarde = JOptionPane.showInputDialog("Ingresa si quieres dar clase en la mañana o en la tarde");
        String dia_libre = JOptionPane.showInputDialog("Ingresa que dia quieres estar libre");

        
        int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres realizar esta acción?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            System.out.println("Usuario sí");
            ConeccionCcu conexionCcu = new ConeccionCcu();
            List<String> asignaturas = conexionCcu.obtenerAsignaturas();

            StringBuilder listaAsignaturas = new StringBuilder();
            for (String asignatura : asignaturas) {
                listaAsignaturas.append("- ").append(asignatura).append(" ");
            }
  
            String mensajeGpt = "Escoge dos materias de la siguiente lista de materias" + listaAsignaturas.toString() 
                    + "según las preferencias que dijo el usuario: " + ccu_preferida;

            String ccu_estudiante = GtpConectedapi.Gpthorario(mensajeGpt);
            
            System.out.println(ccu_estudiante);
            
          
            
            String mensaje_horario = "Organiza los horarios de las siguientes materias según las "
                    + "preferencias del estudiante y las obligaciones tanto de las materias como de cuanta veces da esa materia a la semana: "
                    + "las materias obligatorias son: " ;
                    
            
            System.out.println(mensaje_horario);
            
        } else if (opcion == JOptionPane.NO_OPTION) {
            System.out.println("Usuario no");
        } else if (opcion == JOptionPane.CANCEL_OPTION) {
            System.out.println("Usuario Cancelo");
        } else {
            System.out.println("Usuario cerró el cuadro de diálogo sin seleccionar una opción");
        }








        

        // TODO add your handling code here:
    }//GEN-LAST:event_panelRound1MouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater((Usuario usuario) -> {
            new Dashboard(usuario).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator10am;
    private javax.swing.JSeparator Separator11am;
    private javax.swing.JSeparator Separator12am;
    private javax.swing.JSeparator Separator13pm;
    private javax.swing.JSeparator Separator14pm;
    private javax.swing.JSeparator Separator15pm;
    private javax.swing.JSeparator Separator16pm;
    private javax.swing.JSeparator Separator17pm;
    private javax.swing.JSeparator Separator18pm;
    private javax.swing.JSeparator Separator19pm;
    private javax.swing.JSeparator Separator20pm;
    private javax.swing.JSeparator Separator21pm;
    private javax.swing.JSeparator Separator6am;
    private javax.swing.JSeparator Separator7am;
    private javax.swing.JSeparator Separator8am;
    private javax.swing.JSeparator Separator9am;
    private javax.swing.JPanel background;
    private javax.swing.JLabel carrera_estudiante;
    private javax.swing.JLabel clase_10am;
    private javax.swing.JLabel clase_11am;
    private javax.swing.JLabel clase_12am;
    private javax.swing.JLabel clase_13pm;
    private javax.swing.JLabel clase_14pm;
    private javax.swing.JLabel clase_15pm;
    private javax.swing.JLabel clase_16pm;
    private javax.swing.JLabel clase_17pm;
    private javax.swing.JLabel clase_18pm;
    private javax.swing.JLabel clase_19pm;
    private javax.swing.JLabel clase_20pm;
    private javax.swing.JLabel clase_21pm;
    private javax.swing.JLabel clase_6am;
    private javax.swing.JLabel clase_7am;
    private javax.swing.JLabel clase_8am;
    private javax.swing.JLabel clase_9am;
    private javax.swing.JLabel diajtime;
    private javax.swing.JLabel docente6a7lunes;
    private javax.swing.JLabel docente6a7lunes1;
    private javax.swing.JLabel docente6a7lunes10;
    private javax.swing.JLabel docente6a7lunes105;
    private javax.swing.JLabel docente6a7lunes106;
    private javax.swing.JLabel docente6a7lunes107;
    private javax.swing.JLabel docente6a7lunes108;
    private javax.swing.JLabel docente6a7lunes109;
    private javax.swing.JLabel docente6a7lunes11;
    private javax.swing.JLabel docente6a7lunes110;
    private javax.swing.JLabel docente6a7lunes111;
    private javax.swing.JLabel docente6a7lunes112;
    private javax.swing.JLabel docente6a7lunes113;
    private javax.swing.JLabel docente6a7lunes114;
    private javax.swing.JLabel docente6a7lunes115;
    private javax.swing.JLabel docente6a7lunes116;
    private javax.swing.JLabel docente6a7lunes117;
    private javax.swing.JLabel docente6a7lunes118;
    private javax.swing.JLabel docente6a7lunes119;
    private javax.swing.JLabel docente6a7lunes12;
    private javax.swing.JLabel docente6a7lunes13;
    private javax.swing.JLabel docente6a7lunes14;
    private javax.swing.JLabel docente6a7lunes15;
    private javax.swing.JLabel docente6a7lunes16;
    private javax.swing.JLabel docente6a7lunes17;
    private javax.swing.JLabel docente6a7lunes18;
    private javax.swing.JLabel docente6a7lunes19;
    private javax.swing.JLabel docente6a7lunes20;
    private javax.swing.JLabel docente6a7lunes21;
    private javax.swing.JLabel docente6a7lunes22;
    private javax.swing.JLabel docente6a7lunes23;
    private javax.swing.JLabel docente6a7lunes24;
    private javax.swing.JLabel docente6a7lunes25;
    private javax.swing.JLabel docente6a7lunes26;
    private javax.swing.JLabel docente6a7lunes27;
    private javax.swing.JLabel docente6a7lunes28;
    private javax.swing.JLabel docente6a7lunes29;
    private javax.swing.JLabel docente6a7lunes3;
    private javax.swing.JLabel docente6a7lunes30;
    private javax.swing.JLabel docente6a7lunes31;
    private javax.swing.JLabel docente6a7lunes32;
    private javax.swing.JLabel docente6a7lunes47;
    private javax.swing.JLabel docente6a7lunes48;
    private javax.swing.JLabel docente6a7lunes49;
    private javax.swing.JLabel docente6a7lunes5;
    private javax.swing.JLabel docente6a7lunes50;
    private javax.swing.JLabel docente6a7lunes51;
    private javax.swing.JLabel docente6a7lunes52;
    private javax.swing.JLabel docente6a7lunes53;
    private javax.swing.JLabel docente6a7lunes54;
    private javax.swing.JLabel docente6a7lunes55;
    private javax.swing.JLabel docente6a7lunes56;
    private javax.swing.JLabel docente6a7lunes57;
    private javax.swing.JLabel docente6a7lunes58;
    private javax.swing.JLabel docente6a7lunes59;
    private javax.swing.JLabel docente6a7lunes6;
    private javax.swing.JLabel docente6a7lunes60;
    private javax.swing.JLabel docente6a7lunes7;
    private javax.swing.JLabel docente6a7lunes75;
    private javax.swing.JLabel docente6a7lunes76;
    private javax.swing.JLabel docente6a7lunes77;
    private javax.swing.JLabel docente6a7lunes78;
    private javax.swing.JLabel docente6a7lunes79;
    private javax.swing.JLabel docente6a7lunes8;
    private javax.swing.JLabel docente6a7lunes80;
    private javax.swing.JLabel docente6a7lunes81;
    private javax.swing.JLabel docente6a7lunes82;
    private javax.swing.JLabel docente6a7lunes83;
    private javax.swing.JLabel docente6a7lunes84;
    private javax.swing.JLabel docente6a7lunes85;
    private javax.swing.JLabel docente6a7lunes86;
    private javax.swing.JLabel docente6a7lunes87;
    private javax.swing.JLabel docente6a7lunes88;
    private javax.swing.JLabel docente6a7lunes89;
    private javax.swing.JLabel docente6a7lunes9;
    private javax.swing.JLabel docente6a8lunes117;
    private javax.swing.JLabel docente6a8lunes118;
    private javax.swing.JLabel docente6a8lunes169;
    private javax.swing.JLabel docente6a8lunes20;
    private javax.swing.JLabel docente6a8lunes215;
    private javax.swing.JLabel docente6a8lunes22;
    private javax.swing.JLabel docente6a8lunes24;
    private javax.swing.JLabel docente6a8lunes36;
    private javax.swing.JLabel docente6a8lunes42;
    private javax.swing.JLabel docente6a8lunes45;
    private javax.swing.JLabel docente6a8lunes65;
    private javax.swing.JLabel docente6a8lunes66;
    private javax.swing.JLabel horariode6a7lunes;
    private javax.swing.JLabel horariode6a7lunes1;
    private javax.swing.JLabel horariode6a7lunes10;
    private javax.swing.JLabel horariode6a7lunes105;
    private javax.swing.JLabel horariode6a7lunes106;
    private javax.swing.JLabel horariode6a7lunes107;
    private javax.swing.JLabel horariode6a7lunes108;
    private javax.swing.JLabel horariode6a7lunes109;
    private javax.swing.JLabel horariode6a7lunes11;
    private javax.swing.JLabel horariode6a7lunes110;
    private javax.swing.JLabel horariode6a7lunes111;
    private javax.swing.JLabel horariode6a7lunes112;
    private javax.swing.JLabel horariode6a7lunes113;
    private javax.swing.JLabel horariode6a7lunes114;
    private javax.swing.JLabel horariode6a7lunes115;
    private javax.swing.JLabel horariode6a7lunes116;
    private javax.swing.JLabel horariode6a7lunes117;
    private javax.swing.JLabel horariode6a7lunes118;
    private javax.swing.JLabel horariode6a7lunes119;
    private javax.swing.JLabel horariode6a7lunes12;
    private javax.swing.JLabel horariode6a7lunes13;
    private javax.swing.JLabel horariode6a7lunes14;
    private javax.swing.JLabel horariode6a7lunes15;
    private javax.swing.JLabel horariode6a7lunes16;
    private javax.swing.JLabel horariode6a7lunes17;
    private javax.swing.JLabel horariode6a7lunes18;
    private javax.swing.JLabel horariode6a7lunes19;
    private javax.swing.JLabel horariode6a7lunes20;
    private javax.swing.JLabel horariode6a7lunes21;
    private javax.swing.JLabel horariode6a7lunes22;
    private javax.swing.JLabel horariode6a7lunes23;
    private javax.swing.JLabel horariode6a7lunes24;
    private javax.swing.JLabel horariode6a7lunes25;
    private javax.swing.JLabel horariode6a7lunes26;
    private javax.swing.JLabel horariode6a7lunes27;
    private javax.swing.JLabel horariode6a7lunes28;
    private javax.swing.JLabel horariode6a7lunes29;
    private javax.swing.JLabel horariode6a7lunes3;
    private javax.swing.JLabel horariode6a7lunes30;
    private javax.swing.JLabel horariode6a7lunes31;
    private javax.swing.JLabel horariode6a7lunes32;
    private javax.swing.JLabel horariode6a7lunes47;
    private javax.swing.JLabel horariode6a7lunes48;
    private javax.swing.JLabel horariode6a7lunes49;
    private javax.swing.JLabel horariode6a7lunes5;
    private javax.swing.JLabel horariode6a7lunes50;
    private javax.swing.JLabel horariode6a7lunes51;
    private javax.swing.JLabel horariode6a7lunes52;
    private javax.swing.JLabel horariode6a7lunes53;
    private javax.swing.JLabel horariode6a7lunes54;
    private javax.swing.JLabel horariode6a7lunes55;
    private javax.swing.JLabel horariode6a7lunes56;
    private javax.swing.JLabel horariode6a7lunes57;
    private javax.swing.JLabel horariode6a7lunes58;
    private javax.swing.JLabel horariode6a7lunes59;
    private javax.swing.JLabel horariode6a7lunes6;
    private javax.swing.JLabel horariode6a7lunes60;
    private javax.swing.JLabel horariode6a7lunes7;
    private javax.swing.JLabel horariode6a7lunes75;
    private javax.swing.JLabel horariode6a7lunes76;
    private javax.swing.JLabel horariode6a7lunes77;
    private javax.swing.JLabel horariode6a7lunes78;
    private javax.swing.JLabel horariode6a7lunes79;
    private javax.swing.JLabel horariode6a7lunes8;
    private javax.swing.JLabel horariode6a7lunes80;
    private javax.swing.JLabel horariode6a7lunes81;
    private javax.swing.JLabel horariode6a7lunes82;
    private javax.swing.JLabel horariode6a7lunes83;
    private javax.swing.JLabel horariode6a7lunes84;
    private javax.swing.JLabel horariode6a7lunes85;
    private javax.swing.JLabel horariode6a7lunes86;
    private javax.swing.JLabel horariode6a7lunes87;
    private javax.swing.JLabel horariode6a7lunes88;
    private javax.swing.JLabel horariode6a7lunes89;
    private javax.swing.JLabel horariode6a7lunes9;
    private javax.swing.JLabel horariode6a8lunes117;
    private javax.swing.JLabel horariode6a8lunes118;
    private javax.swing.JLabel horariode6a8lunes169;
    private javax.swing.JLabel horariode6a8lunes20;
    private javax.swing.JLabel horariode6a8lunes215;
    private javax.swing.JLabel horariode6a8lunes22;
    private javax.swing.JLabel horariode6a8lunes24;
    private javax.swing.JLabel horariode6a8lunes36;
    private javax.swing.JLabel horariode6a8lunes42;
    private javax.swing.JLabel horariode6a8lunes45;
    private javax.swing.JLabel horariode6a8lunes65;
    private javax.swing.JLabel horariode6a8lunes66;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel juevesjLabel;
    private javax.swing.JLabel lunesJlabel;
    private javax.swing.JLabel martesjLabel7;
    private javax.swing.JLabel mas_horario_jlabel;
    private javax.swing.JLabel materia6a7lunes;
    private javax.swing.JLabel materia6a7lunes1;
    private javax.swing.JLabel materia6a7lunes10;
    private javax.swing.JLabel materia6a7lunes105;
    private javax.swing.JLabel materia6a7lunes106;
    private javax.swing.JLabel materia6a7lunes107;
    private javax.swing.JLabel materia6a7lunes108;
    private javax.swing.JLabel materia6a7lunes109;
    private javax.swing.JLabel materia6a7lunes11;
    private javax.swing.JLabel materia6a7lunes110;
    private javax.swing.JLabel materia6a7lunes111;
    private javax.swing.JLabel materia6a7lunes112;
    private javax.swing.JLabel materia6a7lunes113;
    private javax.swing.JLabel materia6a7lunes114;
    private javax.swing.JLabel materia6a7lunes115;
    private javax.swing.JLabel materia6a7lunes116;
    private javax.swing.JLabel materia6a7lunes117;
    private javax.swing.JLabel materia6a7lunes118;
    private javax.swing.JLabel materia6a7lunes119;
    private javax.swing.JLabel materia6a7lunes12;
    private javax.swing.JLabel materia6a7lunes13;
    private javax.swing.JLabel materia6a7lunes14;
    private javax.swing.JLabel materia6a7lunes15;
    private javax.swing.JLabel materia6a7lunes16;
    private javax.swing.JLabel materia6a7lunes17;
    private javax.swing.JLabel materia6a7lunes18;
    private javax.swing.JLabel materia6a7lunes19;
    private javax.swing.JLabel materia6a7lunes20;
    private javax.swing.JLabel materia6a7lunes21;
    private javax.swing.JLabel materia6a7lunes22;
    private javax.swing.JLabel materia6a7lunes23;
    private javax.swing.JLabel materia6a7lunes24;
    private javax.swing.JLabel materia6a7lunes25;
    private javax.swing.JLabel materia6a7lunes26;
    private javax.swing.JLabel materia6a7lunes27;
    private javax.swing.JLabel materia6a7lunes28;
    private javax.swing.JLabel materia6a7lunes29;
    private javax.swing.JLabel materia6a7lunes3;
    private javax.swing.JLabel materia6a7lunes30;
    private javax.swing.JLabel materia6a7lunes31;
    private javax.swing.JLabel materia6a7lunes32;
    private javax.swing.JLabel materia6a7lunes47;
    private javax.swing.JLabel materia6a7lunes48;
    private javax.swing.JLabel materia6a7lunes49;
    private javax.swing.JLabel materia6a7lunes5;
    private javax.swing.JLabel materia6a7lunes50;
    private javax.swing.JLabel materia6a7lunes51;
    private javax.swing.JLabel materia6a7lunes52;
    private javax.swing.JLabel materia6a7lunes53;
    private javax.swing.JLabel materia6a7lunes54;
    private javax.swing.JLabel materia6a7lunes55;
    private javax.swing.JLabel materia6a7lunes56;
    private javax.swing.JLabel materia6a7lunes57;
    private javax.swing.JLabel materia6a7lunes58;
    private javax.swing.JLabel materia6a7lunes59;
    private javax.swing.JLabel materia6a7lunes6;
    private javax.swing.JLabel materia6a7lunes60;
    private javax.swing.JLabel materia6a7lunes7;
    private javax.swing.JLabel materia6a7lunes75;
    private javax.swing.JLabel materia6a7lunes76;
    private javax.swing.JLabel materia6a7lunes77;
    private javax.swing.JLabel materia6a7lunes78;
    private javax.swing.JLabel materia6a7lunes79;
    private javax.swing.JLabel materia6a7lunes8;
    private javax.swing.JLabel materia6a7lunes80;
    private javax.swing.JLabel materia6a7lunes81;
    private javax.swing.JLabel materia6a7lunes82;
    private javax.swing.JLabel materia6a7lunes83;
    private javax.swing.JLabel materia6a7lunes84;
    private javax.swing.JLabel materia6a7lunes85;
    private javax.swing.JLabel materia6a7lunes86;
    private javax.swing.JLabel materia6a7lunes87;
    private javax.swing.JLabel materia6a7lunes88;
    private javax.swing.JLabel materia6a7lunes89;
    private javax.swing.JLabel materia6a7lunes9;
    private javax.swing.JLabel materia6a8amlunes117;
    private javax.swing.JLabel materia6a8amlunes118;
    private javax.swing.JLabel materia6a8amlunes169;
    private javax.swing.JLabel materia6a8amlunes20;
    private javax.swing.JLabel materia6a8amlunes215;
    private javax.swing.JLabel materia6a8amlunes22;
    private javax.swing.JLabel materia6a8amlunes24;
    private javax.swing.JLabel materia6a8amlunes36;
    private javax.swing.JLabel materia6a8amlunes42;
    private javax.swing.JLabel materia6a8amlunes45;
    private javax.swing.JLabel materia6a8amlunes65;
    private javax.swing.JLabel materia6a8amlunes66;
    private javax.swing.JLabel mesjtime;
    private javax.swing.JLabel miercolesjLabel;
    private javax.swing.JLabel nombreEstudianteJlabel;
    private javax.swing.JLabel nuevoHorario_jlabel;
    private com.login.PanelRound panel10a11amJueves;
    private com.login.PanelRound panel10a11amMartes;
    private com.login.PanelRound panel10a11amMiercoles;
    private com.login.PanelRound panel10a11amViernes;
    private com.login.PanelRound panel10a11amlunes;
    private com.login.PanelRound panel10a12Miercoles;
    private com.login.PanelRound panel10a12amlunes;
    private com.login.PanelRound panel10a13lunes;
    private com.login.PanelRound panel11a12amJueves;
    private com.login.PanelRound panel11a12amMartes;
    private com.login.PanelRound panel11a12amMiercoles;
    private com.login.PanelRound panel11a12amViernes;
    private com.login.PanelRound panel11a12amlunes;
    private com.login.PanelRound panel12a13Jueves;
    private com.login.PanelRound panel12a13Martes;
    private com.login.PanelRound panel12a13Miercoles;
    private com.login.PanelRound panel12a13Viernes;
    private com.login.PanelRound panel12a13lunes;
    private com.login.PanelRound panel13a14Jueves;
    private com.login.PanelRound panel13a14Martes;
    private com.login.PanelRound panel13a14Miercoles;
    private com.login.PanelRound panel13a14Viernes;
    private com.login.PanelRound panel13a14lunes;
    private com.login.PanelRound panel14a15Jueves;
    private com.login.PanelRound panel14a15Martes;
    private com.login.PanelRound panel14a15Miercoles;
    private com.login.PanelRound panel14a15Viernes;
    private com.login.PanelRound panel14a15lunes;
    private com.login.PanelRound panel14a16Jueves;
    private com.login.PanelRound panel14a16Martes;
    private com.login.PanelRound panel14a16Miercoles;
    private com.login.PanelRound panel15a16Jueves;
    private com.login.PanelRound panel15a16Martes;
    private com.login.PanelRound panel15a16Miercoles;
    private com.login.PanelRound panel15a16Viernes;
    private com.login.PanelRound panel15a16lunes;
    private com.login.PanelRound panel15a17Martes;
    private com.login.PanelRound panel16a17Jueves;
    private com.login.PanelRound panel16a17Martes;
    private com.login.PanelRound panel16a17Miercoles;
    private com.login.PanelRound panel16a17Viernes;
    private com.login.PanelRound panel16a17lunes;
    private com.login.PanelRound panel16a19lunes;
    private com.login.PanelRound panel17a18Jueves;
    private com.login.PanelRound panel17a18Martes;
    private com.login.PanelRound panel17a18Miercoles;
    private com.login.PanelRound panel17a18Viernes;
    private com.login.PanelRound panel17a18lunes;
    private com.login.PanelRound panel18a19Jueves;
    private com.login.PanelRound panel18a19Martes;
    private com.login.PanelRound panel18a19Miercoles;
    private com.login.PanelRound panel18a19Viernes;
    private com.login.PanelRound panel18a19lunes;
    private com.login.PanelRound panel19a20Jueves;
    private com.login.PanelRound panel19a20Martes;
    private com.login.PanelRound panel19a20Miercoles;
    private com.login.PanelRound panel19a20Viernes;
    private com.login.PanelRound panel19a20lunes;
    private com.login.PanelRound panel20a21Jueves;
    private com.login.PanelRound panel20a21Martes;
    private com.login.PanelRound panel20a21Miercoles;
    private com.login.PanelRound panel20a21Viernes;
    private com.login.PanelRound panel20a21lunes;
    private com.login.PanelRound panel6a7amJueves;
    private com.login.PanelRound panel6a7amMartes;
    private com.login.PanelRound panel6a7amMiercoles;
    private com.login.PanelRound panel6a7amViernes;
    private com.login.PanelRound panel6a7amlunes;
    private com.login.PanelRound panel6a8amlunes;
    private com.login.PanelRound panel7a10amMartes;
    private com.login.PanelRound panel7a8amJueves;
    private com.login.PanelRound panel7a8amMartes;
    private com.login.PanelRound panel7a8amMiercoles;
    private com.login.PanelRound panel7a8amViernes;
    private com.login.PanelRound panel7a8amlunes;
    private com.login.PanelRound panel8a10amViernes;
    private com.login.PanelRound panel8a10amlunes;
    private com.login.PanelRound panel8a9amJueves;
    private com.login.PanelRound panel8a9amMartes;
    private com.login.PanelRound panel8a9amMiercoles;
    private com.login.PanelRound panel8a9amViernes;
    private com.login.PanelRound panel8a9amlunes;
    private com.login.PanelRound panel9a10amJueves;
    private com.login.PanelRound panel9a10amMartes;
    private com.login.PanelRound panel9a10amMiercoles;
    private com.login.PanelRound panel9a10amViernes;
    private com.login.PanelRound panel9a10amlunes;
    private com.login.PanelRound panelRound1;
    private com.login.PanelRound panelRound10;
    private com.login.PanelRound panelRound112;
    private com.login.PanelRound panelRound113;
    private com.login.PanelRound panelRound114;
    private com.login.PanelRound panelRound115;
    private com.login.PanelRound panelRound116;
    private com.login.PanelRound panelRound117;
    private com.login.PanelRound panelRound118;
    private com.login.PanelRound panelRound119;
    private com.login.PanelRound panelRound12;
    private com.login.PanelRound panelRound120;
    private com.login.PanelRound panelRound121;
    private com.login.PanelRound panelRound122;
    private com.login.PanelRound panelRound123;
    private com.login.PanelRound panelRound124;
    private com.login.PanelRound panelRound125;
    private com.login.PanelRound panelRound126;
    private com.login.PanelRound panelRound13;
    private com.login.PanelRound panelRound14;
    private com.login.PanelRound panelRound15;
    private com.login.PanelRound panelRound16;
    private com.login.PanelRound panelRound17;
    private com.login.PanelRound panelRound18;
    private com.login.PanelRound panelRound19;
    private com.login.PanelRound panelRound20;
    private com.login.PanelRound panelRound21;
    private com.login.PanelRound panelRound22;
    private com.login.PanelRound panelRound23;
    private com.login.PanelRound panelRound24;
    private com.login.PanelRound panelRound25;
    private com.login.PanelRound panelRound26;
    private com.login.PanelRound panelRound27;
    private com.login.PanelRound panelRound28;
    private com.login.PanelRound panelRound29;
    private com.login.PanelRound panelRound30;
    private com.login.PanelRound panelRound31;
    private com.login.PanelRound panelRound32;
    private com.login.PanelRound panelRound33;
    private com.login.PanelRound panelRound34;
    private com.login.PanelRound panelRound35;
    private com.login.PanelRound panelRound36;
    private com.login.PanelRound panelRound37;
    private com.login.PanelRound panelRound38;
    private com.login.PanelRound panelRound39;
    private com.login.PanelRound panelRound54;
    private com.login.PanelRound panelRound55;
    private com.login.PanelRound panelRound56;
    private com.login.PanelRound panelRound57;
    private com.login.PanelRound panelRound58;
    private com.login.PanelRound panelRound59;
    private com.login.PanelRound panelRound60;
    private com.login.PanelRound panelRound61;
    private com.login.PanelRound panelRound62;
    private com.login.PanelRound panelRound63;
    private com.login.PanelRound panelRound64;
    private com.login.PanelRound panelRound65;
    private com.login.PanelRound panelRound66;
    private com.login.PanelRound panelRound67;
    private com.login.PanelRound panelRound7;
    private com.login.PanelRound panelRound8;
    private com.login.PanelRound panelRound82;
    private com.login.PanelRound panelRound83;
    private com.login.PanelRound panelRound84;
    private com.login.PanelRound panelRound85;
    private com.login.PanelRound panelRound86;
    private com.login.PanelRound panelRound87;
    private com.login.PanelRound panelRound88;
    private com.login.PanelRound panelRound89;
    private com.login.PanelRound panelRound90;
    private com.login.PanelRound panelRound91;
    private com.login.PanelRound panelRound92;
    private com.login.PanelRound panelRound93;
    private com.login.PanelRound panelRound94;
    private com.login.PanelRound panelRound95;
    private com.login.PanelRound panelRound96;
    private com.login.PanelRound panelinterno6amlunes117;
    private com.login.PanelRound panelinterno6amlunes118;
    private com.login.PanelRound panelinterno6amlunes169;
    private com.login.PanelRound panelinterno6amlunes20;
    private com.login.PanelRound panelinterno6amlunes215;
    private com.login.PanelRound panelinterno6amlunes22;
    private com.login.PanelRound panelinterno6amlunes24;
    private com.login.PanelRound panelinterno6amlunes36;
    private com.login.PanelRound panelinterno6amlunes42;
    private com.login.PanelRound panelinterno6amlunes45;
    private com.login.PanelRound panelinterno6amlunes65;
    private com.login.PanelRound panelinterno6amlunes66;
    private javax.swing.JLabel salon6a8lunes117;
    private javax.swing.JLabel salon6a8lunes118;
    private javax.swing.JLabel salon6a8lunes169;
    private javax.swing.JLabel salon6a8lunes20;
    private javax.swing.JLabel salon6a8lunes215;
    private javax.swing.JLabel salon6a8lunes22;
    private javax.swing.JLabel salon6a8lunes24;
    private javax.swing.JLabel salon6a8lunes36;
    private javax.swing.JLabel salon6a8lunes42;
    private javax.swing.JLabel salon6a8lunes45;
    private javax.swing.JLabel salon6a8lunes65;
    private javax.swing.JLabel salon6a8lunes66;
    private javax.swing.JLabel semestre_estudiante;
    private javax.swing.JLabel tituloMiHorario;
    private javax.swing.JLabel viernesjLabel;
    // End of variables declaration//GEN-END:variables
}
