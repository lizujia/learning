package com.lizj.dao;

import java.util.ArrayList;
import java.util.List;

import com.lizj.bean.User;

public class UserDao {

    // 模拟数据库存储
    private static List<User> userList;
    
    {
        userList = new ArrayList<User>();
        for(int i=1; i<=10; i++) {
            User user = new User();
            user.setId(String.valueOf(i));
            user.setLoginId("zhangsan-" + i);
            user.setPassword("123");
            user.setName("张三-" + i);
            user.setAge(20 + i);
            user.setSex(i % 2 == 0 ? "男" : "女");
            userList.add(user);
        }
        
    }
    
    public User queryUserById(String id) {
        for(int i=0; i<userList.size(); i++) {
            User u = userList.get(i);
            if(u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }
    
    public User queryUserByLoginIdAndPassword(String loginId, String password) {
        for(int i=0; i<userList.size(); i++) {
            User user = userList.get(i);
            if(user.getLoginId().equals(loginId) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    
}
