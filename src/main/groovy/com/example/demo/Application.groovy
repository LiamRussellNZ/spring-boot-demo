package com.example.demo

import com.example.demo.house.House
import com.example.demo.person.Person
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {

	static private Person person
	static private House house

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

	static void createNewPerson() {
		person = new Person("James", "Big")
	}

	static void createHouse() {
		house = new House(person)
	}

	static void whoLivesInTheHouse() {
		house.livesInHouse()
	}
}
