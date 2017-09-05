package com.lizj.controller_02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizj.bean.User;

@Controller
@RequestMapping("/user01")
public class UserController01 {

    @RequestMapping("/get")
    public String getUser(Model model) {
        User user = new User();
        user.setId("001");
        user.setName("张三");
        user.setAge(18);
        user.setSex("男");
        model.addAttribute("user", user);
        return "user/oneuser";
    }
    
}