package com.lizj.controller_01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 基于注解的控制器
 */
@Controller
public class HelloController01 {

    @RequestMapping("/hello")
    public String sayHello(HttpServletRequest request) {
        request.setAttribute("message", "Hello World");
        return "helloworld";
    }

}