package com.dxc.filter;

import java.io.IOException;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class JWTTValidationFilter {

	public static final String BEARER ="Bearer";
	public static final String AUTHORIZATION ="Authorization";
	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest)servletRequest;
		HttpServletResponse response = (HttpServletResponse)servletResponse;
	
		final String authorization = request.getHeader(AUTHORIZATION);
		if(authorization == null || !authorization.startsWith(BEARER)) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().println("Auth Header is missing");
		}
		
		else {
		//Bearer tokenValue
		String token =authorization.substring(7);
		try {
			
			final Claims claims = Jwts.parser().setSigningKey("testsecretKey")
					.parseClaimsJws(token)
					.getBody();
					request.setAttribute("Claims", claims);
					chain.doFilter(request, response);
		}catch(Exception e) {
			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
			response.getWriter().println("Invalid Token");
		}
		
		}
		
	}	
}
