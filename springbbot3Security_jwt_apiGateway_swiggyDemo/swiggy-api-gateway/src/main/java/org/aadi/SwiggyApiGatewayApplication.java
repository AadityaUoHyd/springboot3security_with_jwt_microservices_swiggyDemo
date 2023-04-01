package org.aadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SwiggyApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiggyApiGatewayApplication.class, args);
	}

}
