package bdd.newtours.PageActions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import bdd.newtours.PageElements.NewtoursRegisterConfirmPageLocators;
import bdd.utilities.SetupDrivers;
import junit.framework.Assert;

public class NewtoursRegisterConfirmPageActions {

	NewtoursRegisterConfirmPageLocators registerConfrPageLocatorsobj;

	public NewtoursRegisterConfirmPageActions() {
		registerConfrPageLocatorsobj = new NewtoursRegisterConfirmPageLocators();
		PageFactory.initElements(SetupDrivers.driver, registerConfrPageLocatorsobj);
	}

	public void verifyThankyouRegister() throws IOException {
		String confMsg = registerConfrPageLocatorsobj.TxtThankYou.getText();
		Assert.assertEquals(confMsg,
				"Thank you for registering. You may now sign-in using the user name and password you've just entered.");
//		File screenshot = ((TakesScreenshot) SetupDrivers.driver).getScreenshotAs(OutputType.);
//		FileUtils.copyFile(screenshot, new File("C:\\Users\\islam\\Screenshotcapture.jpg"));

		File screenshot = ((TakesScreenshot) SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\islam\\Screenshot\\Screenshotcapture.jpg"));
	}
}