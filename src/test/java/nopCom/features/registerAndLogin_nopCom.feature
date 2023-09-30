@nopcommerce
Feature: Register and Login NopCommerce

  @nopcommerce_register_steps
  Scenario: Register an account
  	#Open Url -> Hooks
  	#Given I open Home page of nopCom 
    When I open Register page of nopCom
    And I input required fields of nopCom
    And I click to Register button of nopCom
    Then I verify success message of nopCom
    And I open Login page of nopCom
    
   @nopcommerce_login_steps
   Scenario: Login using the registered account
   #When I open Login page of nopCom
   When I input credentials of nopCom
   And I click to Login button of nopCom
   Then I verify My Account link is displayed of nopCom
   When I open My Account page of nopCom
   Then I verify Customer Infor page is displayed of nopCom

#####################################################################

#	@new_customer
#	Scenario Outline: New Customer
            # Link
            #Given Open "New Customer" page
#
            # Textbox
             #When Input to "Customer Name" textbox with value "<CustomerName>"
#
            # Radio
              #And Click to "f" radio button
#
            # Textbox
              #And Input to "Date of Birth" textbox with value "<DobIn>"
              #And Input to "Address" textarea with value "<Address>"
              #And Input to "City" textbox with value "<City>"
              #And Input to "State" textbox with value "<State>"
              #And Input to "PIN" textbox with value "<Pin>"
              #And Input to "Mobile Number" textbox with value "<Phone>"
              #And Input to "E-mail" textbox with value "<Email>"
              #And Input to "Password" textbox with value "<Password>"
#
            # Button
              #And Click to "Submit" button
#
            # Message
             #Then Success message displayed with "Customer Registered Successfully!!!"
#
            # Text
              #And The valid text displayed at "Customer Name" with value "<CustomerName>"
              #And The valid text displayed at "Gender" with value "<Gender>"
              #And The valid text displayed at "Birthdate" with value "<DobOut>"
              #And The valid text displayed at "Address" with value "<Address>"
              #And The valid text displayed at "City" with value "<City>"
              #And The valid text displayed at "State" with value "<State>"
              #And The valid text displayed at "Pin" with value "<Pin>"
              #And The valid text displayed at "Mobile No." with value "<Phone>"
              #And The valid text displayed at "Email" with value "<Email>"
              #
        #Examples:
                  #| CustomerName | DobIn      | DobOut     | Gender | Address       | City        | State   | Pin    | Phone      | Email   | Password |
                  #| Tony Teo     | 09/13/1995 | 1995-09-13 | female | 123/08 Le Lai | Ho Chi Minh | Thu Duc | 650000 | 0987666999 | tonyteo | 444555   |
                  
                  