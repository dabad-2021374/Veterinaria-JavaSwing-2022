/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.denisabad.proyectvet.vista;

/**
 * Vista principal
 * @author Denis Abad
 */
public class VistaDocPrin extends javax.swing.JInternalFrame {

    
     //doctor
    private static AgregarDoc instanciaAgregarDoc = null;
    private static VerDoctor instanciaVerDoctor = null;
    private static EliminarDoc instanciaEliminarDoc = null;
    private static ActualizarDoc instanciaActualizarDoc = null;
    //cliente
    private static AgregarCli instanciaAgregarCli = null;
    private static VerCli instanciaVerCli = null;
    private static EliminarCli instanciaEliminarCli= null;
    private static ActualizarCli instanciaActualizarCli = null;
    //empleado 
     private static AgregarEmp instanciaAgregarEmp = null;
    private static VerEmpl instanciaVerEmpl = null;
    private static EliminarEmp instanciaEliminarEmp= null;
    private static ActualizaEmpl instanciaActualizaEmpl = null;
    //cita
    private static AgregarCita instanciaAgregarCita = null;
    private static VerCita instanciaVerCita = null;
    private static EliminarCita instanciaEliminarCita= null;
    private static ActualizarCita instanciaActualizarCita = null;
    //mascota 
    private static AgregarMasc instanciaAgregarMasc = null;
    private static VerMasc instanciaVerMasc = null;
    private static EliminarMasc instanciaEliminarMasc= null;
    private static ActualizarMasc instanciaActualizarMasc = null;
    
