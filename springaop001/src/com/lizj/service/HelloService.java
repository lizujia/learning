package com.lizj.service;

import org.springframework.stereotype.Service;

import com.lizj.annotation.Logger;

@Service
public class HelloService {

    @Logger
    public void hello() {
        System.out.println("hello");
    }
    
    @Logger
    public void hello2(String name, String age) {
        System.out.println("hello, " + name);
    }
    
}
