package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello() {
        return "hello";
    }
    
    public String hi() {
        return "hi";
    }
}
