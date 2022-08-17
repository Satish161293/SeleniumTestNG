package baseClassStudy;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BassClassEx1
    {
	protected static WebDriver Driver;
	
	public void OpenApplication() 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\s\\Downloads\\selenium-java-4.2.2\\chromedriver.exe");
		 Driver = new ChromeDriver();
		 Driver.manage().window().maximize();
		Driver.get("https://kite.zerodha.com/");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	}
	public void Waiting(int sec) 
	{
		Driver.manage().timeouts().implicitlyWait(Duration.ofMillis(sec));
		
	}
	

    }
