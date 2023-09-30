@parameterbeforeafter
Feature: Parameter Feature

	@no_param
	Scenario: Scenario have no parameter
		When Input to Username textbox 
		And Input to Password textbox
		And Click to Submit button 

	@param_mark
	Scenario: Scenario have parameter
		When Input to Username textbox with "automationtest@gmail.com" 
		And Input to Password textbox with "123456"
		And Click to Submit button

	@param_no_mark
	Scenario: Scenario have parameter
		When Input to Username textbox with automationtest@gmail.com 
		And Input to Password textbox with 123456
		And Click to Submit button
	
	@multiple_param
	Scenario: Scenario have parameter
		When Input to Username with "automation test@gmail.com" and Password with "123456"
		And Click to Submit button
	
	