package day31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//File-workbook-sheet-row-cell

public class Pvan_writingdatainexcelsheet_amedate {

	public static void main(String[] args) throws IOException {
		  FileOutputStream file=new  FileOutputStream("C:\\Users\\DELL\\Documents\\TCS.xlsx");
		  
		   XSSFWorkbook workbook=new XSSFWorkbook();
		   XSSFSheet sheet=workbook.createSheet("sheet2");
		   

		   for(int r=0; r<=3;r++)
		   {
			    XSSFRow currentrow=sheet.createRow(r);
			   for(int c=0; c<3;c++)
			   {
			   currentrow.createCell(c).setCellValue("vamsikoppula");
			   }
		   }
		   
			   workbook.write(file);
			   
		   }
}
