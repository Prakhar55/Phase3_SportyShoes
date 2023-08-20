package com.Sportyshoes.SportyShoesOnline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan("com.Sportyshoes")

@EntityScan("com.Sportyshoes.model")
@EnableJpaRepositories("com.Sportyshoes.dao")
public class SportyShoesOnlineApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesOnlineApplication.class, args);
		
	}
	
	 

}
