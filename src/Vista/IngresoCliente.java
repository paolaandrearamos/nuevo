/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlConsignacion;
import Controlador.CtlCuenta;
import Controlador.CtlCuentaMovi;
import Controlador.CtlUsuario;
import Modelo.ClsCliente;
import Modelo.ClsConsignacion;
import Modelo.ClsCuenta;
import Modelo.ClsCuentaMovi;
import Modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Lizeth1304
 */
public class IngresoCliente extends javax.swing.JFrame {

    /**
     * Creates new form IngresoCliente
     */
    //Se instancia los controladores para poder hacer uso en toda la clase
    CtlConsignacion controladorConsignacion;
    CtlCuentaMovi controladorCuenta;
    CtlUsuario controladorUsuario;
    ClsCliente cliente;
    int cedula;

    public IngresoCliente(int cedula) {
        initComponents();
        controladorConsignacion = new CtlConsignacion();
        controladorCuenta = new CtlCuentaMovi();
        controladorUsuario = new CtlUsuario();
        this.cedula=cedula;
        consultarCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConsignacion = new javax.swing.JButton();
        btnAccederCuenta = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "¿Qué desea hacer?", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnConsignacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/699347-icon-74-document-search-48_1.png"))); // NOI18N
        btnConsignacion.setText("Consignar");
        btnConsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsignacionActionPerformed(evt);
            }
        });

        btnAccederCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Untitled-2-35-32.png"))); // NOI18N
        btnAccederCuenta.setText("Acceder");
        btnAccederCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederCuentaActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lock-32_1.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(154, 154, 154))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConsignacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(btnAccederCuenta))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsignacion)
                    .addComponent(btnAccederCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void consultarCliente(){
        ClsCliente cliente = controladorUsuario.SolicitudBuscar(cedula);
         jLabel1.setText(cliente.getNombre());
         jLabel2.setText(cliente.getApellido());
         ClsCuentaMovi cuenta = controladorCuenta.SolicitudBuscarCuentaCliente(cedula);
         jLabel3.setText(cuenta.getIdCuenta()+"");
         jLabel4.setText(cuenta.getSaldo()+"");
         
    }
    private void btnConsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsignacionActionPerformed
        //Para ingresar a la ventana de la acción consignar, primero se pide el número de la cuenta
        //y se va al método buscar para hacer la validación del dato, luego en la condición,
        //se hace la condición para que ingrese a la ventana de consignar y realice la acción
        int cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la cuenta que desea consultar: ").trim());
        ClsConsignacion usu = controladorConsignacion.SolicitudBuscar(cuenta);
        if (usu.getPassword() != null) {
            Consigna consigna = new Consigna();
            dispose();
            consigna.setVisible(true);
        }
    }//GEN-LAST:event_btnConsignacionActionPerformed

    private void btnAccederCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederCuentaActionPerformed

        //Se pide el número de la cuenta que desea ver la información requerida
        //y se va al método buscar para hacer la validación del dato, luego en la condición,
        //se hace la condición para que ingrese a la ventana de acceder y se muestra la información de la consulta
        int cliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la cuenta que desea consultar: ").trim());
        ClsCuentaMovi usu = controladorCuenta.SolicitudBuscar(cliente);
        if (usu.getPersona_cedula() != 0) {
            Cuenta placa = new Cuenta(cliente);
            this.dispose();
            placa.setVisible(true);
        }

    }//GEN-LAST:event_btnAccederCuentaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        //Acción del botón atrás para visualizar de nuevo la ventana login
        Login ven = new Login();
        dispose();
        ven.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoCliente(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccederCuenta;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConsignacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
