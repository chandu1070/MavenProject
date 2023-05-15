package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_click_action {
public static void main(String[] args) throws InterruptedException  {
//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
	WebDriverManager.chromedriver().setup();
WebDriver d=new ChromeDriver();
d.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
d.manage().window().maximize();
Thread.sleep(3000);
WebElement button=d.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
Actions act=new Actions(d);
act.contextClick(button).perform(); //creating action and performing action thats why we are using perform method
d.findElement(By.xpath("//span[normalize-space()='Paste']")).click();
Thread.sleep(3000);
d.switchTo().alert().dismiss();        
            

	}

}
