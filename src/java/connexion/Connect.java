/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ITU
 */
public class Connect {
    public Connection getConnectionPostGresql()throws Exception, ClassNotFoundException
    {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tapakajiro","postgres","0000");
        return con;
    }
    public static void main(String[] args){
        try {
            System.out.println("->>>>"+new Connect().getConnectionPostGresql());
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
