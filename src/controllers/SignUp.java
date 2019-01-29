package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import models.User;

@Controller
public class SignUp {
	
	@RequestMapping("/signUp")
	public ModelAndView newUser() {
		ModelAndView mav = new ModelAndView("signUp");
		return mav;
	}
	
	@PostMapping(value="/signUp")
	public ModelAndView signUp(@ModelAttribute("user") User user, BindingResult br) {
		ModelAndView mav = null;
		
		if (br.hasErrors()) {
			mav = new ModelAndView("/signUp");
		} else {
			mav = new ModelAndView("/userPage");
		}
		
		return mav;
	}
	
}
