/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kandskat
 */
public class L_OTImagenes {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    
    public DefaultTableModel Mostrar_OT_Imagenes(String buscar) {
        DefaultTableModel model;
        String [] titulos = {"Id_Informe","Nro_OT","Id_Item","Tipo_Servicio","Cliente Informe","Link del Informe","Link_Imagen_01","Link_Imagen_02","Link_Imagen_03","Link_Imagen_04","Link_Imagen_05","Link_Imagen_06","Link_Imagen_07","Link_Imagen_08"};        
        String [] registr = new String[14];        
        
        String sSql = "SELECT * FROM imagenesinforme WHERE Nro_OT like '5032'";        
        
        model = new DefaultTableModel(null,titulos);
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while (rs.next()) {
                
                registr[0]= rs.getString("idInforme");
                registr[1]= rs.getString("Nro_OT");
                registr[2]= rs.getString("idItem");
                registr[3]= rs.getString("Tipo_Servic_Informe");
                registr[4]= rs.getString("Cliente_Informe");
                registr[5]= rs.getString("Link_Informe");
                registr[6]= rs.getString("Link_Imagen_01");
                registr[7]= rs.getString("Link_Imagen_02");
                registr[8]= rs.getString("Link_Imagen_03");
                registr[9]= rs.getString("Link_Imagen_04");
                registr[10]= rs.getString("Link_Imagen_05");
                registr[11]= rs.getString("Link_Imagen_06");
                registr[12]= rs.getString("Link_Imagen_07");
                registr[13]= rs.getString("Link_Imagen_08");
                
                model.addRow(registr);
                
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }   
    
    
}
