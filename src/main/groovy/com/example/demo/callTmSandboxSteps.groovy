package com.example.demo

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import io.restassured.RestAssured
import io.restassured.http.Method
import io.restassured.path.json.JsonPath
import io.restassured.response.Response
import io.restassured.specification.RequestSpecification
import org.junit.jupiter.api.Assertions

class callTmSandboxSteps {

    private JsonPath jsonPathEvaluator
    private Response response
    private String baseURI = 'https://api.tmsandbox.co.nz/v1'
    private String endpoint = '/Categories/6327/Details.json?catalogue=false'

    @Given("I have the required information")
    static void iHaveTheRequiredInformation() {
    }

    @When("I call the sandbox api")
    void iCallTheSandboxApi() {
        System.out.print('Executing the given step')
        RestAssured.baseURI = baseURI
        RequestSpecification httpRequest = RestAssured.given()
        response = httpRequest.request(Method.GET, endpoint)
        jsonPathEvaluator = response.jsonPath()
        String responseBody = response.getBody().asString()
        int statusCode = response.getStatusCode()
        Assertions.assertEquals(200, statusCode, "Server returned bad response code")
        System.out.print("Response is: $responseBody")
    }

    @Then("I should see name {string}")
    void iShouldSeeName(String name) {
        String nameInResponse = jsonPathEvaluator.get('Name')
        Assertions.assertEquals(name, nameInResponse)
    }
}
