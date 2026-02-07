package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
 
public class Priority_testNG {
  @Test(priority = 0)
  public void login() {
	  
System.out.println("login successfull");	  
  }
  @Test(priority = 3)
  public void logout() {
	  System.out.println("logout successfull");	  

  }
  @Test(priority = 2)
  public void search() {
	  System.out.println("search successfull");	  

  }
  @Test(priority = 1)
  public void Entertext() {
	  System.out.println("Text Entered successfully");	  

  }
  
  
}
