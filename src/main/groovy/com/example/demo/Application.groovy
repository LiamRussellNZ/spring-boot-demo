package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {

	static void main(String[] args) {
		SpringApplication.run(Application, args)
	}

	@Bean
	CommandLineRunner commandLineRunner(ApplicationContext context) {
		return (args) -> {
			System.out.print("Let's inspect the beans: ")

			String[] beanNames = context.getBeanDefinitionNames()
			Arrays.sort(beanNames)
			for (String beanName : beanNames) {
				System.out.print(beanName)
			}
		}
	}

}
