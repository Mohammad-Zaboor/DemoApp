package com.mer.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.mer.*")
@EntityScan("com.mer.dto")
@EnableJpaRepositories("com.mer.dao")
public class BurkaFarkharApplication {

	public static void main(String[] args) {
		SpringApplication.run(BurkaFarkharApplication.class, args);
		System.out.println("application started");
	}
}
