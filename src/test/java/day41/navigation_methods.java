package day41;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation_methods {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver d=new ChromeDriver();
			//ChromeOptions co =new ChromeOptions();
			//co.addArguments("--remote-allow-origins=*");
			//WebDriver d=new ChromeDriver(co);
		d.navigate().to("https://www.amazon.in/");
		d.navigate().to("https://www.snapdeal.com/");
		
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		System.out.println(d.getCurrentUrl());
		d.navigate().forward();
		Thread.sleep(2000);
		System.out.println(d.getCurrentUrl());
		d.navigate().refresh(); 
		}

	}


