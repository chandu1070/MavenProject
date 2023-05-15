package day24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ALerts_Demo {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriv er.driver.chromedriver","C:\\chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		d.manage().window().maximize();
		Thread.sleep(2000);
        
		d.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(4000);
		
        
        Alert myalert=d.switchTo().alert();
        System.out.println(myalert.getText());    //Capturing the DATA
      
        myalert.sendKeys("welcome");
        
        myalert.accept();
        
         //myalert.dismiss();
         //d.close();
         
        
        
	}

}
