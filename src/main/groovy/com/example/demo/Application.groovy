package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application implements CommandLineRunner {

	static void main(String[] args) {
		SpringApplication.run(Application, args)
	}

	@Override
	void run(String... args) throws Exception {
		System.out.print('this is a spring app')
	}
}
