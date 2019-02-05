package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import models.NewPost;

@Controller
public class EditPost {
	
	@ModelAttribute("post")
	public NewPost post(String title, String description) {
		return new NewPost(title, description);
	}
	
	@RequestMapping("/editPost")
	public ModelAndView editPost(@ModelAttribute("post") NewPost post, BindingResult br) {
		ModelAndView mav = null;
		
		if(br.hasErrors()) {
			mav = new ModelAndView("/editPost");
		} else {
			mav = new ModelAndView("/userPage");
		}
		
		return mav;
	}
	
}
