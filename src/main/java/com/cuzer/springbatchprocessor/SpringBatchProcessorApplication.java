package com.cuzer.springbatchprocessor;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchProcessorApplication.class, args);
	}
}
