package day39;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefox_alerts {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.firefoxdriver().setup();
		 WebDriver d=new FirefoxDriver();
			d.get("https://the-internet.herokuapp.com/javascript_alerts");
			d.manage().window().maximize();
			Thread.sleep(2000);
	}
}

			
