package com.andrewprogramming.springbootadminserver.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class webmvccognig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
        .addResourceLocations("resources/", "static/", "public/", 
        "META-INF/resources/")
        .addResourceLocations("classpath:resources/", "classpath:static/", 
        "classpath:public/", "classpath:META-INF/resources/")
        .addResourceLocations("file:C:\\Users\\Wallis\\Desktop\\code\\springbootadminserver\\src\\main\\resources\\");
	}

   
}
