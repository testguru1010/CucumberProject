package steps;

import io.cucumber.java.en.Then;

public class LoginprodSteps {
	
	
	@Then("user validates capcha image")
	public void user_validates_capcha_image() {
	  System.out.println("User validates the captcha image");
	}
}
