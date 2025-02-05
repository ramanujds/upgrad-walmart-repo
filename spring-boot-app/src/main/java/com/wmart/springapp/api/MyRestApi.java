package com.wmart.springapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestApi {

    @GetMapping
    public String sayHello(){
        return "My Frirst Spring Boot";
    }

}
