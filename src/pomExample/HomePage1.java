package pomExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	@FindBy(xpath = "//span[@class='user-id']")
	private WebElement ID;
	@FindBy(xpath = "//a[@target='_self']")
	private WebElement LogoutButton;

	public HomePage1(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}

	public String ValidateUID() {
		
		String Actual = ID.getText();
		return Actual;
		
	}

	public void ClickLogoutButton() throws InterruptedException {
		ID.click();
		Thread.sleep(1000);
		LogoutButton.click();

	}

}
