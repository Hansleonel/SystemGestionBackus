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
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author kandskat
 */
public class Login {
    
    private conexion a = new conexion();
    private Connection b = a.conectar();
    private String Sentenc1 = "";
    private String Sentenc2 = "";
    public Integer totalregistros;
    
    
    public DefaultTableModel lorgeo(String login, String passw){
            
        DefaultTableModel modelo;
        
        String [] titulos = {"Usuario","Password","Descripcion de Usuario", "Comentario Usuario"};
        
        String [] registro = new String[4];
        
        totalregistros = 0;
        
        modelo = new DefaultTableModel(null, titulos);
        
        
        
        Sentenc1 = "Select * From Usuarios where idUsuario='"+login+"' and PwUsuario='"+passw+"'";
        
        try {
            Statement st = b.createStatement();
            ResultSet rs = st.executeQuery(Sentenc1);
            while(rs.next()){
                registro [0] = rs.getString("idUsuario");
                registro [1] = rs.getString("PwUsuario");
                registro [2] = rs.getString("DsUsuario");
                registro [3] = rs.getString("CoUsuario");
                
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
        
        
        
     
    }

    public DefaultTableModel listar() {
        DefaultTableModel Modelo;
        
        String [] titulos = {"Usuario","Password","Descripcion"};
        String [] registro = new String [4];
        
        totalregistros = 0;
        
        Modelo = new DefaultTableModel(null,titulos);
        
        Sentenc2 ="SELECT * FROM Usuarios";
        
        try {
            Statement st = b.createStatement();
            ResultSet rs = st.executeQuery(Sentenc2);
            while(rs.next())
            {
                registro[0] = rs.getString("idUsuario");
                registro[1] = rs.getString("PwUsuario");
                registro[2] = rs.getString("DsUsuario");
                registro[3] = rs.getString("CoUsuario");
                
                totalregistros = totalregistros +1;
                Modelo.addRow(registro);
            }
            return Modelo;
                    
        } catch (Exception e) {
            
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
        
    }
}
    
    
    
