package model;

import controller.*;

public class Customer {
    
    private int id;
    private String name;
    private String phone;
    
    public Customer() {
        //
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }
    
}