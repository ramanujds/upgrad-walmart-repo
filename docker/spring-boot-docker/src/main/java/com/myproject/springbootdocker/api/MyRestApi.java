package com.myproject.springbootdocker.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestApi {

    @GetMapping
    public String sayHello() {
        return "Welcome to the world of Docker!";
    }
}
