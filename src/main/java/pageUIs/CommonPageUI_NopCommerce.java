package pageUIs;

public class CommonPageUI_NopCommerce {
	public static final String CUSTOMER_INFOR_LINK = "xpath=//a[contains(@class,'ico-account')]";
	public static final String ADDRESS_LINK = "Xpath=//div[contains(@class,'account-navigation')]//a[text()='Addresses']";
	public static final String MY_PRODUCT_REVIEW_LINK = "XPATH=//div[contains(@class,'account-navigation')]//a[text()='My product reviews']";
	public static final String REWARD_POINT_LINK = "Xpath=//div[contains(@class,'account-navigation')]//a[text()='Reward points']";
	public static final String LOGOUT_LINK_AT_USER = "css=a[class='ico-logout']";
	public static final String LOGOUT_LINK_AT_ADMIN = "xpath=//a[text()='Logout']";
	
	// Pattern Object
	public static final String DYNAMIC_PAGES_AT_MY_ACCOUNT_AREA = "Xpath=//div[contains(@class,'account-navigation')]//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX_BY_ID = "xpath=//input[@id='%s']";
	public static final String DYNAMIC_BUTTON_BY_TEXT = "xpath=//button[text()='%s']";
	public static final String DYNAMIC_DROPDOWN_BY_NAME = "xpath=//select[@name='%s']";
	public static final String DYNAMIC_RADIO_BUTTON_BY_LABEL = "xpath=//label[text()='%s']/preceding-sibling::input"; 
	public static final String DYNAMIC_CHECKBOX_BY_LABEL = "xpath=//label[contains(text(),'%s')]/following-sibling::input";
	
	//===
	// Textbox
	public static final String DYNAMIC_TEXTBOX = "//td[text()='%s']/following-sibling::td/input";
	// Textarea
	public static final String DYNAMIC_TEXTAREA = "//td[text()='%s']/following-sibling::td/textarea";
	// Radio button
	public static final String DYNAMIC_RADIO_BUTTON = "//input[@type='radio' and @value='%s']";
	// Menu link
	public static final String DYNAMIC_LINK = "//a[text()='%s']";
	// Button
	public static final String DYNAMIC_BUTTON = "//input[@value='%s']";
	// Message
	public static final String DYNAMIC_MESSAGE = "//p[@class='heading3' and text()='%s']";
	// Column value
	public static final String DYNAMIC_VALUE_BY_COLUMN_NAME = "//td[contains(text(), '%s')]/following-sibling::td";
}
