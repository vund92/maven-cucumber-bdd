package nopCom.stepDefinitions;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import commons.BaseTest;
import commons.PageGeneratorManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import net.masterthought.cucumber.json.Hook;
import pageObjects.UserCustomerInforPageObject;
import pageObjects.UserHomePageObject;
import pageObjects.UserLoginPageObject;
import pageObjects.UserRegisterPageObject;
import commons.DataHelper;

public class NopComSteps extends BaseTest{
	
	WebDriver driver; //Neu ko dung Thread local thì comment dong nay lai cung duoc, con neu co Thread local thì phai dung toi no
//
//	private DataHelper dataFaker;
//	private UserHomePageObject homePage;
//	private UserRegisterPageObject registerPage;
//	private UserLoginPageObject loginPage;
//	private UserCustomerInforPageObject customerInforPage;
//	String firstName, lastName, emailAddress, validPassword;
//	private String date, month, year;
//	
//	@Before("@nopcommerce")
//	public void beforeClass() {
//
//		driver = getBrowserDriver("chrome", "https://demo.nopcommerce.com");
//
//		homePage = PageGeneratorManager.getUserHomePage(driver);
//		dataFaker = DataHelper.getDataHelper();
//
//		firstName = dataFaker.getFirstName();
//		lastName = dataFaker.getLastName();
//		emailAddress = dataFaker.getEmail();
//		validPassword = dataFaker.getPassword();
//
//		date = "10";
//		month = "August";
//		year = "1998";
//
//	}
//	
//	@After("@nopcommerce")
//	public void afterClass() {
//		closeBrowserDriver("local");
//	}
//	
//	@When("^I open Register page of nopCom$")
//	public void iOpenRegisterPage() {
//		log.info("Register Step 01: Navigate to 'Register' page");
//		registerPage = homePage.openRegisterPage();
//	}
//	
//	@When("^I input required fields of nopCom$")
//	public UserRegisterPageObject iInputRequiredFields() {
//		log.info("Register Step 01: Navigate to 'Register' page");
//		registerPage = homePage.openRegisterPage();
//
//		registerPage.clickToRadioButtonByLabel("Female");
//
//		log.info("Register Step 02: Enter to Firstname textbox with value is '" + firstName + "'");
//		registerPage.inputToTextboxByID("FirstName", firstName);
//
//		log.info("Register Step 03: Enter to Lastname textbox with value is '" + lastName + "'");
//		registerPage.inputToTextboxByID("LastName", lastName);
//
//		registerPage.selectToDropdownByName("DateOfBirthDay", date);
//		registerPage.selectToDropdownByName("DateOfBirthMonth", month);
//		registerPage.selectToDropdownByName("DateOfBirthYear", year);
//
//		log.info("Register Step 04: Enter to Email textbox with value is '" + emailAddress + "'");
//		registerPage.inputToTextboxByID("Email", emailAddress);
//
//		registerPage.clickToCheckboxByLabel("Newsletter");
//
//		log.info("Register Step 05: Enter to Password textbox with value is '" + validPassword + "'");
//		registerPage.inputToTextboxByID("Password", validPassword);
//
//		log.info("Register - Step 06: Enter to Confirm Password textbox with value is '" + validPassword + "'");
//		registerPage.inputToTextboxByID("ConfirmPassword", validPassword);
//
//		registerPage.sleepInSecond(10);
//		
//		return registerPage;
//	}
//
//	@When("^I click to Register button of nopCom$")
//	public UserRegisterPageObject iClickToRegisterButton() {
//		log.info("Register - Step 07: Click to 'Register' button");
//		registerPage.clickToButtonByText("Register");
//		return registerPage;
//	}
//
//	@Then("^I verify success message of nopCom$")
//	public UserRegisterPageObject iVerifySuccessMessage() {
//		log.info("Register - Step 08: Verify register success message is displayed");
//		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
//		return registerPage;
//	}
//
//	@When("^I open Login page of nopCom$")
//	public UserLoginPageObject iOpenLoginPage() {
//		if (homePage.isLoginLinkUndisplayed()) {
//			log.info("Login - Step 00: Navigate to Login page");
//			homePage = registerPage.clickToLogoutLink();
//			log.info("Login - Step 01: Navigate to Login page");
//			loginPage = registerPage.openLoginPage();
//		} else {
//			log.info("Login - Step 01: Navigate to Login page");
//			loginPage = registerPage.openLoginPage();
//		}
//		
//		return loginPage;
//	}
//
//	@When("^I input credentials of nopCom$")
//	public UserLoginPageObject iInputCredentials() {
//		log.info("Login - Step 02: Enter to Email textbox with value is '" + emailAddress + "'");
//		loginPage.inputToTextboxByID("Email", emailAddress);
//
//		log.info("Login Step 03: Enter to Password textbox with value is '" + validPassword + "'");
//		loginPage.inputToTextboxByID("Password", validPassword);
//		
//		return loginPage;
//	}
//
//	@When("^I click to Login button of nopCom$")
//	public UserHomePageObject iClickToLoginButton() {
//		log.info("Login - Step 04: Click to Login button");
//		loginPage.clickToButtonByText("Log in");
//		homePage = PageGeneratorManager.getUserHomePage(driver);
//		
//		return homePage;
//	}
//
//	@Then("^I verify My Account link is displayed of nopCom$")
//	public UserHomePageObject iVerifyMyAccountLinkIsDisplayed() {
//		log.info("Login Step 05: Verify 'My Account' link is displayed");
//		verifyTrue(homePage.isMyAccountLinkDisplayed());
//		
//		return homePage;
//	}
//
//	@When("^I open My Account page of nopCom$")
//	public UserCustomerInforPageObject iOpenMyAccountPage() {
//		log.info("Login Step 06: Navigate to 'My Account' page");
//		customerInforPage = homePage.openMyAccountPage();
//		
//		return customerInforPage;
//	}
//
//	@Then("^I verify Customer Infor page is displayed of nopCom$")
//	public UserCustomerInforPageObject iVerifyCustomerInforPageIsDisplayed() {
//		log.info("Login Step 06: Verify 'Customer Infor' page is displayed");
//		verifyTrue(customerInforPage.isCustomerInforPageDisplayed());
//		
//		return customerInforPage;
//	}
//
//	public int generateFakeNumber() {
//		Random rand = new Random();
//		return rand.nextInt(9999);
//	}

}
