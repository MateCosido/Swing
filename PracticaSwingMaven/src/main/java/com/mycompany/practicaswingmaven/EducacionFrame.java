/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practicaswingmaven;

/**
 *
 * @author Usuario
 */
public class EducacionFrame extends javax.swing.JFrame {

    /**
     * Creates new form EducacionFrame
     */
    public EducacionFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechaDesdeEdu = new javax.swing.JFormattedTextField();
        fechaHastaEdu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        establecimientoEdu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tituloEdu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areatextoEdu = new javax.swing.JTextArea();
        agregarDescriEdu = new javax.swing.JButton();
        agregarFechaDesdeEdu = new javax.swing.JButton();
        agregarFechaHastaEdu = new javax.swing.JButton();
        agregarEstableEdu = new javax.swing.JButton();
        agregarTituloEdu = new javax.swing.JButton();
        borrarEdu = new javax.swing.JButton();
        guardarEdu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionEdu = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel1.setText("Educacion");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("FECHA DESDE:");

        jLabel3.setText("FECHA HASTA:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setText("Ejemplo: 02/2024");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText("Ejemplo: 02/2024");

        jLabel6.setText("ESTABLECIMIENTO:");

        jLabel7.setText("TITULO:");

        jLabel8.setText("DESCRIPCION:");

        areatextoEdu.setColumns(20);
        areatextoEdu.setRows(5);
        jScrollPane1.setViewportView(areatextoEdu);

        agregarDescriEdu.setText("Agregar");
        agregarDescriEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDescriEduActionPerformed(evt);
            }
        });

        agregarFechaDesdeEdu.setText("Agregar");
        agregarFechaDesdeEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarFechaDesdeEduActionPerformed(evt);
            }
        });

        agregarFechaHastaEdu.setText("Agregar");
        agregarFechaHastaEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarFechaHastaEduActionPerformed(evt);
            }
        });

        agregarEstableEdu.setText("Agregar");
        agregarEstableEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEstableEduActionPerformed(evt);
            }
        });

        agregarTituloEdu.setText("Agregar");
        agregarTituloEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTituloEduActionPerformed(evt);
            }
        });

        borrarEdu.setText("Borrar todo");
        borrarEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarEduActionPerformed(evt);
            }
        });

        guardarEdu.setText("Guardar");

        descripcionEdu.setColumns(20);
        descripcionEdu.setRows(5);
        jScrollPane2.setViewportView(descripcionEdu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fechaHastaEdu, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(establecimientoEdu)
                                            .addComponent(fechaDesdeEdu)
                                            .addComponent(tituloEdu)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agregarFechaHastaEdu)
                                    .addComponent(agregarFechaDesdeEdu)
                                    .addComponent(agregarEstableEdu)
                                    .addComponent(agregarTituloEdu)
                                    .addComponent(agregarDescriEdu))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(borrarEdu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(guardarEdu)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addGap(25, 25, 25))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fechaDesdeEdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarFechaDesdeEdu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaHastaEdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(agregarFechaHastaEdu))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(establecimientoEdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(agregarEstableEdu))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tituloEdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarTituloEdu))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agregarDescriEdu)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrarEdu)
                    .addComponent(guardarEdu))
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PrincipalFrame principal = new PrincipalFrame();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agregarFechaDesdeEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarFechaDesdeEduActionPerformed
        areatextoEdu.setText(fechaDesdeEdu.getText());
    }//GEN-LAST:event_agregarFechaDesdeEduActionPerformed

    private void agregarFechaHastaEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarFechaHastaEduActionPerformed
        areatextoEdu.setText(fechaDesdeEdu.getText()+" - "+fechaHastaEdu.getText());
    }//GEN-LAST:event_agregarFechaHastaEduActionPerformed

    private void agregarEstableEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEstableEduActionPerformed
        areatextoEdu.setText(fechaDesdeEdu.getText()+" - "+fechaHastaEdu.getText()+"\n"+establecimientoEdu.getText());
    }//GEN-LAST:event_agregarEstableEduActionPerformed

    private void agregarTituloEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTituloEduActionPerformed
        areatextoEdu.setText(fechaDesdeEdu.getText()+" - "+fechaHastaEdu.getText()+"\n"+establecimientoEdu.getText()+
                "\n"+tituloEdu.getText());
    }//GEN-LAST:event_agregarTituloEduActionPerformed

    private void agregarDescriEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDescriEduActionPerformed
        areatextoEdu.setText(fechaDesdeEdu.getText()+" - "+fechaHastaEdu.getText()+"\n"+establecimientoEdu.getText()+
                "\n"+tituloEdu.getText()+"\n"+descripcionEdu.getText());
    }//GEN-LAST:event_agregarDescriEduActionPerformed

    private void borrarEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarEduActionPerformed
        areatextoEdu.setText("");
    }//GEN-LAST:event_borrarEduActionPerformed

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
            java.util.logging.Logger.getLogger(EducacionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EducacionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EducacionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EducacionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EducacionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarDescriEdu;
    private javax.swing.JButton agregarEstableEdu;
    private javax.swing.JButton agregarFechaDesdeEdu;
    private javax.swing.JButton agregarFechaHastaEdu;
    private javax.swing.JButton agregarTituloEdu;
    private javax.swing.JTextArea areatextoEdu;
    private javax.swing.JButton borrarEdu;
    private javax.swing.JTextArea descripcionEdu;
    private javax.swing.JTextField establecimientoEdu;
    private javax.swing.JFormattedTextField fechaDesdeEdu;
    private javax.swing.JTextField fechaHastaEdu;
    private javax.swing.JButton guardarEdu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tituloEdu;
    // End of variables declaration//GEN-END:variables
}
