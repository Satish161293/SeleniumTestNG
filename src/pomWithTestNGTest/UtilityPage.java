package pomWithTestNGTest;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityPage 

{
	public static String ReadDataFromProprties(String key) throws IOException {
		
	
	Properties pro = new Properties();
	FileInputStream Myfile = new  FileInputStream("C:\\Users\\s\\eclipse-workspace\\SeleniiumProject2\\MyProperty.Properties"); 
	pro.load(Myfile);
	String value = pro.getProperty(key);
	return value;
	
	}
	public static void CapturScreenShot(WebDriver Driver,String TCID) throws IOException {
		File Src = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("D:\\S testing notes\\main class notes\\Screenshot"+TCID+".png");
	FileHandler.copy(Src, Dest);
	}

}
