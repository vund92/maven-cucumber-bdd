package facebook.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;
	
	@Given("^Open facebook application$")
	public void openFacebookApplication_() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Then("^Close application$")
	public void closeApplication_() {
		driver.quit();
	}
	
	@Before("@parameterbeforeafter, @datatable, @parameterbackground")
	public void openFacebookApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After("@parameterbeforeafter, @datatable, @parameterbackground")
	public void closeApplication () {
		driver.quit();
	}
	
	@When("^Input to Username textbox$")
	public void inputToUsernameTextbox()  {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("automationtesting@gmail.com");
	}

	@When("^Input to Password textbox$")
	public void inputToPasswordTextbox()  {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("123456");
	}

	@When("^Click to Submit button$")
	public void clickToSubmitButton()  {
		driver.findElement(By.name("login")).click();;
	}
	
	@When("^Input to Username and Password$")
	public void inputToUsernameAndPassword(DataTable arg1)  {

	}

	@When("^Input to Username textbox with \"([^\"]*)\"$")
	public void inputToUsernameTextboxWith(String arg1)  {

	}

	@When("^Input to Password textbox with \"([^\"]*)\"$")
	public void inputToPasswordTextboxWith(String arg1)  {

	}

	@When("^Input to Username textbox with automationtest@gmail\\.com$")
	public void inputToUsernameTextboxWithAutomationtestGmailCom()  {

	}

	@When("^Input to Password textbox with (\\d+)$")
	public void inputToPasswordTextboxWith(int arg1)  {

	}

	@When("^Input to Username with \"([^\"]*)\" and Password with \"([^\"]*)\"$")
	public void inputToUsernameWithAndPasswordWith(String arg1, String arg2)  {

	}
	
}
