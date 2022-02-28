package com.example.demo.house

import com.example.demo.person.Person

class House {

    private Person person;

    House(Person occupant) {
        this.person = occupant
    }

    String livesInHouse() {
        return person + ' lives in this house'
    }
}
