package br.com.isaacsilva.tech.fastfood.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FastfoodDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastfoodDiscoveryApplication.class, args);
	}

}
