/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.L_OTEventos;
import Logica.L_POIExcel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hans
 */
public class FrmGestion_OT_Eventos_Special_Search extends javax.swing.JFrame {

    /**
     * Creates new form FrmGestion_OT_Eventos_Special_Search
     */
    public FrmGestion_OT_Eventos_Special_Search() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        jScrollPane1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_OT_Eventos_Buscar_Tipo_Parametro_01 = new javax.swing.JTextField();
        Txt_OT_Eventos_Buscar_Tipo_Parametro_02 = new javax.swing.JTextField();
        Txt_OT_Eventos_Buscar_Parametro_01 = new javax.swing.JTextField();
        Txt_OT_Eventos_Buscar_Parametro_02 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 120, 30));

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 10, 20));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 20));

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 120, 30));

        Txt_OT_Eventos_Buscar_Tipo_Parametro_01.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Eventos_Buscar_Tipo_Parametro_01.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Eventos_Buscar_Tipo_Parametro_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 110, -1));

        Txt_OT_Eventos_Buscar_Tipo_Parametro_02.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Eventos_Buscar_Tipo_Parametro_02.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Eventos_Buscar_Tipo_Parametro_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 110, -1));

        Txt_OT_Eventos_Buscar_Parametro_01.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Eventos_Buscar_Parametro_01.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Eventos_Buscar_Parametro_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 225, 250, -1));

        Txt_OT_Eventos_Buscar_Parametro_02.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Txt_OT_Eventos_Buscar_Parametro_02.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Txt_OT_Eventos_Buscar_Parametro_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 225, 240, -1));

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 120, 30));

        jTable1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 970, 200));

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 60, 60));

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 70, 60));

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/FrmOTEventosEspecial.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Buscar_Eventos_Special_Search(Txt_OT_Eventos_Buscar_Parametro_01.getText(),Txt_OT_Eventos_Buscar_Tipo_Parametro_01.getText(),Txt_OT_Eventos_Buscar_Parametro_02.getText(),Txt_OT_Eventos_Buscar_Tipo_Parametro_02.getText());
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        FrmGestion_OT_Eventos_Special_Search_Parametro_01 form_ot_eventos_special_parametro = new FrmGestion_OT_Eventos_Special_Search_Parametro_01();
        form_ot_eventos_special_parametro.setVisible(true);
        form_ot_eventos_special_parametro.toFront();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        FrmGestion_OT_Eventos_Special_Search_Parametro_02 form_ot_eventos_special_parametro_segundo = new FrmGestion_OT_Eventos_Special_Search_Parametro_02();
        form_ot_eventos_special_parametro_segundo.setVisible(true);
        form_ot_eventos_special_parametro_segundo.toFront();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        FrmGestion_OT_Crear_Mail form_ot_crear_mail_special = new FrmGestion_OT_Crear_Mail();
        form_ot_crear_mail_special.setVisible(true);
        form_ot_crear_mail_special.toFront();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        L_POIExcel Conv_Tbl_Special_Exel = new L_POIExcel();
        try {
            Conv_Tbl_Special_Exel.Exportar(jTable1);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    public static String UbicarPuntoOT;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String buscar;
        int fila = jTable1.rowAtPoint(evt.getPoint());
        buscar = jTable1.getValueAt(fila, 10).toString();
        UbicarPuntoOT = buscar;
        FrmGestion_OT_Imagenes form_ot_imagenes = new FrmGestion_OT_Imagenes();
        form_ot_imagenes.setVisible(true);
        form_ot_imagenes.toFront();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:    
        FrmGestion_OT_Eventos_Special_Search_Mensual form_eventos_mensual = new FrmGestion_OT_Eventos_Special_Search_Mensual();
        form_eventos_mensual.setVisible(true);
        form_eventos_mensual.toFront();        
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(FrmGestion_OT_Eventos_Special_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_OT_Eventos_Special_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_OT_Eventos_Special_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestion_OT_Eventos_Special_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestion_OT_Eventos_Special_Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_OT_Eventos_Buscar_Parametro_01;
    private javax.swing.JTextField Txt_OT_Eventos_Buscar_Parametro_02;
    public static javax.swing.JTextField Txt_OT_Eventos_Buscar_Tipo_Parametro_01;
    public static javax.swing.JTextField Txt_OT_Eventos_Buscar_Tipo_Parametro_02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void Buscar_Eventos_Special_Search(String parametro_01, String tipo_parametro_01, String parametro_02, String tipo_parametro_02) {
        jScrollPane1.setVisible(true);
        try {
            DefaultTableModel model;
            L_OTEventos func = new L_OTEventos();
            model = func.MostrandoEventos_Special_Search(parametro_01,tipo_parametro_01,parametro_02,tipo_parametro_02);
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
}
