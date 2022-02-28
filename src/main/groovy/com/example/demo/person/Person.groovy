package com.example.demo.person

import org.springframework.context.annotation.Configuration


class Person {
    private String firstName
    private String lastName

    Person(String FirstName, String LastName) {
        this.firstName = FirstName
        this.lastName = LastName
    }

    String getFullName() {
        return "$this.firstName $this.lastName"
    }
}
