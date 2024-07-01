package com.api.book.bootrestbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.api.book.bootrestbook.entities")
@EnableJpaRepositories(basePackages = "com.api.book.bootrestbook.dao")
public class bootrestbookApplication{

	public static void main(String[] args) {
		SpringApplication.run(bootrestbookApplication.class, args);
	}

}