package nopCom.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.BaseTest;
import commons.PageGeneratorManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.CommonPageObject;
import pageObjects.UserCustomerInforPageObject;
import pageObjects.UserHomePageObject;
import pageObjects.UserLoginPageObject;

public class CommonPageSteps extends BaseTest{
	
	WebDriver driver; 
	private CommonPageObject commonPage;
	private UserCustomerInforPageObject customerInforPage;
	
	public CommonPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		commonPage = PageGeneratorManager.getCommonPageObjectPage(driver);
	}
	
	@Given("^Open \"([^\"]*)\" page$")
	public void openPage(String pageName) {

	}
	
	@When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputToTextboxWithValue(String fieldName, String inputValue) {

	}
	
	@When("^Click to \"([^\"]*)\" radio button$")
	public void clickToRadioButton(String radioButtonValue) {

	}

	@When("^Input to \"([^\"]*)\" textarea with value \"([^\"]*)\"$")
	public void inputToTextareaWithValue(String fieldName, String inputValue) {

	}
	
	@When("^Click to \"([^\"]*)\" button$")
	public void clickToButton(String buttonValue) {

	}

	@Then("^Success message displayed with \"([^\"]*)\"$")
	public void successMessageDisplayedWith(String expectedMessage) {

	}

	@Then("^The valid text displayed at \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void theValidTextDisplayedAtWithValue(String rowName, String expectedValue) {

	}


}
