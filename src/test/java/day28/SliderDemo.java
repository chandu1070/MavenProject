package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions act =new Actions(d);
		
		WebElement min_slider=d.findElement(By.xpath("//span[1]"));
		System.out.println("inital value of slider:"+min_slider.getLocation());//(59,250)
		act.dragAndDropBy(min_slider, 100, 0).perform();
		System.out.println("fianl value after moving a slider:"+min_slider.getLocation());
		
		
		WebElement max_slider=d.findElement(By.xpath("//span[2]"));
		System.out.println("initial value of slider:"+max_slider.getLocation());//(544, 250)
		act.dragAndDropBy(max_slider, -44, 0).perform();
		System.out.println("fianl value after moving a slider:"+max_slider.getLocation());
		
		
	}

}
