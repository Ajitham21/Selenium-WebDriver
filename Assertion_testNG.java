package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assertion_testNG {
	WebDriver driver;
	
	// AssertEquals
	
  @Test
  public void Assertioneqals() {
	  String expected = "The Internet";
	  String title=driver.getTitle();
	  System.out.println(title);
	  
	  Assert.assertEquals(title, expected, "title mismatch");
	  }
  
  // AssertTrue
  
  @Test
  public void Assertiontrue() {
	 
	  WebElement name = driver.findElement(By.className("lnXdpd"));
	  Assert.assertTrue(name.isDisplayed(), "logo not displayed correctly");
  }
  
  //AssertFalse
  
  @Test
  public void assertFalse() {
	  
	 WebElement  error =driver.findElement(By.id("username"));
	 error.click();
	 Assert.assertFalse(error.isSelected(), "true");
	  
  }
  @Test
  public void assertionnotNull() {
	  
	 WebElement  username =driver.findElement(By.name("username"));
	
	 Assert.assertNotNull(username, "username field should not be null");
	  
  }
  
  
  @BeforeMethod
  @Parameters("url")
  public void setstring(String url) {
	  System.setProperty("webdriver.gecko.driver", "C:\\\\selenium\\\\geckodriver.exe");
	   driver=new FirefoxDriver();
driver.get(url);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
