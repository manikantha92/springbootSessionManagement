package edu.northeastern.cs5200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringSessionManagementApplication extends SpringBootServletInitializer {
    
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringSessionManagementApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringSessionManagementApplication.class, args);
	}
}
