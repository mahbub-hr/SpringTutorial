package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired ProductService productService;
    @PostMapping (value = "/saveSingleProduct")
    
    // Single Product data Save 
    String saveSingleProduct(@RequestBody HashMap<String, Object>payload)
    {
        String ProductName = (String) payload.get("ProductName");
        String ProductNumber=(String) payload.get("ProductNumber");
        String ProductCatagory=(String) payload.get("ProductCatagory");
        productService.saveSingleProduct(ProductName, ProductNumber, ProductCatagory);
        return "Sucess";
    }

    @PostMapping (value = "/saveMultipleProducts")
    //Multiple Product data save using array list
    
    String saveMultipleProducts(@RequestBody List <HashMap<String, Object>>payload) {
         //loop here
        for (HashMap<String,Object> hasMapObj : payload){
            String ProductName = (String) hasMapObj.get("ProductName");
            String ProductNumber = (String) hasMapObj.get("ProductNumber");
            String ProductCatagory = (String) hasMapObj.get("ProductCatagory");
            productService.saveMultipleProducts(ProductName,ProductNumber,ProductCatagory);            
        }
        return "Sucess";
    }

}
