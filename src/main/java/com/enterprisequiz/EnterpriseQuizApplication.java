package com.enterprisequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude  = {DataSourceAutoConfiguration.class})
public class EnterpriseQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseQuizApplication.class, args);
	}

}
