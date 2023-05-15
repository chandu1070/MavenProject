package day37;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider1 {
	
	WebDriver d;
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
	}
	
	@Test(dataProvider="vamc")
      void testLogin(String email, String pwd)
     {
	   d.get("https://admin-demo.nopcommerce.com/login");
	   WebElement emailid=d.findElement(By.xpath("//input[@id='Email']"));
	   emailid.clear();
	   emailid.sendKeys(email);
	   WebElement password =d.findElement(By.xpath("//input[@id='Password']"));
	   password.clear();
	   password.sendKeys(pwd);
	   d.findElement(By.xpath("//button[@type='submit']")).click();
	   String exp_title="Your store. Login";
	   String  act_title=d.getTitle();
	   Assert.assertEquals(exp_title,act_title); 
     }
       @DataProvider(name="vamc")
	   String[][] Logindata()
	   {
		  String data[][]= {
				  
				  { "vamsikoppula41@gmail.com","vamsikoppula"},
				  {"vamsikoppula56@gmail.com","vamsik"},
				  { "koppula34@gmail.com","vamsi99"},
				  { "chandu777@gmail.com","chanduk"}
		  };
		  return data;
	  }
	@AfterClass
	void teardown() 
	{
		d.quit();
	}
}
