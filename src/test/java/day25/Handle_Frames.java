package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Frames {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.switchTo().frame("packageListFrame");
			d.findElement(By.linkText("org.openqa.selenium")).click();
			
			d.switchTo().defaultContent();
		
		
		d.switchTo().frame("packageFrame");
		d.findElement(By.linkText("WebDriver")).click();
		d.switchTo().defaultContent();
		
		
		
		d.switchTo().frame("classFrame");
		d.findElement(By.xpath("//*[text()='Index']")).click();
		
	
	}

}
