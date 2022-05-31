package com.andrewprogramming.springbootadminserver.controler;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
/*
@RestController
public class FileUploadController {


	@PostMapping("/fileUploadController")
	public String fileUpload(MultipartFile file) throws IOException {
		System.out.println(file.getOriginalFilename());

		file.transferTo(new File("C:/Users/Wallis/Desktop/test/" + "-copy-" + file.getOriginalFilename()));
		return "OK";
	}

}
*/