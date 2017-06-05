package com.lizj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * 基于注解的控制器
 * 并可以接收多个请求
 * Controller注解表示此类是一个控制器
 */
@Controller
public class HelloController {

    /** 计数 */
    private int count = 0;
    
    /**
     * RequestMapping注解用来映射请求的URL和方法
     * 此处映射请求"/hello"
     */
    @RequestMapping(value="/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "everyone");
        mv.setViewName("/WEB-INF/jsp/hello.jsp");
        System.out.println("count: " + count++);
        return mv;
    }
    
    /**
     * 映射请求"/hi"
     */
    @RequestMapping(value="/hi")
    public ModelAndView hi(String param) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", param);
        mv.setViewName("/WEB-INF/jsp/hi.jsp");
        return mv;
    }

}
