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
    @Column(name = "StudentId")
    private int id;

    @Column(name = "StudentName")
    private String studentName;

    public Customer(){

    }
    
    public Customer(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public Customer(String studentName){
        this.studentName = studentName;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id= id;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
}
