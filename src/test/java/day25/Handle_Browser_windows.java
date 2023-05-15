package day25;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Browser_windows {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
		WebDriverManager.chromedriver().setup();
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(co);
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		Thread.sleep(2000);

	     System.out.println("ID of window handle:"+ d.getWindowHandle());
	     d.findElement(By.linkText("OrangeHRM, Inc")).click();
	     System.out.println("IDS of windowhandles:"+d.getWindowHandles());
	    
	 
       Set<String>windowids=d.getWindowHandles();
     
       List<String>windowidList=new ArrayList(windowids);
      
      String Parentwindowid=windowidList.get(0);
      String Childwindowid=windowidList.get(1);
      d.switchTo().window(Childwindowid);    //Switch to child browser window 
      
      d.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
      System.out.println("Title of the child page:"+d.getTitle());      //Sign Up for a Free HR Software Demo | OrangeHRM | OrangeHRM
      d.switchTo().window(Parentwindowid);
      System.out.println("Title of the parent page:"+d.getTitle());    //OrangeHRM*/
      
      //if i want to close particular window in multiple windows
       for(String windowid:windowids)
      {
    	  String title=d.switchTo().window(windowid).getTitle();
    	  if (title.equals("Sign Up for a Free HR Software Demo | OrangeHRM | OrangeHRM"))
    			  {
    		      d.close();
    			  }
      }
   

      
      


}
}
