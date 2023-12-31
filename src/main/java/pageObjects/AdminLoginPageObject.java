package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.AdminLoginPageUI;
import pageUIs.UserHomePageUI;
import pageUIs.UserLoginPageUI;

public class AdminLoginPageObject extends BasePage {
	
	private WebDriver driver; 
	
	public AdminLoginPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void inputToUsernameTextbox(String emailAddress) {
		waitForElementVisible(AdminLoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(AdminLoginPageUI.EMAIL_TEXTBOX, emailAddress);
	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(AdminLoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(AdminLoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public AdminDashboardPageObject clickToLoginButton() {
		waitForElementClickable(AdminLoginPageUI.LOGIN_BUTTON);
		clickToElement(AdminLoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getAdminDashboardPage(driver);
	}
	
	public AdminDashboardPageObject loginAsAdmin(String emailAddress, String password) {
		inputToUsernameTextbox(emailAddress);
		inputToPasswordTextbox(password);
		return clickToLoginButton();
	}
	
}
