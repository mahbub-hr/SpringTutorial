package com.example.demo.service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired ProductRepository productRepository;
  
    //     // Save Product
    // public void saveProduct (String ProductName,String ProductNumber,String ProductCatagory){
    //     Product  product = new Product(ProductName, ProductNumber, ProductCatagory);
    //     // product.setProductName(ProductName);
    //     // product.setProductNumber(ProductNumber);
    //     // product.setProductCatagory(ProductCatagory);
    //     productRepository.save(product);    
    // }

          // Save Products
          public void saveProduct (String ProductName,String ProductNumber,String ProductCatagory){
            Product  product = new Product(ProductName, ProductNumber, ProductCatagory);
            productRepository.save(product);    
        }
    
}
