package pomExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	@FindBy(id="userid") private WebElement UID;
	@FindBy(id="password") private WebElement PWS;
	@FindBy(xpath = "//button[@type='submit']") private WebElement Loginbutton;
	
	public LogInPage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
		
	}
	
	public void SendUserID(String Uid) 
	{
		UID.sendKeys(Uid);
		
	}
	public void SendPassword(String Spw) 
	{
		PWS.sendKeys(Spw);
		
	}
	public void ClickLogInButton() 
	{
		Loginbutton.click();
		
	}

	
}
