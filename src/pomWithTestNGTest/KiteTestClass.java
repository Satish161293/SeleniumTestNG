package pomWithTestNGTest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestClass extends KiteBasePage
{
	KiteLogInPage Log;
	KitePinPage KPage;
	KiteHomePage Home;
	
	@BeforeClass
	public void LaunchKiteId() 
	{
		OpenApplication();
		waiting(1000);
	    Log   = new KiteLogInPage(Driver);
		KPage = new KitePinPage(Driver);
		Home  = new KiteHomePage(Driver);
		
	}
	@BeforeMethod
	public void LogInKite() throws IOException
	{
		Log.SendpassWord(UtilityPage.ReadDataFromProprties("UN1"));
		
		
		
	}
	
  @Test
  public void A ()
  {
	  
	  
	  
	  
  }
}
