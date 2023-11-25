package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class Hooks {
	public WebDriver driver;

//	@BeforeAll
//	public static void beforeAll() {
//		System.out.println("@ BEFOREALL TAG >> Create DB");
//
//	}
//
//	@AfterAll
//	public static void afterAll() {
//		System.out.println("@ AFTERALL TAG >> Close DB");
//
//	}

	@Before(order = 0)
	public void setUp0() {
		System.out.println("@ BEFORE HOOK 0 >>Setup driver");
		SeleniumDriver.setUpDriver();
		

	}
//	@Before(order = 1)
//	public void setUp1() {
//		System.out.println("@ BEFORE HOOK 1 >>Launch browser");
//
//	}
//
	@After(order = 0)
	public void tearDown0(Scenario scenario) {
		System.out.println("@ AFTER HOOK 0 >>TearDown Driver");
		WebDriver driver=SeleniumDriver.getDriver();
		System.out.println(scenario.isFailed());
		if(scenario.isFailed()){
			byte[] screenshotByte = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotByte, "image/png", null);
			
		}
		
		
		SeleniumDriver.tearDown();
	}
//
//
//	@After(order = 1)
//	public void tearDown1() {
//		System.out.println("@ AFTER HOOK 1 >> Kill driver");
//	}
//
//	@BeforeStep
//	public void before_step() {
//		System.out.println("@ BEFORESTEP >> generate log");
//
//	}
//
//	@AfterStep
//	public void after_step() {
//		System.out.println("@ AFTERSTEP >> Delete log");
//	}

}
