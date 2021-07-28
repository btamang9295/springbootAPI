package com.example.api.demoapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/testAPI")
    public String testApi (){
        return "Hello, API is initiated at localhost port:8080";
    }
}
