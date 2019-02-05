package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import models.SignInUser;
import models.User;
import services.UserImp;

@Controller
public class LogIn {
	
	@RequestMapping("/logIn")
	public ModelAndView logInPage() {
		ModelAndView mav = new ModelAndView("logIn");
		return mav;
	}
	
	@ModelAttribute("user")
	public SignInUser signInUser(String email, String password) {
		return new SignInUser(email, password);
	}
	
	@PostMapping(value="/logIn")
	public ModelAndView logIn(@ModelAttribute("user") SignInUser signInUser, 
													  BindingResult br,
													  HttpServletRequest request,
													  HttpServletResponse response) {
		ModelAndView mav = null;
		UserImp userImp = new UserImp();
		
		if (br.hasErrors()) {
			mav = new ModelAndView("/logIn");
		} else {
			if (userImp.validateUser(signInUser.getEmail(), signInUser.getPassword())) {
				User dbUser = userImp.getUser(signInUser.getEmail());
				mav = new ModelAndView("/userPage");
				
				mav.addObject("bdUser", dbUser);
				
				request.getSession().setAttribute("user", dbUser);
			} else {
				mav = new ModelAndView("/logIn");
				
				String message = "Sorry user doesnt exist";
				mav.addObject(message);
			}
		}
		
		return mav;
	}
	
}
