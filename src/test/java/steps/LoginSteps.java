package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


@Given("user navigates to test app website")
public void user_navigates_to_test_app_website() {
  System.out.println("user navigates to test app website");
}

@When("user validates the home page title")
public void user_validates_the_home_page_title() {
	System.out.println("user validates the home page title");
}

@Then("user enters {string} username")
public void user_enters_username(String username) {
	System.out.println("user enters "+username+" username");
}

@Then("user enters {string} password")
public void user_enters_password(String password) {
	System.out.println("user enters "+password+" password");
}

@Then("user clicks on the signin button")
public void user_clicks_on_the_signin_button() {
	System.out.println("user clicks on the signin button");
}


	
	
}
