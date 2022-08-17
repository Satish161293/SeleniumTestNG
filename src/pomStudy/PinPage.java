package pomStudy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	
	
	public PinPage(WebDriver Driver) 
	{
		PageFactory.initElements(Driver, this);
		
	}
	public void SendPin(String pin) 
	{
		PIN.sendKeys(pin);
		
	}
	public void ClickOnContinueBotton()
	{
		ContinueButton.click();		
	}
	

}
