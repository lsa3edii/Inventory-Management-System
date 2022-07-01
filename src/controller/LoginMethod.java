package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import model.*;

public class LoginMethod {

    ResultSet result = null;
    Connection connection = Database.connect();
    private String sql;
    
    public LoginMethod() {
        //
    }

    public boolean check(Login login) {
        try {
            sql = "select * from Admin where id = ? and password = ?";
            
            PreparedStatement check = connection.prepareStatement(sql);
            check.setInt(1,Repository.login.getID());
            check.setString(2, Repository.login.getPassword());
            result = check.executeQuery();
                    
            if (result.next()) 
                return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
    
        } // finally {
//            try {
//                connection.close();
//                
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
//            }
//        }
        return false;
    }
    
}
