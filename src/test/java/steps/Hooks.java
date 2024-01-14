package steps;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
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

	@Before()//("@Web")
	public void setUp0() {
		System.out.println("@ BEFORE HOOK 0 >>Setup driver");
		SeleniumDriver.setUpDriver();
//		AppiumDriver.builder();

	}

//	@SuppressWarnings("deprecation")
//	@Before()//("@Mob")
//	public static void setUpAppium() throws MalformedURLException {
//		System.out.println("@ BEFORE HOOK 1 >>Launch Mob APP");

//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
//		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");
////		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone64_x86_64");
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
//		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
//		cap.setCapability(MobileCapabilityType.APP, "/Users/haz78/Downloads/proverbial_android.apk/");
////		cap.setCapability("APP", System.getProperty("user.dir") + "//AppApk//com.ryder.rydergyde.qa (7).apk");
////		cap.setCapability(MobileCapability.,"TestMobile");
////		cap.setCapability("deviceName","emulator-5554");
////		cap.setCapability("deviceName","Android");
////		 cap.setCapability("browserName", "Chrome");
//////        
////        cap.setCapability("automationName", "uiautomator2");
////        cap.setCapability("APP", System.getProperty("user.dir")+"//AppApk//com.ryder.rydergyde.qa (7).apk");
////        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
////        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
////        driver.get("http://google.com");
////        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//
//		AppiumDriver<MobileElement> driver = null;
//		try {
//			driver = new AndroidDriver<>(new URL("http://locathost:4732/wd/hub"), cap);
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		}

//
	@After(order = 0)
	public void tearDown0(Scenario scenario) {
		System.out.println("@ AFTER HOOK 0 >>TearDown Driver");
		WebDriver driver = SeleniumDriver.getDriver();
		System.out.println(scenario.isFailed());
		if (scenario.isFailed()) {
			byte[] screenshotByte = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
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
