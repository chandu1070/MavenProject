package day31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Enterthedifferentsetsofdata {


		public static void main(String[] args) throws IOException {
			  FileOutputStream file=new  FileOutputStream("C:\\Users\\DELL\\Documents\\TCS.xlsx");
			  
			   XSSFWorkbook workbook=new XSSFWorkbook();
			   XSSFSheet sheet=workbook.createSheet("sheet2");
			   
               Scanner sc=new Scanner(System.in);
               
			   for(int r=0; r<=3;r++)
			   {
				    XSSFRow currentrow=sheet.createRow(r);
				   for(int c=0; c<3;c++)
				   {
					   System.out.println("enter the input value:");
				   currentrow.createCell(c).setCellValue(sc.next());
				   }
			   }
			   
				   workbook.write(file);
				   
			   }
	}


