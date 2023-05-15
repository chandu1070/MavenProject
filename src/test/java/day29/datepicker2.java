package day29;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker2 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().deleteAllCookies();
		d.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");		
		d.manage().window().maximize();
		Thread.sleep(3000);
	d.findElement(By.xpath("//input[@id='dob']")).click();
	 String mon="Jun";
	 String year="1996";
	 String date="23";
	
	Select dmonth=new Select(d.findElement(By.xpath("//select[@aria-label='Select month']")));
	dmonth.selectByVisibleText(mon);
	
	Select dyear=new Select(d.findElement(By.xpath("//select[@aria-label='Select year']")));
	dyear.selectByVisibleText(year);
	
	List<WebElement> alldates=d.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	for(WebElement dt:alldates)
	{
		if(dt.getText().equals(date))
		{
		   dt.click();
		   break;
	    }
	}

}
}
