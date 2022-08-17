package UtilityStudy;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtylityNew 
   {
	   public static String ReadDataFromeProperties(String key) throws IOException 
	   {
		   

		Properties Prop = new Properties();

		FileInputStream MyFile = new FileInputStream(
				"C:\\Users\\s\\eclipse-workspace\\SeleniiumProject2\\MyProperty.Properties");
		Prop.load(MyFile);
		String Value = Prop.getProperty(key);
		return Value;

	}

	public static void CaptureScreenShot(WebDriver Driver, String TCID) throws IOException 
	{
	   File Src = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	   File MyFile = new File("D:\\S testing notes\\main class notes\\Screenshot"+TCID+".png");
	   FileHandler.copy(Src, MyFile);
		

	}
	
}
