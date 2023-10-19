package com.Snigdha.Snigdha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SnigdhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnigdhaApplication.class, args);
	}

}
