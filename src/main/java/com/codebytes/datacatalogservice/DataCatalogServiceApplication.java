package com.codebytes.datacatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataCatalogServiceApplication {

	public DataCatalogServiceApplication(){
		super();
	}

	public static void main(String[] args) {
		SpringApplication.run(DataCatalogServiceApplication.class, args);
	}

}
