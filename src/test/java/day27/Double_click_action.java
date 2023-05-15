package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click_action {
public static void main(String[] args) throws InterruptedException  {
			//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
	WebDriverManager.chromedriver().setup();
			WebDriver d=new ChromeDriver();
			d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
			d.manage().window().maximize();
			Thread.sleep(3000);
			d.switchTo().frame("iframeResult");
			WebElement field1=d.findElement(By.xpath("//input[@id='field1']"));
			field1.clear();
			field1.sendKeys("vamsikoppula");
			WebElement button=d.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
			Actions act=new Actions(d);
			act.doubleClick(button).perform(); 
			
			WebElement field2 =d.findElement(By.xpath("//input[@id='field2']"));
			String copiedtext=field2.getAttribute("value");
			if(copiedtext.equals("vamsikoppula"))
			{
				System.out.println("copied text.test casepassed");
			}
			else
			{
				System.out.println("copied not text.test casefaild");
			}
			
			//WebElement field2 =d.findElement(By.xpath("//input[@id='field2'])"));
			//d.findElement(By.xpath("//button[normalize-space()='Copy Text']")).click();
			 

	}

}
