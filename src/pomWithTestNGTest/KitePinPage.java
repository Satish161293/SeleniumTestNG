package pomWithTestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	@FindBy(id="pin") private WebElement PIN;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueBotton;
	
	public KitePinPage (WebDriver Driver) 
	{
		PageFactory.initElements(Driver, this);
		
	}
	public void SendPin(String pin) 
	{
		PIN.sendKeys(pin);
		
	}
	public void ClickOnContinueButton() 
	{
		ContinueBotton.click();
		
	}
	

}
