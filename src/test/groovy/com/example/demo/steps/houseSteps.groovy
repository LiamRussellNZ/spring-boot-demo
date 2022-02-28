package com.example.demo.steps

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions

class houseSteps {
    @Given('I have the blueprints for a house')
    static void iHaveHouseBlueprints() {
        Assertions.assertEquals(1,1)
    }

    @When("I build the house")
    static void iBuildTheHouse() {
        Assertions.assertEquals(1,3)
    }

    @Then("I have a house with more than one room")
    static void iHaveAHouseWithMoreThanOneRoom() {
        Assertions.assertEquals(1,3)
    }
}