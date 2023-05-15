package day31;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.util.List;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class datademo {
	
		public static void main(String[] args) throws Exception {
			FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Documents\\TCS.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet ws=wb.getSheet("Sheet1");
			Row r=null;
			Cell c=null;
			

			System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://demo.guru99.com/test/newtours/");
			d.manage().window().maximize();
			WebElement Drop=d.findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]"));
			List<WebElement> Drops=Drop.findElements(By.tagName("a"));
			System.out.println(Drops.size());
			
		
			for(int i=0;i<Drops.size();i++)
			{
				
				System.out.println(Drops.get(i).getText());
				r=ws.createRow(i);
				r.createCell(0).setCellValue(Drops.get(i).getText());
				Drops.get(i).click();
				String title=d.getTitle();
				System.out.println(title);
				String url=d.getCurrentUrl();
				System.out.println(url);
				
					r.createCell(1).setCellValue(title);
					r.createCell(2).setCellValue(url);
				
					d.navigate().back();
					Drop=d.findElement(By.xpath("//table[@align='center']//table"));
					 Drops=Drop.findElements(By.tagName("a"));
				}
		
			FileOutputStream f1=new FileOutputStream("C:\\Users\\DELL\\Documents\\TCS.xlsx");
			wb.write(f1);
			f1.close();
			}

		}


