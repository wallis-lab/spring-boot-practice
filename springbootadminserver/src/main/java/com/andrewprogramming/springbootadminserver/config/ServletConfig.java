package com.andrewprogramming.springbootadminserver.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.andrewprogramming.springbootadminserver.servlet.secodnServlet;

@Configuration
public class ServletConfig {

	@Bean
	public ServletRegistrationBean getServletRegistrationBean(){
		ServletRegistrationBean bean= new ServletRegistrationBean(new secodnServlet());
		
		bean.addUrlMappings("/second");
		return bean;
		
		
	}
}
