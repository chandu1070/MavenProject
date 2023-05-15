package day31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Multiple_com_in_datawritten {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Documents\\vvv.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet3");
		Row r=null;
		Cell c=null;
		r=ws.createRow(0);
		r.createCell(0).setCellValue("Manual");

		r.getRowNum();
		r.createCell(1).setCellValue("Testing");

		r.getRowNum();
		r.createCell(2).setCellValue("Api Testing");

		FileOutputStream f1=new FileOutputStream("C:\\Users\\DELL\\Documents\\vvv.xlsx");
		wb.write(f1);
		f1.close();

	}

}
