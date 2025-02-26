package com.springfremeworkproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Bean(name = "student_bean")
	public Student getStudent() {
		return new Student();
	}
	
	@Bean(name = "first_address")
	public Address getAddress() {
		return new Address("Rua 3, Maputo");
	}

	@Bean(name = "second_address")
	public Address getAddress2() {
		return new Address("Rua 10, C.Maputo");
	}
}
