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
public class SignUp {
	
	@RequestMapping("/signUp")
	public ModelAndView newUser() {
		ModelAndView mav = new ModelAndView("signUp");
		return mav;
	}
	
	@ModelAttribute("user")
	public SignInUser signUpUser(String email, String password) {
		return new SignInUser(email, password);
	}
	
	@PostMapping(value="/signUp")
	public ModelAndView signUp(@ModelAttribute("user") SignInUser signUpUser, 
													   BindingResult br,
													   HttpServletRequest request,
													   HttpServletResponse response) {
		ModelAndView mav = null;
		UserImp userImp = new UserImp();
		
		if (br.hasErrors()) {
			mav = new ModelAndView("/signUp");
			
			String message = "Sorry user doesnt exist";
			mav.addObject(message);
		} else {
			userImp.newUser(signUpUser.getEmail(), signUpUser.getPassword());
			
			User dbUser = userImp.getUser(signUpUser.getEmail());
			
			mav = new ModelAndView("/userPage");
			
			mav.addObject("dbUser", dbUser);
			
			request.getSession().setAttribute("user", dbUser);
		}
		
		return mav;
	}
	
}
