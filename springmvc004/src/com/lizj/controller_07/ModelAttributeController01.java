package com.lizj.controller_07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mac01")
public class ModelAttributeController01 {

	@ModelAttribute("paramName")
	// 大家可以自己试一下, 如果不写value属性会是什么样的, 
	// 即只写@ModelAttribute
	public String getParam(@RequestParam("param") String param) {
		return param;
	}
	
	@RequestMapping("/show")
	public String show() {
		return "mac/test01";
	}
	
}
