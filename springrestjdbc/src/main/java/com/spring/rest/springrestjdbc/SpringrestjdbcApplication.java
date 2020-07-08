package com.spring.rest.springrestjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.uinversity")
@EnableSwagger2
public class SpringrestjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestjdbcApplication.class, args);
	}

}
