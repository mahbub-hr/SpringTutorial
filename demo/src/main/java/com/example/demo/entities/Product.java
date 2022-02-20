package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {
@Id //Primary Key
@GeneratedValue(strategy = GenerationType.IDENTITY )  // Allow auto Identitiy
// Column Added
@Column(name = "ProductId") 
private int id;
@Column(name = "ProductName")
private String productName;
@Column (name = "ProductNumber")
private String productNumber;
@Column(name = "ProductCatagory")
private String productCatagory;

public  Product()
{
    //default constructor
}
//create parameterized constructor

// public Product(int id,String ProductName,String ProductNumber,String ProductCatagory)
// {
//     this.id=id;
//     this.productName=ProductName;
//     this.productNumber=ProductNumber;
//     this.productCatagory=ProductCatagory;
// }

public Product(String ProductName,String ProductNumber,String ProductCatagory)
{
 
    this.productName=ProductName;
    this.productNumber=ProductNumber;
    this.productCatagory=ProductCatagory;
}

// Getter Setter Method Add
public int getId()
{
return id;
}
public void setId(int id)
{
    this.id= id;
}
public String getProductName()
{
    return this.productName;
}
public void setProductName(String ProductName)
{
    this.productName=ProductName;
}

public String getProductNumber(){
    return this.productCatagory;
}
public void setProductNumber(String ProductNumber)
{
    this.productNumber=ProductNumber;
}

public String getProductCatagory()
{
return this.productCatagory;
}
public void setProductCatagory(String ProductCatagory)
{
    this.productCatagory= ProductCatagory;
}

}
