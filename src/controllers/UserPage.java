package controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import models.Post;
import models.User;
import services.UserImp;

@Controller
public class UserPage {
	
	@RequestMapping("/userPage")
	public ModelAndView userPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("userPage");
		UserImp userImp = new UserImp();
		
		User user = (User) request.getAttribute("user");
		
		List<Post> listOfPosts = userImp.getAllPosts(user.getId());
		
		mav.addObject("listOfPosts", listOfPosts);
		
		return mav;
	}
	
}
