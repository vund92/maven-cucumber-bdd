package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber; //Ctrl+Shift+O

@RunWith(Cucumber.class)
@CucumberOptions(
		//Duong dan toi file feature
		features = "src/test/java/bank/features", // theo path (dau slash)
		
		//Tim den package step def
		glue = "bank.stepDefinitions", //theo root (dau cham)
		
		//dryRun = true, // la true thi no se kiem tra xem co cai nao undefined thi no bao, con false la no se chay luon va bao loi sau
		monochrome = true, 
		plugin = { "pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber_bankguru.json" }, 
		snippets = SnippetType.CAMELCASE, 
		tags = {"@register_login"})
public class BankGuruTestRunner {

}
