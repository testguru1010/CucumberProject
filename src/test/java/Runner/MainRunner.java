package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (features={"src/test/resources/Features/Login.feature",
		"src/test/resources/Features/LoginStaging.feature","src/test/resources/Features/Loginproduction.feature"}, glue= {"steps"}, tags = "@STG or @PRD"
,plugin= {"html:target/cucumber-reports/cucumber-html-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class MainRunner extends AbstractTestNGCucumberTests {
	
	
	
	
	
	

}
