package com.everis.bootcamp.eurekaClientPractica1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientPractica1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientPractica1Application.class, args);
	}

}
