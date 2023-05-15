package day23;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_SelectmethodDemo {

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.get("https://itera-qa.azurewebsites.net/home/automation");
	d.manage().window().maximize();
	Thread.sleep(2000);
	
	Select drpcountry =new Select(d.findElement(By.xpath("//select[@class='custom-select']")));
	drpcountry.selectByValue("6");  //italy
	
	
	//drpcountry.selectByVisibleText("Norway"); 
	List<WebElement> alloptions=drpcountry.getOptions();
	alloptions.size();
	System.out.println("Total no of dropdowns:"+alloptions.size());   
	Thread.sleep(4000);
	
	//Print all the web elements
	for(int i=0;i<alloptions.size(); i++)
	{
		System.out.println("Alll the options:"+alloptions.get(i).getText());
	}

	d.close();
	
	
	

	}

}
