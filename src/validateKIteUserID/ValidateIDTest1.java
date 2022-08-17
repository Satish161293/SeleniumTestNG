package validateKIteUserID;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UtilityStudy.UtilityClass1;
import baseClassStudy.BassClassEx1;
import pomExample.HomePage1;
import pomExample.PinPAge;

import pomStudy.LogInPage;

public class ValidateIDTest1 extends BassClassEx1

    {
	LogInPage Page;
	PinPAge PIN;
	HomePage1 Home;
	
	
	@BeforeClass
	public void launchKiteId() throws InterruptedException 
	{
		OpenApplication();
		Waiting(1000);
       Page = new LogInPage(Driver);
       PIN = new PinPAge(Driver);
       Home = new HomePage1(Driver);
		
	}

	@BeforeMethod
	public void LoginKiteId() throws EncryptedDocumentException, IOException 
	{
		Page.SendUSerID(UtilityClass1.ReadDataFromeExelSheet(0, 0));
		Page.SendPassword(UtilityClass1.ReadDataFromeExelSheet(0, 1));
		Page.CLickOnLogInPage();
		Waiting(1000);
		PIN.SendPin(UtilityClass1.ReadDataFromeExelSheet(0, 2));
		PIN.ClickContinueButton();
		Waiting(1000);
	}
	@Test
	public void ValidateUID() throws EncryptedDocumentException, IOException 
	{
		String TCID = "1234";
		
		Assert.assertEquals(Home.ValidateUID(),UtilityClass1.ReadDataFromeExelSheet(0, 0),"Actual And Expected ID Is not Matched" );
		UtilityClass1.Snapshot(Driver,TCID);
		
	}
	@AfterMethod
	public void LogOutKiteId() throws InterruptedException 
	
	{
		
		Home.ClickLogoutButton();
		
		
		
	}
	@AfterClass
	public void CloseKiteId() 
	{
		
		Driver.close();
		
	}
}
