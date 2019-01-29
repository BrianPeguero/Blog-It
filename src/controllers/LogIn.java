package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import models.User;
import services.UserImp;

@Controller
public class LogIn {
	
	@RequestMapping("/logIn")
	public ModelAndView logInPage() {
		ModelAndView mav = new ModelAndView("logIn");
		return mav;
	}
	
	@PostMapping(value="/logIn")
	public ModelAndView logIn(@ModelAttribute("user") User user, BindingResult br) {
		ModelAndView mav = null;
		UserImp userImp = new UserImp();
		
		if (br.hasErrors()) {
			mav = new ModelAndView("/logIn");
		} else {
			if (userImp.validateUser(user.getEmail(), user.getPassword())) {
				mav = new ModelAndView("/userPage");
			} else {
				mav = new ModelAndView("/logIn");
			}
		}
		
		return mav;
	}
	
}
