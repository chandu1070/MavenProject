package day25;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window_handles {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.driver.chromedriver","C:\\chromedriver");
		WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
			
			d.get("https://www.dezlearn.com/multiple-browser-windows/");
			d.manage().window().maximize();
			Thread.sleep(2000);
			d.findElement(By.id("u_7_8")).click();
			Thread.sleep(3000);
			 Set<String>windowids=d.getWindowHandles();
              List<String>windowidslist=new ArrayList(windowids);
              
             String parentWindowID= windowidslist.get(0);
             String childWindowID1= windowidslist.get(1);
             String childWindowID2= windowidslist.get(2);
             String childWindowID3= windowidslist.get(3);
             String childWindowID4= windowidslist.get(4);
             String childWindowID5= windowidslist.get(5);
             String childWindowID6= windowidslist.get(6);
             
             d.switchTo().window(childWindowID5);
             System.out.println("childWindowID5:"+d.getTitle());  //Handling Multiple Browser Windows (Tabs) » Dezlearn » Learn IT Easy
             Thread.sleep(3000);
             d.switchTo().window(parentWindowID);
             Thread.sleep(3000);
             
            d.switchTo().window(childWindowID4);
            System.out.println("childWindowID4 title:"+d.getTitle());  //Google
            
            d.switchTo().window(parentWindowID);
            Thread.sleep(3000);
            d.switchTo().window(childWindowID3);
            System.out.println("childWindowID3 title:"+d.getTitle());   //Explore / Twitter
            
            d.switchTo().window(parentWindowID);
            Thread.sleep(3000);
            d.switchTo().window(childWindowID2);
            System.out.println("childWindowID2 title:"+d.getTitle());  //:Facebook – log in or sign up
            
            d.switchTo().window(parentWindowID);
            Thread.sleep(3000);
            d.switchTo().window(childWindowID1);
            System.out.println("childWindowID1 title:"+d.getTitle());   //Apple
            
            
     
            //childWindowID1:Google
           // childWindowID2 title:LinkedIn: Log In or Sign Up
           // childWindowID3 title:YouTube
          //  childWindowID4 title:Explore / Twitter
         //   childWindowID5 title:Apple
           // childWindowID6 title:Facebook – log in or sign up
            
            
             
           
             for(String windowid:windowids)
             {
            	 String title=d.switchTo().window(windowid).getTitle();
            	 if (title.equals("YouTube"));
            	 {
            		 d.findElement(By.id("search-icon")).sendKeys("janasena");
            		 Thread.sleep(4000);
            	 }
            	 
            	 
             }
	}
             
	}
