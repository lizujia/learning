package com.lizj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lizj.bean.User;
import com.lizj.service.TestService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private TestService testService;
    
    @RequestMapping(value={"/add", "/tianjia"})
    public String add() {
        return "user/add";
    }
    
    @RequestMapping("/list")
    public String list() {
        testService.test();
        return "user/list";
    }
    
    @RequestMapping("/get")
    public String getUserById(String id, Model model) {
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setSex("男");
        model.addAttribute("user", user); 
        return "user/oneuser";
    }
    
    @RequestMapping("/achieve")
    public ModelAndView getUserByBh(String bh, Model model) {
        User user = new User();
        user.setId(bh);
        user.setName("张三");
        user.setSex("男");
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("user/oneuser");
        return mv;
    }
    
}