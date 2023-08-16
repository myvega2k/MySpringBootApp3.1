package com.ktds.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//SpringApplication.run(Application.class, args);
		SpringApplication application = new SpringApplication(Application.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.run(args);
	}


}
