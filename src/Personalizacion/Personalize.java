/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personalizacion;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;



/**
 *
 * @author kandskat
 */
public class Personalize extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col){
        
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        
        //color verde
        if(table.getValueAt(row, 12).equals("CS") || table.getValueAt(row, 12).equals("CC"))
        {
            //Color verd = new Color(0,153,102);
            Color verd = new Color(68,182,73);
            
            setBackground(verd);
        }        
        //color rojo
        else if(table.getValueAt(row, 12).equals("AS") || table.getValueAt(row, 12).equals("PS")||table.getValueAt(row, 12).equals("PC")||table.getValueAt(row, 12).equals("AR"))
        {
            //Color ro = new Color(228,51,51);
            Color ro = new Color(233,94,106);
            setBackground(ro);
        }
        //en proceso amarillo
        else if(table.getValueAt(row, 12).equals("EP"))
        {
            //Color ye = new Color(255,204,102);
            Color ye = new Color(236,183,45);
            setBackground(ye);
        }
        
        
        return this;
    }
    
    
}
