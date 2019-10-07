/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcaadi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author César
 */
public class DBClass {
    static private Connection connection;
        public static Connection getConnection() throws Exception{
            if(connection == null){
                Class.forName("com.mysql.jdbc.Driver");
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/caadi", "root", "1123581321");
            }
            return connection;
        }
}
