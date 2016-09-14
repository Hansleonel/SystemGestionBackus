package Logica;

import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; //New imports to read XLSX format
import org.apache.poi.xssf.usermodel.XSSFSheet; //New imports to read XLSX format
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator; //New imports to formula evaluator in XLSX
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Excelpoi {  
    public static void aa(String[] args) throws Exception{
        JFileChooser selector = new JFileChooser();
        String directorio = "";
        String extension = "";
        boolean seleccion = false;

        int resultado = selector.showOpenDialog(null);

        switch (resultado) {
            case JFileChooser.APPROVE_OPTION:
                directorio = selector.getSelectedFile().getPath();
                
                int i = directorio.lastIndexOf('.');
                if (i >= 0) {
                    extension = directorio.substring(i+1);
                }
                
                seleccion = true;
                
                JOptionPane.showMessageDialog(null, "Seleccionaste " + directorio);
                break;
            case JFileChooser.CANCEL_OPTION:
                seleccion = false;
                JOptionPane.showMessageDialog(null, "No seleccionaste nada.");
                break;
            case JFileChooser.ERROR_OPTION:
                seleccion = false;
                JOptionPane.showMessageDialog(null, "Ocurrio un Error.");
                break;
            default:
                break;  
        }
        
        if(seleccion)
        {
            Double valor1 = -1.0;
            Double valor2 = -1.0;
            Double valor3 = -1.0;
            Double valor4 = -1.0;

            do
            {
                try {
                    valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1 para Suma: "));
                }catch (NumberFormatException e) {
                    valor1 = -1.0;
                    JOptionPane.showMessageDialog(null,"Solo numeros");
                }
            }
            while(valor1 < 0);

            do
            {
                try {
                    valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2 para Suma: "));
                }catch (NumberFormatException e) {
                    valor2 = -1.0;
                    JOptionPane.showMessageDialog(null,"Solo numeros");
                }
            }
            while(valor2 < 0);

            do
            {
                try {
                    valor3 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1 para Resta: "));
                }catch (NumberFormatException e) {
                    valor3 = -1.0;
                    JOptionPane.showMessageDialog(null,"Solo numeros");
                }
            }
            while(valor3 < 0);

            do
            {
                try {
                    valor4 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2 para Resta: "));
                }catch (NumberFormatException e) {
                    valor4 = -1.0;
                    JOptionPane.showMessageDialog(null,"Solo numeros");
                }
            }
            while(valor4 < 0);

            if (extension.equals("xls"))
            {
                //Leer el archivo de Excel XLS
                FileInputStream entrada = new FileInputStream(new File(directorio));
                //Acceso al libro de trabajo
                HSSFWorkbook xls = new HSSFWorkbook(entrada); 
                //Acceso a la hoja de trabajo
                HSSFSheet hoja = xls.getSheetAt(0);
                //Declaracion de fila y celda
                Row fila = null;
                Cell celda = null;

                try
                {
                    //Asignando a valores a celdas con valores
                    fila = hoja.getRow(0);
                    
                    celda = fila.getCell(0);
                    celda.setCellValue(valor1);
                    celda = fila.getCell(1);
                    celda.setCellValue(valor3);
                    
                    fila = hoja.getRow(1);
                    
                    celda = fila.getCell(0);
                    celda.setCellValue(valor2);
                    celda = fila.getCell(1);
                    celda.setCellValue(valor4);
                }
                catch(NullPointerException NPE)
                {
                    //En caso de que las celdas esten vacias hay que crearlas
                    fila = hoja.createRow(0);
                    
                    celda = fila.createCell(0);
                    celda.setCellValue(valor1);
                    celda = fila.createCell(1);
                    celda.setCellValue(valor3);
                    
                    fila = hoja.createRow(1);
                    
                    celda = fila.createCell(0);
                    celda.setCellValue(valor2);
                    celda = fila.createCell(1);
                    celda.setCellValue(valor4);
                }

                //Evaluando formulas de todo el libro de excel
                HSSFFormulaEvaluator.evaluateAllFormulaCells(xls);

                //Cerrando archivo
                entrada.close();

                //Abriendo archivo para escritura
                FileOutputStream salida = new FileOutputStream(new File(directorio));
                //write changes
                xls.write(salida);
                //close the stream
                salida.close();
            }
            else if (extension.equals("xlsx"))
            {
                //Leer el archivo de Excel XLSX
                FileInputStream entrada = new FileInputStream(new File(directorio));
                //Acceso al libro de trabajo
                XSSFWorkbook xlsx = new XSSFWorkbook(entrada); 
                //Acceso a la hoja de trabajo
                XSSFSheet hoja = xlsx.getSheetAt(0);
                //Declaracion de fila y celda
                Row fila = null;
                Cell celda = null;

                try
                {
                    //Asignando a valores a celdas con valores
                    fila = hoja.getRow(0);
                    
                    celda = fila.getCell(0);
                    celda.setCellValue(valor1);
                    celda = fila.getCell(1);
                    celda.setCellValue(valor3);
                    
                    fila = hoja.getRow(1);
                    
                    celda = fila.getCell(0);
                    celda.setCellValue(valor2);
                    celda = fila.getCell(1);
                    celda.setCellValue(valor4);
                }
                catch(NullPointerException NPE)
                {
                    //En caso de que las celdas esten vacias hay que crearlas
                    fila = hoja.createRow(0);
                    
                    celda = fila.createCell(0);
                    celda.setCellValue(valor1);
                    celda = fila.createCell(1);
                    celda.setCellValue(valor3);
                    
                    fila = hoja.createRow(1);
                    
                    celda = fila.createCell(0);
                    celda.setCellValue(valor2);
                    celda = fila.createCell(1);
                    celda.setCellValue(valor4);
                }

                //Evaluando formulas de todo el libro de excel
                XSSFFormulaEvaluator.evaluateAllFormulaCells(xlsx);

                //Cerrando la entrada archivo
                entrada.close();

                //Abriendo archivo para escritura
                FileOutputStream salida = new FileOutputStream(new File(directorio));
                //write changes
                xlsx.write(salida);
                //close the stream
                salida.close(); 
            }
        }
    }

    public void princp() throws Exception{
        JFileChooser selector = new JFileChooser();
        String directorio = "";
        String extension = "";
        boolean seleccion = false;

        int resultado = selector.showOpenDialog(null);

        switch (resultado) {
            case JFileChooser.APPROVE_OPTION:
                directorio = selector.getSelectedFile().getPath();
                
                int i = directorio.lastIndexOf('.');
                if (i >= 0) {
                    extension = directorio.substring(i+1);
                }
                
                seleccion = true;
                
                JOptionPane.showMessageDialog(null, "Seleccionaste " + directorio);
                break;
            case JFileChooser.CANCEL_OPTION:
                seleccion = false;
                JOptionPane.showMessageDialog(null, "No seleccionaste nada.");
                break;
            case JFileChooser.ERROR_OPTION:
                seleccion = false;
                JOptionPane.showMessageDialog(null, "Ocurrio un Error.");
                break;
            default:
                break;  
        }
        
                   
            if (extension.equals("xlsx"))
            {
                //Leer el archivo de Excel XLSX
                FileInputStream entrada = new FileInputStream(new File(directorio));
                //Acceso al libro de trabajo
                XSSFWorkbook xlsx = new XSSFWorkbook(entrada); 
                //Acceso a la hoja de trabajo
                XSSFSheet hoja = xlsx.getSheetAt(0);
                //Declaracion de fila y celda
                Row fila;
                Cell celda;

                
                try
                {
                    //Asignando a valores a celdas con valores
                    fila = hoja.getRow(2);
                    
                    celda = fila.getCell(9);
                    celda.setCellValue(801);
                    
                    
                    fila = hoja.getRow(7);
                    
                    celda = fila.getCell(6);
                    celda.setCellValue(2);
                    
                }
                catch(NullPointerException NPE)
                {
                    //En caso de que las celdas esten vacias hay que crearlas
                    fila = hoja.createRow(2);
                    
                    celda = fila.createCell(9);
                    celda.setCellValue(903);
                    
                    fila = hoja.createRow(2);
                    
                    celda = fila.createCell(10);
                    celda.setCellValue(9999999);
                    
                }

                //Evaluando formulas de todo el libro de excel
                XSSFFormulaEvaluator.evaluateAllFormulaCells(xlsx);

                //Cerrando la entrada archivo
                entrada.close();

                //Abriendo archivo para escritura
                FileOutputStream salida = new FileOutputStream(new File(directorio));
                //write changes
                xlsx.write(salida);
                //close the stream
                salida.close(); 
            }      
    }

    public void segnd(JTable jTable1) throws Exception{
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(new FileNameExtensionFilter("Archivo Excel 2010 o Mayor", "xlsm"));
        int numfila = jTable1.getRowCount();
        int numcolumn = jTable1.getColumnCount();
        String directorio = "";
        String extension = "";
        boolean seleccion = false;

        int resultado = selector.showOpenDialog(null);

        switch (resultado) {
            case JFileChooser.APPROVE_OPTION:
                directorio = selector.getSelectedFile().getPath();
                
                int i = directorio.lastIndexOf('.');
                if (i >= 0) {
                    extension = directorio.substring(i+1);
                }
                
                seleccion = true;
                
                JOptionPane.showMessageDialog(null, "Seleccionaste " + directorio);
                break;
            case JFileChooser.CANCEL_OPTION:
                seleccion = false;
                JOptionPane.showMessageDialog(null, "No seleccionaste nada.");
                break;
            case JFileChooser.ERROR_OPTION:
                seleccion = false;
                JOptionPane.showMessageDialog(null, "Ocurrio un Error.");
                break;
            default:
                break;  
        }
        
                   
            if (extension.equals("xlsm"))
            {
                FileInputStream entrada = new FileInputStream(new File(directorio));
                //Acceso al libro de trabajo
                XSSFWorkbook xlsm = new XSSFWorkbook(entrada); 
                //Acceso a la hoja de trabajo
                XSSFSheet hoja = xlsm.getSheetAt(0);
                //Declaracion de fila y celda
                Row fila = null;
                Cell celda = null;
                
                try
                {
                    //Asignando a valores a celdas con valores
                    fila = hoja.getRow(4);
                    
                    celda = fila.getCell(2);
                    celda.setCellValue(999);
                    
                    fila = hoja.getRow(5);
                    
                    celda = fila.getCell(2);
                    celda.setCellValue(99999);
                }
                catch(NullPointerException NPE)
                {
                    //En caso de que las celdas esten vacias hay que crearlas
                    fila = hoja.getRow(4);
					
                    celda = fila.createCell(2);
                    celda.setCellValue(7777);
                    
                    fila = hoja.getRow(5);
                    
                    celda = fila.createCell(2);
                    celda.setCellValue(77777);
                }
                
                //Evaluando formulas de todo el libro de excel
                XSSFFormulaEvaluator.evaluateAllFormulaCells(xlsm);
                
                //Cerrando la entrada archivo
                entrada.close();

                //Abriendo archivo para escritura
                FileOutputStream salida = new FileOutputStream(new File(directorio));
                //write changes
                xlsm.write(salida);
                //close the stream
                salida.close();
            }
    }
}
