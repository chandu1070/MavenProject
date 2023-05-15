package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
			WebDriverManager.chromedriver().setup();
			WebDriver d=new ChromeDriver();
			d.get("https://testautomationpractice.blogspot.com/");
			d.manage().window().maximize();
			Thread.sleep(2000);
			
			//How to Find Rows in A Table
			
		    int rows=d.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
			System.out.println("Number of rows:"+rows);      //7
			
			//int rows= d.findElements(By.tagName("tr")).size();// 8
			//System.out.println("Number of rows:"+rows); //Not recomonded when we have more tables in webpAGE
			
			//Findout no of columns in a Table
			int columns=d.findElements(By.xpath("//table[@name='BookTable']//th")).size();
			System.out.println("no of columns:"+columns);
			
			//Retrieve the data from column and row
			String value=d.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[2]")).getText();
			System.out.println("name of the candidate:"+value);
	
    		// Retrieve the mukesh author of the books	
			for(int r=2; r<=rows; r++)
                {
              	String author=d.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
                 if(author.equals("Mukesh"))
              		{
                	 String bookname=d.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
              			System.out.println(author+"      " +bookname);
              		}
			
			
			//Find out the cost of all books
		
}
		}
		
}



