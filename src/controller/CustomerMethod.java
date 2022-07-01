package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class CustomerMethod implements Repo {

    Connection connection = Database.connect();
    private String sql;
    
    public CustomerMethod() {
        //Database.connect();
    }

    public void add() {
        try {
            PreparedStatement add = connection.prepareStatement("insert into customer values(?,?,?)");

            add.setInt(1, Repo.customer.getID());
            add.setString(2, Repo.customer.getName());
            add.setString(3, Repo.customer.getPhone());
            add.executeUpdate();
            //connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void edit(JTable table) {
        sql = "Update customer set name = '" + Repo.customer.getName() + "' ,id = " + Repo.customer.getID() 
                + " ,phone = '" + Repo.customer.getPhone() + "' where id = " 
                + table.getValueAt(table.getSelectedRow(), 0);

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
        sql = "Delete from customer where id = " + table.getValueAt(table.getSelectedRow(), 0);
        
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            //connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        } 
    }

}
