package Homedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountType {
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@class='col__12-12 default-box default-border selected-card']")
	WebElement PersonalAccount;
	
	@FindBy(xpath = "//*[@class='col__12-12 default-box default-border']")
	WebElement ProAccount;
	
	@FindBy(xpath = "//span[contains(text(),'Select & Continue')]")
	WebElement Selectbutton;
	
	public AccountType(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Personal() {
		PersonalAccount.click();
	}
	
	public void Pro() {
		ProAccount.click();
	}
	public void Selection() {
		Selectbutton.click();
	}
}
