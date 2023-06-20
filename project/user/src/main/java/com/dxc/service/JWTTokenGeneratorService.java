package com.dxc.service;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import com.dxc.model.UserThis;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTTokenGeneratorService implements TokenGeneratorService {

	@Value("${jwt.secret.key}")
	private String secretKey;

	public Map<String, String> generateToken(UserThis user) {
		
		String token = Jwts.builder().setSubject(user.getUserpassword())
				.setIssuer("noteapp")
				.setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, secretKey)
				.compact();
				return Map.of("token",token);
	}
	

}
