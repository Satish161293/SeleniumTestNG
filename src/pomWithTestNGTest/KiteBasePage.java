package pomWithTestNGTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class KiteBasePage
{
	protected static WebDriver Driver;
	public static void OpenApplication()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\s\\Downloads\\selenium-java-4.2.2\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching Kite App",true);
		
		
	}
	public static void waiting(int sec) 
	{
		Driver.manage().timeouts().implicitlyWait(Duration.ofMillis(sec));
		
	}

}
