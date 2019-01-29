package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import models.User;

@Controller
public class Index {
	
	@RequestMapping("/")
	public ModelAndView index(@ModelAttribute("user") User user) {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
}
