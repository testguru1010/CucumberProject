package page.Base;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class AppFactory {
	 static AppiumDriver driver;
	public static void android_launchApp(UiAutomator2Options options) throws InterruptedException, MalformedURLException  {
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
		AppDriver.setDriver(driver);
		System.out.println("Adroid Driver is Set");
		
	}
	
	public static void ios_launchApp(XCUITestOptions options) throws InterruptedException, MalformedURLException  {
		driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), options);
		AppDriver.setDriver(driver);
		System.out.println("IOS Driver is Set");
	}

}
