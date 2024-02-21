package com.EComm.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.EComm.entities.User;
import com.EComm.Repository.UserRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired 
	UserRepository urepos;

	@Override 
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return urepos.save(user);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return urepos.findAll();
	}}

	
