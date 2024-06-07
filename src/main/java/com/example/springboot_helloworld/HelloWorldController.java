package com.example.springboot_helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    @GetMapping("hello")
    public String hello(){
        System.out.println("Hello World from Michel Knight 0");
        return  "Hello World from Michel Knight";
    }
}
