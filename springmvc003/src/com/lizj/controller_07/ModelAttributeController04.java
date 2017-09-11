package com.lizj.controller_07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizj.bean.User;
import com.lizj.service.UserService;

@Controller
@RequestMapping("/mac04")
public class ModelAttributeController04 {

	@Autowired
	private UserService userService;
	
	// @RequestMapping和@ModelAttribute修饰同一个方法
	@RequestMapping("/show")
	@ModelAttribute("username")
	public String show(String userId) {
		User user = userService.getUserById(userId);
		return user.getName();
	}
	
}
