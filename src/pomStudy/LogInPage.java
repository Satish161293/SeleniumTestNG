package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
	
	@FindBy(id = "userid") private WebElement UID;
	@FindBy(id = "password") private WebElement PWS;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	
	public LogInPage(WebDriver Driver) 
	{
		PageFactory.initElements(Driver, this);
		
	}
	public void SendUSerID(String UN) 
	{
		UID.sendKeys(UN);
	}
	public void SendPassword(String pws)
	{
		PWS.sendKeys(pws);
		
	}
	public void CLickOnLogInPage() 
	{
		LoginButton.click();
		
	}

}
