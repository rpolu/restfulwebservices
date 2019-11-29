package com.elegant.springboot.SpringrestJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.elegant.springboot"})
public class SpringrestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestJpaApplication.class, args);
	}

}
