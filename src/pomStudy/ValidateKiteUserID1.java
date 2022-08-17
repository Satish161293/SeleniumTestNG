package pomStudy;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidateKiteUserID1 
{
	WebDriver Driver;
	File MyFile;
	
	LogInPage Login;
	PinPage pin;
	HomePage Home;
	@BeforeClass
	public void LaunchBrouser() throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\s\\Downloads\\selenium-java-4.2.2\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching Kite App",true);
		Driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		MyFile = new File("D:\\S testing notes\\main class notes\\exelSheet\\Study.xlsx");

		Login= new LogInPage(Driver);
		pin = new PinPage(Driver);
		Home = new  HomePage(Driver);
	
	}
	
	@BeforeClass
	public void LogIntoKite() 
	{
		Login.SendUSerID("CPN469");
		Reporter.log("Send User Id",true);
		Login.SendPassword("Vishal45");
		Reporter.log("Send User Password",true);
		Login.CLickOnLogInPage();
		Reporter.log("Clicked on Log In Page",true);
		pin.SendPin("454545");
		Reporter.log("Send Pin",true);
		pin.ClickOnContinueBotton();
		Reporter.log("Clicked on ClickOnContinueBotton ",true);
		Driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
  @Test
  public void ValidateID() 
  {
	  String ExpectedUserID = "CPN469";
	  String ActualserId = Home.getActualUserId();
	  Reporter.log("Validate Actual And Exepected User ID ",true);
	  Assert.assertEquals(ActualserId, ExpectedUserID,"ActualserId And ExpectedUserID and not Matched");
	  Reporter.log("Validate Actual And Exepected User ID TC is Passed ",true); 
	  
	
  }
  @AfterMethod
  public void logoutKitePage() throws InterruptedException
  {
	 
	  Home.ClickOnLogOutBotton();
	  
  }
  
}
