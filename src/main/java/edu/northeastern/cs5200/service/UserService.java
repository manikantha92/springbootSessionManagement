package edu.northeastern.cs5200.service;

import edu.northeastern.cs5200.model.User;

public interface UserService {

	    void save(User user);

	    User findByUsername(String username);
	
}
