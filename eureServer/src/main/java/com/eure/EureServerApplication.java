package com.eure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EureServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EureServerApplication.class, args);
	}

}
