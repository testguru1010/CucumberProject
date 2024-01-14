package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (features="src/test/resources/Features/Mobile.feature", glue={"steps"}
,plugin= {"html:target/cucumber-reports/cucumber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
,	monochrome = true,
// dryRun =true,
tags = "@Mob")
public class MobileFeatureRunner extends AbstractTestNGCucumberTests {
	
	
	
	
	
	

}
