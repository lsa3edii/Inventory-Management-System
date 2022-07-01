package controller;

import model.*;

public interface Repository {
    
    Login login = new Login();
    Admin admin = new Admin();
    
    public boolean add();
    public void edit();
    public void delete();
    public boolean checkPassword(String password);
    public String selectName();
}
