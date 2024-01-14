import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Rough {
	
	public static AppiumDriverLocalService service;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		AndroidDriver driver ;
		
		
			try {
				service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\haz78\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")) 
				.withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		service.start();
		
		//		-------------------------Samsung/Android-------------------
		/*UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");// optional
		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);// optional
		options.setDeviceName("ce07171798059639027e");
		options.setPlatformVersion("9");
		options.noReset();
		options.setAutoGrantPermissions(true);
		options.setAppPackage("com.android.chrome");// to launch device google browser
		options.setAppActivity("com.google.android.apps.chrome.Main");// to launch device google browser     */
		//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//		options.withBrowserName("Chrome");
//		options.setApp("/Users/haz78/Downloads/proverbial_android.apk");
//		Options.setApp(System.getProperty("user.dir")+"/apps//proverbial_android.apk");
//		options.setChromedriverDisableBuildCheck(false);
//		options.chromedriverUseSystemExecutable();
//		options.setIsHeadless(false);

		// ---------------------------- Ammulator Pixel// -------------------------------------------------
		UiAutomator2Options options = new UiAutomator2Options();
		
		options.setPlatformName("Android");// optional
		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);// optional
		options.setDeviceName("emulator-5554");
		options.setPlatformVersion("14");
		options.noReset();
		options.setAutoGrantPermissions(true);
//		options.setAppPackage("com.android.chrome");// to launch device google browser
//		options.setAppActivity("com.google.android.apps.chrome.Main");// to launch device google browser
		options.setApp(System.getProperty("user.dir")+"/src/main/resources/App/proverbial_android.apk");
//		options.setApp("/Users/haz78/Downloads/proverbial_android.apk");
		
		
		
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("appium:deviceName","sdk_gphone64_x86_64");
//		capabilities.setCapability("platformName","android");
//		capabilities.setCapability("appium:platformVersion","14");
//		capabilities.setCapability("appium:automationName","UiAutomator2");
//		capabilities.setCapability("appium:browserName", "Chrome");
////		capabilities.setCapability("appium:noReset", true);
////		
//		capabilities.setCapability("appium:app", "/Users/haz78/Downloads/proverbial_android.apk");

//		capabilities.setCapability("app", "app.getAbsolutePath()");
//		AndroidDriver driver =new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
//		return driver;

//---------------------------- Pixel-------------------------------------------------	
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("appium:noReset", true);
//		capabilities.setCapability("appium:browserName", "Chrome");
//		capabilities.setCapability("appium:deviceName","sdk_gphone64_x86_64");
//		capabilities.setCapability("platformName","android");
//		capabilities.setCapability("appium:platformVersion","14");
//		capabilities.setCapability("appium:automationName","UiAutomator2");		

//		capabilities.setCapability("appium:app", "/Users/haz78/Downloads/chrome-119.0.6045.163.apk");

//		-----------------------------Pixel GooGle -------------------------------------

//		capabilities.setCapability("browserName", "chrome");
//		capabilities.setCapability("browserName", "chrome");
//		cap.setCapability("PLATFORM_NAME", "android");
//		cap.setCapability("DEVICE_NAME", "sdk_gphone64_x86_64");
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
//		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

	

		

			driver = new AndroidDriver(new URL("http://localhost:4723"), options);
	

		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

		driver.get("https://www.google.com");

		Thread.sleep(10000);

		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='XSqSsc']")).sendKeys("hello");

		Thread.sleep(10000);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		driver.quit();
		service.stop();
	}

}
