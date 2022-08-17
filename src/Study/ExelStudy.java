package Study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelStudy {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Myfile =new File("D:\\S testing notes\\main class notes\\exelSheet\\Study.xlsx");
		
		Workbook Mainfaile = WorkbookFactory.create(Myfile);
		Sheet Value = Mainfaile.getSheet("Sheet1");
		int Satish = Value.getLastRowNum();
		System.out.println(Satish);
		for(int i=0;i<=1;i++) {
		String Value1 = Value.getRow(i).getCell(0).getStringCellValue();
		
		System.out.print(Value1 + " !!");
	}
		System.out.println();
		
		for(int i=0;i<=2;i++) {
			
			String Value1 = Value.getRow(0).getCell(i).getStringCellValue();
			System.out.print(Value1+ " !!");
		}
		System.out.println();
		System.out.println("================");
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=2;j++) {
				String cellvalue = Value.getRow(i).getCell(j).getStringCellValue();
				System.out.print(cellvalue+" !! ");
			
			}
			System.out.println();		
		}
//		
//		
	}

}
