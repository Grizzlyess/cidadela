package com.example.cidadela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CidadelaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CidadelaApplication.class, args);
	}

}
