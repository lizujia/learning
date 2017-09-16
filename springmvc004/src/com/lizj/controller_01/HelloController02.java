package com.lizj.controller_01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 基于注解的控制器
 */
@Controller
@RequestMapping("/hello")
public class HelloController02 {

    @RequestMapping("/hello")
    public String sayHello(HttpServletRequest request) {
        System.out.println("I am HelloController02");
        request.setAttribute("message", "Hello World 02");
        return "helloworld";
    }
    
    @RequestMapping(value="/alert", method=RequestMethod.POST)
    public String alert(HttpServletRequest request) {
        System.out.println("I am alert");
        request.setAttribute("message", "alert");
        return "helloworld";
    }

}