package com.jay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class EasyMarttApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyMarttApplication.class, args);
	
	}

}
