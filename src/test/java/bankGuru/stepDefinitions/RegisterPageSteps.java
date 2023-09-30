package bankGuru.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commons.PageGeneratorManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.UserRegisterPageObject;

public class RegisterPageSteps {

	WebDriver driver;
	UserRegisterPageObject registerPage;
	
	public RegisterPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		registerPage = PageGeneratorManager.getUserRegisterPage(driver);
	}
	
//	@Given("^Open Register page$")
//	public void openBankGuruApplication_() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//	
//	@Then("^Close application$")
//	public void closeApplication_() {
//		driver.quit();
//	}
//	
//	@Before("@register_login")
//	public void openBankGuruApplication() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//	
//	@After("@register_login")
//	public void closeApplication () {
//		driver.quit();
//	}
//	
//	@When("^Input to Email textbox$")
//	public void inputToEmailTextbox() {
//		
//	}
//
//	@When("^Click to Submit$")
//	public void clickToSubmit() {
//		
//	}
//
//	@Then("^Get User and password infor$")
//	public void getUserAndPasswordInfor() {
//		
//	}
//
//	@When("^Back to Login page$")
//	public void backToLoginPage() {
//		
//	}

}
