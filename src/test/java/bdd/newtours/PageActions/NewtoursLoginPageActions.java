package bdd.newtours.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.newtours.PageElements.NewtoursLoginPageLocators;
import bdd.utilities.SetupDrivers;
import junit.framework.Assert;

public class NewtoursLoginPageActions {

	NewtoursLoginPageLocators newtoursLoginPageLocatorsObj;

	public NewtoursLoginPageActions() {
		newtoursLoginPageLocatorsObj = new NewtoursLoginPageLocators();
		PageFactory.initElements(SetupDrivers.driver, newtoursLoginPageLocatorsObj);
	}

	public void loadNewtourFrontPage() {
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("http://demo.guru99.com/test/newtours/index.php");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void nevigateLoginPage() {
		newtoursLoginPageLocatorsObj.lnklogin.click();
	}

	public void fillOutLoginForm() {
		newtoursLoginPageLocatorsObj.lgnUsername.clear();
		newtoursLoginPageLocatorsObj.lgnUsername.sendKeys("islamharisul");
		newtoursLoginPageLocatorsObj.lgnPassword.clear();
		newtoursLoginPageLocatorsObj.lgnPassword.sendKeys("7645");
	}

	public void submitLoginPage() {
		newtoursLoginPageLocatorsObj.lgnSubmit.click();
	}

	public void verifyLoginPage() {
		String confMsg = newtoursLoginPageLocatorsObj.thankuText.getText();
		Assert.assertEquals(confMsg, "Thank you for Loggin.");
	}

}
