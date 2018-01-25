package fr.potajaime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class )
public class PotajaimeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PotajaimeBackendApplication.class, args);
	}
}
