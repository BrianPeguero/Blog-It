package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserPage {
	
	@RequestMapping("/userPage")
	public ModelAndView userPage() {
		ModelAndView mav = new ModelAndView("userPage");
		
		
		
		return mav;
	}
	
}
