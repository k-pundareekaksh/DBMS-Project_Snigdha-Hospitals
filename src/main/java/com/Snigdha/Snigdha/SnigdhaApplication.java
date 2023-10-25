package com.Snigdha.Snigdha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

@SpringBootApplication(exclude = {JdbcTemplateAutoConfiguration.class})
public class SnigdhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnigdhaApplication.class, args);
	}
}
