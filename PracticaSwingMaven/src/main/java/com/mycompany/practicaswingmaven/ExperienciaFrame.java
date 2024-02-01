
package com.mycompany.practicaswingmaven;

import java.util.ArrayList;
import java.util.Date;



public class ExperienciaFrame extends javax.swing.JFrame {

 
    public ExperienciaFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
   // DatosCompartidos datosCompartidos = new DatosCompartidos();
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VolverExp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lugarTexto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionTrabajo = new javax.swing.JTextArea();
        BotonDescripcion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaTextoExperiencia = new javax.swing.JTextArea();
        BotonAgregarDesde = new javax.swing.JButton();
        BotonLugar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        añoHasta = new javax.swing.JTextField();
        BotonHasta = new javax.swing.JButton();
        BotonBorrarExperiencia = new javax.swing.JButton();
        añoDesde = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardarExp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VolverExp.setText("Volver");
        VolverExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverExpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel1.setText("Experiencia");

        jLabel2.setText("FECHA DESDE:");

        jLabel3.setText("LUGAR:");

        jLabel4.setText("DESCRIPCION DEL PUESTO:");

        descripcionTrabajo.setColumns(20);
        descripcionTrabajo.setRows(5);
        jScrollPane1.setViewportView(descripcionTrabajo);

        BotonDescripcion.setText("Agregar");
        BotonDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDescripcionActionPerformed(evt);
            }
        });

        AreaTextoExperiencia.setEditable(false);
        AreaTextoExperiencia.setColumns(20);
        AreaTextoExperiencia.setRows(5);
        jScrollPane2.setViewportView(AreaTextoExperiencia);

        BotonAgregarDesde.setText("Agregar");
        BotonAgregarDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarDesdeActionPerformed(evt);
            }
        });

        BotonLugar.setText("Agregar");
        BotonLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLugarActionPerformed(evt);
            }
        });

        jLabel5.setText("FECHA HASTA:");

        BotonHasta.setText("Agregar");
        BotonHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHastaActionPerformed(evt);
            }
        });

        BotonBorrarExperiencia.setText("Borrar todo");
        BotonBorrarExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarExperienciaActionPerformed(evt);
            }
        });

        añoDesde.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/yyyy"))));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setText("Ejemplo: 01/2000");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel7.setText("Ejemplo: 01/2000");

        btnGuardarExp.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(41, 41, 41)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lugarTexto)
                                            .addComponent(añoHasta)
                                            .addComponent(añoDesde)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonAgregarDesde)
                                    .addComponent(BotonHasta)
                                    .addComponent(BotonLugar)
                                    .addComponent(BotonDescripcion, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonBorrarExperiencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardarExp)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(VolverExp)))
                                .addGap(14, 14, 14))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(BotonAgregarDesde)
                            .addComponent(añoDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(añoHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonHasta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lugarTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(BotonLugar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonDescripcion)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonBorrarExperiencia)
                    .addComponent(btnGuardarExp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VolverExp)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverExpActionPerformed
        PrincipalFrame principal = new PrincipalFrame();
        
        dispose();
    }//GEN-LAST:event_VolverExpActionPerformed

    private void BotonAgregarDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarDesdeActionPerformed
        Date fechaNac = (Date) añoDesde.getValue();
        System.out.println(fechaNac);
        AreaTextoExperiencia.setText(añoDesde.getText()+"\n"); 
        
    }//GEN-LAST:event_BotonAgregarDesdeActionPerformed

    private void BotonHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHastaActionPerformed
        AreaTextoExperiencia.setText(añoDesde.getText()+" - "+añoHasta.getText()+"\n");
        
    }//GEN-LAST:event_BotonHastaActionPerformed

    private void BotonLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLugarActionPerformed
        AreaTextoExperiencia.setText(añoDesde.getText()+" - "+añoHasta.getText()+"\n"+lugarTexto.getText());
    }//GEN-LAST:event_BotonLugarActionPerformed

    private void BotonDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDescripcionActionPerformed
        AreaTextoExperiencia.setText(añoDesde.getText()+" - "+añoHasta.getText()+"\n"+lugarTexto.getText()+"\n"+
                descripcionTrabajo.getText());
        //datosCompartidos.setFechaInicioExp(Integer.parseInt(añoDesde.getText()));
        //datosCompartidos.setFechaFinExp(Integer.parseInt(añoHasta.getText()));
        //datosCompartidos.setLugarExp(lugarTexto.getText());
       // datosCompartidos.setDescExp(descripcionTrabajo.getText());        
        
                 
    }//GEN-LAST:event_BotonDescripcionActionPerformed

    private void BotonBorrarExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarExperienciaActionPerformed
        AreaTextoExperiencia.setText("");
    }//GEN-LAST:event_BotonBorrarExperienciaActionPerformed

    public static String ConvertirListAString (ArrayList<String>lista){
        StringBuilder resultado = new StringBuilder();
        for(String elemento : lista){
            resultado.append(elemento).append(", ");
        }
        
        if (resultado.length() > 0) {
            resultado.delete(resultado.length() - 2, resultado.length());
        }
        
        return resultado.toString();
    }
    
    
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExperienciaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTextoExperiencia;
    private javax.swing.JButton BotonAgregarDesde;
    private javax.swing.JButton BotonBorrarExperiencia;
    private javax.swing.JButton BotonDescripcion;
    private javax.swing.JButton BotonHasta;
    private javax.swing.JButton BotonLugar;
    private javax.swing.JButton VolverExp;
    private javax.swing.JFormattedTextField añoDesde;
    private javax.swing.JTextField añoHasta;
    private javax.swing.JButton btnGuardarExp;
    private javax.swing.JTextArea descripcionTrabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lugarTexto;
    // End of variables declaration//GEN-END:variables
}
