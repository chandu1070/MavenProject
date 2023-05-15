package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_withoutsearchhandle {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
			WebDriver d=new ChromeDriver();
			d.get("https://itera-qa.azurewebsites.net/home/automation");
			d.manage().window().maximize();
			Thread.sleep(2000);
			
			//select the no of dropdowns without using select class
			List<WebElement>alldropdwns=d.findElements(By.xpath("//select[@class='custom-select']/option"));
			System.out.println("Total no of dropdowns:"+alldropdwns.size());
			
			//Print total no of dropdowns
			/*for(WebElement dproptions:alldropdwns)
			{
				System.out.println( dproptions.getText());
				
			}*/
			
			//select option from dropdown
			for(WebElement option:alldropdwns)
			{
				if (option.getText().equals("Greece"));
					option.click();
					break;
			}

	}

}
