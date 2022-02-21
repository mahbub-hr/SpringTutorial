package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;

import com.example.demo.entities.Customer;
import com.example.demo.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @PostMapping(value = "/saveSingleCustomer")
    String saveSingleCustomer (@RequestBody HashMap<String, Object>payload)
    {   String customerName =(String) payload.get("customerName");
        customerService.saveCustomer(customerName);
        return "Success";
    }

    @PostMapping(value = "/saveMultipleCustomer")
    String saveMultipleCustomer(@RequestBody List<HashMap<String, Object>> payload){
        // loop here
        for (HashMap<String, Object> hasMapObj : payload) {
           String name = (String) hasMapObj.get("customerName");
            customerService.saveCustomer(name);
        }
        return "Success";
    }

    @GetMapping("getAllCustomer")

    List<Customer> getAllCustomer()
    {
        return customerService.getAllCustomer();
    }

    // @GetMapping ("getCustomerById/{id}")
    // List<Customer> getCustomerById()
    // {
    //     return customerService.findById(1);
    // }

    @GetMapping ("getCustomerById/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable int id) {
		Customer customer = customerService.findById(id);
		if (customer != null) {
			return ResponseEntity.ok(customer); // return 200, with json body
		} else {
			return ResponseEntity.notFound().build();
		}

	}

        
    }

