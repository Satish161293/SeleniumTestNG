package UtilityStudy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomExample.HomePage1;
import pomExample.LogInPage;
import pomExample.PinPAge;

public class ValidateKiteUserIDUsingPropertyFile extends BassClassEx {
	LogInPage Page;
	PinPAge Pin;
	HomePage1 Home;

	@BeforeClass
	public void LaunchBrowser() 
	{
		OpenApplication();
		Page = new LogInPage(Driver);
		Pin = new PinPAge(Driver);
		Home = new HomePage1(Driver);
	}

	@BeforeMethod
	public void B()
	{
		
		

	}

	@Test
	public void ValidteKiteUserID()
	{

	}
     @AfterMethod
	public void LogOutKitePage() throws InterruptedException 
     {
    	 Home.ClickLogoutButton();

	}
      @AfterClass
	public void CLoseBrowser() 
     {
    	  Driver.close();
    	  

	}
}
