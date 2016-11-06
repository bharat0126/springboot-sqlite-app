package com.sqlite.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqlite.dao.UserLoginDao;
import com.sqlite.entities.UserLogin;
import com.sqlite.models.LoginModel;
import com.sqlite.models.UserLoginModel;
import com.sqlite.service.IUserService;


@Service
public class UserService implements IUserService {

	@Autowired
	private UserLoginDao userDao;
	
	@Override
	public UserLoginModel getUser(LoginModel loginModel){
	    UserLoginModel model=new UserLoginModel();
	    UserLogin user=userDao.findUserLoginByUserNameAndPassword(loginModel.getUserName(), loginModel.getPassword());
	    if (user !=null) {
		model.setEmail(user.getEmail());
		model.setFirstName(user.getFirstName());
		model.setId(user.getId());
		model.setLastName(user.getLastName());
		model.setMobile(user.getPassword());
		model.setPassword(user.getPassword());
		model.setUserName(user.getUserName());
	    }
	    return model;
	}
	
	/*public List<UserLogin> getAllUsers() {
		List<UserLogin> persons = (List<UserLogin>) userDao.findAll();
		return persons;
	}

	public void save(UserLogin person) {
		userDao.save(person);
	}*/

}
