Feature: Creating the Automation APIs Script
  #Created by Ahmed Nasser
  #Created on 26 June 2024


  @TC1 @BackEnd_Assignment
  Scenario: Add a new device
    Given I successfully have the correct endpoint and the correct request body
    When  Use the add new device API to be able to add the new device successfully
    And   Validate the added new device details from the response id, name, createdAt, year, price
    And   Validate id and createdAt should not be null
    Then  The new device should be added successfully