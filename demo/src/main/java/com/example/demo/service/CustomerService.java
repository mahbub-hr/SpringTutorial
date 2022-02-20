package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Customer;
import com.example.demo.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired CustomerRepository customerRepository;

    // Save Student
    public void saveStudent(String studentName){
        Customer customer = new Customer(studentName);
        customerRepository.save(customer);
    }
    public List<Customer> getAllCustomer(){
        List<Customer> customerList = customerRepository.findAll();
        // for(Customer customer: customerList){
        //     System.out.println(customer.getStudentName());
        // }
        return customerList;
    }

    // public Optional<Customer> getCustomerById(int id){
        public Customer findById(int id)
        {        // Customer customer = new Customer(id);
        Customer c = customerRepository.findById(id).orElse(null);

        // customerRepository.findById(integer customer);
        
        // Optional<Customer> customerList = customerRepository.findById(1);

        return c;
    }

}
