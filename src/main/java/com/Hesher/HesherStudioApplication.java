package com.Hesher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HesherStudioApplication {

	public static void main(String[] args) {
		SpringApplication.run(HesherStudioApplication.class, args);
	}

}
