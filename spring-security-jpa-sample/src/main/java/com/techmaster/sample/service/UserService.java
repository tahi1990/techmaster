package com.techmaster.sample.service;

import com.techmaster.sample.model.User;

public interface UserService {

	void createUser(User user);
	
	User findByUsername(String username);

}
