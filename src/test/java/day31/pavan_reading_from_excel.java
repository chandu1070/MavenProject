package day31;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//FILE- WORKBOOK-SHEET-ROW-COLUMN

public class pavan_reading_from_excel {

	public static void main(String[] args) throws IOException
	{
   FileInputStream file=new  FileInputStream("C:\\Users\\DELL\\Documents\\TCS.xlsx");
   
   XSSFWorkbook workbook=new XSSFWorkbook(file);
   XSSFSheet sheet=workbook.getSheet("sheet1");
   int totalrows=sheet.getLastRowNum();
   int totalcols=sheet.getRow(1).getLastCellNum();
   
   System.out.println("Rows:"+totalrows);
   System.out.println("columns:"+totalcols);

   for(int r=1; r<=totalrows;r++)
   {
	    XSSFRow currentrow=sheet.getRow(r);
	   for(int c=0; c<totalcols;c++)
	   {
	   XSSFCell cell=currentrow.getCell(c); 
	  System.out.print(cell.toString()+"     ");
   } 
	   System.out.println();
   }
	}
}
