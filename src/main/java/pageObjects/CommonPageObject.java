package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.CommonPageUI_NopCommerce;

public class CommonPageObject extends BasePage{
	
	private WebDriver driver;

	public CommonPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public BasePage openPagesAtMyAccountByName(String pageName) {
		waitForElementClickable(CommonPageUI_NopCommerce.DYNAMIC_PAGES_AT_MY_ACCOUNT_AREA, pageName);
		clickToElement(CommonPageUI_NopCommerce.DYNAMIC_PAGES_AT_MY_ACCOUNT_AREA, pageName);
		switch (pageName) {
		case "Customer info":
			return PageGeneratorManager.getUserCustomerInforPage(driver);
		case "Addresses":
			return PageGeneratorManager.getUserAddressPage(driver);
		case "My product reviews":
			return PageGeneratorManager.getUserMyProductReviewPage(driver);
		case "Reward points":
			return PageGeneratorManager.getUserRewardPointPage(driver);
		default:
		}
		throw new RuntimeException("Invalid page name at My Account area.");
	}

	// Pattern Object
	public void openPagesAtMyAccountByPageName(String pageName) {
		waitForElementClickable(CommonPageUI_NopCommerce.DYNAMIC_PAGES_AT_MY_ACCOUNT_AREA, pageName);
		clickToElement(CommonPageUI_NopCommerce.DYNAMIC_PAGES_AT_MY_ACCOUNT_AREA, pageName);
	}

	/**
	 * Enter to dynamic Textbox by ID
	 * <ul>
	 * <li>Rest Parameter</li>
	 * <li>Textbox by ID</li>
	 * </ul>
	 *
	 * @author Dam DM
	 * @param driver
	 * @param textboxID
	 * @param value
	 */
	public void inputToTextboxByID(String textboxID, String value) {
		waitForAllElementVisible(CommonPageUI_NopCommerce.DYNAMIC_TEXTBOX_BY_ID, textboxID);
		sendkeyToElement(CommonPageUI_NopCommerce.DYNAMIC_TEXTBOX_BY_ID, value, textboxID);
	}

	/**
	 * Click to dynamic Button by text
	 *
	 * @author Dam DM
	 * @param driver
	 * @param buttonText
	 */
	public void clickToButtonByText(String buttonText) {
		waitForElementClickable(CommonPageUI_NopCommerce.DYNAMIC_BUTTON_BY_TEXT, buttonText);
		clickToElement(CommonPageUI_NopCommerce.DYNAMIC_BUTTON_BY_TEXT, buttonText);
	}

	/**
	 * Select item in dropdown by Name attribute
	 *
	 * @param driver
	 * @param dropdownAttributeName
	 * @param itemValue
	 */
	public void selectToDropdownByName(String dropdownAttributeName, String itemValue) {
		waitForElementClickable(CommonPageUI_NopCommerce.DYNAMIC_DROPDOWN_BY_NAME, dropdownAttributeName);
		selectItemInDefaultDropdown(CommonPageUI_NopCommerce.DYNAMIC_DROPDOWN_BY_NAME, itemValue,
				dropdownAttributeName);
	}

	/**
	 * Click to dynamic radio button by label name
	 * 
	 * @param driver
	 * @param radioButtonLabelName
	 */
	public void clickToRadioButtonByLabel(String radioButtonLabelName) {
		waitForElementClickable(CommonPageUI_NopCommerce.DYNAMIC_RADIO_BUTTON_BY_LABEL, radioButtonLabelName);
		checkToDefaultCheckboxOrRadio(CommonPageUI_NopCommerce.DYNAMIC_RADIO_BUTTON_BY_LABEL,
				radioButtonLabelName);
	}

	/**
	 * Click to dynamic checkbox by label name
	 *
	 * @param driver
	 * @param checkboxLabelName
	 */
	public void clickToCheckboxByLabel(String checkboxLabelName) {
		waitForElementClickable(CommonPageUI_NopCommerce.DYNAMIC_CHECKBOX_BY_LABEL, checkboxLabelName);
		checkToDefaultCheckboxOrRadio(CommonPageUI_NopCommerce.DYNAMIC_CHECKBOX_BY_LABEL, checkboxLabelName);
	}

	/**
	 * Get value in textbox by textboxID
	 *
	 * @param driver
	 * @param textboxID
	 * @return
	 */
	public String getTextboxValueByID(String textboxID) {
		waitForElementVisible(CommonPageUI_NopCommerce.DYNAMIC_TEXTBOX_BY_ID, textboxID);
		return getElementAttribute(CommonPageUI_NopCommerce.DYNAMIC_TEXTBOX_BY_ID, "value", textboxID);
	}

	// Level_08_Switch_Role
	public UserHomePageObject clickToLogoutLinkAtUserPage(WebDriver driver) {
		waitForElementClickable(CommonPageUI_NopCommerce.LOGOUT_LINK_AT_USER);
		clickToElement(CommonPageUI_NopCommerce.LOGOUT_LINK_AT_USER);
		return PageGeneratorManager.getUserHomePage(driver);
	}

	public AdminLoginPageObject clickToLogoutLinkAtAdminPage(WebDriver driver) {
		waitForElementClickable(CommonPageUI_NopCommerce.LOGOUT_LINK_AT_ADMIN);
		clickToElement(CommonPageUI_NopCommerce.LOGOUT_LINK_AT_ADMIN);
		return PageGeneratorManager.getAdminLoginPage(driver);
	}
	
	//============================================================================
	

//	public void inputToDynamicTextbox (String fieldName, String inputValue) {
//		waitForElementVisible(CommonPageUI_NopCommerce.DYNAMIC_TEXTBOX, fieldName); 
//		if (fieldName.equals("Date of Birth")) {
//		removeAttributeInDOM(CommonPageUI_NopCommerce.DYNAMIC_TEXTBOX, "type", fieldName); 
//		sleepInSeconds(1);
//		}
//		sendkeyToElement(driver, CommonPageUI_NopCommerce.DYNAMIC_TEXTBOX, inputValue, fieldName);
//	}
//	public void inputToDynamicTextArea (WebDriver driver, String fieldName, String inputValue) {}
//	public void clickToDynamicButton (WebDriver driver, String buttonValue) {}
//	public void clickToDynamicRadioButton (WebDriver driver, String radioButtonValue) {}
//	public void clickToDynamicLink(WebDriver driver, String linkPageName) {}
//	public boolean isDynamicMessageDisplayed (WebDriver driver, String messageText) { return false;} 
//	public String getDynamicValueByRowName (WebDriver driver, String rowName) {
//		waitForElementVisible (driver, CommonPageUI_NopCommerce.DYNAMIC_VALUE_BY_COLUMN_NAME, rowName); 
//		return getElementText (driver, CommonPageUI_NopCommerce.DYNAMIC_VALUE_BY_COLUMN_NAME, rowName);
//	}
	

}
