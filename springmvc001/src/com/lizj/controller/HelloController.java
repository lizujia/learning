package com.lizj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * HelloController作为一个页面控制器, 是一个实现Controller接口的页面控制器
 * 它可以处理一个单一请求
 */
public class HelloController implements Controller {

    /** 计数 */
    private int count = 0;
    
    /**
     * 实现Controller接口中定义的方法 
     * 此方法返回一个ModelAndView对象, 
     * 此对象中, 包含着视图名和模型
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "everyone");
        mv.setViewName("/WEB-INF/jsp/hello.jsp");
        System.out.println("count: " + count++);
        return mv;
    }
    
}
