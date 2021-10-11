package com.samdasu.da;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SamdasuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamdasuApplication.class, args);
	}

}
