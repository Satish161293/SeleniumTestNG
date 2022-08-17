package pomExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPAge {
	
	@FindBy(id="pin") private WebElement PIN;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	public PinPAge(WebDriver Driver) 
	{
		PageFactory.initElements(Driver,this);
		
	}
	public void SendPin(String Pin) 
	{
		PIN.sendKeys(Pin);
		
	}
	public void ClickContinueButton() 
	{
	ContinueButton.click();
		
	}
}
