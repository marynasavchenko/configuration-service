package com.onlinestore.configurationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Class that bootstraps this service.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	/**
	 * Main method, used to run this application.
	 *
	 * @param args the string array, that contains command line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
