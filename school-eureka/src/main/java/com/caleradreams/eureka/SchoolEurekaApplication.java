package com.caleradreams.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SchoolEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolEurekaApplication.class, args);
	}

}
