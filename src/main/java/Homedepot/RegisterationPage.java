package Homedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterationPage {
	public WebDriver driver;
	@FindBy(id = "email")
	WebElement emailfield;
	
	@FindBy(name = "password")
	WebElement passwordfield;
	
	@FindBy(name = "zipcode")
	WebElement zipcodefield;
	
	@FindBy(name = "phone")
	WebElement phonefield;
	
	@FindBy(xpath = "(//label[@class='checkbox-btn__label-test u__text-align--left'])[1]")
	WebElement Keepmesignin;
	
	@FindBy(xpath = "(//label[@class='checkbox-btn__label-test u__text-align--left'])[2]")
	WebElement Verifyphone;
	
	@FindBy(xpath = "//span[contains(text(),'Sign In')]")
	WebElement Signinbutton;
	
	public RegisterationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

public void emailofinput() {
	emailfield.sendKeys("Sam@gmail.com");
	}

public void password() {
	passwordfield.sendKeys("Virginia");
}
public void postalcode() {
	zipcodefield.sendKeys("77082");
}
public void phone() {
	phonefield.sendKeys("8323842975");
}
public void Keepsigned() {
	Keepmesignin.click();
}
public void phoneverifying() {
	Verifyphone.click();
}
public void singbutton() {
	Signinbutton.click();
}
}
