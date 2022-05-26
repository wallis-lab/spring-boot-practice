package com.andrewprogramming.springbootadminserver.controler;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class fileControler {





	  @PostMapping("/fileUploadController")
	  public String fileUpload(MultipartFile file) throws Exception, IOException {
		  Logger parentLogger = LogManager.getLogger();
	   // System.out.println(file.getOriginalFilename());
		  parentLogger.info("开始FileUpload");

		  
		  
		  file.transferTo(new File("C:/Users/Wallis/Desktop/test/" +"-copy-"+ file.getOriginalFilename()));
	    return "OK";
	  }

}
