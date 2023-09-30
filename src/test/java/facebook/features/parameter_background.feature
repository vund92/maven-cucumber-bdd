@parameterbackground
Feature: Parameter Feature

Background:
	#nó sẽ apply cho từng Scenario trong Feature này thôi
	Given Open facebook application

	@no_param
	Scenario: Scenario have no parameter
#		Given Open facebook application         #lý do là vì đã hoặc là dùng background hoặc là dùng Before
		When Input to Username textbox 
		And Input to Password textbox
		And Click to Submit button 
#		And Close application 			                    #lý do là có dùng After rồi

	@param_mark
	Scenario: Scenario have parameter
		#Given Open facebook application					#lý do là vì đã hoặc là dùng background hoặc là dùng Before
		When Input to Username textbox with "automationtest@gmail.com" 
		And Input to Password textbox with "123456"
		And Click to Submit button
		#And Close application														#lý do là có dùng After rồi

	@param_no_mark
	Scenario: Scenario have parameter
		#Given Open facebook application					#lý do là vì đã hoặc là dùng background hoặc là dùng Before
		When Input to Username textbox with automationtest@gmail.com 
		And Input to Password textbox with 123456
		And Click to Submit button
		#And Close application														#lý do là có dùng After rồi
	
	@multiple_param
	Scenario: Scenario have multiple parameter
		#Boi vi co background roi ma con co cai nay nên no se khoi dong 2 browser, bỏ 1 browser đứng đó và process các step tiep theo trên browser 2
		Given Open facebook application 
		When Input to Username with "automation test@gmail.com" and Password with "123456"
		And Click to Submit button
		#And Close application														#lý do là có dùng After rồi
