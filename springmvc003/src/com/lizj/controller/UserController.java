package com.lizj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lizj.bean.User;
import com.lizj.service.TestService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private TestService testService;
    
    @RequestMapping(name="tj", value={"/add", "/tianjia"})
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
    
    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String add(@RequestParam("bh") String id, 
    		     	  @RequestParam("xm") String name, 
    		     	  @RequestParam("nl") int age) {
    	User user = new User();
    	user.setId(id);
    	user.setName(name);
    	user.setAge(age);
    	System.out.println(user);
    	return "user/success";
    }
    
    @RequestMapping("/test/{param1}/{param2}")
    public void pathVariable(@PathVariable String param1, @PathVariable String param2) {
    	System.out.println("param1: " + param1);
    	System.out.println("param2: " + param2);
    }
    
}