package nopCom.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.BaseTest;
import commons.DataHelper;
import commons.PageGeneratorManager;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.UserHomePageObject;
import pageObjects.UserLoginPageObject;
import pageObjects.UserRegisterPageObject;

public class RegisterPageSteps extends BaseTest{
	
	WebDriver driver;
	 UserRegisterPageObject registerPage;
	DataHelper dataFaker;
	UserHomePageObject homePage;
	UserLoginPageObject loginPage;
	static String firstName, lastName;
	String date, month, year;
	
	static String emailAddressLocal, validPasswordLocal;
	TestContext testContext;
	
	//Constructor, khi vao RegisterPageSteps class thi constructor se duoc call dau tien
	public RegisterPageSteps(TestContext testContext) {
		this.driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		homePage = PageGeneratorManager.getUserHomePage(driver);
		registerPage = PageGeneratorManager.getUserRegisterPage(driver);
	}
	
//	@Before("@nopcommerce") //khong nen bo vao Before vi Before se bi kick hoat va tao lai data moi bang cach nao do :))))
//	public void beforeClass() {  //tao pre-condition, Before se call sau khi constructor chay
//		homePage = PageGeneratorManager.getUserHomePage(driver);
//		dataFaker = DataHelper.getDataHelper();
//
//		firstName = dataFaker.getFirstName();
//		lastName = dataFaker.getLastName();
//		
//		String emailAddressTemp = dataFaker.getEmail();
//		String validPasswordTemp = dataFaker.getPassword();
//		
//		emailAddress = emailAddressTemp;
//		validPassword = validPasswordTemp;
//		
//		System.out.println("Login email in Register: " + emailAddress);
//		System.out.println("Login password in Register: " + validPassword);
//
//		date = "10";
//		month = "August";
//		year = "1998";
//	}
	
	@When("^I open Register page of nopCom$")
	public void iOpenRegisterPage() {
		log.info("Register Step 01: Navigate to 'Register' page");
		registerPage = homePage.openRegisterPage();
	}
	
	@When("^I input required fields of nopCom$")
	public UserRegisterPageObject iInputRequiredFields() {
		dataFaker = DataHelper.getDataHelper();

		firstName = dataFaker.getFirstName();
		lastName = dataFaker.getLastName();
		
//		emailAddress = dataFaker.getEmail();
//		validPassword = dataFaker.getPassword();
		
		testContext.getDataContext().setContext(Context.EMAIL_ADDRESS, dataFaker.getEmail());
		testContext.getDataContext().setContext(Context.PASSWORD, dataFaker.getPassword());
		
		emailAddressLocal = testContext.getDataContext().getContext(Context.EMAIL_ADDRESS);
		validPasswordLocal = testContext.getDataContext().getContext(Context.PASSWORD);
		
		System.out.println("Login email in Register: " + emailAddressLocal);
		System.out.println("Login password in Register: " + validPasswordLocal);

		date = "10";
		month = "August";
		year = "1998";
		
		
		log.info("Register Step 01: Navigate to 'Register' page");
		registerPage = homePage.openRegisterPage();

		registerPage.clickToRadioButtonByLabel("Female");

		log.info("Register Step 02: Enter to Firstname textbox with value is '" + firstName + "'");
		registerPage.inputToTextboxByID("FirstName", firstName);

		log.info("Register Step 03: Enter to Lastname textbox with value is '" + lastName + "'");
		registerPage.inputToTextboxByID("LastName", lastName);

		registerPage.selectToDropdownByName("DateOfBirthDay", date);
		registerPage.selectToDropdownByName("DateOfBirthMonth", month);
		registerPage.selectToDropdownByName("DateOfBirthYear", year);

		log.info("Register Step 04: Enter to Email textbox with value is '" + emailAddressLocal + "'");
		registerPage.inputToTextboxByID("Email", emailAddressLocal);

		registerPage.clickToCheckboxByLabel("Newsletter");

		log.info("Register Step 05: Enter to Password textbox with value is '" + validPasswordLocal + "'");
		registerPage.inputToTextboxByID("Password", validPasswordLocal);

		log.info("Register - Step 06: Enter to Confirm Password textbox with value is '" + validPasswordLocal + "'");
		registerPage.inputToTextboxByID("ConfirmPassword", validPasswordLocal);

		registerPage.sleepInSecond(10);
		
		return registerPage;
	}

	@When("^I click to Register button of nopCom$")
	public UserRegisterPageObject iClickToRegisterButton() {
		log.info("Register - Step 07: Click to 'Register' button");
		registerPage.clickToButtonByText("Register");
		return registerPage;
	}

	@Then("^I verify success message of nopCom$")
	public UserRegisterPageObject iVerifySuccessMessage() {
		log.info("Register - Step 08: Verify register success message is displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
		return registerPage;
	}

	@When("^I open Login page of nopCom$")
	public UserLoginPageObject iOpenLoginPage() {
		if (homePage.isLoginLinkUndisplayed()) {
			log.info("Login - Step 00: Navigate to Login page");
			homePage = registerPage.clickToLogoutLink();
			log.info("Login - Step 01: Navigate to Login page");
			loginPage = registerPage.openLoginPage();
		} else {
			log.info("Login - Step 01: Navigate to Login page");
			loginPage = registerPage.openLoginPage();
		}
		return loginPage;
	}

}
