package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Actions.LoginpageActions;
import page.Base.BasePage;
import page.Objects.LoginPageObjects;
import utils.SeleniumDriver;

public class LoginStagingSteps {
	LoginpageActions lpa = new LoginpageActions();
	
	LoginPageObjects loginPageObjects = null;
	
	public LoginStagingSteps() {
		this.loginPageObjects = new LoginPageObjects();
		PageFactory.initElements(SeleniumDriver.getDriver(), loginPageObjects);
	}

	@Given("user navigates to test app website in staging env")
	public void user_navigates_to_test_app_website_in_staging_env() {
		System.out.println("user navigates to test app website in staging env");
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testsiteurl"));

	}

	@When("user validates the home page title in staging env")
	public void user_validates_the_home_page_title_in_staging_env() {
		System.out.println("user validates the home page title in staging env");

		lpa.ValidateLpage();
			
	}

	@Then("user enters {string} username in staging env")
	public void user_enters_username_in_staging_env(String username) {
		System.out.println("user enters " + username + " username in staging env");
	}

	@Then("user enters {string} password in staging env")
	public void user_enters_password_in_staging_env(String password) {
		System.out.println("user enters " + password + " password in staging env");
	}

	@Then("user clicks on the signin button in staging env")
	public void user_clicks_on_the_signin_button_in_staging_env() {
		System.out.println("user clicks on the signin button in staging env");
	}

}
