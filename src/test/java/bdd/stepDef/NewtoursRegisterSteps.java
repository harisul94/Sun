package bdd.stepDef;

import bdd.newtours.PageActions.NewtoursHomePageActions;
import bdd.newtours.PageActions.NewtoursRegisterConfirmPageActions;
import bdd.newtours.PageActions.NewtoursRegisterPageActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewtoursRegisterSteps {

	NewtoursHomePageActions NewtoursHomePageActionsObj = new NewtoursHomePageActions();
	NewtoursRegisterPageActions NewtoursRegisterPageActionsObj = new NewtoursRegisterPageActions();
	NewtoursRegisterConfirmPageActions NewtoursRegisterConfirmPageActionsObj = new NewtoursRegisterConfirmPageActions();

	@Given("^Browse to Newtours homepage$")
	public void browse_to_Newtours_homepage() throws Throwable {
		NewtoursHomePageActionsObj.loadNewtourHomepage();
	}

	@When("^Navigate to Register page$")
	public void navigate_to_Register_page() throws Throwable {
		NewtoursHomePageActionsObj.navigateRegisterPage();
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {
		NewtoursRegisterPageActionsObj.fillContactInfo();
		NewtoursRegisterPageActionsObj.fillMailingInfo();
		

	}

	@When("^Complete creating account with \"([^\"]*)\" with \"([^\"]*)\"$")
	public void complete_creating_account_with_with(String UserName, String Password) throws Throwable {
		NewtoursRegisterPageActionsObj.fillUserInfo(UserName, Password);
		NewtoursRegisterPageActionsObj.submitRegForm();
		

	}

	@Then("^Verify account created successfully$")
	public void verify_account_created_successfully() throws Throwable {
		NewtoursRegisterConfirmPageActionsObj.verifyThankyouRegister();

	}

}
