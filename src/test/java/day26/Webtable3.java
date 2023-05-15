package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable3 {

 public static void main(String[] args) throws InterruptedException { 
		//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
	 WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		int rows=d.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int cols=d.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		//Find out the cost of all books
		{
		int total=0;
		   for(int r=2; r<=rows; r++)
		   {
			   String cost=d.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText(); 
			   total=total+Integer.parseInt(cost);
		   }
		   
			   System.out.println("total cost of books:"+total);
	}

	}

}
