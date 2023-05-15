package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Key_Board_Actions {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().deleteAllCookies();
		d.get("https://text-compare.com/");		
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions act=new Actions(d);
		d.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("vamsikoppula");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
	}

}
