package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber; //Ctrl+Shift+O

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/facebook/features", 
		glue = "facebook.stepDefinitions", 
		//dryRun = true, // la true thi no se kiem tra xem co cai nao undefined thi no bao, con false la no se chay luon va bao loi sau
		monochrome = true, 
		plugin = { "pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber_facebook.json" }, 
		snippets = SnippetType.CAMELCASE, 
		tags = {"@parameterbackground"})
public class FacebookTestRunner {

}

/**
 Giải thích 1 điểm liên quan đến Before:
 B1: Khi run file TestRunner.java này thì nó sẽ dựa vào 2 options này: 
 		features = "src/test/java/features", 
		glue = "stepDefinitions", 
		để mà chỉa vào features folder và stepDefinitions folder cùng lúc.
 B2: nó kiểm tra xem tất cả Before có trong các files mà stepDefinitions folder có.
		rồi nó xem cái Before nào chứa tags = {"@parameterbackground"}) thì nó sẽ run cái Before đó.
		Tuy nhiên, cái Before nào để trống ko chứa cái tags nào thì được mặc định là của chung và nó cũng kích hoạt lên cùng luôn.
		Có nghĩa là, có thể có nhiều hơn 1 cái Before được kích hoạt, rồi mở lên nhiều browsers cùng lúc, 
		rồi access tới những địa chỉ website (có thể trùng hoặc khác nhau) được chỉ định trong các Before đó. 
 **/

/**
Giải thích 1 điểm liên quan đến Nếu file feature chứa Background và file stepDefinition của feature đó có cả Before:
	Thì lúc này nó mở cả 2 browsers cùng lúc lên luôn nha. 1 cái trong Background và 1 cái của Before. Rồi nó sẽ thả 1 cái browser ở đó ko tắt.
	Rồi các steps còn lại nó sẽ tiến hành trên browser còn lại. 
	Nếu có After mà close browser thì nó CÓ THỂ CHỈ close được 1 cái.
* **/
