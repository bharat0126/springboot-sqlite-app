package com.sqlite.service;

import com.sqlite.models.LoginModel;
import com.sqlite.models.UserLoginModel;


public interface IUserService {

	/*public List<UserLogin> getAllUsers();
	
	public void save(UserLogin person);*/
    
    public UserLoginModel getUser(LoginModel loginModel);
}
