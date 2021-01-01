package Homedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy(linkText = "My Account")
	WebElement MyAccountbutton;
	
	@FindBy(xpath = "//span[contains(text(),'Register')]")
	WebElement registerbutton;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void myaccountbtn() {
		MyAccountbutton.click();
	}
	
	public void registerbtn() {
		registerbutton.click();
	}
}

