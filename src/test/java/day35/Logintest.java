package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	WebDriver d;
	
	@Test(priority=1)
	void openapp()
	{
		WebDriverManager.chromedriver().setup();
		 d=new ChromeDriver();
		d.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
	}
	
	@Test(priority=2)
	void login() throws InterruptedException 
	{
		WebElement emailbox=d.findElement(By.xpath("//input[@id='Email']"));
		emailbox.clear();
		emailbox.sendKeys("admin@yourstore.com");
		WebElement pwordbox=d.findElement(By.xpath("//input[@id='Password']"));
		pwordbox.clear();
		pwordbox.sendKeys("admin");
		
		d.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		/*String  act_lable=d.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
		if(act_lable.equals("Dashboard"))
		{
			System.out.println("Login is passed");
		}
		else
		{
			System.out.println("Login is failed");
		}     */
	} 
	
	@Test(priority=3)
	void closeapp()
	{ 
	    d.close();
		System.out.println("close the application");
	}

}
