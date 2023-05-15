package day29;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker1 {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().deleteAllCookies();
		d.get("https://jqueryui.com/datepicker/");		
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.switchTo().frame(0);
		
		//d.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/26/2023");
		
		//I want to enter 10-04-2024
		String year="2025";
		String month="April";
		String date="10";
		 
     	d.findElement(By.xpath("//input[@id='datepicker']")).click();
      while(true)
		{
			String mnt=d.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=d.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				if(mnt.equals(month) && yr.equals(year))
				{
					System.out.println("break");
		            break;
		         }		
		d.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
      
     //DATE
    List<WebElement> alldates=d.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
 
     for(WebElement dt:alldates)
 	{
 		if(dt.getText().equals(date))
 		{
 			dt.click();
 		    break;
        }
   }
}
}