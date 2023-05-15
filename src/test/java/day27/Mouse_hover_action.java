package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_hover_action {
	
public static void main(String[] args) throws InterruptedException  {
	//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
	d.manage().window().maximize();
	Thread.sleep(3000);
	/*d.findElement(By.xpath("//span[@class='nav_item_name']")).click();
	d.findElement(By.xpath("//a[contains(text(),'Documentation')]")).click();
	Thread.sleep(3000);*/
	
	WebElement developers=d.findElement(By.xpath("//span[@class='nav_item_name']"));
	WebElement documentation =d.findElement(By.xpath("//a[contains(text(),'Documentation')]"));
	
	Actions act=new Actions(d);
	act.moveToElement(developers).moveToElement(documentation).click().perform();
	
	
	
	}

}
