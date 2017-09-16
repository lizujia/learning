package com.lizj.controller_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizj.bean.User;
import com.lizj.service.UserService;

@Controller
@RequestMapping("/user02")
public class UserController02 {

    @Autowired
    private UserService userService;
    
    /*
     * springmvc中controller中的方法参数, 支持大多数常用的数据类型, 
     * 如: String, int.... 
     */
    @RequestMapping("/get")
    public String getUser(String id, Model model) {
        User user = userService.getUserById(id);
        
        // 如果没查到, 去异常页面
        if(user == null) {
            model.addAttribute("message", "未找到");
            return "common/error"; 
        }
        
        // 向model中添加数据
        model.addAttribute("user", user);
        // 返回视图名称
        return "user/oneuser";
    }
    
}