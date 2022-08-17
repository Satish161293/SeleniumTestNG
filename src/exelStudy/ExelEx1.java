package exelStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelEx1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile = new File("D:\\S testing notes\\main class notes\\exelSheet\\Study.xlsx");
		Workbook File = WorkbookFactory.create(MyFile);
		Sheet Sheet1 = File.getSheet("Sheet3");
		String Value1 = Sheet1.getRow(0).getCell(0).getStringCellValue();
     	System.out.println(Value1);
		for(int i=0;i<=3;i++) {
			
			for(int j=0;j<=3;j++) {
				String Value = Sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.println(Value);
			}
				
		}
		

	}

}
