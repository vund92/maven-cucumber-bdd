@parameterbackground
Feature: Parameter Feature

Background:
	Given Open facebook application

	@no_param
	Scenario: Scenario have no parameter
		#Given Open facebook application 
		When Input to Username textbox 
		And Input to Password textbox
		And Click to Submit button 
		And Close application

	@param_mark
	Scenario: Scenario have parameter
		#Given Open facebook application
		When Input to Username textbox with "automationtest@gmail.com" 
		And Input to Password textbox with "123456"
		And Click to Submit button
		And Close application

	@param_no_mark
	Scenario: Scenario have parameter
		#Given Open facebook application
		When Input to Username textbox with automationtest@gmail.com 
		And Input to Password textbox with 123456
		And Click to Submit button
		And Close application
	
	@multiple_param
	Scenario: Scenario have multiple parameter
		#Boi vi co background roi ma con co cai nay nên no se khoi dong 2 browser, bỏ 1 browser đứng đó là process các step tiep theo trên browser 2
		Given Open facebook application 
		When Input to Username with "automation test@gmail.com" and Password with "123456"
		And Click to Submit button
		And Close application
	
	