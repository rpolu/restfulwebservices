package com.elegant.redbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.elegant")
public class RedbusApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedbusApplication.class, args);
	}

}
