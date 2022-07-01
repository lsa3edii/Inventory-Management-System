package controller;

import javax.swing.JTable;
import model.*;

public interface Repo {
    
    Category category = new Category();
    Customer customer = new Customer();
    Product product = new Product();
     
    public void add();
    public void edit(JTable table);
    public void delete(JTable table);

}
