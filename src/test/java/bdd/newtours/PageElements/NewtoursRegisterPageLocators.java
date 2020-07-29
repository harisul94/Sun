package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursRegisterPageLocators {

	//First Name locators
			@FindBy(xpath="//input[@name='firstName']")
		    public WebElement FirstName;
			
			//Last Name locators
			@FindBy(xpath="//input[@name='lastName']")
		    public WebElement LastName;
		
			//Phone locators
			@FindBy(xpath="//input[@name='phone']")
		    public WebElement phone;
			
			//Email locators
			@FindBy(xpath="//input[@id='userName']")
		    public WebElement email;

			//WebElement AddressLine1
			@FindBy(xpath="//input[@name='address1']")
		    public WebElement address1;
			
			//WebElement City
			@FindBy(xpath="//input[@name='city']")
		    public WebElement city;
			
			//WebElement State
			@FindBy(xpath="//input[@name='state']")
		    public WebElement state;
			
			//WebElement Postal
			@FindBy(xpath="//input[@name='postalCode']")
		    public WebElement postalCode;
			
			//WebElement Country
			@FindBy(xpath="//select[@name='country']")
		    public WebElement country;
			
			//WebElement UserName
			@FindBy(xpath="//input[@id='email']")
		    public WebElement UserName;
			
			//WebElement Password
			@FindBy(xpath="//input[@name='password']")
		    public WebElement Password;
			
			//WebElement confirmPassword
			@FindBy(xpath="//input[@name='confirmPassword']")
		    public WebElement confirmPassword;
			
			//WebElement Submit
			@FindBy(xpath="//input[@name='submit']")
		    public WebElement SubmitButton;
	}

