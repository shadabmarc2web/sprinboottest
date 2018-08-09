package com.marc2web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.marc2web.model.User;

@Controller

public class UserController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String test() {
		return "register";
	}
	
	
	@RequestMapping(value="/success",method=RequestMethod.POST)
	public ModelAndView greet(@RequestParam("name")String name,@RequestParam("age") int age,@RequestParam(required=true ,name="email")String email,@RequestParam("city")String city) {
		
		User user= new User(name,age,email,city);
		
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("user",user); 
		
        return modelAndView;
        
	}

}
