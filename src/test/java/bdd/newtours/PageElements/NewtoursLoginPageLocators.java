package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursLoginPageLocators {

	// login Link
	@FindBy(xpath = "//a[contains(text(),'SIGN-ON')]")
	public WebElement lnklogin;

	@FindBy(xpath = "//input[@name='userName']")
	public WebElement lgnUsername;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement lgnPassword;

	@FindBy(xpath = "//input[@name='submit']")
	public WebElement lgnSubmit;

	@FindBy(xpath = "//b[contains(text(),'Thank you for Loggin.')]")
	public WebElement thankuText;

}
