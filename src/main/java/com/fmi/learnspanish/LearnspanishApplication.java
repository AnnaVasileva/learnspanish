// All Rights Reserved, Copyright © Anna Vasileva 2020.

package com.fmi.learnspanish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class LearnspanishApplication {
  @Autowired
  JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(LearnspanishApplication.class, args);
	}

}
