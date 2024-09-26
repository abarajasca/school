package com.caleradreams.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SchoolStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolStudentApplication.class, args);
	}

}
