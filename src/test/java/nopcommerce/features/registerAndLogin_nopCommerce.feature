@nopcommerce
Feature: Register and Login NopCommerce

  @nopcommerce_register_steps
  Scenario: Register an account
  # Open Url -> Hooks
    When I open Register page 
    And I input required fields
    And I click to Register button
    Then I verify success message
    
   @nopcommerce_login_steps
   Scenario: Login using the registered account
   When I open Login page
   And I input credentials
   And I click to Login button
   Then I verify My Account link is displayed 
   When I open My Account page
   Then I verify Customer Infor page is displayed

