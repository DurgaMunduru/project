package com.dxc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.exception.IncorrectPasswordException;
import com.dxc.exception.UserExistsException;
import com.dxc.exception.UserNotFoundException;
import com.dxc.model.UserThis;
import com.dxc.repository.UserRepository;


@Service
public class ServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	
	public UserThis registerUser(UserThis user) throws UserExistsException{
		final boolean existsByUserId = this.repo.existsById(user.getUserid());
		if(existsByUserId) {
			throw new UserExistsException("User Already Exists");
		}
		return this.repo.save(user);
	}

	
	public UserThis authenticateUser(int userid, String password) throws UserNotFoundException, IncorrectPasswordException {
		final Optional<UserThis> optionaluser= this.repo.findByUserIdAndPassword(userid, password);
		return null;
	}

	
	
	public UserThis createUser(UserThis user) {
		
		return repo.save(user);
	}

	
	public UserThis updateUser(int userid, UserThis user) throws UserNotFoundException{
		UserThis newUser = getUserById(userid);
		if(newUser==null)
			throw new UserNotFoundException();
		else
			return repo.save(user);
	}

	public UserThis getUserById(int userid) throws UserNotFoundException{
		UserThis user = repo.getById(userid);
		if(user == null)
			throw new UserNotFoundException();
		return user;
	}

	
	public  void deleteUser(int userid) {

		repo.deleteById(userid); 
	}

}
