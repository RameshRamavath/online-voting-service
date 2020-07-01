package com.test.votingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration

public class VotingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotingServiceApplication.class, args);
	}

}
