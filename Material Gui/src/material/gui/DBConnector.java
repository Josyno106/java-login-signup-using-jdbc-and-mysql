/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package material.gui;

import java.sql.*;  

/**
 *
 * @author tapam
 */
public class DBConnector {
    
  public static Connection con;
    
  public static Connection makeConnection() throws ClassNotFoundException{
      try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection(  
            "jdbc:mysql://127.0.0.1/javaloginregister?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root",""); 
            
              System.out.println("connected successfully");
              return con;
      }catch(SQLException e){
            System.out.println(e.getMessage()); 
            return null;
      }
  } 
}
