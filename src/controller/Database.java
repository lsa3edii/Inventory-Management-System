package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class Database {
        
    private static Connection connection = null;
        
    private Database() {
        //
    }
    
    public static Connection connect() {
        String url = "jdbc:sqlserver://DESKTOP-L1JM9QG\\SQLEXPRESS;databaseName=InvSystem;"
                + "integratedSecurity=true;encrypt=false";
    
        try {
            //connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            connection = DriverManager.getConnection(url);
            return connection;
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
}
