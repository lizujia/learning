package com.lizj.service;

import com.lizj.bean.User;
import com.lizj.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public User getUserById(String id) {
        return userDao.queryUserById(id);
    }
    
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
}
