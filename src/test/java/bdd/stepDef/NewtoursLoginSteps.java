package bdd.stepDef;

import bdd.newtours.PageActions.NewtoursLoginPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewtoursLoginSteps {

	NewtoursLoginPageActions newtoursLoginPageActionsObj = new NewtoursLoginPageActions();

	@Given("^Land to Newtours homepage$")
	public void land_to_Newtours_homepage() throws Throwable {
		newtoursLoginPageActionsObj.loadNewtourFrontPage();
	}

	@When("^Navigate to Sign-On page$")
	public void navigate_to_Sign_On_page() throws Throwable {
		newtoursLoginPageActionsObj.nevigateLoginPage();
	}

	@When("^Fill login form with valid username and password$")
	public void fill_login_form_with_valid_username_and_password() throws Throwable {
		newtoursLoginPageActionsObj.fillOutLoginForm();
	}

	@When("^Click login button$")
	public void click_login_button() throws Throwable {
		newtoursLoginPageActionsObj.submitLoginPage();
	}

	@Then("^Verify login successfully$")
	public void verify_login_successfully() throws Throwable {
		newtoursLoginPageActionsObj.verifyLoginPage();
	}

}
