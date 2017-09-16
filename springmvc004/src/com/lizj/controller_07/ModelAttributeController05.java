package com.lizj.controller_07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizj.bean.User;
import com.lizj.service.UserService;

@Controller
@RequestMapping("/mac05")
public class ModelAttributeController05 {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public User getUserById(String userId) {
		return userService.getUserById(userId);
	}
	
	@RequestMapping("/show")
	public String show(@ModelAttribute User user) {
		return "mac/test05";
	}
	
}
