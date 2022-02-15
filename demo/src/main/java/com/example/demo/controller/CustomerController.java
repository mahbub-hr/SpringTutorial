package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;

import com.example.demo.entities.Customer;
import com.example.demo.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired CustomerService customerService;

    @GetMapping("/test")
    String testFuntion(){
        return "Hello world";
    }

    /**
     *  {
            "studentName": "Mahmud Hasan"
        }
     * @param payload
     * @return
     */
    @PostMapping(value = "/saveCustomer")
    String saveCustomer(@RequestBody List<HashMap<String, Object>> payload){
        // loop here
        for () {
            
        }
        String studentName = (String) payload.get("studentName");
        customerService.saveStudent(studentName);
        return "Success";
    }

    @GetMapping("getAllCustomer")
    List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
}
