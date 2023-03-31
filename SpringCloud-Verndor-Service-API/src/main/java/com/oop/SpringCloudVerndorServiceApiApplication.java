package com.oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudVerndorServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudVerndorServiceApiApplication.class, args);
	}

}
