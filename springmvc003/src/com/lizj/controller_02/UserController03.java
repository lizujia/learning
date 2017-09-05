package com.lizj.controller_02;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lizj.bean.User;

@Controller
@RequestMapping("/user03")
public class UserController03 {

    // 模拟数据库存储
    private static List<User> userList;
    
    {
        userList = new ArrayList<User>();
        for(int i=1; i<=10; i++) {
            User user = new User();
            user.setId(String.valueOf(i));
            user.setName("张三-" + i);
            user.setAge(20 + i);
            user.setSex(i % 2 == 0 ? "男" : "女");
            userList.add(user);
        }
        
    }
    
    /*
     * springmvc中controller中的方法参数, 支持大多数常用的数据类型, 
     * 如: String, int.... 
     */
    @RequestMapping("/get")
    public ModelAndView getUser(String id, Model model) {
        User user = null;
        for(int i=0; i<userList.size(); i++) {
            User u = userList.get(i);
            if(u.getId().equals(id)) {
                user = u;
                break ;
            }
        }
        if(user == null) {
            user = new User();
            user.setId("001");
            user.setName("张三");
            user.setAge(18);
            user.setSex("男");
        }
        // 创建一个ModelAndView对象
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("user/oneuser");
        return mv;
    }
    
}