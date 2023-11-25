package page.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPageObjects{



	//Login Page hearder  //div[@class='header']//a/img
	@FindBy(xpath = "//div[@class='header']//a/img")
	@CacheLookup
	public 	WebElement IMG_HomePg;
	
	
	//Login modal
//	
	@FindBy(how = How.NAME, using = "username")
	public WebElement INP_userName;
//	
//	@FindBy(how = How.NAME, using = "password")
//	public WebElement INP_password;
//	
//	@FindBy(how = How.XPATH, using = "//span[contains(text(),'LOG IN')]")
//	public WebElement BTN_LoginBtn;
	

}
