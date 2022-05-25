package com.andrewprogramming.springbootadminserver;





import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@EnableAdminServer
@ServletComponentScan
public class SpringbootadminserverApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootadminserverApplication.class, args);
  }

}
