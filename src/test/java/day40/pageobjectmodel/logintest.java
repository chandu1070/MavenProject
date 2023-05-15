package day40.pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {
  WebDriver driver ;
  Loginpage2 lp;
  
  @BeforeClass
  void setup() throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(3000);
  }
  
 @Test(priority=1)
  void test_logo() 
  {
	lp=new Loginpage2(driver);
	Assert.assertEquals(lp.checklogopresence(),true);
  }
   
 @Test(priority=2)
 void test_login()
 {
	lp.setUsername("Admin");
	lp.setPassword("admin123");
	lp.clicklogin();
	Assert.assertEquals(driver.getTitle(),"OrangeHRM");
 }
 
 @AfterClass
 void tearDown()
 {
	 driver.close();
 }
 
}
