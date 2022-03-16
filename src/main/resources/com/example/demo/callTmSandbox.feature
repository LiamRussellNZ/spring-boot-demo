Feature: Test the Trademe sandbox API returns the expected items

  Scenario: I get returned the response that I expect
    Given I have the required information
    When  I call the sandbox api
    Then  I should see name "Carbon credits"