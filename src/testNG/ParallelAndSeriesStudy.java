package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelAndSeriesStudy {
  @Test
  public void A() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\s\\Downloads\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.flipkart.com/");
		Driver.manage().window().maximize();
		Thread.sleep(1000);
	  
  }
}