    /**
     * Creates new form VistaDocPrin
     */
    public VistaDocPrin() {
        initComponents();
    }
    //Mascota
    private synchronized AgregarMasc getInstanciaAgregarMasc(){
        if (instanciaAgregarMasc == null){
            instanciaAgregarMasc = new AgregarMasc(); 
            instanciaAgregarMasc.setVisible(true);
            jDesktopPane1.add(instanciaAgregarMasc);
            
        }else if (instanciaAgregarMasc.isVisible() == false){
            instanciaAgregarMasc.setVisible(true);
        }
        instanciaAgregarMasc.show();
        return instanciaAgregarMasc; 
    }
    private synchronized VerMasc getInstanciaVerMasc(){
        if (instanciaVerMasc == null){
            instanciaVerMasc = new VerMasc(); 
            instanciaVerMasc.setVisible(true);
            jDesktopPane1.add(instanciaVerMasc);
            
        }else if (instanciaVerMasc.isVisible() == false){
            instanciaVerMasc.setVisible(true);
        }
        instanciaVerMasc.show();
        return instanciaVerMasc; 
    }
    private synchronized EliminarMasc getInstanciaEliminarMasc(){
        if (instanciaEliminarMasc == null){
            instanciaEliminarMasc = new EliminarMasc(); 
            instanciaEliminarMasc.setVisible(true);
            jDesktopPane1.add(instanciaEliminarMasc);
            
        }else if (instanciaEliminarMasc.isVisible() == false){
            instanciaEliminarMasc.setVisible(true);
        }
        instanciaEliminarMasc.show();
        return instanciaEliminarMasc; 
    }
    private synchronized ActualizarMasc getInstanciaActualizarMasc(){
        if (instanciaActualizarMasc == null){
            instanciaActualizarMasc = new ActualizarMasc(); 
            instanciaActualizarMasc.setVisible(true);
            jDesktopPane1.add(instanciaActualizarMasc);
            
        }else if (instanciaActualizarMasc.isVisible() == false){
            instanciaActualizarMasc.setVisible(true);
        }
        instanciaActualizarMasc.show();
        return instanciaActualizarMasc; 
    }
    //doctor
    private synchronized AgregarDoc getAgregarDoc(){
        if (instanciaAgregarDoc == null){
            instanciaAgregarDoc = new AgregarDoc(); 
            instanciaAgregarDoc.setVisible(true);
            jDesktopPane1.add(instanciaAgregarDoc);
            
        }else if (instanciaAgregarDoc.isVisible() == false){
            instanciaAgregarDoc.setVisible(true);
        }
        instanciaAgregarDoc.show();
        return instanciaAgregarDoc; 
    }
     private synchronized VerDoctor getInstanciaVerDoctor(){
        if (instanciaVerDoctor == null){
            instanciaVerDoctor = new VerDoctor(); 
            instanciaVerDoctor.setVisible(true);
            jDesktopPane1.add(instanciaVerDoctor);
            
        }else if (instanciaVerDoctor.isVisible() == false){
            instanciaVerDoctor.setVisible(true);
        }
        instanciaVerDoctor.show();
        return instanciaVerDoctor; 
    }
      private synchronized EliminarDoc getInstanciaEliminarDoc(){
        if (instanciaEliminarDoc == null){
            instanciaEliminarDoc = new EliminarDoc(); 
            instanciaEliminarDoc.setVisible(true);
            jDesktopPane1.add(instanciaEliminarDoc);
            
        }else if (instanciaEliminarDoc.isVisible() == false){
            instanciaEliminarDoc.setVisible(true);
        }
        instanciaEliminarDoc.show();
        return instanciaEliminarDoc; 
    }
       private synchronized ActualizarDoc getInstanciaActualizarDoc(){
        if (instanciaActualizarDoc == null){
            instanciaActualizarDoc = new ActualizarDoc(); 
            instanciaActualizarDoc.setVisible(true);
            jDesktopPane1.add(instanciaActualizarDoc);
            
        }else if (instanciaActualizarDoc.isVisible() == false){
            instanciaActualizarDoc.setVisible(true);
        }
        instanciaActualizarDoc.show();
        return instanciaActualizarDoc; 
    }
       //Cliente
    private synchronized AgregarCli getInstanciaAgregarCli(){
        if (instanciaAgregarCli == null){
            instanciaAgregarCli = new AgregarCli(); 
            instanciaAgregarCli.setVisible(true);
            jDesktopPane1.add(instanciaAgregarCli);
            
        }else if (instanciaAgregarCli.isVisible() == false){
            instanciaAgregarCli.setVisible(true);
        }
        instanciaAgregarCli.show();
        return instanciaAgregarCli; 
    }
    private synchronized VerCli getInstanciaVerCli(){
        if (instanciaVerCli == null){
            instanciaVerCli = new VerCli(); 
            instanciaVerCli.setVisible(true);
            jDesktopPane1.add(instanciaVerCli);
            
        }else if (instanciaVerCli.isVisible() == false){
            instanciaVerCli.setVisible(true);
        }
        instanciaVerCli.show();
        return instanciaVerCli; 
    }
    private synchronized EliminarCli getInstanciaEliminarCli(){
        if (instanciaEliminarCli == null){
            instanciaEliminarCli = new EliminarCli(); 
            instanciaEliminarCli.setVisible(true);
            jDesktopPane1.add(instanciaEliminarCli);
            
        }else if (instanciaEliminarCli.isVisible() == false){
            instanciaEliminarCli.setVisible(true);
        }
        instanciaEliminarCli.show();
        return instanciaEliminarCli; 
    }
    private synchronized ActualizarCli getInstanciaActualizarCli(){
        if (instanciaActualizarCli == null){
            instanciaActualizarCli = new ActualizarCli(); 
            instanciaActualizarCli.setVisible(true);
            jDesktopPane1.add(instanciaActualizarCli);
            
        }else if (instanciaActualizarCli.isVisible() == false){
            instanciaActualizarCli.setVisible(true);
        }
        instanciaActualizarCli.show();
        return instanciaActualizarCli; 
    }
    //empleado
    private synchronized AgregarEmp getInstanciaAgregarEmpi(){
        if (instanciaAgregarEmp == null){
            instanciaAgregarEmp = new AgregarEmp(); 
            instanciaAgregarEmp.setVisible(true);
            jDesktopPane1.add(instanciaAgregarEmp);
            
        }else if (instanciaAgregarEmp.isVisible() == false){
            instanciaAgregarEmp.setVisible(true);
        }
        instanciaAgregarEmp.show();
        return instanciaAgregarEmp; 
    }
    private synchronized VerEmpl getInstanciaVerEmpl(){
        if (instanciaVerEmpl == null){
            instanciaVerEmpl = new VerEmpl(); 
            instanciaVerEmpl.setVisible(true);
            jDesktopPane1.add(instanciaVerEmpl);
            
        }else if (instanciaVerEmpl.isVisible() == false){
            instanciaVerEmpl.setVisible(true);
        }
        instanciaVerEmpl.show();
        return instanciaVerEmpl; 
    }
    private synchronized EliminarEmp getInstanciaEliminarEmp(){
        if (instanciaEliminarEmp == null){
            instanciaEliminarEmp = new EliminarEmp(); 
            instanciaEliminarEmp.setVisible(true);
            jDesktopPane1.add(instanciaEliminarEmp);
            
        }else if (instanciaEliminarEmp.isVisible() == false){
            instanciaEliminarEmp.setVisible(true);
        }
        instanciaEliminarEmp.show();
        return instanciaEliminarEmp; 
    }
    private synchronized ActualizaEmpl getInstanciaActualizaEmpl(){
        if (instanciaActualizaEmpl == null){
            instanciaActualizaEmpl = new ActualizaEmpl(); 
            instanciaActualizaEmpl.setVisible(true);
            jDesktopPane1.add(instanciaActualizaEmpl);
            
        }else if (instanciaActualizaEmpl.isVisible() == false){
            instanciaActualizaEmpl.setVisible(true);
        }
        instanciaActualizaEmpl.show();
        return instanciaActualizaEmpl; 
    }
    //Cita
    private synchronized AgregarCita getInstanciaAgregarCita(){
        if (instanciaAgregarCita == null){
            instanciaAgregarCita = new AgregarCita(); 
            instanciaAgregarCita.setVisible(true);
            jDesktopPane1.add(instanciaAgregarCita);
            
        }else if (instanciaAgregarCita.isVisible() == false){
            instanciaAgregarCita.setVisible(true);
        }
        instanciaAgregarCita.show();
        return instanciaAgregarCita; 
    }
    private synchronized VerCita getInstanciaVerCita(){
        if (instanciaVerCita == null){
            instanciaVerCita = new VerCita(); 
            instanciaVerCita.setVisible(true);
            jDesktopPane1.add(instanciaVerCita);
            
        }else if (instanciaVerCita.isVisible() == false){
            instanciaVerCita.setVisible(true);
        }
        instanciaVerCita.show();
        return instanciaVerCita; 
    }
    private synchronized EliminarCita getInstanciaEliminarCita(){
        if (instanciaEliminarCita == null){
            instanciaEliminarCita = new EliminarCita(); 
            instanciaEliminarCita.setVisible(true);
            jDesktopPane1.add(instanciaEliminarCita);
            
        }else if (instanciaEliminarCita.isVisible() == false){
            instanciaEliminarCita.setVisible(true);
        }
        instanciaEliminarCita.show();
        return instanciaEliminarCita; 
    }
    private synchronized ActualizarCita getInstanciaActualizarCita(){
        if (instanciaActualizarCita == null){
            instanciaActualizarCita = new ActualizarCita(); 
            instanciaActualizarCita.setVisible(true);
            jDesktopPane1.add(instanciaActualizarCita);
            
        }else if (instanciaActualizarCita.isVisible() == false){
            instanciaActualizarCita.setVisible(true);
        }
        instanciaActualizarCita.show();
        return instanciaActualizarCita; 
    }
    
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        jMenu1.setText("Doctor");

