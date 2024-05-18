package com.SpringGFG.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements GreetService {

    public String greetUser(String name){
        return "this is user " + name;
    }

}
