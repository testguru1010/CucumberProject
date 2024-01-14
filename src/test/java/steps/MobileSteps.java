package steps;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;

import utils.SeleniumDriver;

public class MobileSteps {
	private WebDriver driver;

	public MobileSteps() {
		
	}

	@Given("user navigates to mobile test app")
	public void user_navigates_to_mobile_test_app() throws InterruptedException {

		Thread.sleep(1000);
		System.out.println("user navigates to test app website");
		System.out.println(">>>>>>>>>>here<<<<<<");
		Thread.sleep(1000);

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
		driver.get("http://www.google.com");
		Thread.sleep(1000);

	}
//
//@When("user validates the home page title")
//public void user_validates_the_home_page_title() {
//	System.out.println("user validates the home page title");
//}

//@Then("user enters {string} username")
//public void user_enters_username(String username) {
//	System.out.println("user enters "+username+" username");
//}
//
//@Then("user enters {string} password")
//public void user_enters_password(String password) {
//	System.out.println("user enters "+password+" password");
//}
//
//@Then("user clicks on the signin button")
//public void user_clicks_on_the_signin_button() {
//	System.out.println("user clicks on the signin button");
//}

}
