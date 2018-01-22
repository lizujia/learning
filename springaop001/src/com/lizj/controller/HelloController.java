package com.lizj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizj.service.impl.IHello;

/**
 * 基于注解的控制器
 */
@Controller
public class HelloController {

    /*@Autowired
    private HelloService helloService;*/
    
    @Autowired
    private IHello helloImpl;
    
    @RequestMapping("/log")
    public String say(Model model) {
        // helloService.hello();
        helloImpl.say();
        model.addAttribute("message", "helloworld");
        return "helloworld";
    }

}