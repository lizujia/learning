package com.lizj.controller_07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizj.service.UserService;

@Controller
@RequestMapping("/mac03")
public class ModelAttributeController03 {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void getUserById(String userId, Model model) {
		model.addAttribute("user", userService.getUserById(userId));
	}
	
	@RequestMapping("/show")
	public String show() {
		return "mac/test03";
	}
	
}
