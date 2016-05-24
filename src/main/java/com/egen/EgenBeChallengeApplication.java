package com.egen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class EgenBeChallengeApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(EgenBeChallengeApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EgenBeChallengeApplication.class);
	}
}
