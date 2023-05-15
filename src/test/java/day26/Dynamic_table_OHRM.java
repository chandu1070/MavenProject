package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_table_OHRM {

	public static void main(String[] args) throws InterruptedException  {
		//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		d.findElement(By.name("username")).sendKeys("Admin");
	    d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@id='oxd-main-menu-item active'")).click();
		d.findElement(By.xpath("//a[@normalize-space()='Employee List']")).click();
	}
}//a[@class='oxd-main-menu-item active']