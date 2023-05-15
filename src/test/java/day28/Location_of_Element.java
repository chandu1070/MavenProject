package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Location_of_Element {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");		
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement logo=d.findElement(By.xpath("//div[@class='sliderText']"));
		System.out.println(logo.getLocation());
		System.out.println(logo.getLocation().getX());
		System.out.println(logo.getLocation().getY());
		
		
		
		
		

	}

}
