package com.foodbear.foodbear.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Testing {

    @GetMapping
    public String sayHello(){
        return "Hello from food-bear service";
    }
}
