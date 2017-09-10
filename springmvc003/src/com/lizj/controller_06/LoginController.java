package com.lizj.controller_06;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lizj.bean.User;
import com.lizj.service.UserService;

@Controller
@SessionAttributes("user")
public class LoginController {

    @Autowired
    private UserService userService;
    
    @RequestMapping(value="/{pageName}", method=RequestMethod.GET)
    public String login(@PathVariable String pageName) {
        // 动态跳转页面
        return "login/" + pageName;
    }
    
    @RequestMapping(value="/login",  method=RequestMethod.POST)
    public String login(String loginId, String password, Model model) {
        User user = userService.login(loginId, password);
        System.out.println(user.getName());
        if(user == null) {
            
        }
        model.addAttribute("user", user);
        return "login/success";
    }
    
    @RequestMapping("/test")
    public void test(HttpSession session) {
        System.out.println(1);
    }
    
}
