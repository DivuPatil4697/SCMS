package com.elementsoftech.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication 
public class AckCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AckCoreApplication.class, args);
		System.out.println("core app started..");
	}

}
