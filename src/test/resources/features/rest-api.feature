#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
Feature: Check the Rest API functionality.

  Scenario: verify the user API operation.
    When user perform post operation to create new user
      | name | ravi kumar        |
      | job  | Software Engineer |
    Then the API should return success status code 201
    Then the post API should contain expected value in response
      | name | ravi kumar        |
      | job  | Software Engineer |
    When user fetch the details based on the user id like:7
    Then the API should return success status code 200
    
