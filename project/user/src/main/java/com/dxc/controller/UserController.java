package com.dxc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.exception.IncorrectPasswordException;
import com.dxc.exception.UserExistsException;
import com.dxc.exception.UserNotFoundException;
import com.dxc.model.UserThis;
import com.dxc.model.userCredential;
import com.dxc.service.TokenGeneratorService;
import com.dxc.service.UserService;

import io.jsonwebtoken.JwtBuilder;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private TokenGeneratorService tokenGenerator;
	
	@PostMapping("/register")
	public UserThis registerUser(@RequestBody UserThis user) throws UserExistsException {
		return this.service.registerUser(user);
	}
	
	@PostMapping("/login")
	public Map<String, String> authenticateUser(@RequestBody userCredential credentails) throws UserNotFoundException, IncorrectPasswordException{
		final UserThis user = this.service.authenticateUser(credentails.getUserid(), credentails.getPassword());
		return this.tokenGenerator.generateToken(user);
	}
	
	@PostMapping("/adduser")
	public UserThis createUser(@RequestBody UserThis user) {
		return service.createUser(user);
	}
	
	@PutMapping("/updateuser")
	public UserThis update(@PathVariable int userid, @RequestBody UserThis user) throws UserNotFoundException{
		return service.updateUser(userid, user);
	}
	
	@DeleteMapping("/deleteuser")
	public void deleteUser(@PathVariable int userid) {
		 service.deleteUser(userid);
	}
	
	@GetMapping("/getuserbyid/{userid}")
	public UserThis getUser(@PathVariable int userid) throws UserNotFoundException{
		return service.getUserById(userid);
	}
}
