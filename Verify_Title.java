package TestNG;

import org.testng.annotations.Test;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Verify_Title {
	WebDriver driver;
  @Test
  public void m1() {
	  String title=driver.getTitle();
	  System.out.println(title);

	  if(title.equals("The Internet")) {
		  System.out.println(title + "title is matched");
	  
	  }
	  else {
		  System.out.println(title + "   title is not matched");

	  }
		  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\\\selenium\\\\geckodriver.exe");
	   driver=new FirefoxDriver();
	  driver.get("https://the-internet.herokuapp.com/login");
  }

  @AfterMethod
  public void afterMethod() {
	// driver.close();
	
  }

}
