package com.andrewprogramming.springbootadminserver.controler;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.andrewprogramming.springbootadminserver.model.User;

@Controller
public class PageController {

	/*@GetMapping("/{page}")//创建这个 jsp 的时候 有东西冲突
	public String showPage(@PathVariable String page) {
		return page;
	}*/

	/*	@GetMapping("/nidaye")
	public String showPage1() {
		return "index1";
	}*/

	@GetMapping("/show")
	public String showPage2(Model model, HttpServletRequest request) {
		model.addAttribute("msg", "heelo springboot thymeleaf");
		model.addAttribute("date", new Date());		

		model.addAttribute("gender", "female");		

		model.addAttribute("id", 3);	


		List<User> userList= new ArrayList<>();

		userList.add(new User("1","nidaye","male"));
		userList.add(new User("2","nidaye2","male"));
		userList.add(new User("3","nidaye3","female"));

		model.addAttribute("List",userList );


		request.setAttribute("req", "HttpServletRequest");
		request.getSession().setAttribute("ses", "HttpSession");

		request.getSession().getServletContext().setAttribute("con", "context");
		
		
		model.addAttribute("id","2222");
		model.addAttribute("name","nidaye");
		

		return "hello88";
	}


	/*@GetMapping("/show1")
	public String showPage1(Model model) {
		model.addAttribute("msg", "heelo springboot thymeleaf");

		return "hello88";
	}*/

	@GetMapping("show1")
	public String show1() {
		return "daye";
	}

	@GetMapping("/showParam")
	public String showParam(String id, String name) {
		System.out.print("id="+id+" name="+name);
		
		

		return "show2";


	}
	
	
	@GetMapping("/showParam/{id}")
	public String showParam1(@PathVariable String id) {
		System.out.print("id="+id);

		return "show2";
	}
	
	@GetMapping("/showParam/{id}/{name}")
	public String showParam1(@PathVariable String id, @PathVariable String name) {
		System.out.print("id="+id+"name="+name);

		return "show2";
	}
	
	
}
