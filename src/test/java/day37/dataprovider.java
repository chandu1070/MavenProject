package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	WebDriver d;
    @BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		 d=new ChromeDriver();			
	}
    @Test
    void Login()
    {
     d.findElement(By.xpath("https://admin-demo.nopcommerce.com/login"));
     d.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
     d.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
     d.findElement(By.xpath("//button[@type='submit']")).click();
          String exp_title="Admin area demo";
          String act_title=d.getTitle();
          //String act title=d.get Title();
          //Assert.assertEquals(act_tiel, exp_title);
         
         Assert.assertEquals(act_title,exp_title);
        
    }		
}
