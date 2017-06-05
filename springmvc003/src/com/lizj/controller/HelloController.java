package com.lizj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 基于注解的控制器
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/say")
    public String say(Model model) {
        model.addAttribute("message", "helloworld");
        return "helloworld";
    }
    
    @RequestMapping
    public String execute(Model model) {
        model.addAttribute("message", "helloworld");
        return "helloworld";
    }

}