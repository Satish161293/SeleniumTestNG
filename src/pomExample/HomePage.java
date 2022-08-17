package pomExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement ID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;	
	public  HomePage (WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);		
	}	
	public void ValidateUID() 
	{
		String Expected = "ELR321";
		String Actual =ID.getText();
		if (Actual.equals(Expected)) 
		{
			System.out.println("Actual And Expected User Id Are Matched Sor Test Case Is Passed");			
		}
		else {
			System.out.println("Actual And Expected User Id Are not Matched Sor Test Case Is Fail");
		}		
	}
	public void ClickLogoutButton() throws InterruptedException
	{
		ID.click();
		Thread.sleep(1000);
		LogoutButton.click();
		
	}
	

}
