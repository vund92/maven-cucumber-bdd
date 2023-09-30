Feature: Register and Login
<feature description>

  Scenario: Register to system and login
    Given Open Register page
    When Input to Email textbox
    And Click to Submit
    Then Get User and password infor
    When Back to Login page
    And Submit valid infor to login form
    Then Home page displayed