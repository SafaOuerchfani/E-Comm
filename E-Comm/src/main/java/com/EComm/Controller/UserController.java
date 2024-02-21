package com.EComm.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.EComm.entities.User;
import com.EComm.Service.IUserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	IUserService userv;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers() { 
		List<User> pro = userv.findAllUsers();

        return pro;
	    
	}

	@PostMapping("/addusert")
	public User createUser(@Valid @RequestBody User user) {
	    return userv.saveUser(user);
	}

}
