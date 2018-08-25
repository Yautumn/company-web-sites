package com.yautumn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CompanyWebSitesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CompanyWebSitesApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(CompanyWebSitesApplication.class);
	}

}
