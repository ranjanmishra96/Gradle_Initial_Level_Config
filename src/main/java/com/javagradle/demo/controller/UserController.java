package com.javagradle.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javagradle.demo.entity.User;
import com.javagradle.demo.service.UserService;


@Controller
@RequestMapping(value="/US")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/addUser",method=RequestMethod.GET)
	public ModelAndView  AddUser(User user){
		
		ModelAndView modelAndView = new ModelAndView("user-add-form");
		modelAndView.addObject("user", user);
		return modelAndView; 
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public ModelAndView addingUser(@ModelAttribute User user){
		ModelAndView modelAndView = new ModelAndView("home");
		userService.addUser(user);
		String message = "User Saved Suucessfully";
		modelAndView.addObject("message", message);
		return modelAndView;
		
	}
}
