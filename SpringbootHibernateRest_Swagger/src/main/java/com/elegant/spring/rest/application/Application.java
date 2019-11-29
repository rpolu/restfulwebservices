package com.elegant.spring.rest.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "com.elegant.spring.rest" })
@EnableJpaRepositories(basePackages={"com.elegant.spring.rest.repository"}) 
@EntityScan(basePackages={"com.elegant.spring.rest.model"}) 
public class Application {
	public static void main(String[] args) {
		System.out.println("Starting Spring Application");
		SpringApplication.run(Application.class, args);
	}
}