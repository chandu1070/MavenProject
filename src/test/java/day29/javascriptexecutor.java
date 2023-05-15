package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
		WebDriver d=new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.switchTo().frame(0);

		WebElement chkd=d.findElement(By.name("RESULT_CheckBox-8"));
		
		JavascriptExecutor je=(JavascriptExecutor)d;
		je.executeScript("arguments[0].click();",chkd);
		

	}

}
