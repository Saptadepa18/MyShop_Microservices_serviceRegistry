package com.example.myshopserviceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyshopServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyshopServiceRegistryApplication.class, args);
	}

}
