package com.slamapp.slamappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class SlamappBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlamappBackendApplication.class, args);
	}

}
