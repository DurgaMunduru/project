package com.dxc.service;

import java.util.Map;

import com.dxc.model.UserThis;

import io.jsonwebtoken.JwtBuilder;

public interface TokenGeneratorService {

	Map<String, String>  generateToken(UserThis user);
	
}
