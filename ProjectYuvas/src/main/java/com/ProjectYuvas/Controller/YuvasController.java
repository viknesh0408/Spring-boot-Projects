package com.ProjectYuvas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class YuvasController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("Home");
	}

}
