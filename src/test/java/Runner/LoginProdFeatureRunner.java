package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (features="src/test/resources/Features/Loginproduction.feature", glue={"steps"}
,plugin= {"html:target/cucumber-reports/cucumber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class LoginProdFeatureRunner extends AbstractTestNGCucumberTests {
	
	
	
	
	
	

}
