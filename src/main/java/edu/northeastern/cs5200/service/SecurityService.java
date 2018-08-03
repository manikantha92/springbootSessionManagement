package edu.northeastern.cs5200.service;

public interface SecurityService {

	    String findLoggedInUsername();

	    void autologin(String username, String password);
	
}
