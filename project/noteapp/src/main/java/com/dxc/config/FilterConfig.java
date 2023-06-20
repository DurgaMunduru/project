package com.dxc.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.GenericFilterBean;

import com.dxc.filter.JWTTValidationFilter;

@Configuration
public class FilterConfig {

	public static final String NOTE_PATH = "/api/v1/notes/*";
	
	@Bean
	public FilterRegistrationBean<GenericFilterBean> jwtFilter(){
		FilterRegistrationBean<GenericFilterBean> filterRegistrationBean = new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(new JWTTValidationFilter());
		filterRegistrationBean.addUrlPatterns(NOTE_PATH);
		return filterRegistrationBean;
	
	}	
}
