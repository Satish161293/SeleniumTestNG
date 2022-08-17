package pomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage 
{
	@FindBy(xpath = "//span[@class='user-id']")private WebElement Uid;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOut;
	public HomePage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
		
	}
	public void ValidateUserId(String UID) 
	{
		String ActualUserId =Uid.getText();
		if(ActualUserId.equals("ELR321")) 
		{
			System.out.println("Actual And Expected UserId is Matched hence TC is Passed");
			
		}
		else {
			System.out.println("Actual And Expected UserId is not Matched Hence TC is Fail");
		}
		
	}
	public String getActualUserId() {
		String actualUserID = Uid.getText();
		return actualUserID;
	}
	public void ClickOnLogOutBotton() throws InterruptedException 
	{
		Uid.click();
		Thread.sleep(1000);
		LogOut.click();
		
	}
	
	

}
