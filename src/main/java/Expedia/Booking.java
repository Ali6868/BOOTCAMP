package Expedia;

import java.awt.Window;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Booking {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/arash/Desktop/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://expedia.com");
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
		driver.findElement(By.xpath("//a[@href='?pwaLob=wizard-flight-pwa']")).click();
		driver.findElement(By.xpath("//*[@aria-label='Leaving from']")).sendKeys("was");
		driver.findElement(By.xpath("//*[text()='Washington (WAS - All Airports)']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Going to']")).sendKeys("hou");
		driver.findElement(By.xpath("//*[text()='Houston (HOU - All Airports)']")).click();
		driver.findElement(By.xpath("//*[@id='d1-btn']")).click();
		driver.findElement(By.xpath("(//*[@data-day='19'])[1]")).click();
		driver.findElement(By.xpath("(//*[@data-day='19'])[2]")).click();
		driver.findElement(By.xpath("(//*[text()='Done'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		driver.findElement(By.xpath("(//button[@class='uitk-card-link'])[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[@data-test-id='select-link'])[2]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.findElement(By.linkText("No Thanks")).click();
		
		String ParentWindow = driver.getWindowHandle();
		Set<String> NewWindows = driver.getWindowHandles();
		for(String Window : NewWindows) {
			if(Window.equalsIgnoreCase(ParentWindow)) {
				System.out.println("Time to Switch to New Window");
		}else {
			driver.switchTo().window(Window);
		}
		}
		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[contains(text(),'Check out')]")).click();
		
		driver.findElement(By.id("firstname[0]")).sendKeys("SAM");
		driver.findElement(By.id("lastname[0]")).sendKeys("BARGHPEIMA");
		driver.findElement(By.id("phone-number[0]")).sendKeys("8324394939");
		driver.findElement(By.id("gender_male[0]")).click();
		
		dateOfBirth();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("Window.scrollBy(0,5000");
		//driver.findElement(By.id("yes_insurance")).click();
		
		driver.findElement(By.name("creditCards[0].cardholder_name")).sendKeys("SAM BARGHPEIMA");
		driver.findElement(By.id("creditCardInput")).sendKeys("406094859992");
		new Select(driver.findElement(By.name("creditCards[0].expiration_month"))).selectByVisibleText("07-Jul");
		new Select(driver.findElement(By.name("creditCards[0].expiration_year"))).selectByVisibleText("2024");
		driver.findElement(By.id("new_cc_security_code")).sendKeys("843");
		driver.findElement(By.name("creditCards[0].street")).sendKeys("3502 Leesburg St");
		driver.findElement(By.name("creditCards[0].city")).sendKeys("Houston");
		new Select(driver.findElement(By.name("creditCards[0].state"))).selectByVisibleText("TX");
		driver.findElement(By.name("creditCards[0].zipcode")).sendKeys("77082");
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("Sbarghpeima@gmail.com");
		
		//Payment();
		Thread.sleep(3000);
		driver.findElement(By.id("complete-booking")).click();
	}
	public static void dateOfBirth() {
		driver.findElement(By.id("date_of_birth_month0")).click();
		new Select(driver.findElement(By.id("date_of_birth_month0"))).selectByVisibleText("09 - Sep");

		driver.findElement(By.id("date_of_birth_day[0]")).click();
		new Select(driver.findElement(By.id("date_of_birth_day[0]"))).selectByVisibleText("18");

		driver.findElement(By.id("date_of_birth_year[0]")).click();
		new Select(driver.findElement(By.id("date_of_birth_year[0]"))).selectByVisibleText("1989");
		driver.findElement(By.id("date_of_birth_year[0]")).click();

	}
	/*public static void Payment() {
		driver.findElement(By.name("creditCards[0].cardholder_name")).sendKeys("SAM BARGHPEIMA");
		driver.findElement(By.id("creditCardInput")).sendKeys("406094859992");
		new Select(driver.findElement(By.name("creditCards[0].expiration_month"))).selectByVisibleText("07-Jul");
		new Select(driver.findElement(By.name("creditCards[0].expiration_year"))).selectByVisibleText("2024");
		driver.findElement(By.id("new_cc_security_code")).sendKeys("843");
		driver.findElement(By.name("creditCards[0].street")).sendKeys("3502 Leesburg St");
		driver.findElement(By.name("creditCards[0].city")).sendKeys("Houston");
		new Select(driver.findElement(By.name("creditCards[0].state"))).selectByVisibleText("TX");
		driver.findElement(By.name("creditCards[0].zipcode")).sendKeys("77082");
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("Sbarghpeima@gmail.com");

	}*/
}
