package com.spring.rest.springrestjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.uinversity")
public class SpringrestjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestjdbcApplication.class, args);
	}

}
