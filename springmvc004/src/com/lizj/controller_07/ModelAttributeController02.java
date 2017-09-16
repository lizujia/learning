package com.lizj.controller_07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizj.bean.User;
import com.lizj.service.UserService;

@Controller
@RequestMapping("/mac02")
public class ModelAttributeController02 {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	// 这次没有使用@ModelAttribute注解的value属性
	public User getUserById(String userId) {
		return userService.getUserById(userId);
	}
	
	@RequestMapping("/show")
	public String show() {
		return "mac/test02";
	}
	
}
