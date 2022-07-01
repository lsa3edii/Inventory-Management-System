package controller;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ShowData {
    
    private String sql;
    Connection Connection = Database.connect();
    Statement statement = null;
    ResultSet result = null;
    
    public ShowData() {
        //Database.connect();
    }

    public void DataInTable(javax.swing.JTable table, String tableName) {
        sql = "select * from " + tableName;
        
        try {
            statement = Connection.createStatement();
            result = statement.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(result));
            //Connection.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void DataInComboBox(javax.swing.JComboBox<String> category) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        try {
            statement = Database.connect().createStatement();
            result = statement.executeQuery("select * from category");
            
            while(result.next())
                category.addItem(result.getString("name"));
            //Connection.close();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
