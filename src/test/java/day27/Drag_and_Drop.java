package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop {
	public static void main(String[] args) throws InterruptedException  {
			//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
		WebDriverManager.chromedriver().setup();
			WebDriver d=new ChromeDriver();
			d.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			d.manage().window().maximize();
			Thread.sleep(3000);
			Actions act=new Actions(d);
			WebElement washington= d.findElement(By.xpath("//div[@id='box3']"));
			WebElement us=d.findElement(By.xpath("(//div[@id='box103'])[1]"));
			act.dragAndDrop(washington, us).perform();
			
			WebElement Rome=d.findElement(By.xpath("//div[@id='box6']"));
			WebElement Sweden=d.findElement(By.xpath("//div[@id='box102']"));
			act.dragAndDrop(Rome, Sweden).perform();
			Thread.sleep(3000);
			
			d.close();
	
	}

}
  