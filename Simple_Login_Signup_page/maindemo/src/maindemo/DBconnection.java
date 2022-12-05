/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maindemo;
import java.sql.*;
/**
 *
 * @author priya
 */
public class DBconnection {
    static final String DB_URL ="jdbc:mysql://localhost:3306/mainconnect";
    static final String USER ="root";
    static final String PASS ="";
    public static Connection connectDB()
    {
        Connection conn = null;
        try {
            
                //Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                return conn;
            }
        catch(SQLException ex)
            {
                 System.out.println("There were error while connecting to DB.");
                 return null;
            }
   }
}
