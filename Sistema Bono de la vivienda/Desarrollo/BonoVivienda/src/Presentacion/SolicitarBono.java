package Presentacion;

import Datos.vBono;
import Logica.fBono;
import javax.swing.JOptionPane;

public class SolicitarBono extends javax.swing.JFrame {

    public SolicitarBono() {
        initComponents();
        setLocationRelativeTo(null);
        lblIdCliente.setVisible(false);
    }
    
    private String accion = "guardar";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoEstabilidad = new javax.swing.ButtonGroup();
        GrupoVivienda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIngresos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEgresos = new javax.swing.JTextField();
        chkEstSi = new javax.swing.JRadioButton();
        chkEstNo = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        chkViviendaSi = new javax.swing.JRadioButton();
        chkViviendaNo = new javax.swing.JRadioButton();
        btnVerificar = new javax.swing.JButton();
        lblIdCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SOLICITAR BONO DE VIVIENDA");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCliente.setText("Cliente:");

        jLabel3.setText("Edad:");

        jLabel4.setText("Establilidad Laboral:");

        jLabel5.setText("Ingresos:");

        jLabel6.setText("Egresos:");

        GrupoEstabilidad.add(chkEstSi);
        chkEstSi.setText("Si");

        GrupoEstabilidad.add(chkEstNo);
        chkEstNo.setText("No");

        jLabel7.setText("Tiene Vivienda:");

        GrupoVivienda.add(chkViviendaSi);
        chkViviendaSi.setText("Si");

        GrupoVivienda.add(chkViviendaNo);
        chkViviendaNo.setText("No");

        btnVerificar.setText("VERIFICAR");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        lblIdCliente.setText("idCliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEgresos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addComponent(txtIngresos, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkEstSi)
                                    .addComponent(chkViviendaSi))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkEstNo)
                                    .addComponent(chkViviendaNo)))
                            .addComponent(lblIdCliente)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnVerificar)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(lblIdCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(chkEstSi)
                    .addComponent(chkEstNo))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(chkViviendaSi)
                    .addComponent(chkViviendaNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVerificar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        if (txtEdad.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar una Edad");
            txtEdad.requestFocus();
            return;
        }                        
        
        if (txtIngresos.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Ingreso");
            txtIngresos.requestFocus();
            return;
        }

        if (txtEgresos.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Egreso");
            txtEgresos.requestFocus();
            return;
        }                
        
        vBono dts = new vBono();
        fBono func = new fBono();

        dts.setIdUsuario(Integer.parseInt(lblIdCliente.getText()));       
        dts.setEdad(Integer.parseInt(txtEdad.getText()));
        
        if (chkEstSi.isSelected()){
            dts.setEstLaboral("Si");
        } else if (chkEstNo.isSelected()){
            dts.setEstLaboral("No");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debes Seleccionar la Estabilidad Laboral");
            return;
        }
        
        if (chkViviendaSi.isSelected()){
            dts.setTieneVivienda("Si");
        } else if(chkViviendaNo.isSelected()){
            dts.setTieneVivienda("No");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debes Seleccionar Tiene Vivienda");
            return;
        }
        
        dts.setIngresos(Double.parseDouble(txtIngresos.getText()));
        dts.setEgresos(Double.parseDouble(txtEgresos.getText()));
        
        Double fondos = Double.parseDouble(txtIngresos.getText())- Double.parseDouble(txtEgresos.getText());        
        String estado;
        if(Integer.parseInt(txtEdad.getText()) >= 25 && Integer.parseInt(txtEdad.getText()) <= 50 && fondos > 100){
            estado = "Aprobado";
            dts.setEstado(estado);               
        } else {
            estado = "Rechazado";
            dts.setEstado(estado);
        }        
        
        if (accion.equals("guardar")) {
            if (func.Insertar(dts)) {                
                JOptionPane.showMessageDialog(rootPane, "EL Usuario fue: " + estado + " Para el Bono de Vivienda");                
                this.dispose();
            }                                               
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(SolicitarBono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitarBono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitarBono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitarBono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitarBono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoEstabilidad;
    private javax.swing.ButtonGroup GrupoVivienda;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JRadioButton chkEstNo;
    private javax.swing.JRadioButton chkEstSi;
    private javax.swing.JRadioButton chkViviendaNo;
    private javax.swing.JRadioButton chkViviendaSi;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblCliente;
    public static javax.swing.JLabel lblIdCliente;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEgresos;
    private javax.swing.JTextField txtIngresos;
    // End of variables declaration//GEN-END:variables
}
