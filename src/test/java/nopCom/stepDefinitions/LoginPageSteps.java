package nopCom.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.BaseTest;
import commons.PageGeneratorManager;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.UserCustomerInforPageObject;
import pageObjects.UserHomePageObject;
import pageObjects.UserLoginPageObject;

public class LoginPageSteps extends BaseTest{
	
	WebDriver driver; //Neu ko dung Thread local thì comment dong nay lai cung duoc, con neu co Thread local thì phai dung toi no
	UserLoginPageObject loginPage;
	UserCustomerInforPageObject customerInforPage;
	UserHomePageObject homePage;
	
	String emailAddressLocal, validPasswordLocal;
	TestContext testContext;
	
	public LoginPageSteps(TestContext testContext) {
		this.driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		homePage = PageGeneratorManager.getUserHomePage(driver);
		loginPage = PageGeneratorManager.getUserLoginPage(driver);
	}

	@When("^I input credentials of nopCom$")
	public UserLoginPageObject iInputCredentials() {
//		String emailAddress = RegisterPageSteps.emailAddress;
//		String validPassword = RegisterPageSteps.validPassword;
		
		emailAddressLocal = testContext.getDataContext().getContext(Context.EMAIL_ADDRESS);
		validPasswordLocal = testContext.getDataContext().getContext(Context.PASSWORD);
		
		System.out.println("Login email in Login: " + emailAddressLocal);
		System.out.println("Login password in Login: " + validPasswordLocal);
		
		log.info("Login - Step 02: Enter to Email textbox with value is '" + emailAddressLocal + "'");
		loginPage.inputToTextboxByID("Email", emailAddressLocal);
		
		log.info("Login Step 03: Enter to Password textbox with value is '" + validPasswordLocal + "'");
		loginPage.inputToTextboxByID("Password", validPasswordLocal);
		
		return loginPage;
	}

	@When("^I click to Login button of nopCom$")
	public UserHomePageObject iClickToLoginButton() {
		log.info("Login - Step 04: Click to Login button");
		loginPage.clickToButtonByText("Log in");
		homePage = PageGeneratorManager.getUserHomePage(driver);
		
		return homePage;
	}

	@Then("^I verify My Account link is displayed of nopCom$")
	public UserHomePageObject iVerifyMyAccountLinkIsDisplayed() {
		log.info("Login Step 05: Verify 'My Account' link is displayed");
		verifyTrue(homePage.isMyAccountLinkDisplayed());
		
		return homePage;
	}

	@When("^I open My Account page of nopCom$")
	public UserCustomerInforPageObject iOpenMyAccountPage() {
		log.info("Login Step 06: Navigate to 'My Account' page");
		customerInforPage = homePage.openMyAccountPage();
		
		return customerInforPage;
	}

	@Then("^I verify Customer Infor page is displayed of nopCom$")
	public UserCustomerInforPageObject iVerifyCustomerInforPageIsDisplayed() {
		log.info("Login Step 06: Verify 'Customer Infor' page is displayed");
		verifyTrue(customerInforPage.isCustomerInforPageDisplayed());
		
		return customerInforPage;
	}
}
