package Run;

import org.testng.annotations.Test;

import Homedepot.AccountType;
import Homedepot.HomePage;
import Homedepot.RegisterationPage;
import Starter.Usability;
import java.util.concurrent.TimeUnit;


public class UserRegister extends Usability {
  
	@Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	  HomePage hp = new HomePage(driver);
	  hp.myaccountbtn();
	  hp.registerbtn();
	  
	  AccountType at = new AccountType(driver);
	  at.Selection();
	  
	  RegisterationPage rp = new RegisterationPage(driver);
	  rp.emailofinput();
	  rp.password();
	  rp.postalcode();
	  rp.phone();
	  rp.Keepsigned();
	  rp.singbutton();
	  
  }
  
}
