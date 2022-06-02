package com.andrewprogramming.springbootadminserver;




import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@EnableAdminServer
//@ServletComponentScan
//@MapperScan("com.andrewprogramming.springbootadminserver.Mapper")
@MapperScan("com.andrewprogramming.springbootadminserver.Mapper")
public class SpringbootadminserverApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootadminserverApplication.class, args);
  }

}
