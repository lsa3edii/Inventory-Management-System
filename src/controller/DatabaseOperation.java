package controller;

import javax.swing.JTable;

public class DatabaseOperation {
    
    Repo type;
    
    public DatabaseOperation() {
     //   
    }
    
    public DatabaseOperation(Repo type) {
        this.type = type;
    }
    
    public void setType(Repo type) {
        this.type = type;
    }
    
    public void add() {
        type.add();
    }
    
    public void edit(JTable table) {
        type.edit(table);
    }
    
    public void delete(JTable table) {
        type.delete(table);
    }
    
//    public boolean search() {
//        if(new ProductMethod().search())
//            return true;
//        return false;
//    }
    
}
