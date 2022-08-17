package pomWithTestNGTest;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  KiteHomePage 
{

	@FindBy(xpath ="//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logOut;
	
	public KiteHomePage(WebDriver Driver) 
	{
		PageFactory.initElements(Driver, this);
		
	}
	
	public String validateUserID() 
	{
		String Actul = UserID.getText();
		return Actul;
		
	}
	public void Logout() 
	{
		UserID.click();
		Logout();
	
	}
}

