package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private int id;

    @Column(name = "customerName")
    private String customerName;

    public Customer(){

    }
    
    public Customer(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public Customer(String customerName){
        this.customerName = customerName;
    }
    
    public Customer(int id) {
        this.id = id;
       
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id= id;
    }

    public String getcustomerName(){
        return this.customerName;
    }
    public void setcustomerName(String customerName){
        this.customerName = customerName;
    }
}
