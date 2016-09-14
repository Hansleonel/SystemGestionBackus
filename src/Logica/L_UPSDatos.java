/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.D_UpsDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kandskat
 */
public class L_UPSDatos {
    
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    
    private String sSql="";
    private String SSql2="";
    
    public int totalregitrs;
    public int confirmar;

    public DefaultTableModel MostrandoDatos(String buscar) {
        DefaultTableModel model;
        
        String[] titulos = {"Id","Nombre","Direccion","CentroCosto.","NroAtm","Local","Estado","EstadoUps",
                                "Monitoreado","Descrip","Capacidad","Marca","Ip","Gw","Msc","Nro Serie","Garantia","Estado Garantia",
                                "Periodo Garantia","Propietario","Proveedor","Provnci","Ciudad","Territorio","Mantenimiento 2015"};
            
        String [] registr = new String[25];        
        totalregitrs=0;        
        model = new DefaultTableModel(null,titulos);
        
        sSql = "SELECT * FROM upsinformacion_prb WHERE NomLocal LIKE '%"+buscar+"%' or DirLocal LIKE '%"+buscar+"%' or C_CostoLocal LIKE '%"+buscar
                +"%' or Nro_ATM LIKE '%"+buscar+"%' or TipoLocal LIKE '%"+buscar+"%' or EstadoMonitoreo LIKE '%"+buscar+"%' or Desc_UPS LIKE '%"+buscar
                +"%' or Capacidad_UPS LIKE '%"+buscar+"%' or Marca_UPS LIKE '%"+buscar+"%' or IP_UPS LIKE '%"+buscar+"%' or GW_UPS LIKE '%"+buscar
                +"%' or Msc_UPS like '%"+buscar+"%' or Fecha_Garantia like '%"+buscar+"%' or Estado_Garantia like '%"+buscar+"%' or ProveedorUPS like '%"+buscar+"%'";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while (rs.next()) {
                registr[0]=rs.getString("idInformacion_UPS");
                registr[1]=rs.getString("NomLocal");
                registr[2]=rs.getString("DirLocal");
                registr[3]=rs.getString("C_CostoLocal");
                registr[4]=rs.getString("Nro_ATM");
                registr[5]=rs.getString("TipoLocal");   
                registr[6]=rs.getString("EstadoLocal");   
                registr[7]=rs.getString("EstadoUPS");
                registr[8]=rs.getString("EstadoMonitoreo");
                registr[9]=rs.getString("Desc_UPS");
                registr[10]=rs.getString("Capacidad_UPS");
                registr[11]=rs.getString("Marca_UPS");
                registr[12]=rs.getString("IP_UPS");
                registr[13]=rs.getString("GW_UPS");
                registr[14]=rs.getString("Msc_UPS");
                registr[15]=rs.getString("Nro_Serie_UPS");
                registr[16]=rs.getString("Fecha_Garantia");
                registr[17]=rs.getString("Estado_Garantia");
                registr[18]=rs.getString("Periodo_de_Garantia");
                registr[19]=rs.getString("Propietario");
                registr[20]=rs.getString("ProveedorUPS");
                registr[21]=rs.getString("Provincia_UPS");
                registr[22]=rs.getString("Ciudad_Distrito_UPS");
                registr[23]=rs.getString("Territorio_UPS");
                registr[24]=rs.getString("Mantenimiento_UPS");
                
                totalregitrs = totalregitrs + 1;
                
                model.addRow(registr);
                
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel MostrandoDatosUnicos(String UbicarPunto) {
        DefaultTableModel model;
        
        String[] titulos = {"Id","Nombre","Direccion","CentroCosto.","NroAtm","Local","Estado","EstadoUps",
                                "Monitoreado","Descrip","Capacidad","Marca","Ip","Gw","Msc","Nro Serie","Garantia","Estado Garantia",
                                "Periodo Garantia","Propietario","Proveedor","Provnci","Ciudad","Territorio","Mantenimiento 2015"};
            
        String [] registr = new String[25];        
        totalregitrs=0;        
        model = new DefaultTableModel(null,titulos);
        
        sSql = "SELECT * FROM upsinformacion_prb WHERE idInformacion_UPS ='"+UbicarPunto+"'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while (rs.next()) {
                registr[0]=rs.getString("idInformacion_UPS");
                registr[1]=rs.getString("NomLocal");
                registr[2]=rs.getString("DirLocal");
                registr[3]=rs.getString("C_CostoLocal");
                registr[4]=rs.getString("Nro_ATM");
                registr[5]=rs.getString("TipoLocal");   
                registr[6]=rs.getString("EstadoLocal");   
                registr[7]=rs.getString("EstadoUPS");
                registr[8]=rs.getString("EstadoMonitoreo");
                registr[9]=rs.getString("Desc_UPS");
                registr[10]=rs.getString("Capacidad_UPS");
                registr[11]=rs.getString("Marca_UPS");
                registr[12]=rs.getString("IP_UPS");
                registr[13]=rs.getString("GW_UPS");
                registr[14]=rs.getString("Msc_UPS");
                registr[15]=rs.getString("Nro_Serie_UPS");
                registr[16]=rs.getString("Fecha_Garantia");
                registr[17]=rs.getString("Estado_Garantia");
                registr[18]=rs.getString("Periodo_de_Garantia");
                registr[19]=rs.getString("Propietario");
                registr[20]=rs.getString("ProveedorUPS");
                registr[21]=rs.getString("Provincia_UPS");
                registr[22]=rs.getString("Ciudad_Distrito_UPS");
                registr[23]=rs.getString("Territorio_UPS");
                registr[24]=rs.getString("Mantenimiento_UPS");
                
                totalregitrs=totalregitrs+1;
                
                model.addRow(registr);
                
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean editar_ups(D_UpsDatos dts) {
        sSql = "UPDATE upsinformacion_prb SET NomLocal=?, DirLocal=?, C_CostoLocal=?, Nro_ATM=?, TIpoLocal=?, EstadoLocal=?, EstadoUPS=?, EstadoMonitoreo=?, Desc_UPS=?, Capacidad_UPS=?, Marca_UPS=?, IP_UPS=?, GW_UPS=?, Msc_UPS=?, Nro_Serie_UPS=?, Fecha_Garantia=?, Estado_Garantia=?, Periodo_de_Garantia=?, Propietario=?, ProveedorUPS=?, Provincia_UPS=?, Ciudad_Distrito_UPS=?, Territorio_UPS=?, Mantenimiento_UPS=?"+
                " WHERE idInformacion_UPS = ?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sSql);
            pst.setString(1,dts.getNomLocal());
            pst.setString(2,dts.getDirLocal());
            pst.setString(3,dts.getC_CostoLocal());
            pst.setString(4,dts.getNro_ATM());
            pst.setString(5,dts.getTipoLocal());
            pst.setString(6,dts.getEstadoLocal());
            pst.setString(7,dts.getEstadoUPS());
            pst.setString(8,dts.getEstadoMonitoreo());
            pst.setString(9,dts.getDesc_UPS());
            pst.setString(10,dts.getCapacidad_UPS());
            pst.setString(11,dts.getMarca_UPS());
            pst.setString(12,dts.getIP_UPS());
            pst.setString(13,dts.getGW_UPS());
            pst.setString(14,dts.getMsc_UPS());
            pst.setString(15,dts.getNro_Serie_UPS());
            pst.setString(16,dts.getFecha_Garantia());
            pst.setString(17,dts.getEstado_Garantia());
            pst.setString(18,dts.getPeriodo());
            pst.setString(19,dts.getPropietario());
            pst.setString(20,dts.getProveedr());
            pst.setString(21,dts.getProvincia());
            pst.setString(22,dts.getCiudad());
            pst.setString(23,dts.getTerritr());
            pst.setString(24,dts.getMantenimientoProgrm());
            pst.setInt(25, dts.getIdInformacion_UPS());
            
            int n = pst.executeUpdate();
            
            if(n!=0){
                return true;
            }
            else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
                
    }

    public DefaultTableModel MostrandoDatosUnicosPorPropietario(String UbicarPunto, String PropietarioNombre) {
        DefaultTableModel model;
        
        String[] titulos = {"Id","Nombre","Direccion","CentroCosto.","NroAtm","Local","Estado","EstadoUps",
                                "Monitoreado","Descrip","Capacidad","Marca","Ip","Gw","Msc","Nro Serie","Garantia","Estado Garantia",
                                "Periodo Garantia","Propietario","Proveedor","Provnci","Ciudad","Territorio","Mantenimiento 2015"};
            
        String [] registr = new String[25];        
        totalregitrs=0;        
        model = new DefaultTableModel(null,titulos);
        
        sSql = "SELECT * FROM upsinformacion_prb WHERE NomLocal like '"+UbicarPunto+"' or Propietario like '"+PropietarioNombre+"'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while (rs.next()) {
                registr[0]=rs.getString("idInformacion_UPS");
                registr[1]=rs.getString("NomLocal");
                registr[2]=rs.getString("DirLocal");
                registr[3]=rs.getString("C_CostoLocal");
                registr[4]=rs.getString("Nro_ATM");
                registr[5]=rs.getString("TipoLocal");   
                registr[6]=rs.getString("EstadoLocal");   
                registr[7]=rs.getString("EstadoUPS");
                registr[8]=rs.getString("EstadoMonitoreo");
                registr[9]=rs.getString("Desc_UPS");
                registr[10]=rs.getString("Capacidad_UPS");
                registr[11]=rs.getString("Marca_UPS");
                registr[12]=rs.getString("IP_UPS");
                registr[13]=rs.getString("GW_UPS");
                registr[14]=rs.getString("Msc_UPS");
                registr[15]=rs.getString("Nro_Serie_UPS");
                registr[16]=rs.getString("Fecha_Garantia");
                registr[17]=rs.getString("Estado_Garantia");
                registr[18]=rs.getString("Periodo_de_Garantia");
                registr[19]=rs.getString("Propietario");
                registr[20]=rs.getString("ProveedorUPS");
                registr[21]=rs.getString("Provincia_UPS");
                registr[22]=rs.getString("Ciudad_Distrito_UPS");
                registr[23]=rs.getString("Territorio_UPS");
                registr[24]=rs.getString("Mantenimiento_UPS");
                
                totalregitrs=totalregitrs+1;
                
                model.addRow(registr);
                
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
