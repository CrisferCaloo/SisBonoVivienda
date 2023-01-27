package Presentacion;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setExtendedState(Menu.MAXIMIZED_BOTH);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lblAcceso = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        btnBonos = new javax.swing.JMenu();
        btnBonoVivienda = new javax.swing.JMenuItem();
        btnPersonas = new javax.swing.JMenu();
        btnUsuarios = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnArchivo = new javax.swing.JMenu();
        btnCambiarUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calificaión del Bono de Vivienda");

        escritorio.setBackground(new java.awt.Color(204, 255, 204));

        lblAcceso.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lblAcceso.setForeground(new java.awt.Color(255, 255, 255));
        lblAcceso.setText("Acceso");
        escritorio.add(lblAcceso);
        lblAcceso.setBounds(60, 170, 580, 40);

        lblNombre.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        escritorio.add(lblNombre);
        lblNombre.setBounds(60, 90, 640, 40);

        btnBonos.setMnemonic('e');
        btnBonos.setText("SOLICITAR BONO");

        btnBonoVivienda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        btnBonoVivienda.setText("Bono de Vivienda");
        btnBonoVivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBonoViviendaActionPerformed(evt);
            }
        });
        btnBonos.add(btnBonoVivienda);

        menuBar.add(btnBonos);

        btnPersonas.setMnemonic('h');
        btnPersonas.setText("PERSONAS");

        btnUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        btnPersonas.add(btnUsuarios);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Resultados Bono de Vivienda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btnPersonas.add(jMenuItem1);

        menuBar.add(btnPersonas);

        btnArchivo.setText("ARCHIVO");

        btnCambiarUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        btnCambiarUsuarios.setText("Cambiar Usuario");
        btnCambiarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuariosActionPerformed(evt);
            }
        });
        btnArchivo.add(btnCambiarUsuarios);

        menuBar.add(btnArchivo);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBonoViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBonoViviendaActionPerformed
        // TODO add your handling code here:
        Bono form = new Bono();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnBonoViviendaActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        Usuario form = new Usuario();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnCambiarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuariosActionPerformed
        // TODO add your handling code here:
        Inicio form = new Inicio();
        form.toFront();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCambiarUsuariosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ResultadosBono form = new ResultadosBono();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {        
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnArchivo;
    private javax.swing.JMenuItem btnBonoVivienda;
    private javax.swing.JMenu btnBonos;
    private javax.swing.JMenuItem btnCambiarUsuarios;
    public static javax.swing.JMenu btnPersonas;
    public static javax.swing.JMenuItem btnUsuarios;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JLabel lblAcceso;
    public static javax.swing.JLabel lblNombre;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
