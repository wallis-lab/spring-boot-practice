package com.andrewprogramming.springbootadminserver.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;





@Log4j2
public class myinterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		Logger parentLogger = LogManager.getLogger();

		parentLogger.info("111111");
		parentLogger.debug("222222222 pre");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		Logger parentLogger = LogManager.getLogger();
		parentLogger.debug("333333333333 post");
		System.out.println("4444444444 post handle");
		//HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		Logger parentLogger = LogManager.getLogger();
		parentLogger.debug("555555555 pre handle");
		// TODO Auto-generated method stub
		
	}

	

}
