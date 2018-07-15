package io.kiyoshimo.springdddexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableSpringConfigured // for spring-aspects
public class SpringDddExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDddExampleApplication.class, args);
	}
}
