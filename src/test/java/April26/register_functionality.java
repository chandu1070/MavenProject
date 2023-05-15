package April26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class register_functionality {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver d=new ChromeDriver();
			d.get(" https://demo.automationtesting.in/Register.html");
			d.manage().window().maximize();
			Thread.sleep(2000);
			
          d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("vamsi");
          Thread.sleep(2000);
    
          WebElement hp1=d.findElement(By.xpath("//input[@placeholder='Last Name']"));
          hp1.sendKeys("koppula");
          Thread.sleep(2000);
    
        //d.switchTo().frame("Address");
         WebElement hp3=d.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
         hp3.sendKeys("11-11","Near Girls HIGH SCHOOL","Patamata", "vijayawada");
         Thread.sleep(2000);
     
         WebElement c4=d.findElement(By.xpath("//input[@type='email']"));
         c4.sendKeys("vamsikoppula56@gmail.com");
         Thread.sleep(2000);
      
         WebElement c5=d.findElement(By.xpath("//input[@type='tel']"));
         c5.sendKeys("9346272443");
         Thread.sleep(2000);
      
        d.findElement(By.xpath("//input[@value='Male']")).click();
       d.findElement(By.id("checkbox1")).click();
       Thread.sleep(2000);
      
        WebElement lang=d.findElement(By.xpath("//div[@id='msdd']"));
        Select skill =new Select(d.findElement(By.xpath("//select[@id='Skills']")));
  	    skill.selectByVisibleText("AutoCAD");
  	 // Thread.sleep(2000);
    
      Select ctry1=new Select (d.findElement(By.xpath("//select[@id='countries']")));
      Select ctry2= new Select(d.findElement(By.xpath("//span[@id='select2-country-container']")));
      ctry2.selectByVisibleText("India");
      Thread.sleep(2000);
     
      Select yr =new Select(d.findElement(By.xpath("//select[@id='yearbox']")));
      yr.selectByVisibleText("1999");
      Thread.sleep(2000);
     
      Select mnt =new Select(d.findElement(By.xpath("//select[@placeholder='Month']")));
      mnt.selectByVisibleText("April");
      Thread.sleep(2000);
     
     
     Select dt =new Select(d.findElement(By.xpath("//select[@id='daybox']")));
     dt.selectByVisibleText("10");
     Thread.sleep(2000);
     
     WebElement pwd= d.findElement(By.xpath("//input[@id='firstpassword']"));
     pwd.sendKeys("vamsi1070"); 
     Thread.sleep(2000);
    
     WebElement cnfp= d.findElement(By.xpath("//input[@id='secondpassword']"));
     cnfp.sendKeys("vamsi1070"); 
     Thread.sleep(2000);
    
    d.findElement(By.xpath("//button[@id='submitbtn']")).click();
    
     
    
	}

}
