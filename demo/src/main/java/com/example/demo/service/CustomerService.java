package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Customer;
import com.example.demo.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired CustomerRepository customerRepository;

    public void saveStudent(String studentName){
        Customer customer = new Customer(studentName);
        customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer(){
        List<Customer> customerList = customerRepository.findAll();

        for(Customer customer: customerList){
            System.out.println(customer.getStudentName());
        }
        return customerList;
    }
}
