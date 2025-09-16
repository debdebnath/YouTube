package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Compare_Col {

	public static void main(String[] args) throws Exception {
		String fileName="C:\\Users\\Dev\\Desktop\\Excel\\Column.xlsx";
		 FileInputStream excelFile= new FileInputStream(new File(fileName));
		 Workbook workbook= WorkbookFactory.create(excelFile);
		 Sheet sh = workbook.getSheetAt(0);
		 Row row= null;
		 Cell cell = null; 
		 int rc=0;
		 int cc=0;
		 
		 // row = sh.getRow(1) ;
		  
		  sh.getRow(0).createCell(3).setCellValue("Result");
		  
		  rc=sh.getPhysicalNumberOfRows();
		 // System.out.println(rc);
	
		 // cc= sh.getRow(0).getPhysicalNumberOfCells();
		 // System.out.println(cc);
		
		 // row = sh.getRow(1) ;
		  
		//  String col1 = row.getCell(1).getStringCellValue();
		  //System.out.println(col1);
		  
		 // String col2= row.getCell(2).getStringCellValue();
		  //System.out.println(col2);
		  
		  
		  for(int r=1;r<rc;r++)
		  {
			  row=sh.getRow(r);
			  if((row.getCell(1).getStringCellValue()).equals((row.getCell(2).getStringCellValue())))
			  {
				  row.createCell(3).setCellValue("Pass");
			  }else
			  {
				  row.createCell(3).setCellValue("Fail");
			  }
		  }
	
		   FileOutputStream fileOut = new FileOutputStream(fileName); 
		   workbook.write(fileOut);
           excelFile.close();
		
	
	
	}

}
