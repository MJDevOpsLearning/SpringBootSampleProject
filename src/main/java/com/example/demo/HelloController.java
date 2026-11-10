package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Manoj Jaiswal - Spring Boot application running in Docker!";
    }
}
