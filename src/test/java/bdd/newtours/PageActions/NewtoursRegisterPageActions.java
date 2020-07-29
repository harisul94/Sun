package bdd.newtours.PageActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bdd.newtours.PageElements.NewtoursRegisterPageLocators;
import bdd.utilities.ReadExcelSheetData;
import bdd.utilities.SetupDrivers;

public class NewtoursRegisterPageActions {

	NewtoursRegisterPageLocators NewtoursRegisterPageLocatorsObj;

	public NewtoursRegisterPageActions() {
		NewtoursRegisterPageLocatorsObj = new NewtoursRegisterPageLocators();
		PageFactory.initElements(SetupDrivers.driver, NewtoursRegisterPageLocatorsObj);
	}

	public void fillContactInfo() throws IOException {
		NewtoursRegisterPageLocatorsObj.FirstName.clear();
		NewtoursRegisterPageLocatorsObj.FirstName.sendKeys(ReadExcelSheetData.getMapData("FirstNameXl"));
		NewtoursRegisterPageLocatorsObj.LastName.clear();
		NewtoursRegisterPageLocatorsObj.LastName.sendKeys(ReadExcelSheetData.getMapData("LastNameXl"));
		NewtoursRegisterPageLocatorsObj.phone.clear();
		NewtoursRegisterPageLocatorsObj.phone.sendKeys(ReadExcelSheetData.getMapData("PhoneXl"));
		NewtoursRegisterPageLocatorsObj.email.clear();
		NewtoursRegisterPageLocatorsObj.email.sendKeys(ReadExcelSheetData.getMapData("Email"));
	}

	public void fillMailingInfo() {

		NewtoursRegisterPageLocatorsObj.address1.sendKeys("41-58, 71st street");
		NewtoursRegisterPageLocatorsObj.city.sendKeys("Woodside");
		NewtoursRegisterPageLocatorsObj.state.sendKeys("NY");
		NewtoursRegisterPageLocatorsObj.postalCode.sendKeys("11377");

		Select mydrpdwn = new Select(NewtoursRegisterPageLocatorsObj.country);
		mydrpdwn.selectByVisibleText("UNITED STATES");
	}

	public void fillUserInfo(String UserName, String Password) {
		NewtoursRegisterPageLocatorsObj.UserName.sendKeys(UserName);
		NewtoursRegisterPageLocatorsObj.Password.sendKeys(Password);
		NewtoursRegisterPageLocatorsObj.confirmPassword.sendKeys(Password);
	}

	public void submitRegForm() {
		NewtoursRegisterPageLocatorsObj.SubmitButton.click();
	}

}
