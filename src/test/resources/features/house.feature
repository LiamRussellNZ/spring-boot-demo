Feature: I can build a house

  Rule: My house can have one or more rooms

    Scenario: My house is made with one room
      Given I have the blueprints for a house
      When  I build the house
      Then  I have a house with more than one room