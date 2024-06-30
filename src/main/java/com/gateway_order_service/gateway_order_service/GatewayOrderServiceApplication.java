package com.gateway_order_service.gateway_order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayOrderServiceApplication.class, args);
	}

}
