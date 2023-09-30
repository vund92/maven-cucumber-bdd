package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.UserHomePageUI;
import pageUIs.UserRegisterPageUI;

public class UserHomePageObject extends BasePage {
	
	private WebDriver driver; 
	
	public UserHomePageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public UserRegisterPageObject openRegisterPage() {
		waitForElementClickable(UserHomePageUI.REGISTER_LINK);
		clickToElement(UserHomePageUI.REGISTER_LINK);
		return PageGeneratorManager.getUserRegisterPage(driver);
	}

	public boolean isMyAccountLinkDisplayed() {
		waitForElementVisible(UserHomePageUI.MY_ACCOUNT_LINK);
		return isElementDisplayed(UserHomePageUI.MY_ACCOUNT_LINK);
	}

	public UserCustomerInforPageObject openMyAccountPage() {
		waitForElementClickable(UserHomePageUI.MY_ACCOUNT_LINK);
		clickToElement(UserHomePageUI.MY_ACCOUNT_LINK);
		return PageGeneratorManager.getUserCustomerInforPage(driver);
	}
	
	public boolean isLoginLinkUndisplayed() {
		waitForElementVisible(UserRegisterPageUI.LOGIN_LINK);
		return isElementUndisplayed(UserRegisterPageUI.LOGIN_LINK);
	}
	
	public boolean isWelcomeMessageDisplayed() {
		waitForElementVisible(UserHomePageUI.WELCOME_MESSAGE);
		return isElementDisplayed(UserHomePageUI.WELCOME_MESSAGE);
	}

}
