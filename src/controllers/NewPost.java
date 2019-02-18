package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import models.User;
import services.PostImp;

@Controller
public class NewPost {
	
	@ModelAttribute("newPost")
	public models.NewPost post (String title, String description){
		return new models.NewPost(title, description);
	}
	
	@RequestMapping("/newPost")
	public ModelAndView newPost(@ModelAttribute("newPost") models.NewPost newPost, 
															BindingResult br,
													   HttpServletRequest request) {
		
		ModelAndView mav = null;
		
		if(br.hasErrors()) {
			mav = new ModelAndView("/newPost");
		} else {
			User user = (User) request.getAttribute("user");
			
			PostImp postImp = new PostImp();
			postImp.createPost(user.getId(), newPost.getTitle(), newPost.getDescription());
			
			mav = new ModelAndView("/userPage");
		}
		return mav;
	}
	
}
