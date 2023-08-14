package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.UserCustomerInforPageUI;
import pageUIs.UserHomePageUI;

public class UserCustomerInforPageObject extends BasePage {
	
	private WebDriver driver; 
	
	public UserCustomerInforPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean isCustomerInforPageDisplayed() {
		waitForAllElementVisible(UserCustomerInforPageUI.CUSTOMER_INFOR_HEADER);
		return isElementDisplayed(UserCustomerInforPageUI.CUSTOMER_INFOR_HEADER);
	}

//	public AddressPageObject openAddressPage() {
//		waitForElementClickable(driver, CustomerInforPageUI.ADDRESS_LINK);
//		clickToElement(driver, CustomerInforPageUI.ADDRESS_LINK);
//		return PageGeneratorManager.getAddressPage(driver);
//	}
	
	

}
