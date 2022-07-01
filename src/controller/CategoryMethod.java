package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class CategoryMethod implements Repo {

    Connection connection = Database.connect();
    private String sql;

    public CategoryMethod() {
        //Database.connect();
    }
    
    @Override
    public void add() {
        try {
            PreparedStatement add = connection.prepareStatement("insert into category values(?,?)");
            
            add.setInt(1, category.getID());
            add.setString(2, category.getName());
            add.executeUpdate();
            //connection.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void edit(JTable table) {
        sql = "Update category set name = '" + category.getName() + "' ,id = " + category.getID()
                + " where id = " + table.getValueAt(table.getSelectedRow(), 0);
        
        try {
            PreparedStatement edit = connection.prepareStatement(sql);
            edit.executeUpdate();
            //connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    @Override
    public void delete(JTable table) {
        sql = "Delete from category where id = " + table.getValueAt(table.getSelectedRow(), 0);
       
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            //connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
}
