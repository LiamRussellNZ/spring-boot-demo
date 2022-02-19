package com.example.demo

import com.example.demo.person.Person
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/")
    String index() {
        return "Greetings from SpringBoot"
    }

    @GetMapping('/hello')
    String hello() {
        return 'Hello world, this is SpringBoot'
    }

    @GetMapping('/person')
    @ResponseBody
    String greetPerson(@RequestParam String firstName, @RequestParam String lastName) {
        Person person = new Person(firstName, lastName)
        print(person.getFullName())
        return "Hello $firstName $lastName"
    }
}
