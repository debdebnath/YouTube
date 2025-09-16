package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws Exception {

		FileInputStream fis= new FileInputStream("E:\\Automation_Workspace\\YouTube\\data\\TestData.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		//XSSFSheet sheet= workbook.getSheet("Sheet1");//get sheet through sheet name
		XSSFSheet sheet= workbook.getSheetAt(0);// get sheet through index
		
		int rowCount = sheet.getLastRowNum();// returns the row count
		System.out.println(rowCount);
		
		int colCount = sheet.getRow(0).getLastCellNum();// returns the column/cell count
		System.out.println(colCount);
		
		for(int i=0;i<rowCount;i++) {
			XSSFRow currentRow = sheet.getRow(i);// Focus on current row
			for(int j=0;j<colCount;j++) {
				String value = currentRow.getCell(j).toString();// Read the value from a cell
				System.out.print(" "+value);
			}
			System.out.println();
		}
		
	}

}
