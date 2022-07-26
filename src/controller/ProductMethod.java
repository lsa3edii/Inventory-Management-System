package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ProductMethod implements Repo{

    Connection connection = Database.connect();
    ResultSet result = null;
    private String sql;

    public ProductMethod() {

    }

    @Override
    public void add() {
        try {
            PreparedStatement add = connection.prepareStatement("insert into product values(?,?,?,?,?,?)");

            add.setInt(1, product.getID());
            add.setString(2, product.getName());
            add.setInt(3, product.getPrice());
            add.setInt(4, product.getQuantity());
            add.setString(5, product.getDescription());
            add.setString(6, product.getCategory().getSelectedItem().toString());
            add.executeUpdate();
            //connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void edit(JTable table) {
        sql = "Update product set name = '" + product.getName() + "' ,id = " + product.getID() + " ,price = "
                + product.getPrice() + " ,quantity = " + product.getQuantity() + " ,description = '"
                + product.getDescription() + "' ,category = '" + product.getCategory().getSelectedItem()
                + "' where id = " + table.getValueAt(table.getSelectedRow(), 0);
        
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
        sql = "Delete from Product where id = " + table.getValueAt(table.getSelectedRow(), 0);
        
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            //connection.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
//    public boolean search() {
//        sql = "select * from Product";
//
//        try {
//            PreparedStatement search = connection.prepareStatement(sql);
//            result = search.executeQuery();
//            
//            while(result.next())
//                if(result.getString("name").contains(product.getSearch()))
//                    return true;
//                
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
//        }
//        return false;
//    }
    
}
