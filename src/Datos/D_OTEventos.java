/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author kandskat
 */
public class D_OTEventos {
    
    int idOrdendeT;
    int idItem;
    String FechaReporte;
    String HoraReporte;
    String C_Costo_Nro_ATM;
    String TipoLocal;
    String NomLocal;
    String ZonaLocal;
    String TipoSolicitud;
    String DetalleSolicitud;
    int Nro_OT;
    String lvl_servic;
    String Estado_servic;
    String Proveedor_Item;
    String Reprog_Servic;
    String Tecnic;
    String Fecha_Programada;
    String Hora_Programada;
    String Observaciones;

    public D_OTEventos() {
    }

    public D_OTEventos(int idOrdendeT, int idItem, String FechaReporte, String HoraReporte, String C_Costo_Nro_ATM, String TipoLocal, String NomLocal, String ZonaLocal, String TipoSolicitud, String DetalleSolicitud, int Nro_OT, String lvl_servic, String Estado_servic, String Proveedor_Item, String Reprog_Servic, String Tecnic, String Fecha_Programada, String Hora_Programada, String Observaciones) {
        this.idOrdendeT = idOrdendeT;
        this.idItem = idItem;
        this.FechaReporte = FechaReporte;
        this.HoraReporte = HoraReporte;
        this.C_Costo_Nro_ATM = C_Costo_Nro_ATM;
        this.TipoLocal = TipoLocal;
        this.NomLocal = NomLocal;
        this.ZonaLocal = ZonaLocal;
        this.TipoSolicitud = TipoSolicitud;
        this.DetalleSolicitud = DetalleSolicitud;
        this.Nro_OT = Nro_OT;
        this.lvl_servic = lvl_servic;
        this.Estado_servic = Estado_servic;
        this.Proveedor_Item = Proveedor_Item;
        this.Reprog_Servic = Reprog_Servic;
        this.Tecnic = Tecnic;
        this.Fecha_Programada = Fecha_Programada;
        this.Hora_Programada = Hora_Programada;
        this.Observaciones = Observaciones;
    }

    public int getIdOrdendeT() {
        return idOrdendeT;
    }

    public void setIdOrdendeT(int idOrdendeT) {
        this.idOrdendeT = idOrdendeT;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getFechaReporte() {
        return FechaReporte;
    }

    public void setFechaReporte(String FechaReporte) {
        this.FechaReporte = FechaReporte;
    }

    public String getHoraReporte() {
        return HoraReporte;
    }

    public void setHoraReporte(String HoraReporte) {
        this.HoraReporte = HoraReporte;
    }

    public String getC_Costo_Nro_ATM() {
        return C_Costo_Nro_ATM;
    }

    public void setC_Costo_Nro_ATM(String C_Costo_Nro_ATM) {
        this.C_Costo_Nro_ATM = C_Costo_Nro_ATM;
    }

    public String getTipoLocal() {
        return TipoLocal;
    }

    public void setTipoLocal(String TipoLocal) {
        this.TipoLocal = TipoLocal;
    }

    public String getNomLocal() {
        return NomLocal;
    }

    public void setNomLocal(String NomLocal) {
        this.NomLocal = NomLocal;
    }

    public String getZonaLocal() {
        return ZonaLocal;
    }

    public void setZonaLocal(String ZonaLocal) {
        this.ZonaLocal = ZonaLocal;
    }

    public String getTipoSolicitud() {
        return TipoSolicitud;
    }

    public void setTipoSolicitud(String TipoSolicitud) {
        this.TipoSolicitud = TipoSolicitud;
    }

    public String getDetalleSolicitud() {
        return DetalleSolicitud;
    }

    public void setDetalleSolicitud(String DetalleSolicitud) {
        this.DetalleSolicitud = DetalleSolicitud;
    }

    public int getNro_OT() {
        return Nro_OT;
    }

    public void setNro_OT(int Nro_OT) {
        this.Nro_OT = Nro_OT;
    }

    public String getLvl_servic() {
        return lvl_servic;
    }

    public void setLvl_servic(String lvl_servic) {
        this.lvl_servic = lvl_servic;
    }

    public String getEstado_servic() {
        return Estado_servic;
    }

    public void setEstado_servic(String Estado_servic) {
        this.Estado_servic = Estado_servic;
    }

    public String getProveedor_Item() {
        return Proveedor_Item;
    }

    public void setProveedor_Item(String Proveedor_Item) {
        this.Proveedor_Item = Proveedor_Item;
    }

    public String getReprog_Servic() {
        return Reprog_Servic;
    }

    public void setReprog_Servic(String Reprog_Servic) {
        this.Reprog_Servic = Reprog_Servic;
    }

    public String getTecnic() {
        return Tecnic;
    }

    public void setTecnic(String Tecnic) {
        this.Tecnic = Tecnic;
    }

    public String getFecha_Programada() {
        return Fecha_Programada;
    }

    public void setFecha_Programada(String Fecha_Programada) {
        this.Fecha_Programada = Fecha_Programada;
    }

    public String getHora_Programada() {
        return Hora_Programada;
    }

    public void setHora_Programada(String Hora_Programada) {
        this.Hora_Programada = Hora_Programada;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
    
        
}
