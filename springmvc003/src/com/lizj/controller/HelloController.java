package com.lizj.controller;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 基于注解的控制器
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

	private static final Logger LOGGER = (Logger) LogFactory.getLog(HelloController.class); 
	
    @RequestMapping("/say")
    public String say(Model model) {
    	LOGGER.info("hello");
        model.addAttribute("message", "helloworld");
        return "helloworld";
    }
    
    @RequestMapping
    public String execute(Model model) {
        model.addAttribute("message", "helloworld");
        return "helloworld";
    }

}