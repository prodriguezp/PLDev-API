package com.pldev.servicesPLD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableJpaRepositories(basePackages = "repository")
@EntityScan("entities")
@ComponentScan({"controllers","entities","repository","service"})
public class ServicesPldApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesPldApplication.class, args);
	}
	
	 

}
