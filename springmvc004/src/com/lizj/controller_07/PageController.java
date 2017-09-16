package com.lizj.controller_07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mac")
public class PageController {

	@RequestMapping("/{pageName}")
	public String show(@PathVariable String pageName) {
		return "mac/" + pageName;
	}
	
}
