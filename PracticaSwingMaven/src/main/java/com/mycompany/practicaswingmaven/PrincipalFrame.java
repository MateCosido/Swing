
package com.mycompany.practicaswingmaven;

/** @author SebaS */
public class PrincipalFrame extends javax.swing.JFrame {

    
    public PrincipalFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelPrincipal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabelImagenPrincipal = new javax.swing.JLabel();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2Experiencia = new javax.swing.JMenu();
        MostrarExp = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MostrarEdu = new javax.swing.JMenuItem();
        jMenu3Habilidades = new javax.swing.JMenu();
        MostrarHab = new javax.swing.JMenuItem();
        jMenu4AcercaDeMi = new javax.swing.JMenu();
        MostrarAcerca = new javax.swing.JMenuItem();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portfolio Swing");
        setIconImages(null);
        setResizable(false);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelImagenPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\Seba.png")); // NOI18N

        jLabelBienvenido.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabelBienvenido.setText("Bienvenido a mi portfolio Java Swing");

        jLabelNombre.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabelNombre.setText("Sebastián R. Larrosa");

        jLabel1.setText("sebastianlarrosa@yahoo.com.ar");

        jLabel2.setText("https://www.facebook.com/SebapoliS");

        jLabel3.setText("https://www.linkedin.com/in/sebastian-ramon-larrosa/");

        jLabel4.setText("https://github.com/MateCosido");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelImagenPrincipal)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBienvenido)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 143, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelImagenPrincipal)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelBienvenido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jMenu2Experiencia.setText("Experiencia");
        jMenu2Experiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ExperienciaActionPerformed(evt);
            }
        });

        MostrarExp.setText("Mostrar Experiencia");
        MostrarExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarExpActionPerformed(evt);
            }
        });
        jMenu2Experiencia.add(MostrarExp);

        jMenuBar1.add(jMenu2Experiencia);

        jMenu1.setText("Educación");

        MostrarEdu.setText("Mostrar Educacion");
        MostrarEdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarEduActionPerformed(evt);
            }
        });
        jMenu1.add(MostrarEdu);

        jMenuBar1.add(jMenu1);

        jMenu3Habilidades.setText("Habilidades");

        MostrarHab.setText("Mostrar Habilidades");
        MostrarHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarHabActionPerformed(evt);
            }
        });
        jMenu3Habilidades.add(MostrarHab);

        jMenuBar1.add(jMenu3Habilidades);

        jMenu4AcercaDeMi.setText("Acerca de mí");

        MostrarAcerca.setText("Mostrar Acerca de mí");
        MostrarAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarAcercaActionPerformed(evt);
            }
        });
        jMenu4AcercaDeMi.add(MostrarAcerca);

        jMenuBar1.add(jMenu4AcercaDeMi);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu2ExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ExperienciaActionPerformed
       //TODO
    }//GEN-LAST:event_jMenu2ExperienciaActionPerformed

    private void MostrarExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarExpActionPerformed
        ExperienciaFrame educacion = new ExperienciaFrame();
        educacion.setVisible(true);
    }//GEN-LAST:event_MostrarExpActionPerformed

    private void MostrarAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarAcercaActionPerformed
        AcercaFrame acerca = new AcercaFrame();
        acerca.setVisible(true);
    }//GEN-LAST:event_MostrarAcercaActionPerformed

    private void MostrarEduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarEduActionPerformed
        EducacionFrame educacion = new EducacionFrame();
        educacion.setVisible(true);
    }//GEN-LAST:event_MostrarEduActionPerformed

    private void MostrarHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarHabActionPerformed
        HabilidadesFrame habilidades = new HabilidadesFrame();
        habilidades.setVisible(true);
    }//GEN-LAST:event_MostrarHabActionPerformed
    
    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MostrarAcerca;
    private javax.swing.JMenuItem MostrarEdu;
    private javax.swing.JMenuItem MostrarExp;
    private javax.swing.JMenuItem MostrarHab;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelImagenPrincipal;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2Experiencia;
    private javax.swing.JMenu jMenu3Habilidades;
    private javax.swing.JMenu jMenu4AcercaDeMi;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
