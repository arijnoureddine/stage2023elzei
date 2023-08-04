package com.example.demobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan("com.example.javaClasses")
@EntityScan("com.example.javaClasses")
public class DemobackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemobackendApplication.class, args);
	}

}
