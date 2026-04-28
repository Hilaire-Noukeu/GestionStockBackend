package com.gestionStockBACKEND.gestionStockBACKEND;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GestionStockBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionStockBackendApplication.class, args);
	}

}
