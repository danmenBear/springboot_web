package com.mike.pr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mike.pr.mapper")
public class PrApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrApplication.class, args);
	}
}
