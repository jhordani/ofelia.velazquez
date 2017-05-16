/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jhordani
 */
public class conexion {
    
    private static Connection cn;

    public conexion() {
    }
    
    public static Connection conectar(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/OfeliaVelasquez", "root", "admin");
        } catch (Exception e) {
            System.out.println(e);
        }
    return cn;
    
}
}
