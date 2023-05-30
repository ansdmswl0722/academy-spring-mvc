package com.nhnacademy.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBoardApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootBoardApplication.class);
        application.run(args);
    }

}
