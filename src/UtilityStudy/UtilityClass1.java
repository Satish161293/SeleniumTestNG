package UtilityStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;





public class UtilityClass1 
{
	public static String ReadDataFromeExelSheet(int Num1,int Num2) throws EncryptedDocumentException, IOException 
	{
		File MyFile =new File("D:\\S testing notes\\main class notes\\exelSheet\\Study.xlsx");
		String Value = WorkbookFactory.create(MyFile).getSheet("Sheet4").getRow(Num1).getCell(Num2).getStringCellValue();
		return Value;
	}
	
	public static void Snapshot(WebDriver Driver ,String TCID) throws IOException 
	{
		
		File Source = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("D:\\S testing notes\\main class notes\\Screenshot\\"+TCID+".png");
		FileHandler.copy(Source, Destination);
		Reporter.log("Teken ScreenShot",true);
	}

}
