package com.stackroute.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigurarionService {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurarionService.class, args);
	}

}
