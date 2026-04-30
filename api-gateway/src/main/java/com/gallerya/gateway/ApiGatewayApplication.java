package com.gallerya.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// @SpringBootApplication activa la configuración automática de Spring
@SpringBootApplication

// @EnableDiscoveryClient le dice a este servicio que se registre
// en Eureka al iniciar, y que pueda descubrir otros servicios por nombre.
// Así el Gateway puede usar lb://nombre-servicio en las rutas.
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
}