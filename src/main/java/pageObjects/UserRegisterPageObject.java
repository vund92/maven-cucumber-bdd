package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.UserHomePageUI;
import pageUIs.UserRegisterPageUI;

public class UserRegisterPageObject extends BasePage {
	
	private WebDriver driver;

	public UserRegisterPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void clickToRegisterButton() {
		waitForElementClickable(UserRegisterPageUI.REGISTER_BUTTON);
		clickToElement(UserRegisterPageUI.REGISTER_BUTTON);
	}

	public String getErrorMessageAtFirstnameTextbox() {
		waitForElementVisible(UserRegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtLastnameTextbox() {
		waitForElementVisible(UserRegisterPageUI.LAST_NAME_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.LAST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtEmailTextbox() {
		waitForElementVisible(UserRegisterPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getErrorMessageAtPasswordTextbox() {
		waitForElementVisible(UserRegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.PASSWORD_ERROR_MESSAGE);
	}

	public String getErrorMessageAtConfirmPasswordTextbox() {
		waitForElementVisible(UserRegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
	}

	public void inputToFirstnameTextbox(String firstName) {
		waitForElementVisible(UserRegisterPageUI.FIRST_NAME_TEXTBOX);
		sendkeyToElement(UserRegisterPageUI.FIRST_NAME_TEXTBOX, firstName);
	}

	public void inputToLastnameTextbox(String lastName) {
		waitForElementVisible(UserRegisterPageUI.LAST_NAME_TEXTBOX);
		sendkeyToElement(UserRegisterPageUI.LAST_NAME_TEXTBOX, lastName);
		
	}
	
	public void inputToEmailTextbox(String emailAddress) {
		waitForElementVisible(UserRegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(UserRegisterPageUI.EMAIL_TEXTBOX, emailAddress);
	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(UserRegisterPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(UserRegisterPageUI.PASSWORD_TEXTBOX, password);
	}

	public void inputToConfirmPasswordTextbox(String confirmPassword) {
		waitForElementVisible(UserRegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(UserRegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, confirmPassword);
	}

	public String getRegisterSuccessMessage() {
		waitForElementVisible(UserRegisterPageUI.REGISTER_SUCCESS_MESSAGE);
		return getElementText(UserRegisterPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public UserHomePageObject clickToLogoutLink() {
		waitForElementClickable(UserRegisterPageUI.LOGOUT_LINK);
		clickToElement(UserRegisterPageUI.LOGOUT_LINK);
		//Cach 2
		//return new HomePageObject(driver);
		
		//Cach 3
		return PageGeneratorManager.getUserHomePage(driver);
	}

	public String getErrorExistingEmailMessage() {
		waitForElementVisible(UserRegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
	}
	
	public boolean isLogoutLinkDisplayed() {
		waitForElementVisible(UserRegisterPageUI.LOGOUT_LINK);
		return isElementDisplayed(UserRegisterPageUI.LOGOUT_LINK);
	}

	public UserLoginPageObject openLoginPage() {
		waitForElementClickable(UserRegisterPageUI.LOGIN_LINK);
		clickToElement(UserRegisterPageUI.LOGIN_LINK);
		return PageGeneratorManager.getUserLoginPage(driver);
	}

	
}
