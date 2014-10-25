package com.test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.servlet.ModelAndView;

import com.test.model.User;
import com.test.service.UserService;

@Controller
@RequestMapping(value="/login")
public class RegisterController {
	 @Autowired
	 UserService userService;
	 
	 @RequestMapping(method = RequestMethod.GET)
	   public String viewRegistration(Map<String, Object> model) {
	        User userForm = new User();    
	        model.put("userForm", userForm);
	         
	        List<String> professionList = new ArrayList<>();
	        professionList.add("Developer");
	        professionList.add("Designer");
	        professionList.add("IT Manager");
	        model.put("professionList", professionList);
	         
	        return "login";
	  }
	@RequestMapping(method=RequestMethod.POST)
	 public String processRegistration(@ModelAttribute("userForm") User user,
			 Map<String, Object> model){
		 System.out.println("username: " + user.getUSER_ID());
		 //Logic
		 
		 //TODO
		 return "registerSuccess";
	 }
	@RequestMapping("/getList")
	public ModelAndView getUserLIst() {  
		 List<User> userList = userService.getUserList();
		
		 return new ModelAndView("userList", "userList", userList);  
	}  

}