        jMenuItem1.setText("Agregar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Ver");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Eliminar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Actualizar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Empleado");

        jMenuItem5.setText("Agregar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Ver");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Eliminar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Actualizar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Cliente");

        jMenuItem9.setText("Agregar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Ver");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Eliminar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Actualizar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Mascota");

        jMenuItem13.setText("Agregar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("Ver");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Eliminar");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Actualizar");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Cita");

        jMenuItem17.setText("Agregar");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuItem18.setText("Ver");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem19.setText("Eliminar");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem19);

        jMenuItem20.setText("Actualizar");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem20);

        jMenuBar1.add(jMenu6);
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        getAgregarDoc(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        getInstanciaVerDoctor(); 
       instanciaVerDoctor.mostrarDatos();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        getInstanciaEliminarDoc(); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        getInstanciaActualizarDoc(); 
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        getInstanciaAgregarCli(); 
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       getInstanciaVerCli();
       instanciaVerCli.mostrarDatos();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
      getInstanciaEliminarCli(); 
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
       getInstanciaActualizarCli(); 
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        getInstanciaAgregarEmpi(); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        getInstanciaVerEmpl(); 
        instanciaVerEmpl.mostrarDatos();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       getInstanciaEliminarEmp(); 
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       getInstanciaActualizaEmpl(); 
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        getInstanciaAgregarCita(); 
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        getInstanciaVerCita();
        instanciaVerCita.mostrarDatos();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        getInstanciaEliminarCita(); 
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
       getInstanciaActualizarCita(); 
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        getInstanciaAgregarMasc(); 
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
      getInstanciaVerMasc(); 
      instanciaVerMasc.mostrarDatos();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        getInstanciaEliminarMasc(); 
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        getInstanciaActualizarMasc(); 
    }//GEN-LAST:event_jMenuItem16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
