package assertStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingStudy 
 {
	@Parameters("Browser")
	
  @Test
  public void A(String Name) 
  
  {
	  WebDriver Driver=null;
	  
	  if(Name.equals("Chrome")) 
	  {
		  
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\s\\Downloads\\selenium-java-4.2.2\\chromedriver.exe");
		   Driver = new ChromeDriver();
	  }
	  else if(Name.equals("Firfox")) 
	  {
		  System.setProperty("webdriver.gecko.driver", "D:\\S testing notes\\main class notes\\firfox Driver\\geckodriver.exe");
	      Driver = new FirefoxDriver();
		  
		  
	  }
	  
	  Driver.get("https://srtmun.ac.in/en/");
	  Driver.manage().window().maximize();
	  
  }
}
