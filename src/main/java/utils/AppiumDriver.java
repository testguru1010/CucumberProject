package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDriver {
	private static AppiumDriver appiumdriver;
	
	private AppiumDriver() throws MalformedURLException{
	
	
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone64_x86_64");
//	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//	cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	cap.setCapability(MobileCapabilityType.APP, "/Users/haz78/Downloads/proverbial_android.apk/");
//	cap.setCapability("APP", System.getProperty("user.dir") + "//AppApk//com.ryder.rydergyde.qa (7).apk");
//	cap.setCapability(MobileCapability.,"TestMobile");
//	cap.setCapability("deviceName","emulator-5554");
//	cap.setCapability("deviceName","Android");
//	 cap.setCapability("browserName", "Chrome");
////    
//    cap.setCapability("automationName", "uiautomator2");
//    cap.setCapability("APP", System.getProperty("user.dir")+"//AppApk//com.ryder.rydergyde.qa (7).apk");
//    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//    driver.get("http://google.com");
//    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 URL url = new URL("http://127.0.0.1:4723/wd/hub");
	 AndroidDriver driver = new AndroidDriver(url, cap);
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.get("http://www.google.com");

}
	public static void setUpAppiumDriver() throws MalformedURLException {
		if (Objects.isNull(appiumdriver))
			appiumdriver = new AppiumDriver();
	}
}





