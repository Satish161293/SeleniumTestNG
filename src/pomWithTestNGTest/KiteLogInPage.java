package pomWithTestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage 
{
	@FindBy(id="userid") private WebElement ID;
	@FindBy(id="password") private WebElement PASS;
	@FindBy(xpath = "//button[@type='submit']")private WebElement clickOnLogInBotton;
	
	public KiteLogInPage(WebDriver Driver) 
	{
		PageFactory.initElements(Driver, this);
		
	}
	public void SendUserID(String id) 
	{
		ID.sendKeys(id);
		
		
	}
	public void SendpassWord(String pass) 
	{
		PASS.sendKeys(pass);
		
	}
	public void CLickOnContinueBotton() 
	{
		clickOnLogInBotton.click();
		
	}

}
