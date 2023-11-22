/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import dbconnection.ConeccionUsuarios;
import java.awt.Color;


public class RegistroEstudiantes extends javax.swing.JFrame {

    int xMouse, yMouse;
    
            
            
            
            
    public RegistroEstudiantes() {
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

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitButton = new javax.swing.JPanel();
        exitButtonlabel = new javax.swing.JLabel();
        panel_izquierdo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        titulo_usuario = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        titulo_contraseña = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        panel_register = new com.login.PanelRound();
        RegistroLabel = new javax.swing.JLabel();
        estadoPeticion = new javax.swing.JLabel();
        nombre_estudiante = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        titulo_usuario2 = new javax.swing.JLabel();
        semestre_estudiante = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        titulo_usuario3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        titulo_usuario4 = new javax.swing.JLabel();
        carrera_estudiante1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setPreferredSize(new java.awt.Dimension(800, 450));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(217, 217, 217));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(217, 217, 217));

        exitButtonlabel.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        exitButtonlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButtonlabel.setText("X");
        exitButtonlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButtonlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonlabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButtonlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButtonlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 763, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        panel_izquierdo.setBackground(new java.awt.Color(217, 217, 217));
        panel_izquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Inter ExtraBold", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registrate");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo.setMaximumSize(new java.awt.Dimension(115, 15));
        panel_izquierdo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 286, 26));

        titulo_usuario.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        titulo_usuario.setText("Usuario:");
        panel_izquierdo.add(titulo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        usuario.setBackground(new java.awt.Color(217, 217, 217));
        usuario.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(51, 0, 0));
        usuario.setText("Usuario de elysa");
        usuario.setBorder(null);
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioMousePressed(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
        });
        panel_izquierdo.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 160, 29));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        panel_izquierdo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 120, 9));

        titulo_contraseña.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        titulo_contraseña.setText("Contraseña:");
        panel_izquierdo.add(titulo_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 110, -1));

        contraseña.setBackground(new java.awt.Color(217, 217, 217));
        contraseña.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        contraseña.setText("********");
        contraseña.setBorder(null);
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaMousePressed(evt);
            }
        });
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseñaKeyPressed(evt);
            }
        });
        panel_izquierdo.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 110, 20));
        panel_izquierdo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 110, 10));

        panel_register.setBackground(new java.awt.Color(231, 231, 231));
        panel_register.setRoundBottomLeft(20);
        panel_register.setRoundBottomRight(20);
        panel_register.setRoundTopLeft(20);
        panel_register.setRoundTopRight(20);
        panel_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_registerMouseExited(evt);
            }
        });
        panel_register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistroLabel.setBackground(new java.awt.Color(204, 204, 204));
        RegistroLabel.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        RegistroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistroLabel.setText("Registrate");
        RegistroLabel.setToolTipText("");
        RegistroLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistroLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistroLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistroLabelMouseExited(evt);
            }
        });
        panel_register.add(RegistroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        panel_izquierdo.add(panel_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 303, 40));

        estadoPeticion.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        panel_izquierdo.add(estadoPeticion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 190, 20));

        nombre_estudiante.setBackground(new java.awt.Color(217, 217, 217));
        nombre_estudiante.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        nombre_estudiante.setForeground(new java.awt.Color(51, 0, 0));
        nombre_estudiante.setText("Tu nombre completo");
        nombre_estudiante.setBorder(null);
        nombre_estudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombre_estudianteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombre_estudianteMousePressed(evt);
            }
        });
        nombre_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_estudianteActionPerformed(evt);
            }
        });
        nombre_estudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombre_estudianteKeyPressed(evt);
            }
        });
        panel_izquierdo.add(nombre_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 270, 29));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        panel_izquierdo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 280, 9));

        titulo_usuario2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        titulo_usuario2.setText("Carrera:");
        panel_izquierdo.add(titulo_usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        semestre_estudiante.setBackground(new java.awt.Color(217, 217, 217));
        semestre_estudiante.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        semestre_estudiante.setForeground(new java.awt.Color(51, 0, 0));
        semestre_estudiante.setText("1");
        semestre_estudiante.setBorder(null);
        semestre_estudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                semestre_estudianteMousePressed(evt);
            }
        });
        semestre_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestre_estudianteActionPerformed(evt);
            }
        });
        panel_izquierdo.add(semestre_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 130, 29));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        panel_izquierdo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 130, 9));

        titulo_usuario3.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        titulo_usuario3.setText("Semestre:");
        panel_izquierdo.add(titulo_usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        panel_izquierdo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 120, 9));

        titulo_usuario4.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        titulo_usuario4.setText("Nombre completo:");
        panel_izquierdo.add(titulo_usuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        carrera_estudiante1.setBackground(new java.awt.Color(217, 217, 217));
        carrera_estudiante1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        carrera_estudiante1.setForeground(new java.awt.Color(51, 0, 0));
        carrera_estudiante1.setText("Ingenieria de Sistemas");
        carrera_estudiante1.setBorder(null);
        carrera_estudiante1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carrera_estudiante1MousePressed(evt);
            }
        });
        carrera_estudiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrera_estudiante1ActionPerformed(evt);
            }
        });
        panel_izquierdo.add(carrera_estudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 130, 29));

        background.add(panel_izquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
       
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitButtonlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonlabelMouseClicked
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
        
        
        RegistroEstudiantes.this.setVisible(false);

    }//GEN-LAST:event_exitButtonlabelMouseClicked

    private void panel_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_registerMouseEntered
        panel_register.setBackground(Color.white);
    }//GEN-LAST:event_panel_registerMouseEntered

    private void panel_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_registerMouseExited
        panel_register.setBackground(new Color(231,231,231, 255));
    }//GEN-LAST:event_panel_registerMouseExited

    private void RegistroLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroLabelMouseEntered
        panel_register.setBackground(Color.white);
    }//GEN-LAST:event_RegistroLabelMouseEntered

    private void RegistroLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroLabelMouseExited
        panel_register.setBackground(new Color(231,231,231, 255));
    }//GEN-LAST:event_RegistroLabelMouseExited

    private void exitButtonlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonlabelMouseEntered
        exitButtonlabel.setForeground(Color.red);
    }//GEN-LAST:event_exitButtonlabelMouseEntered

    private void exitButtonlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonlabelMouseExited
        exitButtonlabel.setForeground(Color.black);
    }//GEN-LAST:event_exitButtonlabelMouseExited

    private void usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMousePressed
        if(usuario.getText().equals("Usuario de elysa")){
            usuario.setText("");
        }
        
        if(String.valueOf(contraseña.getPassword()).isEmpty()){
            contraseña.setText("********");
        }
        
    }//GEN-LAST:event_usuarioMousePressed

    private void contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMousePressed
        if(String.valueOf(contraseña.getPassword()).equals("********")){
        contraseña.setText("");
        }
        
        if(usuario.getText().isEmpty()){
        usuario.setText("Usuario de elysa");
        }
    }//GEN-LAST:event_contraseñaMousePressed

    private void panel_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_registerMouseClicked

    String user = usuario.getText();
    String password = String.valueOf(contraseña.getPassword());
    String nombre = nombre_estudiante.getText();
    String carrera = carrera_estudiante1.getText();
    String semestre = semestre_estudiante.getText();
        
    System.out.println("Nombre del estudiante: "+nombre+ " Carrera dle estudiante:" + carrera + " Semestre "
        + semestre + " Usuario:" + user + " Contrasena: " +password);
        
    ConeccionUsuarios conxionUsuarios = new ConeccionUsuarios();
    
    boolean request = conxionUsuarios.agregarUsuario(user, password, nombre, carrera, semestre);
    
    
    if(request){
        estadoPeticion.setText("Registro Correcto! Inicie sesion");
    }else{
        estadoPeticion.setText("Ups... hubo un problema, recuerda llenar todo");
    }
        

        
    }//GEN-LAST:event_panel_registerMouseClicked

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void RegistroLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroLabelMouseClicked
        
        String user = usuario.getText();
        String password = String.valueOf(contraseña.getPassword());
        String nombre = nombre_estudiante.getText();
        String carrera = carrera_estudiante1.getText();
        String semestre = semestre_estudiante.getText();

        System.out.println("Nombre del estudiante: "+nombre+ " Carrera dle estudiante:" + carrera + " Semestre "
            + semestre + " Usuario:" + user + " Contrasena: " +password);

        ConeccionUsuarios conxionUsuarios = new ConeccionUsuarios();

        boolean request = conxionUsuarios.agregarUsuario(user, password, nombre, carrera, semestre);


        if(request){
            estadoPeticion.setText("Registro Correcto! Inicie sesion");
        }else{
            estadoPeticion.setText("Ups... hubo un problema, recuerda llenar todo");
        }
   
        
        
    }//GEN-LAST:event_RegistroLabelMouseClicked

    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed
        if(usuario.getText().equals("Usuario de elysa")){
            usuario.setText("");
        }
        
        
        
    }//GEN-LAST:event_usuarioKeyPressed

    private void contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyPressed
        if(String.valueOf(contraseña.getPassword()).equals("********")){
        contraseña.setText("");
        }
    }//GEN-LAST:event_contraseñaKeyPressed

    private void nombre_estudianteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_estudianteMousePressed
        
        if (nombre_estudiante.getText().equals("Tu nombre completo")){
            nombre_estudiante.setText("");
        }
        
        if (semestre_estudiante.getText().equals("Ingenieria de Sistemas")){
            nombre_estudiante.setText("Ingenieria de Sistemas");
        }
        
         if (semestre_estudiante.getText().equals("1")){
            semestre_estudiante.setText("1");
        }
        
        
        
    }//GEN-LAST:event_nombre_estudianteMousePressed

    private void nombre_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_estudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_estudianteActionPerformed

    private void nombre_estudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_estudianteKeyPressed
        if (nombre_estudiante.getText().equals("Tu nombre completo")){
            nombre_estudiante.setText("");
        }
        
        if (semestre_estudiante.getText().equals("Ingenieria de Sistemas")){
            semestre_estudiante.setText("Ingenieria de Sistemas");
        }
        
         if (semestre_estudiante.getText().equals("1")){
            semestre_estudiante.setText("1");
        }
        
    }//GEN-LAST:event_nombre_estudianteKeyPressed

    private void semestre_estudianteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre_estudianteMousePressed
        if (semestre_estudiante.getText().equals("1")){
            semestre_estudiante.setText("");
        }
        
        if (nombre_estudiante.getText().equals("Tu nombre completo")){
            nombre_estudiante.setText("Tu nombre completo");
        }
        
         if (carrera_estudiante1.getText().equals("Ingenieria de Sistemas")){
            carrera_estudiante1.setText("Ingenieria de Sistemas");
        }
        
   
        
    }//GEN-LAST:event_semestre_estudianteMousePressed

    private void semestre_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestre_estudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semestre_estudianteActionPerformed

    private void nombre_estudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_estudianteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_estudianteMouseClicked

    private void carrera_estudiante1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrera_estudiante1MousePressed
         if (carrera_estudiante1.getText().equals("Ingenieria de Sistemas")){
            carrera_estudiante1.setText("");
        }
        
        if (semestre_estudiante.getText().equals("1")){
            semestre_estudiante.setText("1");
        }
        
        if (nombre_estudiante.getText().equals("Tu nombre completo")){
            nombre_estudiante.setText("Tu nombre completo");
        }
        
        
    }//GEN-LAST:event_carrera_estudiante1MousePressed

    private void carrera_estudiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrera_estudiante1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carrera_estudiante1ActionPerformed
                  
    
    
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
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegistroLabel;
    private javax.swing.JPanel background;
    public javax.swing.JTextField carrera_estudiante1;
    public javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel estadoPeticion;
    private javax.swing.JPanel exitButton;
    private javax.swing.JLabel exitButtonlabel;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JTextField nombre_estudiante;
    private javax.swing.JPanel panel_izquierdo;
    private com.login.PanelRound panel_register;
    public javax.swing.JTextField semestre_estudiante;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo_contraseña;
    private javax.swing.JLabel titulo_usuario;
    private javax.swing.JLabel titulo_usuario2;
    private javax.swing.JLabel titulo_usuario3;
    private javax.swing.JLabel titulo_usuario4;
    public javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}



