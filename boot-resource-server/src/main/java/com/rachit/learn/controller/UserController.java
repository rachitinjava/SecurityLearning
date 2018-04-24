package com.rachit.learn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rachit.learn.model.User;

@RestController
public class UserController {

	@GetMapping("/user/getUsersList")
	public List<User> getUserList(){
		List<User> userList = new ArrayList<>();
		User user = new User();
		user.setUserId("1");
		user.setUserName("Rachit");
		userList.add(user);
		return userList;
	}
	
}
