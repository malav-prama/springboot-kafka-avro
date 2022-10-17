package com.example.springbootkafkaavro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringbootKafkaAvroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaAvroApplication.class, args);
	}

}
