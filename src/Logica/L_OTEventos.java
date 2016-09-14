/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.D_OTEventos;
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
public class L_OTEventos {
    
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    
    
    private String sSql ="";
    private String sSql2="";
    
    
    public int totalregistr;
    public int totalregistr1;

    public DefaultTableModel MostrandoEventos(String buscar) {
        DefaultTableModel model;
        
        String[] titulos = {"Item","Id","FechaReporte","Hora","C.C.","Local","Nombre",
                        "Zona Local","Solicitud", "Detalle Solicitud", "Numero_OT","Lvl_Servic","Estado Servic",
                        "Proveedor","Reprogrmc","Tecnic","Fecha Progrmada","Hora Programa", "Observaciones" };
        String[] registr = new String[19];
        
        totalregistr1 = 0;
        
        model = new DefaultTableModel(null, titulos);
        
        sSql = "select * from otinformacion_prb where idItem like '%"+buscar+"%' or FechaReporte like '%"+buscar+"%' or C_Costo_Nro_ATM like '%"+buscar
                +"%' or TipoLocal like '%"+buscar+"%' or NomLocal like '%"+buscar+"%' or TipoSolicitud like '%"+buscar+"%' or DetalleSolicitud like '%"+buscar
                +"%' or Nro_OT like '%"+buscar+"%' or Estado_Servic like '%"+buscar+"%' or Proveedor_Item like '%"+buscar+"%' or Tecnic like '%"+buscar
                +"%' or Fecha_Programada like '%"+buscar+"%'";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while (rs.next()) {
                
                registr[0]=rs.getString("idOrdenDeT");
                registr[1]=rs.getString("idItem");
                registr[2]=rs.getString("FechaReporte");
                registr[3]=rs.getString("HoraReporte");
                registr[4]=rs.getString("C_Costo_Nro_ATM");
                registr[5]=rs.getString("TipoLocal");
                registr[6]=rs.getString("NomLocal");
                registr[7]=rs.getString("ZonaLocal");
                registr[8]=rs.getString("TipoSolicitud");
                registr[9]=rs.getString("DetalleSolicitud");
                registr[10]=rs.getString("Nro_OT");
                registr[11]=rs.getString("Lvl_Servic");
                registr[12]=rs.getString("Estado_Servic");
                registr[13]=rs.getString("Proveedor_Item");
                registr[14]=rs.getString("Reprogr_Servic");
                registr[15]=rs.getString("Tecnic");
                registr[16]=rs.getString("Fecha_Programada");
                registr[17]=rs.getString("Hora_Programada");
                registr[18]=rs.getString("Observaciones");
                
                //totalregistr = totalregistr + 1;
                
                model.addRow(registr);
                
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }

    public DefaultTableModel Buscar_Pendientes(String buscar) {
        DefaultTableModel model;
        
        String[] titulos = {"ItemOT","IdItem","FechaReporte","Hora de Reporte","Centro_Costo","Tipo_Local","Nombr_Local",
                        "Zona Local","Tipo Solicitud", "Detalle Solicitud", "Numero_OT","Lvl_Servic","Estado Servic",
                        "Proveedor ITEM","Reprogrmc","Tecnic o","Fecha Progrmada","Hora Programa", "Observaciones"};
            
        String [] registr = new String[19];
        
        model = new DefaultTableModel(null, titulos);
        
        sSql = "SELECT * FROM otinformacion_prb WHERE FechaReporte like '%"+buscar+"%' OR Fecha_Programada like '%"+buscar+"%'";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while (rs.next()) {
                
                registr[0]=rs.getString("idOrdenDeT");
                registr[1]=rs.getString("idItem");
                registr[2]=rs.getString("FechaReporte");
                registr[3]=rs.getString("HoraReporte");
                registr[4]=rs.getString("C_Costo_Nro_ATM");
                registr[5]=rs.getString("TipoLocal");
                registr[6]=rs.getString("NomLocal");
                registr[7]=rs.getString("ZonaLocal");
                registr[8]=rs.getString("TipoSolicitud");
                registr[9]=rs.getString("DetalleSolicitud");
                registr[10]=rs.getString("Nro_OT");
                registr[11]=rs.getString("Lvl_Servic");
                registr[12]=rs.getString("Estado_Servic");
                registr[13]=rs.getString("Proveedor_Item");
                registr[14]=rs.getString("Reprogr_Servic");
                registr[15]=rs.getString("Tecnic");
                registr[16]=rs.getString("Fecha_Programada");
                registr[17]=rs.getString("Hora_Programada");
                registr[18]=rs.getString("Observaciones");
                
                totalregistr = totalregistr + 1;
                model.addRow(registr);
                
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public String Buscar_OT_Mayor() {
        sSql="SELECT MAX(Nro_OT) FROM otinformacion_prb";
        String OT_Mayor;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            rs.next();
            OT_Mayor=rs.getString("MAX(Nro_OT)");
            return OT_Mayor;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean Insertar_OTEventos(D_OTEventos dts) {
        sSql="SELECT MAX(idOrdenDeT) FROM otinformacion_prb";
        sSql2="INSERT INTO otinformacion_prb(idOrdenDeT,idItem,FechaReporte,HoraReporte,C_Costo_Nro_ATM,TipoLocal,NomLocal,ZonaLocal,TipoSolicitud,DetalleSolicitud,Nro_OT,Lvl_Servic,Estado_Servic,Proveedor_Item,Reprogr_Servic,Tecnic,Fecha_Programada,Hora_Programada,Observaciones)"+
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String IdOrdenTMayor;
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);            
            rs.next();
            
            IdOrdenTMayor = rs.getString("MAX(idOrdenDeT)");            
            int IDMayor = Integer.parseInt(IdOrdenTMayor)+1;
            
            PreparedStatement pst = cn.prepareStatement(sSql2);
            pst.setInt(1, IDMayor);
            pst.setInt(2, dts.getIdItem());
            pst.setString(3, dts.getFechaReporte());
            pst.setString(4, dts.getHoraReporte());
            pst.setString(5, dts.getC_Costo_Nro_ATM());
            pst.setString(6, dts.getTipoLocal());
            pst.setString(7, dts.getNomLocal());
            pst.setString(8, dts.getZonaLocal());
            pst.setString(9, dts.getTipoSolicitud());
            pst.setString(10, dts.getDetalleSolicitud());
            pst.setInt(11, dts.getNro_OT());
            pst.setString(12, dts.getLvl_servic());
            pst.setString(13, dts.getEstado_servic());
            pst.setString(14, dts.getProveedor_Item());
            pst.setString(15, dts.getReprog_Servic());
            pst.setString(16, dts.getTecnic());
            pst.setString(17, dts.getFecha_Programada());
            pst.setString(18, dts.getHora_Programada());
            pst.setString(19, dts.getObservaciones());
            
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

    public boolean editar(D_OTEventos dts) {
        sSql = "UPDATE otinformacion_prb SET idItem=?, FechaReporte=?, HoraReporte=?, C_Costo_Nro_ATM=?, TipoLocal=?, NomLocal=?, ZonaLocal=?, TipoSolicitud=?, DetalleSolicitud=?, Nro_OT=?, Lvl_Servic=?, Estado_Servic=?, Proveedor_Item=?, Reprogr_Servic=?, Tecnic=?, Fecha_Programada=?,Hora_Programada=?, Observaciones=?"+
                " Where idOrdenDeT=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sSql);
            
            pst.setInt(1, dts.getIdItem());
            pst.setString(2, dts.getFechaReporte());
            pst.setString(3, dts.getHoraReporte());
            pst.setString(4, dts.getC_Costo_Nro_ATM());
            pst.setString(5, dts.getTipoLocal());
            pst.setString(6, dts.getNomLocal());
            pst.setString(7, dts.getZonaLocal());
            pst.setString(8, dts.getTipoSolicitud());
            pst.setString(9, dts.getDetalleSolicitud());
            pst.setInt(10, dts.getNro_OT());
            pst.setString(11, dts.getLvl_servic());
            pst.setString(12, dts.getEstado_servic());
            pst.setString(13, dts.getProveedor_Item());
            pst.setString(14, dts.getReprog_Servic());
            pst.setString(15, dts.getTecnic());
            pst.setString(16, dts.getFecha_Programada());
            pst.setString(17, dts.getHora_Programada());
            pst.setString(18, dts.getObservaciones());
            pst.setInt(19, dts.getIdOrdendeT());
            
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

    public DefaultTableModel MostrandoEventos_Special_Search(String parametro_01, String tipo_parametro_01, String parametro_02, String tipo_parametro_02) {
        
        DefaultTableModel model;
        
        String[] titulos = {"ItemOT","IdItem","FechaReporte","Hora de Reporte","Centro_Costo","Tipo_Local","Nombr_Local",
                        "Zona Local","Tipo Solicitud", "Detalle Solicitud", "Numero_OT","Lvl_Servic","Estado Servic",
                        "Proveedor ITEM","Reprogrmc","Tecnic o","Fecha Progrmada","Hora Programa", "Observaciones" };            
        String[] registr = new String[19];
        
        model = new DefaultTableModel(null, titulos);
        
        sSql="SELECT * FROM otinformacion_prb WHERE "+tipo_parametro_01+"= '"+parametro_01+"' and "+tipo_parametro_02+" like '%"+parametro_02+"%'";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while(rs.next()){
                registr[0]=rs.getString("idOrdenDeT");
                registr[1]=rs.getString("idItem");
                registr[2]=rs.getString("FechaReporte");
                registr[3]=rs.getString("HoraReporte");
                registr[4]=rs.getString("C_Costo_Nro_ATM");
                registr[5]=rs.getString("TipoLocal");
                registr[6]=rs.getString("NomLocal");
                registr[7]=rs.getString("ZonaLocal");
                registr[8]=rs.getString("TipoSolicitud");
                registr[9]=rs.getString("DetalleSolicitud");
                registr[10]=rs.getString("Nro_OT");
                registr[11]=rs.getString("Lvl_Servic");
                registr[12]=rs.getString("Estado_Servic");
                registr[13]=rs.getString("Proveedor_Item");
                registr[14]=rs.getString("Reprogr_Servic");
                registr[15]=rs.getString("Tecnic");
                registr[16]=rs.getString("Fecha_Programada");
                registr[17]=rs.getString("Hora_Programada");
                registr[18]=rs.getString("Observaciones");
                
                model.addRow(registr);
            }
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public void Deleted_OT(String OT_Deleted) {
        sSql = "DELETE FROM otinformacion_prb WHERE idOrdenDeT ='"+OT_Deleted+"'";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sSql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletd");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
