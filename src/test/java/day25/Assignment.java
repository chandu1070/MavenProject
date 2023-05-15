package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
			WebDriverManager.chromedriver().setup();
			WebDriver d=new ChromeDriver();
			d.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
			d.manage().window().maximize();
			Thread.sleep(2000);
			d.switchTo().frame("globalSqa");
			d.findElement(By.name("s")).sendKeys("selenium");
			d.findElement(By.xpath("//button[@class='button_search']")).click();
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
			Thread.sleep(5000);
			d.close();
				
	}

}
