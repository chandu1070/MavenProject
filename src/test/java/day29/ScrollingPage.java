package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().deleteAllCookies();
		d.get("https://www.worldometers.info/geography/flags-of-the-world/");
		JavascriptExecutor js=(JavascriptExecutor)d;
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		//scroll down page  by pixel number
		//js.executeScript("window.scrollBy(0,3000)","");
		//System.out.println(js.executeScript("return window.pageYOffset;"));  //3000
		
		//scroll down the page till element is visible
	   /* WebElement flag=d.findElement(By.xpath("//img[@src='/img/flags/small/tn_ag-flag.gif']"));
        js.executeScript("arguments[0].scrollIntoview();",flag);
       System.out.println(js.executeScript("return window.pageYOffset;"));  */
		
        //End of the page
      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      System.out.println(js.executeScript("return window.pageYOffset;"));  //3000
      Thread.sleep(3000);
      js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
      		
	}

}
