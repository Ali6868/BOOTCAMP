package Starter;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;

public class Usability {
	public WebDriver driver;
@Parameters({"browser","URI"})
  @BeforeClass
  public void beforeClass(String browser, String Website) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "/Users/arash/Desktop/chromedriver");
			driver=new ChromeDriver();
			driver.get(Website);
			driver.manage().window().maximize();
	  } else if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "/Users/arash/Desktop/geckodriver");
			driver=new FirefoxDriver();
			driver.get(Website);
			driver.manage().window().maximize();
	  }
	  
  }
  

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

}
