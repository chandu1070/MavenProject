package April26;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
      driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alt1= driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alt2=driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.sendKeys("vamsikoppula");
	
		alt2.accept();	
		
		WebElement text=driver.findElement(By.xpath("//p[@id='demo1']"));
		System.out.println(text.getText());
		
		        String act_title="Hello vamsi How are you today";
				String exp_text=driver.findElement(By.xpath("//p[@id='demo1']")).getText();
				if(exp_text.equals (act_title))
				{
					System.out.println("Success");
				}
				else
				{
					System.out.println("Fail");
				}
	}

}
