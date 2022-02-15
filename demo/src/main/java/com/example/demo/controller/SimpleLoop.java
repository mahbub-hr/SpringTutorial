package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

public class SimpleLoop {
    
    public void main(String []args){
        List<Integer> intergerList= new ArrayList<>();

        // 1
        for (int i = 0; i < intergerList.size(); i++) {
            intergerList.add(i);
            // processing
            System.out.println("Value : " + intergerList.get(i));
        }

        // 2

        for (Integer integer : intergerList) {
            
        }
    }
}
