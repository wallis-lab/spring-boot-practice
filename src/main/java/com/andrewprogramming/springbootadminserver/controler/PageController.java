package com.andrewprogramming.springbootadminserver.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {

  @GetMapping("/{page}")//创建这个 jsp 的时候 有东西冲突
  public String showPage(@PathVariable String page) {
    return page;
  }
  
  @GetMapping("/nidaye")
  public String showPage1() {
    return "nidaye";
  }
  

}
