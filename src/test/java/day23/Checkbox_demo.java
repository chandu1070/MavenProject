package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver d=new ChromeDriver();
		d.get("https://itera-qa.azurewebsites.net/home/automation");
		
		// Select check box
		
		d.manage().window().maximize();
		d.findElement(By.id("monday")).click();
		
		//Find Out total no of check boxes
		
		List<WebElement> checkboxes= d.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		System.out.println("number of checkboxes:"+checkboxes.size());   //7
		
		
		//select all the check boxes                //For Loop
		for(int i=0;i<checkboxes.size();i++)
			{
			checkboxes.get(i).click();
			}
		// Or
		for(WebElement chkb:checkboxes)     //nested for looop
		{
			chkb.click();
		}
		
		//Select last Two check boxes
		for(int i=5;i<checkboxes.size();i++)
		{ 
		checkboxes.get(i).click();
		}
		
		//Select first 2 check boxes
		for(int i=0;i<2;i++)
		{ 
		checkboxes.get(i).click();
		}
		
		//Unselect the check boxes
		
		for(WebElement chkb:checkboxes)
		{
			if(chkb.isSelected());
			
		}
		
		 

	}

}
    