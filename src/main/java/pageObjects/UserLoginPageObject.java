package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.UserHomePageUI;
import pageUIs.UserLoginPageUI;

public class UserLoginPageObject extends BasePage {
	
	private WebDriver driver; 
	
	public UserLoginPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public UserHomePageObject clickToLoginButton() {
		waitForElementClickable(UserLoginPageUI.LOGIN_BUTTON);
		clickToElement(UserLoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getUserHomePage(driver);
	}

	public void inputToEmailTextbox(String invalidEmail) {
		waitForElementVisible(UserLoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(UserLoginPageUI.EMAIL_TEXTBOX, invalidEmail);
		
	}
	
	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(UserLoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(UserLoginPageUI.PASSWORD_TEXTBOX, password);
		
	}
	
	public String getErrorMessageUnsuccessfully() {
		waitForElementVisible(UserLoginPageUI.UNSUCCESSFUL_ERROR_MESSAGE);
		return getElementText(UserLoginPageUI.UNSUCCESSFUL_ERROR_MESSAGE);
	}

	public String getErrorMessageAtEmailTextbox() {
		waitForElementVisible(UserLoginPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(UserLoginPageUI.EMAIL_ERROR_MESSAGE);
	}
	
	public UserHomePageObject loginAsUser(String emailAddress, String password) {
		inputToEmailTextbox(emailAddress);
		inputToPasswordTextbox(password);
		return clickToLoginButton();
	}
	
}
