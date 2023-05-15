package day26;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class WebTable_StaticPage {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			//ChromeOptions co=new ChromeOptions();
			//co.addArguments("--remote-allow-origins=*");
			WebDriver d= new ChromeDriver();
			d.get("https://testautomationpractice.blogspot.com/");
			d.manage().window().maximize();
	       //how to find rows in a table
			int rows=d.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
			System.out.println("No of rows:"+rows);
			//How to find no.of columns/header in a table
			int cols=d.findElements(By.xpath("//table[@name='BookTable']//th")).size();
			System.out.println("no of columns:"+cols);
			//Retrive the specific row/column data(5th row 1st col)
			/*String values=d.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
			System.out.println(values);*/
			//How to retrive all the data from the table
			for(int r=2;r<=rows;r++)
			{
				for(int c=1;c<=cols;c++)
				{
					String value=d.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
					System.out.print(value);
				}
				System.out.println();
			}
			//print booknames whose author is amit
			for(int r=2;r<=rows;r++)
			{
					String author=d.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
					System.out.print(author);
					if(author.equals("Mukesh"))
						{
						String bookname=d.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
						System.out.print(bookname);
						System.out.println(author+"   "+bookname);
						}
				}
			//Find the cost of all books listed
			int total=0;
			for(int r=2;r<=rows;r++)
			{
				String price=d.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				total=total+Integer.parseInt(price);
				
			}
			System.out.println("Total books prices:"+total);
			
			
			
			
	}

	}


