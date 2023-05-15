package April26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

   public class iteqaregister {
   public static void main(String[] args) throws InterruptedException 
       {

		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d.get("https://itera-qa.azurewebsites.net/home/automation");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		d.findElement(By.id("name")).sendKeys("vamsikoppula");
		d.findElement(By.id("phone")).sendKeys("9346272443");
		d.findElement(By.id("email")).sendKeys("vamsikoppula56@gmail.com");
		d.findElement(By.id("address")).sendKeys("High school road,patamata,vijaywada");
		d.findElement(By.id("password")).sendKeys("vamsi1234");
		 Thread.sleep(3000);

d.findElement(By.id("male")).click();
Thread.sleep(3000);

d.findElement(By.id("friday")).click();
Thread.sleep(3000);

Select ctr=new Select(d.findElement(By.xpath("//*[@class='custom-select']")));
ctr.selectByVisibleText("Spain");
 Thread.sleep(3000);
d.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[2]/label")).click();
Thread.sleep(3000);

d.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label")).click();
Thread.sleep(3000);

WebElement link=d.findElement(By.xpath("//*[@id='inputGroupFile02']"));
link.sendKeys("C://Users//DELL//Pictures//Screenshots//Birthday Poster.png");
System.out.println("Birthday poster file");

d.findElement(By.xpath("//*[@class='input-group-text']"));
System.out.println("Uploaded Successfully");

d.findElement(By.name("submit")).click();
System.out.println("Submitted Successfully"); 
	}

		

	}

