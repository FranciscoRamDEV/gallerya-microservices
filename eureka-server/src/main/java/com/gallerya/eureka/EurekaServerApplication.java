package com.gallerya.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// @SpringBootApplication le dice a Spring que este es el punto de entrada
// de la aplicación y que active la configuración automática
@SpringBootApplication

// @EnableEurekaServer es la anotación mágica que convierte esta aplicación
// en un servidor de registro. Sin ella, sería solo un proyecto Java vacío.
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}