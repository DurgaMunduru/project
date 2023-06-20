package com.dxc.service;

import java.util.Optional;

import com.dxc.exception.IncorrectPasswordException;
import com.dxc.exception.UserExistsException;
import com.dxc.exception.UserNotFoundException;
import com.dxc.model.UserThis;

public interface UserService {
	
	UserThis registerUser(UserThis user) throws UserExistsException;
	UserThis authenticateUser(int userid,String password) throws UserNotFoundException,IncorrectPasswordException;
	UserThis createUser(UserThis user);
	UserThis updateUser(int userid, UserThis user) throws UserNotFoundException;
	UserThis getUserById(int userid) throws UserNotFoundException;
	public void deleteUser(int userid);
	
}
