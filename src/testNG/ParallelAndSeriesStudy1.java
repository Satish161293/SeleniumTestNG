package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelAndSeriesStudy1 {
  @Test
  public void B() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\s\\Downloads\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://vctcpune.com/selenium/practice.html");
		Driver.manage().window().maximize();
		Thread.sleep(1000);
  }
}
