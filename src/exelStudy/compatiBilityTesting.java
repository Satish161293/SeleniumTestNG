package exelStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class compatiBilityTesting {
	
	
	  @Test
	  public void FirefoxStudy() 
	  
	  {
		  System.setProperty("webdriver.gecko.driver", "D:\\S testing notes\\main class notes\\firfox Driver\\geckodriver.exe");		
	      WebDriver Driver = new FirefoxDriver();
	      Driver.get("http://www.naukri.com/");
	   
	  }
	  @Test
	  public void ChromeStudy() 
	  
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\s\\Downloads\\selenium-java-4.2.2\\chromedriver.exe");
	      WebDriver Driver = new ChromeDriver();
	      Driver.get("http://www.naukri.com/");
	   
	  }
	  
}
