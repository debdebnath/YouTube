package youtubespecial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataFromExcelSheet {

	@DataProvider
	String [][] getData()  throws Exception {
		String path="E:\\Automation_Workspace\\YouTube\\data\\TestData.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		int noOfRows = wb.getSheet("sheet1").getPhysicalNumberOfRows()-1;
		int noOfCol = wb.getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println(noOfCol);
		System.out.println(noOfRows);
		String [][]s=new String[noOfRows][noOfCol];
		for (int i = 1; i <= noOfRows; i++) {
			for (int j = 0; j < noOfCol; j++) {
				String value=wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
				s[i-1][j]=value;
				//System.out.println(value);
			}
		}
		return s;
	}
	@Test(dataProvider="getData")
		public void takedata(String s1, String s2 )
		{
		System.out.println(s1+" "+s2);
		}
		
//		String s1=wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
//		String s2=wb.getSheet("Sheet1").getRow(0).getCell(1).toString();
//		System.out.println(s1);
//		System.out.println(s2);

}
