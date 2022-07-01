package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class AdminMethod implements Repository{

    Connection connection = Database.connect();
    ResultSet result = null;
    private String sql;

    public AdminMethod() {
        //Database.connect();
    }

    @Override
    public boolean add() {
        try {
            PreparedStatement add = connection.prepareStatement("insert into Admin values(?,?,?)");

            add.setInt(1, admin.getID());
            add.setString(2, admin.getName());
            add.setString(3, admin.getPassword());
            add.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    @Override
    public void edit() {
        sql = "Update Admin set name = '" + admin.getName() +  "' ,password = '"
                + admin.getPassword() + "' where id = " + Repository.login.getID();
        
        try {
            PreparedStatement edit = connection.prepareStatement(sql);
            edit.executeUpdate();
            //connection.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        } 
    }

    @Override
    public void delete() {
        sql = "Delete from Admin where id = " + Repository.login.getID();
        
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            //connection.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public boolean checkPassword(String password) {
        sql = "select password from Admin where id = " + Repository.login.getID();

        try {
            PreparedStatement select = connection.prepareStatement(sql);
            result = select.executeQuery();
            
            if(result.next() && result.getString("password").equals(password)) 
                return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    @Override
    public String selectName() {
        sql = "select name from Admin where id = " + Repository.login.getID();

        try {
            PreparedStatement select = connection.prepareStatement(sql);
            result = select.executeQuery();
            
            if(result.next())
                return result.getString("name");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);//        
        }
        return null;
    }
    
}
