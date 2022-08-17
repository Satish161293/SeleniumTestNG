package Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class generalStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\s\\Downloads\\selenium-java-4.2.2\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		Actions Act = new Actions(Driver);
		
	    WebElement About = Driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
	    Thread.sleep(2000);
        Act.moveToElement(About).click().build().perform();
        // Act.click().perform();
	}

	}


