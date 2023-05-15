package day38;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paramtest {
	
	WebDriver d;
	@Parameters({"browser"})
	@BeforeClass
	void setup(String br)
	{
		if (br.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();	
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			d=new EdgeDriver();
		}
	
	
		d.get("https://demo.guru99.com/v4/");
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	@Test(priority=1)
	void logotest() throws InterruptedException
	{
		try {
		WebElement logo=d.findElement(By.xpath("//a[normalize-space()='Demo Site']"));
        Assert.assertEquals(logo.isDisplayed(), true);
		}
		catch(Exception e)
		{
			Assert.fail();
			
		}
        
        
	}

	
	@Test(priority=2)
	void logotitle()
	{
		Assert.assertEquals(d.getTitle(),"Guru99 Bank Home Page","Titles are not matched");
		
	}
	@AfterClass()
	void teardown()
	{
		d.quit();
	}
}
