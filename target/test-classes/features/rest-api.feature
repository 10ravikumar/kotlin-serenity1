#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
Feature: Check the Rest API functionality.

  Scenario: verify the user API operation.
  
    When creates a new user using post request
      | name | ravi kumar        |
      | job  | Software Engineer |
    Then the API should return success status code 201
    Then the post API should contains expected values in response
      | name | ravi kumar        |
      | job  | Software Engineer |
    When fetch the Use details based on the user id like:7
    Then the API should return success status code 200
    
