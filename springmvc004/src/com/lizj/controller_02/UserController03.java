package com.lizj.controller_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lizj.bean.User;
import com.lizj.service.UserService;

@Controller
@RequestMapping("/user03")
public class UserController03 {

    @Autowired
    private UserService userService;    
    
    /*
     * springmvc中controller中的方法参数, 支持大多数常用的数据类型, 
     * 如: String, int.... 
     */
    @RequestMapping("/get")
    public ModelAndView getUser(String id, Model model) {
        // 创建一个ModelAndView对象
        ModelAndView mv = new ModelAndView();
        User user = userService.getUserById(id);
        
        // 如果没查到, 去异常页面
        if(user == null) {
            mv.addObject("message", "未找到");
            mv.setViewName("common/error");
            return mv;
        }
        
        mv.addObject("user", user);
        mv.setViewName("user/oneuser");
        return mv;
    }
    
}