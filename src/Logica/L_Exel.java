/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author Hans
 */
public class L_Exel {
    Workbook wb;
    
    public String Importar(File archivo, JTable tablaD){
        String respuesta = "Revisr";
        DefaultTableModel model = new DefaultTableModel();
        tablaD.setModel(model);
        try {
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet Hoja = wb.getSheetAt(0);
            Iterator filaIterator = Hoja.rowIterator();
            int indiceFila = -1;
            while (filaIterator.hasNext()){
                indiceFila++;
                Row fila = (Row) filaIterator.next();
                Iterator columnaIterator = fila.cellIterator();
                Object[] ListaColumna = new Object[7];
                int indicecolumna = -1;
                while(columnaIterator.hasNext()){
                    indicecolumna++;
                    Cell celda = (Cell) columnaIterator.next();
                    if(indiceFila==0){
                        model.addColumn(celda.getStringCellValue());
                    }
                    else{
                        if(celda!=null){
                            switch(celda.getCellType()){
                                case Cell.CELL_TYPE_NUMERIC:
                                    ListaColumna[indicecolumna]=(int)Math.round(celda.getNumericCellValue());
                                    break;
                                case Cell.CELL_TYPE_STRING:
                                    ListaColumna[indicecolumna]=celda.getStringCellValue();
                                    break;
                                case Cell.CELL_TYPE_BOOLEAN:
                                    ListaColumna[indicecolumna]=celda.getBooleanCellValue();
                                    break;
                                default:
                                    ListaColumna[indicecolumna]=celda.getDateCellValue();
                                    break;
                            }
                        }
                    }
                }
                if(indiceFila!=0)model.addRow(ListaColumna);
            }
            respuesta="Funciona";
        } catch (Exception e) {
        }
        return respuesta;
    }
    
    
    public String Exportar(File archivo, JTable tablaD){
        String respuesta="Revisr";
        int numfila = tablaD.getRowCount();
        int numcolumn = tablaD.getColumnCount();
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();
        }
        else{
            wb = new XSSFWorkbook();
        }
        Sheet hoja1 = wb.createSheet("PrimeraHoja");
        try {
            for(int i = -1; i< numfila; i++){
                Row fila = hoja1.createRow(i+1);
                for (int j = 0; j <numcolumn; j++){
                    Cell celda = fila.createCell(j);
                    if(i == -1){
                        celda.setCellValue(String.valueOf(tablaD.getColumnName(j)));
                    }
                    else{
                        celda.setCellValue(String.valueOf(tablaD.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="Funciona";
        } catch (Exception e) {
        }
        return respuesta;
    }

    public String SobreExportar(File archivo, JTable jTable1, String drct) {
        String a = "revisr";
        try {
            FileInputStream entrada = new FileInputStream(new File(drct));
            XSSFWorkbook xlsx = new XSSFWorkbook(entrada);
            XSSFSheet hoja = xlsx.getSheetAt(0);
            Row fila = null;
            Cell celda = null;
            try {
                fila =hoja.getRow(4);
                celda = fila.createCell(3);
                celda.setCellValue(1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            XSSFFormulaEvaluator.evaluateAllFormulaCells(xlsx);
            entrada.close();
            
            FileOutputStream sld = new FileOutputStream(new File(drct));
            xlsx.write(sld);
            sld.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return a;
    }
}
