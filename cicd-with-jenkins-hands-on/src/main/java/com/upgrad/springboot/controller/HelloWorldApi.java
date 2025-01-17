package com.upgrad.springboot.controller;


import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class HelloWorldApi {

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }


}
