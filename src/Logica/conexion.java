/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
/**
 *
 * @author kandskat
 */
public class conexion {
    
    public Connection con;
    public Statement ins;

    
    
    
    public Connection conectar(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprueba01?zeroDateTimeBehavior=convertToNull", "root", "iniciar");
            //con=DriverManager.getConnection("jdbc:mysql://192.168.1.100:3306/dbprueba01?zeroDateTimeBehavior=convertToNull", "root","iniciar");
            //con=DriverManager.getConnection("jdbc:mysql://192.168.1.5:3306/db_clientes_othrs?zeroDateTimeBehavior=convertToNull", "root","iniciar");
            //con=DriverManager.getConnection("jdbc:mysql://sql3.freesqldatabase.com:3306/sql3132736?zeroDateTimeBehavior=convertToNull","sql3132736","tmLaQADgLQ");
            con=DriverManager.getConnection("jdbc:mysql://sql9.freesqldatabase.com:3306/sql9135087?zeroDateTimeBehavior=convertToNull","sql9135087","rnRLxXyrhG");
            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data01?zeroDateTimeBehavior=convertToNull","root","iniciar");
            System.out.println("se realizo la conexion");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
        
    }
        
    Statement creStatement(){
        
        
        throw new UnsupportedOperationException("no soprtd");
    }
    
    
}

