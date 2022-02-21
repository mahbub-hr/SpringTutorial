package com.example.demo.service;
import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired ProductRepository productRepository;
  
        // Save Single Product
    public void saveSingleProduct (String ProductName,String ProductNumber,String ProductCatagory){
        Product  product = new Product();
        product.setProductName(ProductName);
        product.setProductNumber(ProductNumber);
        product.setProductCatagory(ProductCatagory);
        productRepository.save(product);    
    }

          // Save Multiple Products
          public void saveMultipleProducts (String ProductName,String ProductNumber,String ProductCatagory){
            Product  product = new Product(ProductName, ProductNumber, ProductCatagory);           
            productRepository.save(product);    
        }
    
}
