package day31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class datawriteinexcel {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\\\DELL\\Documents\\vvv.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		Cell c=null;

		r=ws.createRow(0);
		r.createCell(1).setCellValue("manual testing");

		r=ws.createRow(2);
		r.createCell(3).setCellValue("automation testing");

		r=ws.createRow(2);
		r.createCell(6).setCellValue(" is very easy");

		FileOutputStream f1=new FileOutputStream("C:\\Users\\DELL\\Documents\\vvv.xlsx");
		wb.write(f1);
		f1.close();

	}

}
