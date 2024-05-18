package com.SpringGFG.demo.controller;

import com.SpringGFG.demo.service.GreetService;
import com.SpringGFG.demo.service.GreetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @Autowired
    GreetServiceImpl ourGreetService;

    public MyController(GreetServiceImpl greetService) {
        ourGreetService = greetService;
    }

    @GetMapping("/user")
    public String greetUser(@RequestParam String person){
        System.out.println("Coming here");
        return ourGreetService.greetUser(person);
    }

    @GetMapping("/user/{name}")
    public String greetUserViaPath(@PathVariable("name") String person){
        System.out.println("Coming here");
        return ourGreetService.greetUser(person);
    }

}
