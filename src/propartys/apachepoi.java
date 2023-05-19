package propartys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class apachepoi {

	@SuppressWarnings({ "deprecation", "static-access", "null", "resource" })
	public static void main(String[] args) throws IOException {
		
		FileInputStream f= new FileInputStream("D:\\A POI\\book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
	XSSFSheet sh = wb.getSheet("sheet1");
	Row r= null;
	Cell c = null;
	Iterator<Row>row=sh.iterator();
	
	
	
	while(row.hasNext());
	{
	   row.next();
	   Iterator<Cell> cell= r.iterator();
	   while(cell.hasNext());
	   {
		   cell.next();
		   if (c.getCellType()== c.CELL_TYPE_NUMERIC){
			   
			   System.out.println(c.getNumericCellValue());
			 		   
		   }
		   else if(c.getCellType()== Cell.CELL_TYPE_STRING){
			   System.out.println(c.getStringCellValue());
			   
		   } 
		   
	   }
		
		
	}
		
		
		
	}

}
