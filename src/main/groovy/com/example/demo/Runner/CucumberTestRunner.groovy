package com.example.demo.Runner

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.platform.suite.api.ConfigurationParameter
import org.junit.platform.suite.api.SelectClasspathResource
import org.junit.platform.suite.api.Suite

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@SelectClasspathResource("com/example/demo/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.demo.steps")
class CucumberTestRunner {
    @Test
    void simpleAssert() {
        Assertions.assertTrue(true)
    }
}
