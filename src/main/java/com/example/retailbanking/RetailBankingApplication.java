package com.example.retailbanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class RetailBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailBankingApplication.class, args);
	}

}
