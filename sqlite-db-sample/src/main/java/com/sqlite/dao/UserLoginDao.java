package com.sqlite.dao;

import org.springframework.data.repository.CrudRepository;

import com.sqlite.entities.UserLogin;

public interface UserLoginDao extends CrudRepository<UserLogin, Long> {

   UserLogin findUserLoginByUserNameAndPassword(String username,String password);
}
