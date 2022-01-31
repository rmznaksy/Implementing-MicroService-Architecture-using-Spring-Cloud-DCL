package com.example.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class SecurityCardMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityCardMicroserviceApplication.class, args);

	}

}
