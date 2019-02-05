package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewPost {
	
	@ModelAttribute("newPost")
	public models.NewPost post (String title, String description){
		return new models.NewPost(title, description);
	}
	
	@RequestMapping("/newPost")
	public ModelAndView newPost(@ModelAttribute("newPost") models.NewPost newPost, 
															BindingResult br) {
		
		ModelAndView mav = null;
		
		if(br.hasErrors()) {
			mav = new ModelAndView("/newPost");
		} else {
			mav = new ModelAndView("/userPage");
		}
		return mav;
	}
	
}
