package com.elegnat.BasicAPP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.elegant")
public class BasicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicAppApplication.class, args);
	}

}
