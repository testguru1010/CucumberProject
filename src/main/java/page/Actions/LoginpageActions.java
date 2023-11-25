package page.Actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import page.Objects.LoginPageObjects;
import utils.SeleniumDriver;

public class LoginpageActions {
	
	LoginPageObjects loginPageObjects = null;
	
	public LoginpageActions() {
		this.loginPageObjects = new LoginPageObjects();
		PageFactory.initElements(SeleniumDriver.getDriver(), loginPageObjects);
	}

	public void ValidateLpage() {
		Assert.assertTrue(loginPageObjects.IMG_HomePg.isDisplayed());
		
	}

	
	
	
}
