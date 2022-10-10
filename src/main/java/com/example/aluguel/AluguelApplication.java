package com.example.aluguel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//(exclude={DataSourceAutoConfiguration.class})
@EntityScan("com.example.domain")
@EnableJpaRepositories("com.example.aluguel.repository")
public class AluguelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AluguelApplication.class, args);
	}

}
