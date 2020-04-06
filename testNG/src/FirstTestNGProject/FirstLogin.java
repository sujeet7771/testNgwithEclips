package FirstTestNGProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstLogin {
 
  @BeforeTest
  public void launchBrowser() {
	  System.out.println("Browser open sucessfully");
	  System.out.println("Enter the desire url");
	  
  }
  @Test
  public void loginPage() {
	  System.out.println("Enter the user name and password");
	  System.out.println("login is sucessfully");
  }

  @AfterTest
  public void logout() {
	  System.out.println("logout");
  }

}
